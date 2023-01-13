package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.User;
import com.example.Repository.UserRepository;
import com.example.Service.UserService;

@Repository
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);

	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub

		return userRepository.findAll();
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);

	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub

		User _user = userRepository.findById(user.getUid()).get();
		_user.setUname(user.getUname());
		return userRepository.save(_user);
	}

	public User findUserById(int id) {
		return userRepository.findById(id).get();
	}

}
