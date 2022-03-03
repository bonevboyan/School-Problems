package term_2.set_08_stack_queue;

public class QueueOfIntegers {
    private int length;
    private Node front, rear;

    public QueueOfIntegers(){
        length = 0;
        front = rear = null;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            front = node;
        }else {
            rear.setNextNode(node);
        }
        rear = node;
        length++;
    }

    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Empty queue");
        }
        int result = front.getData();
        front = front.getNextNode();
        length--;
        if(isEmpty()){
            rear = null;
        }
        return result;
    }

    public  boolean isEmpty(){
        return length == 0;
    }

    public int size(){
        return length;
    }
}
