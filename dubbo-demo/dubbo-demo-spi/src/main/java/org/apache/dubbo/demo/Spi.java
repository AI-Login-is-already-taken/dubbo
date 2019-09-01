package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI(value = "spib")
public interface Spi {

//    @Adaptive(value = "spiType")
    boolean isSupport(String name);

    @Adaptive(value = "spiType")
    String sayHello(URL url);
}
