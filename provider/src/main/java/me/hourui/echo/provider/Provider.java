package me.hourui.echo.provider;

/**
 * @author hourui 2018/6/15 11:34 AM
 */
public interface Provider {

    String echo(String s);

    void echo(String s, double d, float f, int i, boolean b);

}
