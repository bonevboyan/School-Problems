package term_2.set_12_stack_queue.sport;

public enum Direction {
    Empty('-'),
    Left('L'),
    Rigth('R');

    char direction;
    Direction(char d) {
        direction = d;
    }
}
