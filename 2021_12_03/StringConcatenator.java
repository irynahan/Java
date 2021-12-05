public class StringConcatenator implements IConcatenator{
    @Override
    public String concatenate(String[] strings) {
        String resString = "";
        for(int i = 0; i < strings.length; i++) {
            resString += strings[i];
        }
        return resString;
    }
}
