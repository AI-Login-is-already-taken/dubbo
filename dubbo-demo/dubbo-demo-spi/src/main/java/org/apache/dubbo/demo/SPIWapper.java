package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**AOP示例*/
//@Adaptive(value = "spia")
public class SPIWapper implements Spi {

    private Spi spi;

    public SPIWapper(Spi spi) {
        this.spi = spi;
    }

    @Override
    public boolean isSupport(String name) {
        return spi.isSupport(name);
    }

    @Override
    public String sayHello(URL url) {
        System.out.println("adaptive类");
        return spi.sayHello(null);
    }
}
