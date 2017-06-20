package com.JStudio.Statoil;

public class Tank {

	public double fullCapacity;
	public double currentCapacity;
	public PetrolType petrolType;

	public double getDifference(){
		return fullCapacity - currentCapacity;
	}

	public double getFullCapacity() {
		return fullCapacity;
	}

	public void setFullCapacity(double fullCapacity) {
		this.fullCapacity = fullCapacity;
	}

	public double getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(double currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public PetrolType getPetrolType() {
		return petrolType;
	}

	public void setPetrolType(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

}
