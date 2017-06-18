package com.JStudio.Statoil;

public class Car {

	private PetrolType petrolType;
	private double currentPetrolCapacity;
	private double fullPetrolCapacity;

	public Car(PetrolType petrolType, double fullCapacity) {
		super();
		this.petrolType = petrolType;
		this.fullPetrolCapacity = fullCapacity;
	}

	public void tankPetrol(double amountOfPetrol){
		currentPetrolCapacity += amountOfPetrol;
	}


	public PetrolType getPetrolType() {
		return petrolType;
	}

	public double getCurrentPetrolCapacity() {
		return currentPetrolCapacity;
	}

	public void setCurrentPetrolCapacity(double currentCapacity) {
		this.currentPetrolCapacity = currentCapacity;
	}

	public double getFullCapacity() {
		return fullPetrolCapacity;
	}

}
