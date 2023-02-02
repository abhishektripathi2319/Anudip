import java.util.ArrayList;
import java.util.Iterator;

/**
 * ColorCollections
 */
public class ColorCollections {
    
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("Blue");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        Iterator<String> itr = colorList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}