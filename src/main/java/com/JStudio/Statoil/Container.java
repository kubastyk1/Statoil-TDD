package com.JStudio.Statoil;

public class Container extends Tank{

	public Container(PetrolType petrolType, double fullCapacity) {

		this.petrolType = petrolType;
		this.fullCapacity = fullCapacity;
	}

	public void addPetrol(double litersOfPetrol) {
		double bothCapacity = currentCapacity + litersOfPetrol;

		if(bothCapacity < fullCapacity){
			currentCapacity = bothCapacity;
		}else{
			currentCapacity = fullCapacity;
		}
	}

	public void removePetrol(double litersOfPetrol) {

		double bothCapacity = currentCapacity - litersOfPetrol;

		if(bothCapacity > 0){
			currentCapacity = bothCapacity;
		}else{
			currentCapacity = 0;
		}
	}

	public double getDifference(){
		return fullCapacity - currentCapacity;
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
