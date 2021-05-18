package ro.ase.csie.cts.g1094.dp.observer;

public class UINotificationsModule implements NetworkStatusHandleInterface {

	@Override
	public void connectionDown() {
		System.out.println("Alert: connection lost");
		
	}

	@Override
	public void connectionUp() {
		System.out.println("Alert: Let's get back to the game");
		
	}

}
