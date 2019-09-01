package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;

public class SpiBImp implements Spi {
    @Override
    public boolean isSupport(String name) {
        return "SPIB".equalsIgnoreCase(name.trim());
    }

    @Override
    public String sayHello(URL url) {
        return "hello 我是厂商B";
    }
}
