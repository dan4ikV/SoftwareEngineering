package Iterator;

public class ArrayIterator<T> implements Iterator{
    private T[] arr;
    private int pos;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
         return pos < arr.length;
    }

    @Override
    public T next() {
        pos++;
        return arr[pos - 1];
    }
}
