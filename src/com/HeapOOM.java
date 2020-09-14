package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆溢出
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * 	at java.base/java.util.Arrays.copyOf(Arrays.java:3720)
 * 	at java.base/java.util.Arrays.copyOf(Arrays.java:3689)
 * 	at java.base/java.util.ArrayList.grow(ArrayList.java:237)
 * 	at java.base/java.util.ArrayList.grow(ArrayList.java:242)
 * 	at java.base/java.util.ArrayList.add(ArrayList.java:485)
 * 	at java.base/java.util.ArrayList.add(ArrayList.java:498)
 * 	at com.HeapOOM.main(HeapOOM.java:15)
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
