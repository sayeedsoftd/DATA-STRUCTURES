package MyJavaProject.datastructure;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMap {
    public static <map> void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>(); // create HasMap
        map.put("Shafi",1); // insert value
        map.put("Bala",2);
        map.put("kamal",3);
        map.put("Rohi",4);
        map.put("Nasima",5);
        System.out.println(map);
        map.put("Bala",6); // update value
        System.out.println(map); // print value

        map.remove("Rohi"); // remove keys in a map
        System.out.println(map);

        // search operation
        /*containsKey()==This method is used in Map Interface in Java to check whether
         a particular key is being mapped into the Map or not
        * */

        if (map.containsKey("Bala"))
        {
            System.out.println("Key is present this map .");
        }
        else
        {
            System.out.println("Key is not present in the map .");
        }

      /// use of get() function
        System.out.println(map.get("Bala")); //value  exist
        System.out.println(map.get("Sayeed")); // value doesn't exist because this value is not in the map

      for (Map.Entry<String,Integer> e : map.entrySet())
      {
          System.out.println(e.getKey());
          System.out.println(e.getValue());      // iterate the map
      }
        Set<String> keys=map.keySet();  // store all values in keys
        for (String key:keys)
        {
            System.out.println(key + " " + map.get(key));  // print all keys
        }
        System.out.println(map.size());  // check size in map .
    }
}
