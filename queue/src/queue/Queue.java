package queue;

import java.util.ArrayList;

public class Queue {

	private final int size = 10;

	private int head;
	private int tail;

	public Queue() {
		head = 0;
		tail = 0;
	}

	// Last In Last Out

	// front get
	// rear put
	private ArrayList<Integer> arr = new ArrayList<Integer>();

	public boolean checkIndex() {
		if (head > tail)
			return false;
		else
			return true;
	}

	public void put(int num) {
		if (checkIndex()) {
			arr.add(tail++, num);
			System.out.println("put :: " + num);
		} else {
			System.out.println("머리가 더 커");
		}
	}

	public void get() {
		if (head >= tail) {
			System.out.println("꺼낼게 없어");
		} else {
			System.out.println("get :: " + arr.get(head++));
		}
	}

	public void getList() {
		for (int i = head; i < tail; i++) {
			System.out.println(arr.get(i));
		}
	}

}
