package MyJavaProject.datastructure;


public class TreeMap {

    public static void main(String[] args) {

        java.util.TreeMap<Integer,String> map=new java.util.TreeMap<>();
        map.put(1,"jako");
        map.put(4,"jamal");
        map.put(2,"jalal");
        map.put(19,"jami");
        System.out.println(map);
        System.out.println("First key:"+map.firstKey());
        System.out.println("Last key:"+map.lastKey());
        System.out.println("Lower Key:"+map.lowerKey(3));
        System.out.println("Higher key:"+map.higherKey(4));


    }
}
