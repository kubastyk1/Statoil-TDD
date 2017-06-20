package com.JStudio.Statoil;

public class Car extends Tank{

	public Car(PetrolType petrolType, double fullCapacity) {
		super();
		this.petrolType = petrolType;
		this.fullCapacity = fullCapacity;
	}

	public void tankPetrol(double amountOfPetrol){
		currentCapacity += amountOfPetrol;
	}

}
