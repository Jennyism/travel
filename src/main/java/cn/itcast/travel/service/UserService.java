package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author Jennyism
 * @date 2019/8/2 0002 20:00
 */
public interface UserService {
    /**
     * 注册用户的方法
     * @param user
     * @return
     */
    boolean regist(User user);

    boolean active(String code);

    User login(User user);
}
