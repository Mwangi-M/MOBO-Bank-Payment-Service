package com.example.moboBank.model;

import com.example.moboBank.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<model.User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public model.User getUserById(Long id) {
        Optional<model.User> user = userRepository.findById(id);
        if(((Optional<?>) user).isPresent()) {
            return user.get();
        } else {
            throw new ResourceNotFoundException("User", "id", id);
        }
    }

    @Override
    public model.User createUser(model.User user) {
        return userRepository.save(user);
    }

    @Override
    public model.User updateUser(Long id, model.User userDetails) {
        model.User user = getUserById(id);
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        model.User updatedUser = userRepository.save(user);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long id) {
        model.User user = getUserById(id);
        userRepository.delete(user);
    }

    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
            super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        }
    }
}
