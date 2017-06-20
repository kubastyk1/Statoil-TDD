package com.JStudio.Statoil;

public class Truck {

	private double fullCapacity;
	private double currentCapacity;
	private Station currentStation;
	private PetrolType petrolType;

	public Truck(Station station, PetrolType petrolType, double fullCapacity) {
		this.currentStation = station;
		this.fullCapacity = fullCapacity;
		this.petrolType = petrolType;
		this.currentCapacity = fullCapacity;
	}

	public void drainTruck() {
		double remainPetrol = currentStation.addPetrol(petrolType, currentCapacity);
		if(remainPetrol == 0)
			currentCapacity = 0;
	}

	public double getFullCapacity() {

		return fullCapacity;
	}

	public double getCurrentCapacity() {
		return currentCapacity;
	}

}
