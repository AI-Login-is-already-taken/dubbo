package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]){
//        ExtensionLoader loader = ExtensionLoader.getExtensionLoader(Spi.class);
//        Spi spi = (Spi)loader.getExtension("true");
//        System.out.println(spi.sayHello(null));
//
//        Spi spia = (Spi)loader.getExtension("spia");
//        System.out.println(spia.sayHello(null));

        ExtensionLoader operatorLoader = ExtensionLoader.getExtensionLoader(SPIOperator.class);
        SPIOperator operatora = (SPIOperator) operatorLoader.getExtension("operatora");
        Map<String, String> params = new HashMap<>();
        params.put("spiType", "spia");
        URL url = new URL("", "", 0, params);
        operatora.operate(url);
    }
}
