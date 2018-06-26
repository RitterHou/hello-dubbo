package me.hourui.echo.provider;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author hourui 2018/6/15 11:35 AM
 */
@Service(version = "1.0.0")
public class ProviderImpl implements Provider {

    @Override
    public String echo(String s) {
        return s;
    }

    @Override
    public void echo(String s, double d, float f, int i, boolean b) {
        System.out.println(s + d + f + i + b);
    }

}
