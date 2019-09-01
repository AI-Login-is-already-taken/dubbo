package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;

/**依赖注入示例*/
public class SPIOperatorA implements SPIOperator {

    private Spi spi;

    public Spi getSpi() {
        return spi;
    }

    public void setSpi(Spi spi) {
        this.spi = spi;
    }

    @Override
    public void operate(URL url) {
        System.out.println("SPIOperate。。。");
        System.out.println(spi.sayHello(url));
    }
}
