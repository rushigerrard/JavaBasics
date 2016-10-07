package com.learning.java.queue;

public class StackUsingQueue {
	private int tail = -1;
	private int head = -1;
	private int queueSize = 3;
	Queue q1 = new Queue();
	Object[] arr = new Object[queueSize];
	
	public void enque(Object item){
		if(tail >= (queueSize - 1)){
			resizeQueue();
		}
		arr[++tail] = item;
		
	}
	
	private void resizeQueue() {
		Object[] temp = arr;
		queueSize = queueSize * 2;
		arr = new Object[queueSize];
		
		for(int i = 0; i <= tail; i++){
			arr[i] = temp[i];
		}
	}
	public Object specialDeque(){
		if(head > tail)
			return null;
		while(head < tail - 1){
			q1.enque(arr[++head]);
		}
		Object item = arr[++head];
		Object item2;
		head = -1;
		tail = -1;
		while((item2 = q1.dequeue()) != null){
			enque(item2);
		}
		return item;
	}
	public Object dequeue(){
		if(head > tail)
			return null;
		if(head == tail){
		}
		Object item = arr[head++];
		return item;
	}
}
