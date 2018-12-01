package queue;

public class TestMain {

	public static void main(String[] args) {
		Queue q = new Queue();

		q.put(3);
		q.put(4);
		q.put(7);
		q.put(2);

		System.out.println();

		q.get();
		q.get();

		System.out.println();
		q.getList();
		q.get();
		
		q.put(0);
		q.put(1);
		
		System.out.println();
		q.getList();
		
	}
}
