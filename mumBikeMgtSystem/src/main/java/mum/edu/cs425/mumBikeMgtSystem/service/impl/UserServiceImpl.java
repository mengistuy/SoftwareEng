package mum.edu.cs425.mumBikeMgtSystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs425.mumBikeMgtSystem.dao.UserRepository;
import mum.edu.cs425.mumBikeMgtSystem.model.User;
import mum.edu.cs425.mumBikeMgtSystem.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(User u) {
		userRepo.save(u);
		
	}

	@Override
	public void deleteUser(long id) {
		userRepo.deleteById(id);
		
	}

}
