package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

// 用户操作Dao
public interface UserDao {
    public List<User> findAll();

    public User findUserByUsernameAndPassword(String username, String password);

    public void add(User user);

    public void delete(int id);

    public User findById(int id);

    public void update(User user);

    /*
    * 查询总记录数
    * @return
    * @param condition
    * */
    public int findTotalCount();

    /*
    * 分页查询每页记录
    * @param start
    * @param rows
    * @param condition
    * @return
    * */
    List<User> findByPage(int start, int rows);

}
