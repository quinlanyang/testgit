package smart4j.sample.service;

import smart4j.sample.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author Yql
 * @create 2019/1/10
 */
public interface UserService {
    List<User> findUserList();

    User findUser(long id);

    boolean saveUser(Map<String,Object> fieldMap);

    boolean updateUser(long id, Map<String,Object> fieldMap);

    boolean deleteUser(long id);
}
