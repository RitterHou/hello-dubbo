package me.hourui.echo.bean;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author hourui 2018/5/15 14:10
 */
@Setter
@Builder
@ToString
public class Name implements Serializable {

    private String firstName;
    private String lastName;

}
