package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	Station station;
	Petrol petrol;
	Container container;
	Customer customer;
	double containerSize = 100;

	@Before
	public void setUp(){

		station = new Station();
		petrol = new Petrol(PetrolType.PB95);
		container = new Container(PetrolType.PB95);
		customer = new Customer();

		container.addPetrol(containerSize);
		station.addContainer(container);
	}

	@Test
	public void buyPetrolTest(){

		double litersOfPetrol = 40;
		double oldAmountOfPetrolInCar = customer.getCar().getCurrentCapacity();
		customer.buyPetrol(PetrolType.PB95, litersOfPetrol);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(containerSize - litersOfPetrol));
		assertTrue(customer.getCar().getCurrentCapacity() > oldAmountOfPetrolInCar);
	}
}
