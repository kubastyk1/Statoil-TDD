package com.JStudio.Statoil;

public class Truck extends Tank{

	private Station currentStation;

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

}
