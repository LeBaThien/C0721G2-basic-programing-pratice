package b10_dsa_list.exercise.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.addElement(1);//add element
        listInteger.addElement(2);
        listInteger.addElement(3);
        listInteger.addElement(4);
        listInteger.add(3,6);

        System.out.println(listInteger.size());
        System.out.println("element 0: "+listInteger.get(0));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 3: "+listInteger.get(3));
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 5: "+listInteger.get(4));
        System.out.println("element 8: "+listInteger.get(4));

        System.out.println(listInteger.contains(-2));//false
        System.out.println(listInteger.contains(4));//true

    }
}
