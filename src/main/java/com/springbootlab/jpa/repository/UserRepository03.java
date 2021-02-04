package com.springbootlab.jpa.repository;

import com.springbootlab.jpa.entity.UserDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 12:59
 */
public interface UserRepository03 extends PagingAndSortingRepository<UserDO, Integer> {
    UserDO findByUsername(String username);

    Page<UserDO> findByCreateTimeAfter(Date createTime, Pageable pageable);
}
