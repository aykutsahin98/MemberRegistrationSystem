package memberRegistrationSystem.core.concretes;

import memberRegistrationSystem.core.abstracts.RegisterService;
import memberRegistrationSystem.google.googleManager;

public class GoogleManagerAdapter implements RegisterService {

	@Override
	public void register() {
		googleManager manager = new googleManager();
		manager.register();
		
	}



}
