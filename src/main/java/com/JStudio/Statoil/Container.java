package com.JStudio.Statoil;

public class Container {

	private PetrolType petrolType;
	private int howManyLiters;

	public Container(PetrolType petrolType) {

		this.petrolType = petrolType;
	}

	public void addPetrol(int litersOfFuel) {

		howManyLiters += litersOfFuel;
	}

	public PetrolType getPetrolType() {
		return petrolType;
	}

	public void setPetrolType(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

	public int getHowManyLiters() {
		return howManyLiters;
	}

	public void setHowManyLiters(int howManyLiters) {
		this.howManyLiters = howManyLiters;
	}


}
