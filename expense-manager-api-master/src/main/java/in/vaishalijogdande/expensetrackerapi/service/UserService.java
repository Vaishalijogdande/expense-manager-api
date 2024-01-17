package in.vaishalijogdande.expensetrackerapi.service;

import in.vaishalijogdande.expensetrackerapi.entity.User;
import in.vaishalijogdande.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}
