public class Pairwise2 {
    /**
     * The method must calculate the max pairwise product from the array with only non-negative numbers
     *
     * @param array the array to find the product from
     * @return max pairwise product
     */
    // TODO implement this, finding two max numbers (the numbers must be on the different indicies)
    public long twoMaxMultiply(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("array size should be more than 2 ");
        }

        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        int indexPreMax = 0;
        for (int i = 1; i < indexMax; i++) {
            if (array[i] > array[indexPreMax]) {
                indexPreMax = i;
            }
        }
        for (int i = indexMax + 1; i < array.length; i++)
            if (array[i] > array[indexPreMax]) {
                indexPreMax = i;
            }

        return (long) array[indexMax] * array[indexPreMax];
    }

}
