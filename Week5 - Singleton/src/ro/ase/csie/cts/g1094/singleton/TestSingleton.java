package ro.ase.csie.cts.g1094.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//DbConnection con1=new DbConnection("127.0.0.1:3306","cts");
		
		//DbConnection con1=DbConnection.getConnection();
		//DbConnection con2=DbConnection.getConnection();
		DbConnection con1=DbConnection.getConnection("127.0.0.1:1443","cts");
		DbConnection con2=DbConnection.getConnection("127.0.0.1:1443","cts");
		
		DbConnection con3=DbConnection.getConnection("10.0.0.1:1443","productonDB");
		
		if(con1==con2) {
			System.out.println("The are pointing to the same db");
		}
		
		
		
	}

}
