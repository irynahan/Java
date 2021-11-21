import java.util.Arrays;

public class CustomArrayList implements CustomList{

    private static final int INITIAL_CAPACITY = 8;

    private int[] source;
    private int size;

    public CustomArrayList() {
        source = new int[INITIAL_CAPACITY];
    }

    @Override
    public void set(int index, int value) {
        if (index < size) {
            source[index] = value;
        } else{
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        }
    }

    @Override
    public int get(int index) {
        if (index < size) {
            return source[index];
        } else{
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (source[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void removeById(int index) {
        if (index < size) {
            int[] newSource = new int[source.length];
            for (int i = 0; i < index; i++) {
                newSource[i] = source[i];
            }
            for (int i = index; i < source.length-1; i++) {
                newSource[i] = source[i + 1];
            }
            source = newSource;
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        }
    }

    @Override
    public void add(int value) {
        if(size == source.length)
            increaseCapacity();
        source[size] = value;
        size++;
    }

    private void increaseCapacity() {
        int[] newSource = new int[source.length * 2];
        for(int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        source = newSource;
    }

    @Override
    public void insert(int index, int value) {
        if (size == source.length) {
            increaseCapacity();
        }
        if (index < size) {
            int[] newSource = new int[source.length];

            for (int i = 0; i < index; i++) {
                newSource[i] = source[i];
            }
            newSource[index] = value;
            for (int i = index + 1; i < newSource.length; i++) {
                newSource[i] = source[i - 1];
            }
            source = newSource;
            size++;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
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
