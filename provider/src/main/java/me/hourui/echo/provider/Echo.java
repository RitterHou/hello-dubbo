package me.hourui.echo.provider;

import me.hourui.echo.bean.Location;
import me.hourui.echo.bean.User;

import java.util.List;

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

}
