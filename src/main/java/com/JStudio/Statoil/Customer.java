package com.JStudio.Statoil;

public class Customer {

	public Station currentStation;
	private Car car;

	public Customer(Station station, Car car) {
		super();
		this.currentStation = station;
		this.car = car;
	}

	public void buyPetrol(PetrolType petrolType, double litersOfPetrol) {
		currentStation.removePetrol(petrolType, litersOfPetrol);
		car.tankPetrol(litersOfPetrol);
	}

	public Car getCar() {
		return car;
	}

}
