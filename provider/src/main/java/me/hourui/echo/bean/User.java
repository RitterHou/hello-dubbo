package me.hourui.echo.bean;

import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author hourui 2018/5/15 14:10
 */
@Setter
@ToString
public class User implements Serializable {

    private Name name;
    private int age;
    private double salary;
    private boolean graduated;
    private Location location;
    private List<Name> friends;
    private long hairs;
    private Object object;
    private List<Integer> workDays;
    private List<Map<String, String>> fuck;
    private String[] books;

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

}
