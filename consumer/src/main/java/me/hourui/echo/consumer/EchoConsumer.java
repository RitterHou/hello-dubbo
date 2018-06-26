package me.hourui.echo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import me.hourui.echo.provider.Echo;
import org.springframework.stereotype.Component;

@Component
public class EchoConsumer {

    @Reference(version = "1.0.0")
    private Echo echo;

    public void test() {
//        String name = "hello, world";
//        System.out.println("I send something to provider: " + name);
//        System.out.println(echo.echo("张", "三", 18, 2000, false));

//        System.out.println(echo.echo15());
//        System.out.println(echo.echo16());
//        try {
//            echo.echo17();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(echo.echo6(100000.0));
//        echo.test2("🐶");
//        System.out.println(echo.getCity(CityEnum.Nanjing));
    }

}
