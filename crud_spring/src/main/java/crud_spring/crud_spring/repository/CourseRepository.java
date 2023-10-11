package crud_spring.crud_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud_spring.crud_spring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
