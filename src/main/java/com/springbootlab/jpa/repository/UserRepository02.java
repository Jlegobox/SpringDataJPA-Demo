package com.springbootlab.jpa.repository;

import com.springbootlab.jpa.entity.UserDO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 12:58
 */
public interface UserRepository02 extends PagingAndSortingRepository<UserDO, Integer> {
}
