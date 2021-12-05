public class CharArrayConcatenator implements IConcatenator {
    /**
     * using char array, whose length is the total length of all the strings in the String array.
     * The implementation should create a char array of the total length, then one by one copy every string into this array.
     * After that create a result string based on this array.
     * @param strings a String array to concatenate
     * @return concatenated string
     */
    @Override
    public String concatenate(String[] strings) {
        int length = 0;
        for(int i = 0; i < strings.length; i++) {
            length += strings[i].length();
        }
        char[] result = new char[length];

        int position=0;
        for(int i = 0; i < strings.length; i++) {
            char [] subchar = strings[i].toCharArray();
            for(char eachChar : subchar){
                result[position]=eachChar;
                position++;
            }
        }
        return new String(result);
    }
}
