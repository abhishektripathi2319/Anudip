import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }
}
