package com.example.community.dao;

import com.example.community.CommunityApplication;
import com.example.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author lmy
 * @create 2022-07-11-21:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() {
//        User user = new User();
//        user.setUsername("test11");
//        user.setPassword("123456");
//        user.setSalt("abc");
//        user.setEmail("test@qq.com");
//        user.setHeaderUrl("http://www.nowcoder.com/101.png");
//        user.setCreateTime(new Date());
//        int i = userMapper.insertUser(user);
        //User user = userMapper.selectById(101);
        System.out.println();
    }
}
