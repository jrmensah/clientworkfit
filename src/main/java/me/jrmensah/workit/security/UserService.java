package me.jrmensah.workit.security;

import me.jrmensah.workit.Entity.User;
import me.jrmensah.workit.Repository.RoleRepository;
import me.jrmensah.workit.Repository.TrainerRepository;
import me.jrmensah.workit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;


	@Autowired
	TrainerRepository trainerRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	public Long countByEmail(String email) {
		return userRepository.countByEmail(email);
	}
	public User findByUsername(String username){
		return userRepository.findByUsername(username);
	}


//		public void saveUser(User user) {
//		user.addRole (roleRepository.findByRole("USER"));
//		user.setEnabled(true);
//		userRepository.save(user);
//	}
		public void saveAdmin(User user) {
		user.addRole (roleRepository.findByRole("ADMIN"));
		user.setEnabled(true);
		userRepository.save(user);
	}
}
