package randomGameBackendSimulation;

public class UserManager implements UserService {

	
	private Verification[] verifications;
	
	public UserManager(Verification[] verifications) {
		this.verifications = verifications;
		
		
	}
	
	
	@Override
	public void register(User user) {
		
		Utils.verifyAll(verifications, user.getFirstName());
		System.out.println( user.getFirstName() + " " +user.getLastName() + " " + "sisteme kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println( user.getFirstName() + " " +user.getLastName() + " kullanıcısının bilgileri güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println( user.getFirstName() + " " +user.getLastName() + " kullanıcısının bilgileri silindi");
		
	}

}
