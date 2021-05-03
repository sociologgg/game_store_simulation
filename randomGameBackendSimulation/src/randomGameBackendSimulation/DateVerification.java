package randomGameBackendSimulation;

public class DateVerification implements Verification {

	@Override
	public void verify(String message) {
		System.out.println(  message + " " + " Kullanıcısının doğum bilgisi doğrulandı.");
		
	}

}
