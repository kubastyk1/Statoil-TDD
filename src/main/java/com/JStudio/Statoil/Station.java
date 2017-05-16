package com.JStudio.Statoil;

import java.util.ArrayList;
import java.util.List;

public class Station {

	private List<Container> containerList = new ArrayList<Container>();

	public void addContainer(Container container) {

		containerList.add(container);
	}

	public void addPetrol(Petrol petrol, int litersOfFuel) {

		for(Container container : containerList){
			if(container.getPetrolType() == petrol.getPetrolType()){
				container.addPetrol(litersOfFuel);
			}
		}
	}

	public List<Container> getContainerList() {
		return containerList;
	}

	public void setContainerList(List<Container> containerList) {
		this.containerList = containerList;
	}

}
