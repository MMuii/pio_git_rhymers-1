package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_LIST_RETURN_VALUE = -1;
    private static final int EMPTY_LIST_VALUE = -1;
    private static final int FULL_LIST_VALUE = 11;
    private static final int RHYMER_SIZE = 12;

    private final int[] numbers = new int[RHYMER_SIZE];

    private int total = EMPTY_LIST_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_LIST_VALUE;
    }

    public boolean isFull() {
        return total == FULL_LIST_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_LIST_RETURN_VALUE;
        return numbers[total];
    }

    public int getTotal() {
        return total;
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_LIST_RETURN_VALUE;
        return numbers[total--];
    }

}
