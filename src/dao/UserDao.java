package dao;

import model.User;
import org.hibernate.Session;
import util.Main;

/**
 * Created by ${guhao} on 2017/8/18.
 */
public class UserDao {
    public User Query(){
        Session session = Main.getSession();
        User user=session.get(User.class,1);
        return  user;
    }
}
