package es.uclm.rentalplatform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.uclm.rentalplatform.domain.User;
import es.uclm.rentalplatform.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public boolean existsByEmail(String email) {
        return repository.findByEmail(email).isPresent();
    }

    public User save(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}