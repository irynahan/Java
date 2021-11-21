public class Main {

    public static void main(String[] args) {
        CustomArrayList myList = new CustomArrayList();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.println();
        System.out.println(myList.size());
        myList.set(1, 99);
        myList.println();
        System.out.println(myList.get(2));
        System.out.println(myList.contains(2));
        System.out.println(myList.contains(0));

        myList.insert(2,44);
        myList.println();
        System.out.println(myList.size());

        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(7);
        myList.add(7);
        myList.add(9);
        myList.println();
        System.out.println(myList.size());
        myList.removeById(0);
        myList.println();
        System.out.println(myList.size());

    }
}
