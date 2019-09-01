package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;

public class SpiAImp implements Spi {
    @Override
    public boolean isSupport(String name) {
        return "APIA".equalsIgnoreCase(name.trim());
    }

    @Override
    public String sayHello(URL url) {
        return "hello 我是A";
    }
}
