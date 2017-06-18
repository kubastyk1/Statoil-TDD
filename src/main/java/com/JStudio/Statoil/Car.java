package com.JStudio.Statoil;

public class Car {

	private PetrolType petrolType;
	private double currentCapacity;
	private double fullCapacity;

	public Car(PetrolType petrolType, double fullCapacity) {
		super();
		this.petrolType = petrolType;
		this.fullCapacity = fullCapacity;
	}

	public void tankPetrol(double amountOfPetrol){
		currentCapacity += amountOfPetrol;
	}


	public PetrolType getPetrolType() {
		return petrolType;
	}

	public double getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(double currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public double getFullCapacity() {
		return fullCapacity;
	}

}
