package smart4j.sample.action;

import org.smart4j.framework.ioc.annotation.Inject;
import org.smart4j.framework.mvc.annotation.Action;
import smart4j.sample.service.UserService;

/**
 * @author Yql
 * @create 2019/1/10
 */
@Action
public class UserAction {
    @Inject
    private UserService userService;


}
