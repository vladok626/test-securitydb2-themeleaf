package ru.urfu.testsecuritydb2themeleaf.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecuritydb2themeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
