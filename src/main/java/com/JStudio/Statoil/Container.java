package com.JStudio.Statoil;

public class Container {

	private PetrolType petrolType;
	private double howManyLiters;
	private double fullCapacity = 5000;

	public Container(PetrolType petrolType) {

		this.petrolType = petrolType;
	}

	public void addPetrol(double litersOfFuel) {
		howManyLiters += litersOfFuel;
	}

	public PetrolType getPetrolType() {
		return petrolType;
	}

	public void setPetrolType(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

	public double getHowManyLiters() {
		return howManyLiters;
	}

	public void setHowManyLiters(double howManyLiters) {
		this.howManyLiters = howManyLiters;
	}

	public double getFullCapacity() {
		return fullCapacity;
	}
}
