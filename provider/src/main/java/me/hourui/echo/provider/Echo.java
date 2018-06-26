package me.hourui.echo.provider;

import me.hourui.echo.bean.*;
import me.hourui.echo.bean.product.Product;
import me.hourui.echo.bean.retail.Lock;
import me.hourui.echo.bean.retail.View;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface Echo {
    User echo(String firstName, String lastName, int age, double salary, boolean graduated);

    String echo1(String name);

    boolean echo2(boolean b);

    int echo3(int i1, int i2, int i3, int i4);

    double echo4(double d1, double d2, double d3, double d4, double d5);

    int echo5(int i);

    double echo6(double d);

    long echo7(long i);

    List<String> echo8();

    String[] echo9();

    List<Integer> echo10();

    int[] echo11();

    Integer[] echo12();

    List<Location> echo13();

    Location[] echo14();

    Date echo15();

    Date echo16();

    String echo17();

    void echo18();

    void echo19();

    View echo20();

    Product echo21();

    Shop[] echo22();

    Same echo23();

    Set<String> echo24();

    Bean test0(Bean bean);

    NewUser test1(NewUser newUser, Name name, String s, Location location, Lock lock);

    String test2(String s);

    void test3(String s);

    CityEnum getCity(CityEnum city);

    void test4(String[] strings, int[] ints, Object4Array object4Array);

}
