package oom;

/**
 * Created by ooopic on 2017/3/1.
 *
 * 虚拟机栈和本地方法栈溢出  栈容量只由-Xss参数设定
 * VM Args： -Xss2M
 */
public class VMStackOOM {

    private void dontStop(){
        while(true){
        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        VMStackOOM oom = new VMStackOOM();
        oom.stackLeakByThread();
    }
}
