package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @author Jennyism
 * @date 2019/8/2 0002 20:00
 */
public interface UserDao {

    /**
     * 根据用户查询用户信息
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 用户保存
     * @param user
     */
    public void save(User user);

    User findByCode(String code);

    void updateStatus(User user);

    User findByUsernameAndPassword(String username, String password);
}
