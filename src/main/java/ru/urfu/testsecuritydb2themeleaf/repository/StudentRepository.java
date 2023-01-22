package ru.urfu.testsecuritydb2themeleaf.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.urfu.testsecuritydb2themeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
