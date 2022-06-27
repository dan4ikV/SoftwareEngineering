package Iterator;

public class StringIterator implements Iterator {
    private char[] arr;
    private int pos;

    public StringIterator(String text) {
        this.arr = text.toCharArray();
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < arr.length;
    }

    @Override
    public Character next() {
        pos++;
        return arr[pos - 1];
    }
}
