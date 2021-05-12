package eTicaret.business.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user, boolean isGoogleUsed);
	void logout(User user);
	List<User> getAll();
}