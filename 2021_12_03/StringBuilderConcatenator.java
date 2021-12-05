public class StringBuilderConcatenator implements IConcatenator {
    @Override
    public String concatenate(String[] strings) {
        StringBuilder builderResult = new StringBuilder();
        for(int i = 0; i < strings.length; i++) {
            builderResult.append(strings[i]);
        }
        return new String(builderResult);
    }
}
