package ro.ase.csie.cts.g1094.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ScreenData coordSoldier1 = new ScreenData(100, 10, 10, "Green");
		ScreenData coordSoldier2 = new ScreenData(100, 100, 10, "Brown");
		ScreenData coordsTree1 = new ScreenData(10, 10, 10, "Green");
		ScreenData coordsTree2 = new ScreenData(10, 10, 10, "Green");
		
		
		ModelFlyweightActions soldier = Model3DFactory.getModel(ModelTypes.SOLDIER);
		soldier.display(coordSoldier2);
		soldier.display(coordSoldier1);
	
		ModelFlyweightActions tree = Model3DFactory.getModel(ModelTypes.TREE);
		tree.display(coordsTree1);
		tree.display(coordsTree2);
	}
}
