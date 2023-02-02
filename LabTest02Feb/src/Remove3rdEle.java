import java.util.ArrayList;

public class Remove3rdEle {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println("ArrayList Before Removing element : " + list);
        //Remove 3rd Element
        list.remove(2);
        System.out.println("ArrayList After Removing element : " + list);
        

    }
}
