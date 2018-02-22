package com.anyang.study.respository;

import com.anyang.study.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findById(String id);
}
