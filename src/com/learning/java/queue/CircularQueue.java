package com.learning.java.queue;

public class CircularQueue{
	
	int head = 0;
	int tail = 0;
	int queueSize = 2;
	
	Object[] arr = new Object[queueSize];
	
	public void enqueue(Object item){
		int s = size();
		if(s == queueSize){
			System.out.println("Resizing the queue");
			resizeQueue();
		}
		
		if(tail == queueSize){
			tail = 0;
		}
		arr[tail++] = item;
		
	}
	
	public Object dequeue(){
		if(isEmpty()){
			return null;
		}
		Object item = arr[head++];
		if(head == queueSize){
			head = 0;
		}
		return item;
	}
	
	private void resizeQueue() {
		Object[] temp = arr;
		int s = size();
		int lastIndex = s;
		int i = 0;

		queueSize = queueSize * 2;
		arr = new Object[queueSize];

		while(s > 0){
			s--;
			arr[i++] = temp[head++];
			if(head == lastIndex)
				head = 0;

		}
		head = 0;
		tail = lastIndex;
	}
	private boolean isFull() {
		if(size() == queueSize)
			return true;
		return false;
	}
	private int size(){
		return Math.abs( Math.abs(queueSize - head) - Math.abs(queueSize - tail) );
	}
	private Boolean isEmpty(){
		return head == tail;
	}
}