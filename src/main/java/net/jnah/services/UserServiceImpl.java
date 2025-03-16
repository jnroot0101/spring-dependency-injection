package net.jnah.services;

import net.jnah.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository; // loosely coupled

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public double calculate() {
        double  data = userRepository.getData();
        double result = data * 12 * Math.PI/2 * Math.cos(data);
        return result;
    }
}
