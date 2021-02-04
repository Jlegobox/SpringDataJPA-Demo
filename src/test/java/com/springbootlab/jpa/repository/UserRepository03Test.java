package com.springbootlab.jpa.repository;

import com.springbootlab.jpa.entity.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 15:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepository03Test {
    @Autowired
    private UserRepository03 userRepository;

    @Test
    public void testFindByUsername() {
        UserDO user = userRepository.findByUsername("J");
        System.out.println(user);
    }

    @Test
    public void testFindByCreateTimeAfter() {
        // 创建分页条件
        Pageable pageable = PageRequest.of(1, 10);
        // 执行分页操作
        Date createTime = new Date(2018 - 1990, Calendar.FEBRUARY, 24); // 临时 Demo ，实际不建议这么写
        Page<UserDO> page = userRepository.findByCreateTimeAfter(createTime, pageable);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}
