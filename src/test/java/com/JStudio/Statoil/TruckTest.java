package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TruckTest {

	Truck truck;

	@Before
	public void setUp(){
		truck = new Truck(2000);
	}

	@Test
	public void emptingTruckTest(){

		truck.drainTruck();

		assertThat(truck.getFullCapacity(), is(0));
	}
}
