package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TruckTest {

	Truck truck;
	Station station;
	@Before
	public void setUp(){
		station = new Station();
		station.addContainer(new Container(PetrolType.PB95));
		station.addContainer(new Container(PetrolType.PB95));
		truck = new Truck(station, PetrolType.PB95, 2000);
	}

	@Test
	public void emptingTruckTest(){
		truck.drainTruck();

		assertThat(truck.getFullCapacity(), is(2000.0));
		assertThat(truck.getCurrentCapacity(), is(0.0));
	}
}
