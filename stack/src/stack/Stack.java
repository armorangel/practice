package stack;

import java.util.ArrayList;

public class Stack {

	private final int SIZE = 10;

	private int ind;

	public Stack() {
		ind = 0;
	}

	private ArrayList<Integer> arr = new ArrayList<Integer>();

	// Last in First Out

	public void push(int num) {
		if (SIZE < ind) {
			System.out.println("overflow...");
			return;
		} else {
			System.out.println("push :: " + num);
			arr.add(ind++, num);
		}
	}

	public void pop() {
		if (ind == 0) {
			System.out.println("index is 0..");
			return;
		} else {
			System.out.println("pop :: " + arr.remove(--ind));
		}

	}

	public void getInd() {
		System.out.println("now Index = " + ind);
	}

	public void getList() {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + " :: " + arr.get(i));
		}
	}
}
