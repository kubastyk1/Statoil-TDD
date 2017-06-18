package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OilStationTest {

	Station station;
	Container container1;
	Container container2;
	Petrol petrol;
	Petrol petrol2;

	@Before
	public void setUp(){

		station = new Station();
		petrol = new Petrol(PetrolType.PB95);
		petrol2 = new Petrol(PetrolType.DIESEL);

		container1 = new Container(petrol.getPetrolType());
		container2 = new Container(petrol2.getPetrolType());

		station.addContainer(container1);
		station.addContainer(container2);
	}

	@Test
	public void addPetrolToContainer(){

		double litersOfFuel = 1000;
		double litersOfFuel2 = 2500;

		station.addPetrol(petrol, litersOfFuel);
		station.addPetrol(petrol2, litersOfFuel2);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(litersOfFuel));
		assertThat(station.getContainerList().get(1).getCurrentCapacity(), is(litersOfFuel2));
	}

	@Test
	public void removePetrolFromContainer(){

		double litersOfPetrol = 1000;
		station.addPetrol(petrol, station.getContainerList().get(0).getFullCapacity());
		station.removePetrol(petrol, litersOfPetrol);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(),
				is(station.getContainerList().get(0).getFullCapacity() - litersOfPetrol));
	}
}
