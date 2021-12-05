public class ConcatenationTester {

    /**
     * The method test the performance of concatenation using "concatenator", adding the "string" "number" times to itself
     *
     * @param concatenator - the way (implementation) to test performance with
     * @param string       to concatenate
     * @param number       times to concatenate
     * @return the time taken for the concatenation with "concatenator"
     */
    public long test(IConcatenator concatenator, String string, int number) {
        String[] strings = composeStrings(string, number);
        // TODO measure the time taken for using concatenator.concatenate()
        long startTimeMillis = System.currentTimeMillis();
        concatenator.concatenate(strings);
        return System.currentTimeMillis() - startTimeMillis;
    }

    //TODO implement the method. It must compose a String array from the string number times
    private String[] composeStrings(String string, int number) {
        String [] resultArray = new String[number];
        for (int i = 0; i < resultArray.length; i++ ) {
            resultArray[i] = string;
        }
        return resultArray;
    }
}
