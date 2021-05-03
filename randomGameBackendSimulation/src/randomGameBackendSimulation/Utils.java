package randomGameBackendSimulation;

public class Utils{
	
	public static void verifyAll(Verification[] verifications, String message) {
		
		for(Verification verifier : verifications){
			verifier.verify(message);
			
		}
	}

}
