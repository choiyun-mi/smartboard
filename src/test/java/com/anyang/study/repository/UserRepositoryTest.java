package com.anyang.study.repository;

import com.anyang.study.configuration.ApplicationContextConfig;
import com.anyang.study.respository.UserRepository;
import com.anyang.study.vo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContextConfig.class)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Before
    User user1 = new User("userid1", "userpw1", "username1");
    User user2 = new User("userid2", "userpw2", "username2");
    User user3 = new User("userid3", "userpw3", "username3");

    //등록
    @Test
    public void addUser(){
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

    //조회
    @Test
    public void findUser(){
        List<User> users = userRepository.findAll();
        User firstUser = users.get(0);
        assertThat(firstUser.getName(), is("username1"));
    }
    @Test
    public void findUser(){
        User findedUser = userRepository.findById("userid2");
        assertThat(findedUser.getName(), is("username2"));
    }

    //갱신
    @Test
    public void modifyUser(){
        user1.setName("usernewname1");
        User modifiedUser = userRepository.findById("userid1");
        assertThat(modifiedUser.getName(),is("usernewname1"));
    }

    //삭제
    @Test
    public void deleteUser(){
        userRepository.delete(user1);
        List<User> users = userRepository.findAll();
        User firstUser = users.get(0);
        assertThat(firstUser.getName(), is("username2"));
    }
}
