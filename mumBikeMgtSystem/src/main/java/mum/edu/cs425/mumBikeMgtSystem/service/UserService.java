package mum.edu.cs425.mumBikeMgtSystem.service;
import java.util.List;

import mum.edu.cs425.mumBikeMgtSystem.model.User;
public interface UserService {
	public List<User> getAllUsers();
	public User getUserById(long id);
	public void saveOrUpdate(User u);
	public void deleteUser(long id);
}
