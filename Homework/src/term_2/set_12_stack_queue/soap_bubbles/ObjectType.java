package term_2.set_12_stack_queue.soap_bubbles;

public enum ObjectType {
    Empty('-'),
    Bubble('O'),
    UpPin('L'),
    DownPin('T' );

    char price;
    ObjectType(char p) {
        price = p;
    }
}
