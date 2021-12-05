public class StringBufferConcatenator implements IConcatenator {
    @Override
    public String concatenate(String[] strings) {
        StringBuffer bufferResult = new StringBuffer();
        for(int i = 0; i < strings.length; i++) {
            bufferResult.append(strings[i]);
        }
        return bufferResult.toString();
    }
}
