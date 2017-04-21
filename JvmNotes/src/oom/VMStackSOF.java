package oom;


/**
 * Created by yaofly on 2017/3/1.
 *
 * 虚拟机栈和本地方法栈溢出  栈容量只由-Xss参数设定
 * VM Args： -Xss128k
 */
public class VMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        VMStackSOF sof = new VMStackSOF();
        try{
            sof.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+sof.stackLength);
            throw e;
        }
    }

}
