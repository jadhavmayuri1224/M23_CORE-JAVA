package com.tns.collection;

import java.util.PriorityQueue;
import java.util.Queue;
//pool and peek method
public class QueueExample1 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(22);
		q.add(23);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());

	}

}
