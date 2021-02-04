package com.springbootlab.jpa.repository;

import com.springbootlab.jpa.entity.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 15:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepository04Test {
    @Autowired
    private UserRepository04 userRepository;

    @Test
    public void testFindIdByUsername01() {
        UserDO user = userRepository.findByUsername01("J");
        System.out.println(user);
    }

    @Test
    public void testFindIdByUsername02() {
        UserDO user = userRepository.findByUsername02("J");
        System.out.println(user);
    }

    @Test
    public void testFindIdByUsername03() {
        UserDO user = userRepository.findByUsername03("J");
        System.out.println(user);
    }

    @Test
    // 更新操作，需要在事务中。
    // 在单元测试中，事务默认回滚，所以可能怎么测试，事务都不更新。
    @Transactional
    public void testUpdateUsernameById() {
        userRepository.updateUsernameById(5, "jiang");
    }
}
