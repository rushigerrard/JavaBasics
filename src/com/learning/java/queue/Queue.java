package com.learning.java.queue;

public class Queue{
	private int tail = -1;
	private int head = -1;
	private int queueSize = 3;
	Object[] arr = new Object[queueSize];
	
	public void enque(Object item){
		if(tail >= (queueSize - 1)){
			resizeQueue();
		}
		arr[++tail] = item;
		if(head == -1){
			head++;
		}
	}
	
	private void resizeQueue() {
		Object[] temp = arr;
		queueSize = queueSize * 2;
		arr = new Object[queueSize];
		
		for(int i = 0; i <= tail; i++){
			arr[i] = temp[i];
		}
	}
	
	public Object dequeue(){
		if(head > tail)
			return null;
		
		Object item = arr[head++];
		
		return item;
	}
}


