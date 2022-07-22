package com.kt.springdemodatajpa.repository;

import com.kt.springdemodatajpa.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserInfo, Long> {

    Optional<UserInfo> findByUserId(String userId);


}
