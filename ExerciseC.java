import java.util.HashMap;

public class HashMapConcatenate {


    public static void concatenateNum(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2, HashMap<Integer, Integer> map3) {
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int i : map1.keySet()) {
            newMap.put(i, map1.get(i));
        }
        for (int i : map2.keySet()) {
            newMap.put(i, map2.get(i));
        }
        for (int i : map3.keySet()) {
            newMap.put(i, map3.get(i));
        }
        System.out.println(newMap);

    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> d1 = new HashMap<>();
        HashMap<Integer, Integer> d2 = new HashMap<>();
        HashMap<Integer, Integer> d3 = new HashMap<>();

       d1.put(1, 10);
       d1.put(2, 20);
       d2.put(3, 30);
       d2.put(4, 40);
       d3.put(5, 50);
       d3.put(6, 60);

       concatenateNum(d1,d2,d3);

    }
}

