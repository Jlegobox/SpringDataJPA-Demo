package com.springbootlab.jpa.repository;

import com.springbootlab.jpa.entity.UserDO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 13:01
 */
public interface UserRepository04 extends PagingAndSortingRepository<UserDO, Integer> {
    @Query("SELECT u FROM UserDO u WHERE u.username = ?1")
    UserDO findByUsername01(String username);

    @Query("SELECT u FROM UserDO u WHERE u.username = :username")
    UserDO findByUsername02(@Param("username") String username);

    @Query(value = "SELECT * FROM users u WHERE u.username = :username", nativeQuery = true)
    UserDO findByUsername03(@Param("username") String username);

    @Query("UPDATE UserDO  u SET u.username = :username WHERE u.id = :id")
    @Modifying
    int updateUsernameById(Integer id, String username);
}
