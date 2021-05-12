package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Veritabanına eklendi: " +user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Veritabanında güncellendi: " +user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Veritabanından silindi: " +user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
	
		return null;
	}

	@Override
	public List<String> getAllEMail() {
		List<String> eMailList = new ArrayList<String>();
		eMailList.add("srcnbsrn@gmail.com");
		eMailList.add("serkan@gmail.com");
		return eMailList;
	}

}
