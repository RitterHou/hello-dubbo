package me.hourui.echo.bean;

import lombok.ToString;
import me.hourui.echo.bean.retail.Employee;
import me.hourui.echo.bean.retail.Lock;

import java.io.Serializable;

/**
 * @author hourui 2018/6/22 2:34 PM
 */
@ToString
public class NewUser implements Serializable {

    private String horse = "🐴";
    private User1 user1 = new User1();
    private User2 user2 = new User2();
    private User3 user3 = new User3();
    private User4 user4 = new User4();
    private User5 user5 = new User5();
    private User6 user6 = new User6();
    private User7 user7 = new User7();
    private User8 user8 = new User8();
    private User9 user9 = new User9();
    private User10 user10 = new User10();
    private User11 user11 = new User11();
    private User12 user12 = new User12();
    private User13 user13 = new User13();
    private Location location = new Location();
    private Name name = new Name("隔壁", "王叔叔");
    private Lock lock = Lock.builder()
            .lockReason("")
            .locked(false)
            .employee(Employee.builder().build())
            .build();

}
