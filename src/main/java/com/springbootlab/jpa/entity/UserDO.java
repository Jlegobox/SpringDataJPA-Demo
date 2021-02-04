package com.springbootlab.jpa.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author J
 * @Email jlc_game123@163.com
 * @Date 2021/2/4
 * @Time 11:41
 */
@Entity
@Table(name = "users")
public class UserDO {
    /**
     * 用户编号
     */
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,  // strategy 设置使用数据库主键自增策略；
            generator = "JDBC") // generator 设置插入完成后，查询最后生成的 ID 填充到该属性中。
    private Integer id;
    /**
     * 账号
     */
    @Column(nullable = false)
    private String username;
    /**
     * 密码（明文）
     *
     */
    @Column(nullable = false)
    private String password;
    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false) // 指定数据库内列名为create_time用于映射数据库命名规则和Java不同
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
