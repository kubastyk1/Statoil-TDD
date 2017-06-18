package com.JStudio.Statoil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContainerTest {

	Container container1;
	Container container2;

	@Before
	public void setUp(){
		container1 = new Container(PetrolType.PB95);
		container2 = new Container(PetrolType.DIESEL);
	}

	@Test
	public void addPetrolToContainer(){
		double litersOfFuel = 1000;
		double litersOfFuel2 = 2500;

		container1.addPetrol(litersOfFuel);
		container2.addPetrol(litersOfFuel2);

		assertThat(container1.getCurrentCapacity(), is(litersOfFuel));
		assertThat(container2.getCurrentCapacity(), is(litersOfFuel2));
	}

	@Test
	public void checkIfPetrolIsOverContainerLimit(){

		container1.addPetrol(container1.getFullCapacity() + 2000);

		assertThat(container1.getCurrentCapacity(), is(container1.getFullCapacity()));
	}

	@Test
	public void removePetrolFromContainer(){

		double litersOfPetrol = 1000;
		container1.addPetrol(container1.getFullCapacity());
		container1.removePetrol(litersOfPetrol);

		assertThat(container1.getCurrentCapacity(), is(container1.getFullCapacity() - litersOfPetrol));
	}

	@Test
	public void checkIfPetrolIsUnderConteinerLimit(){

		double litersOfPetrol = 1000;
		container1.removePetrol(litersOfPetrol);

		assertThat(container1.getCurrentCapacity(), is(0.0));
	}
}
