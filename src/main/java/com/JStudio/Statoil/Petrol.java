package com.JStudio.Statoil;

public class Petrol {

	private PetrolType petrolType;

	public Petrol(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

	public PetrolType getPetrolType() {
		return petrolType;
	}

	public void setPetrolType(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

}
