import java.util.Arrays;

public class CustomArrayList <T> implements CustomList <T>{

    private static final int INITIAL_CAPACITY = 8;

    private T[] source;
    private int size;

    public CustomArrayList() {
        source = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public void set(int index, T value) {
        if (index < size && index >=0) {
            source[index] = value;
        } else{
            throw new CustomOutOfBoundsException();
        }
    }

    @Override
    public T get(int index) {
        if (index < size && index >=0) {
            return source[index];
        } else{
            throw new CustomOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T removeById(int index) {
        if (index < size && index >=0) {
            T res = source[index];

            for (int i = index+1; i < size; i++) {
                source[i - 1] = source[i];
            }
            size--;
            return res;
        } else {
            throw new CustomOutOfBoundsException();
        }
    }

    @Override
    public boolean removeByValue(T value) {
        boolean res = false;
        int indexOfValue = 0;
        for (int i = 0; i < size; i++) {
            if (value.equals(source[i])) {
                indexOfValue = i;
                res = true;
            }
        }
        if (res) {
            for (int i = indexOfValue+1; i < size; i++) {
                source[i - 1] = source[i];
            }
            size--;
        }
        return res;
    }

    @Override
    public void add(T value) {
        if(size == source.length)
            increaseCapacity();
        source[size] = value;
        size++;
    }

    private void increaseCapacity() {
        T[] newSource = (T[]) new Object[source.length * 2];
        for(int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        source = newSource;
    }

    @Override
    public void insert(int index, T value) {

        if (index < size && index >=0) {
            if (size == source.length) {
                increaseCapacity();
            }


            for (int i = size; i > index; i--) {
                source[i] = source[i-1];
            }
            source[index] = value;
            size++;
        }
        else {
            throw new CustomOutOfBoundsException();
        }
    }

    @Override
    public void println() {
        for(int i = 0; i < size; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

}
