package smart4j.sample.service.impl;

import org.smart4j.framework.tx.annotation.Service;
import org.smart4j.framework.orm.DataSet;
import smart4j.sample.entity.User;
import smart4j.sample.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @author Yql
 * @create 2019/1/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findUserList() {
        return DataSet.selectList(User.class);
    }

    @Override
    public User findUser(long id) {
        return DataSet.select(User.class,"id = ?",id);
    }

    @Override
    public boolean saveUser(Map<String, Object> fieldMap) {
        return DataSet.insert(User.class,fieldMap);
    }

    @Override
    public boolean updateUser(long id, Map<String, Object> fieldMap) {
        return DataSet.update(User.class,fieldMap,"id = ?",id);
    }

    @Override
    public boolean deleteUser(long id) {
        return DataSet.delete(User.class,"id = ?",id);
    }
}
