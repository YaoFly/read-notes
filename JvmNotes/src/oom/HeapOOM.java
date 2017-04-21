package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaofly on 2017/2/28.
 *
 * Java堆溢出   设置堆最大值与最小值相等，可避免堆自动扩展
 * VM Args： -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
