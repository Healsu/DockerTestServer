package com.example.dockertestserver.Repository;

import com.example.dockertestserver.Model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends JpaRepository<People,Long> {
}
