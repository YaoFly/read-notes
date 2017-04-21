package oom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yaofly on 2017/3/1.
 *
 * 运行时常量池溢出 PermGen space
 * VM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        //使用List保持着常量池引用，避免Full GC 回收常量池行为
        List<String> list = new ArrayList<>();
        //10MB的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
        //jdk1.7以上版本，intern()方法不再复制实例，只是在常量池中记录首次出现的实力引用，
    }

    public static void intern() {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
