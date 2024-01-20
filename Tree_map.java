// Tree map naturally sorted .
package MyJavaProject.datastructure;

import java.util.Map;
import java.util.TreeMap;

public class Tree_map {
    public static void main(String[] args) {

        Map<String,Integer> map=new TreeMap<>();
        map.put("SAYEED",25);
        map.put("SHEFA",22);
        map.put("RAKIB",35);
        map.put("RAJO",76);
        map.put("ABU",24);
        map.put("NALA",12);

        for (Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey() +" = " + e.getValue());

        }
    }
}
