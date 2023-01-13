package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.User;
@Service
public interface UserService {

	public User createUser(User user);

	public List<User> findAllUsers();

	public void deleteUser(int id);

	public User updateUser(User user);

	public User findUserById(int id);

}
