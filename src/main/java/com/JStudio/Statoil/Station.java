package com.JStudio.Statoil;

import java.util.ArrayList;
import java.util.List;

public class Station {

	private List<Container> containerList = new ArrayList<Container>();

	public void addContainer(Container container) {

		containerList.add(container);
	}

	public void addPetrol(PetrolType petrol, double litersOfPetrol) {

		double litersRemain = litersOfPetrol;

		for(Container container : containerList){
			if(container.getPetrolType() == petrol){
				litersRemain = distributePetrol(container, litersRemain);
			}
		}
	}

	public void removePetrol(PetrolType petrol, double litersOfPetrol){

		for(Container container : containerList){
			if(container.getPetrolType() == petrol){
				container.removePetrol(litersOfPetrol);
			}
		}
	}

	public List<Container> getContainerList() {
		return containerList;
	}

	public void setContainerList(List<Container> containerList) {
		this.containerList = containerList;
	}

	private double distributePetrol(Container container, double litersRemain){
		if(container.getDifference() >= litersRemain){
			container.addPetrol(litersRemain);
		}else{
			litersRemain -= container.getDifference();
			container.addPetrol(container.getDifference());
		}

		return litersRemain;
	}
}
