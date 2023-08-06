package com.shekhovtsov.user.repository;

import com.shekhovtsov.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
