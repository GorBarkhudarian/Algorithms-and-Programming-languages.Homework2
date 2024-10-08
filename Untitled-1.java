//N;2
// import java.util.Arrays; 

// public class insertionSort 
// { 

// 	static void insertionSortRecursive(int arr[], int n) 
// 	{ 
// 		if (n <= 1) 
// 			return; 
// 		insertionSortRecursive( arr, n-1 ); 
// 		int last = arr[n-1]; 
// 		int j = n-2; 
// 		while (j >= 0 && arr[j] > last) 
// 		{ 
// 			arr[j+1] = arr[j]; 
// 			j--; 
// 		} 
// 		arr[j+1] = last; 
// 	} 
	
// 	public static void main(String[] args) 
// 	{ 
// 		int arr[] = {100, 50, 60, 20, 40}; 
	
// 		insertionSortRecursive(arr, arr.length); 
		
// 		System.out.println(Arrays.toString(arr)); 
// 	} 
// } 


//N:2
// import java.util.*; // I did not know about this one -> .*

// class Queue {
//     int first, rear, amount;
//     int[] queue;

//     Queue(int c) {
//         first = 0;
//         rear = -1;
//         amount = c;
//         queue = new int[amount];
//     }

//     void enqueue(int data) {
//         if (rear == amount - 1) {
//             System.out.println("Queue is full");
//             return;
//         }

//         queue[++rear] = data;
//     }

//     void dequeue() {
//         if (first > rear) {
//             System.out.println("Queue is empty");
//             return;
//         }

//         for (int i = 0; i < rear; i++) {
//             queue[i] = queue[i + 1];
//         }

//         rear--;
//     }

//     void display() {
//         if (first > rear) {
//             System.out.println("Queue is Empty");
//             return;
//         }

//         for (int i = first; i <= rear; i++) {
//             System.out.print(queue[i] + ", ");
//         }
//         System.out.println();
//     }

//     void first() {
//         if (rear == -1) {
//             System.out.println("Queue is Empty");
//             return;
//         }
//         System.out.println("First Element is: " + queue[first]);
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);

//         q.display();

//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.enqueue(40);
//         q.enqueue(50);

//         q.display();

//         q.enqueue(60);

//         q.display();

//         q.dequeue();
//         q.dequeue();
//         q.dequeue();

//         System.out.println("After tree deletions");

//         q.display();

//         System.out.println("After one insertion");
//         q.enqueue(60);

//         q.display();

//         q.first();
//     }
// }
