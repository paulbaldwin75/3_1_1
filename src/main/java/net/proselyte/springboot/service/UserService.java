package net.proselyte.springboot.service;

import net.proselyte.springboot.model.User;
import net.proselyte.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }

    public void edit(User user) {
        userRepository.save(user);
    }

    public User getById(long id){
        return userRepository.getReferenceById(id);
    }
}
