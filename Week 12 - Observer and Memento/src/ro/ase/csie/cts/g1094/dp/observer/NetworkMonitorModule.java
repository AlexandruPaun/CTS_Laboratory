package ro.ase.csie.cts.g1094.dp.observer;
import java.util.ArrayList;
import java.util.List;


public class NetworkMonitorModule {
	List<NetworkStatusHandleInterface> modules= new ArrayList<>();
	
	public void register(NetworkStatusHandleInterface module) {
		this.modules.add(module);
	}
	
	public void unregister(NetworkStatusHandleInterface module) {
		this.modules.remove(module);
	}
	public void networkStatusChanged(NetworkStatus status) {
		if(status==NetworkStatus.UP) {
			for(NetworkStatusHandleInterface module :modules) {
				module.connectionUp();
			}
		}
	
		if(status==NetworkStatus.DOWN) {
			for(NetworkStatusHandleInterface module :modules) {
				module.connectionDown();
			}
		}
	}
}
