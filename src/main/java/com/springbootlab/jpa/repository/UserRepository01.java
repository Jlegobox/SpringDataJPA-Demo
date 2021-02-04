package com.springbootlab.jpa.repository;

import com.springbootlab.jpa.entity.UserDO;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 11:48
 */
public interface UserRepository01 extends CrudRepository<UserDO,Integer> {

}
