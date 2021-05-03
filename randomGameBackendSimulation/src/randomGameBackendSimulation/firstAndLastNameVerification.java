package randomGameBackendSimulation;

public class firstAndLastNameVerification implements Verification{

	@Override
	public void verify(String message) {
		System.out.println( message + " " +  "Kullanıcısının isim bilgileri doğrulandı.");
		
	}
	
	
}
