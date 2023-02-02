import java.util.ArrayList;
import java.util.Iterator;

public class ElementSwap {
    public static void swapList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();
        int index = 0;
        while (i1.hasNext() && i2.hasNext()) {
            Integer a = i1.next();
            list1.set(index, i2.next());
            list2.set(index, a);
            index++;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List 1 : ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(50);
        list1.add(40);
        list1.add(30);
        list1.add(20);
        list1.add(10);
        System.out.println("List 2 : ");
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();

        swapList(list, list1);

        System.out.println("List 1 : ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("List 2 : ");
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }

}
