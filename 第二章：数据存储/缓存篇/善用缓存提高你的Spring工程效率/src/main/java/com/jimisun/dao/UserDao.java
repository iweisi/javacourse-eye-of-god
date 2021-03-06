package com.jimisun.dao;

import com.jimisun.domain.User;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:15 2018-10-25
 * @Modified By:
 */
public interface UserDao {

    @Cacheable(value = "UserCache", key = "#root.args[0]")
    User getUser(String username);
}
