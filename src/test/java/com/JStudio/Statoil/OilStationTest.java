package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OilStationTest {

	Station station;
	Container container1;
	Container container2;

	@Before
	public void setUp(){

		station = new Station();
		container1 = new Container(PetrolType.PB95);
		container2 = new Container(PetrolType.DIESEL);

		station.addContainer(container1);
		station.addContainer(container2);
	}

	@Test
	public void addPetrolToContainer(){

		Petrol petrol = new Petrol(PetrolType.PB95);
		Petrol petrol2 = new Petrol(PetrolType.DIESEL);
		double litersOfFuel = 1000;
		double litersOfFuel2 = 2500;

		station.addPetrol(petrol, litersOfFuel);
		station.addPetrol(petrol2, litersOfFuel2);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(litersOfFuel));
		assertThat(station.getContainerList().get(1).getCurrentCapacity(), is(litersOfFuel2));
	}

	@Test
	public void checkIfPetrolIsNotOverContainerLimit(){

		Petrol petrol = new Petrol(PetrolType.PB95);

		station.addPetrol(petrol, station.getContainerList().get(0).getFullCapacity() + 2000);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(station.getContainerList().get(0).getFullCapacity()));
	}

}
