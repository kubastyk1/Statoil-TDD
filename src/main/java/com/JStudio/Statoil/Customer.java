package com.JStudio.Statoil;

public class Customer {

	public Station currentStation;
	private Car car;
	private double tankCost;
	public Customer(Station station, Car car) {
		super();
		this.currentStation = station;
		this.car = car;
	}

	public void buyPetrol(PetrolType petrolType, double litersOfPetrol) {
		currentStation.removePetrol(petrolType, litersOfPetrol);
		car.tankPetrol(litersOfPetrol);
		PetrolRepository pr = new PetrolRepository();
		tankCost = litersOfPetrol * pr.getPrice(petrolType);
	}

	public Car getCar() {
		return car;
	}

	public Double getTankCost() {

		return tankCost;
	}

}
