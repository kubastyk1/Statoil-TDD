package com.JStudio.Statoil;

import java.util.HashMap;
import java.util.Map;

public class PetrolRepository {

	Map<PetrolType, Double> petrols = new HashMap<PetrolType, Double>();

	public PetrolRepository() {

		petrols.put(PetrolType.PB95, 4.5);
		petrols.put(PetrolType.PB98, 5.0);
		petrols.put(PetrolType.DIESEL, 4.0);
		petrols.put(PetrolType.GAS, 3.2);
	}

	public double getPrice(PetrolType petrolType) {

		return petrols.get(petrolType);
	}

}
