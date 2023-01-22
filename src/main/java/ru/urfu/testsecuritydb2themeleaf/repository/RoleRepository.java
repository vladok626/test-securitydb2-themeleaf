package ru.urfu.testsecuritydb2themeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecuritydb2themeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
