package com.JStudio.Statoil;

public class Container {

	private PetrolType petrolType;
	private int howManyLiters;

	public PetrolType getPetrolType() {
		return petrolType;
	}

	public void setPetrolType(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

	public Container(PetrolType petrolType) {

		this.petrolType = petrolType;
	}

	public void addPetrol(int litersOfFuel) {
		// TODO Auto-generated method stub
		howManyLiters += litersOfFuel;
	}

	public int getHowManyLiters() {
		return howManyLiters;
	}

	public void setHowManyLiters(int howManyLiters) {
		this.howManyLiters = howManyLiters;
	}


}
