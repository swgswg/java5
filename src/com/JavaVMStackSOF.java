package com;

/**
 * 虚拟机栈溢出
 * Exception in thread "main" java.lang.StackOverflowError
 * 	at com.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
 * 	at com.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
 * 	at com.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
 * 	at com.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
