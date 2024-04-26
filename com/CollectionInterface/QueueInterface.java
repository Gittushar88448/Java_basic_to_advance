package com.CollectionInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Rahul");
        queue.offer("Mehul");
        queue.offer("Ravi");
        queue.offer("Rohan");
        queue.offer("Tillu");

        System.out.println(queue);

        queue.poll();
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.contains("Rahul") ? "Rahul present" : "Rahul is absent");

        System.out.println(queue.peek());
    }

}
