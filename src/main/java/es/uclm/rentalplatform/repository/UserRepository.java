package es.uclm.rentalplatform.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uclm.rentalplatform.domain.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}