import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0, "Java");
        map.put(1,"Is");
        map.put(2,"A Platform");
        map.put(3,"Independent");
        map.put(4,"Language");
        System.out.println("Total Key-Value Pair : "+ map.size());
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println("Key => "+e.getKey()+",  Value => "+e.getValue());
        }


        
    }
}
