package com.JStudio.Statoil;

public class Container {

	private PetrolType petrolType;
	private double currentCapacity;
	private double fullCapacity = 5000;

	public Container(PetrolType petrolType) {

		this.petrolType = petrolType;
	}

	public void addPetrol(double litersOfFuel) {
		double bothCapacity = currentCapacity + litersOfFuel;

		if(bothCapacity < fullCapacity){
			currentCapacity = bothCapacity;
		}else{
			currentCapacity = fullCapacity;
		}
	}

	public PetrolType getPetrolType() {
		return petrolType;
	}

	public void setPetrolType(PetrolType petrolType) {
		this.petrolType = petrolType;
	}

	public double getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(double currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public double getFullCapacity() {
		return fullCapacity;
	}
}
