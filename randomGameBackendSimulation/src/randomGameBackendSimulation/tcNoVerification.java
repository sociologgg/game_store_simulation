package randomGameBackendSimulation;

public class tcNoVerification implements Verification {

	@Override
	public void verify(String message) {
		System.out.println(  message + " " +  " Kullanıcısının TcNo bilgisi doğrulandı.");
		
	}

}
