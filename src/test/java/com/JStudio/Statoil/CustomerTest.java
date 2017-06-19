package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	Station station;
	Container container;
	Customer customer;
	double containerSize = 1000;

	@Before
	public void setUp() {

		station = new Station();
		container = new Container(PetrolType.PB95);
		customer = new Customer(station, new Car(PetrolType.PB95, 100));

		container.addPetrol(containerSize);
		station.addContainer(container);
	}

	@Test
	public void buyPetrolTest() {

		double litersOfPetrol = 40;
		double oldAmountOfPetrolInCar = customer.getCar().getCurrentPetrolCapacity();

		customer.buyPetrol(PetrolType.PB95, litersOfPetrol);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(containerSize - litersOfPetrol));
		assertTrue(customer.getCar().getCurrentPetrolCapacity() > oldAmountOfPetrolInCar);
	}

	@Test
	public void paymentTest(){
		double litersOfPetrol = 40;

		customer.buyPetrol(PetrolType.PB95, litersOfPetrol);

		assertThat(customer.getTankCost(), is(litersOfPetrol * new PetrolRepository().getPrice(PetrolType.PB95)));
	}

	@Test
	public void buyMorePetrolThanCarCapacity(){
		double litersOfPetrol = 200;
		double oldAmountOfPetrolInCar = customer.getCar().getCurrentPetrolCapacity();
		customer.buyPetrol(PetrolType.PB95, litersOfPetrol);
		double difference = customer.getCar().getCurrentPetrolCapacity() - oldAmountOfPetrolInCar;

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(containerSize - difference));
		assertTrue(customer.getCar().getCurrentPetrolCapacity() > oldAmountOfPetrolInCar);
		assertThat(customer.getTankCost(), is(difference * new PetrolRepository().getPrice(PetrolType.PB95)));
	}
}
