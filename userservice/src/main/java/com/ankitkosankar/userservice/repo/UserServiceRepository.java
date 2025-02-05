package com.ankitkosankar.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankitkosankar.userservice.model.User;

@Repository
public interface UserServiceRepository extends JpaRepository<User, Long> {

}
