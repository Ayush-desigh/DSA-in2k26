import java.util.Queue;
import  java.util.PriorityQueue;
public class priorityQueue {

/*
What is a Priority Queue?
Definition: A Priority Queue is a special type of Queue in which 
elements are processed or removed based on their priority rather than
their insertion order (FIFO).

In a normal Queue:
- First In → First Out (FIFO).
- The element inserted first is removed first.


In a Priority Queue:
- Elements are removed according to their priority.
- In Java, the default priority is the smallest element first.

Types of Priority Queue

Type 1: Min Priority Queue
- Smallest element has the highest priority.
- Elements are removed in ascending order.

Example: 10, 20, 30, 40

Type 2: Max Priority Queue

- Largest element has the highest priority.
- Elements are removed in descending order.

Example: 40, 30, 20, 10

it is present in 
import java.util.PriorityQueue;

*/
    public static void main(String[] args) {
        
        Queue<Integer> q=new PriorityQueue<>(); // default store in min Heap

        //for maxHeap
        Queue<Integer> q1=new PriorityQueue<>((a,b)->b-a);

        q.offer(90);
        q.offer(80);
        q.offer(70);
        q.offer(50);
        q.offer(30);
        q.offer(10);

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(50);
        q1.offer(70);
        System.out.println(q1);
    }
    
}
