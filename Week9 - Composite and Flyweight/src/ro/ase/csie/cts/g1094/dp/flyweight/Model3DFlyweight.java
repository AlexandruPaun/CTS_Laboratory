package ro.ase.csie.cts.g1094.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Model3DFlyweight implements ModelFlyweightActions {

	String name;
	//3d model
	List<Double> modelPoints = new ArrayList<>();
	

	
	
	public Model3DFlyweight(String name, List<Double> modelPoints) {
		super();
		this.name = name;
		this.modelPoints = modelPoints;
	}

	

	public Model3DFlyweight(String string) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void display(ScreenData data) {
		System.out.println(String.format("Printing %s at coordinates (%f,%f,%f)", name, data.x, data.y, data.z));
		
	}

	@Override
	public void loadModel(String filename) {
		// TODO Auto-generated method stub
		
	}

}