package com.example.tentdemo.repository;

import com.example.tentdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value =
            "SELECT *" +
            " FROM test_db.users" +
            " WHERE id = :id",
            nativeQuery = true)
    public Map<String, Object> findUserById(Long id);
}
