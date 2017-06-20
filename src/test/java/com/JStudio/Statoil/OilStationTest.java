package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OilStationTest {

	Station station;
	Container container1;
	Container container2;
	Container container3;

	@Before
	public void setUp(){

		station = new Station();
		container1 = new Container(PetrolType.PB95);
		container2 = new Container(PetrolType.DIESEL);
		container3 = new Container(PetrolType.PB95);

		station.addContainer(container1);
		station.addContainer(container2);
		station.addContainer(container3);
	}

	@Test
	public void addPetrolToContainer(){

		double litersOfFuel = 1000;
		double litersOfFuel2 = 2500;

		station.addPetrol(PetrolType.PB95, litersOfFuel);
		station.addPetrol(PetrolType.DIESEL, litersOfFuel2);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(litersOfFuel));
		assertThat(station.getContainerList().get(1).getCurrentCapacity(), is(litersOfFuel2));
	}

	@Test
	public void removePetrolFromContainer(){

		double litersOfPetrol = 1000;
		station.addPetrol(PetrolType.PB95, station.getContainerList().get(0).getFullCapacity());
		station.removePetrol(PetrolType.PB95, litersOfPetrol);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(),
				is(station.getContainerList().get(0).getFullCapacity() - litersOfPetrol));
	}

	@Test
	public void addToMuchPetrolToContainer(){
		double litersOfFuel = 6000;

		station.addPetrol(PetrolType.PB95, litersOfFuel);

		assertThat(station.getContainerList().get(0).getCurrentCapacity(), is(station.getContainerList().get(0).getFullCapacity()));
		assertThat(station.getContainerList().get(2).getCurrentCapacity(), is(litersOfFuel - station.getContainerList().get(0).getFullCapacity()));
	}
}
