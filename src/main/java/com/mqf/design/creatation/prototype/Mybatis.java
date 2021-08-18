package com.mqf.design.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

public class Mybatis {

    private Map<String, User> userCache = new HashMap<>();


    /**
     * 从数据库查对象
     *
     * @return
     */
    public User getUser(String username) throws CloneNotSupportedException {
        User user = null;
        if (!userCache.containsKey(username)) {
            //从数据库查
            user = getUserFromDb(username);
        } else {
            //从缓存中直接拿，脏缓存问题
            //原型已经拿到，不能直接给
            user = userCache.get(username);
            //从这个对象快速得到一个克隆体
            user = (User) user.clone();
        }
        return user;
    }

    private User getUserFromDb(String username) throws CloneNotSupportedException {
        System.out.println("从数据库查用户" + username + "并创建对象");
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userCache.put(username, (User) user.clone());
        return user;
    }


}
