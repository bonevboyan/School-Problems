package term_2.set_12_stack_queue.priortity_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>(List.of("George" , "Jim" , "John" , "Blake" , "Kevin" , "Michael"));
        PriorityQueue<String> queue2 = new PriorityQueue<>(List.of("George" , "Katie" , "Kevin" , "Michelle" , "Ryan"));

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> difference = new ArrayList<>();

        while(!queue1.isEmpty() && !queue2.isEmpty()){
            int diff = queue1.peek().compareTo(queue2.peek());
            if(diff == 0){
                union.add(queue1.poll());
                intersection.add(queue2.poll());
            }else if(diff < 0){
                union.add(queue1.peek());
                difference.add(queue1.poll());
            }else{
                union.add(queue2.peek());
                difference.add(queue2.poll());
            }
        }

        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);
    }
}
