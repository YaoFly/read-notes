package oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by ooopic on 2017/3/1.
 *
 * DirectMemory容量通过MaxDirectMemorySize指定，如果不指定，则默认与Java堆最大值一样
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {

    private  static final int _1MB = 1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        while (true){
            //向操作系统申请分配内存
            unsafe.allocateMemory(_1MB);
        }
    }
}
