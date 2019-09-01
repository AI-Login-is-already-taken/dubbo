package org.apache.dubbo.demo.consumer;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String args[]) throws Exception{
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers.stream().peek(e -> System.out.println("处理：" + e)).filter(e -> e % 2 == 0)
        .findFirst().map(e -> "The value is " + e).orElse("No value found")
        );
        System.out.println("hello");
        Method method = Test.class.getMethod("getStr", String.class);
        Object obj = method.invoke(method, "zhaoxugang");
        System.out.println(obj);
    }

    public String getStr(String name){
        return name;
    }
}