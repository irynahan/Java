import java.util.Arrays;

public class AdvancedIntArray {

    private int[] source;

    public AdvancedIntArray(int initialSize) {
        source = new int[initialSize];
    }

    public int get(int index) {
        return source[index];
    }

    public void set(int index, int value) {
        source[index] = value;
    }

    public int size() {
        return source.length;
    }

    public void append(int value) {
        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[newSource.length - 1] = value;
        source = newSource;
    }

    public void insert(int index, int value) {
        int[] newArray = new int [source.length + 1];
        for(int i = 0; i < index; i++) {
            newArray[i] = source[i];
        }
        newArray[index] = value;

        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = source[i-1];
        }
        source = newArray;
    }

    public void delete(int index) {
        //TODO complete
        int [] newArray = new int [source.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = source[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = source[i + 1];
        }
        source = newArray;
    }

    public boolean contains(int value) {
        boolean isInArray = false;
        for (int i = 0; i < source.length; i++){
            if (source[i] == value){
                isInArray = true;
            }
        }
        return isInArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(source);
    }
}
