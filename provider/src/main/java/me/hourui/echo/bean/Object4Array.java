package me.hourui.echo.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author hourui 2018/6/26 4:05 PM
 */
@ToString
public class Object4Array implements Serializable {

    private List<Location> locations;
    private List<User1> users;
    private Set<String> strings;

}
