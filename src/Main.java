import java.util.*;

public class Main {
    /*
    Arraylist manages elements internally.
    Eg: [0][1][2][3]....
    Linkedlist stores elements where in each elemennt has a referemce to its previous and next value
    Eg: [1]->[2]->[3]....
    * */
    private static void doTimings(String typ,List<Integer> list)
    {
//        for(int i=0;i<1E5;i++)
//            list.add(i);
        long start=System.currentTimeMillis();
        //Add items at start of list.Array takes slightlyless time as compared to Linkedlist

        for(int i=0;i<1E5;i++)
            list.add(i);
        //Adding items anywhere else in list. Array takes more time as compared to Linkedlist
        for(int i=0;i<1E5;i++)
            list.add(0,i);

        long end=System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" ms for "+typ);
    }
    public static void main(String[] args) {
//ARRAYLIST IN JAVA
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // ARRAYLIST AND LINKEDLIST IN JAVA
        List<Integer> arrayList=new ArrayList<Integer>();
        List<Integer> linkedList=new LinkedList<Integer>();
        doTimings("ArrayList",arrayList);
        doTimings("Linkedlist",linkedList);

        //HASHMAPS {hashmaps aren't sorted}
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(6,"May");
        hashMap.put(24,"Nov");
        hashMap.put(13,"March");
        hashMap.put(11,"April");
        for(Map.Entry<Integer,String> entry: hashMap.entrySet())
        {
            int key=entry.getKey();
           String value=entry.getValue();
           System.out.println("Key is: "+ key+" and the value is: "+value);
        }
//for(int i=0;i< numbers.size();i++)
//        System.out.println(numbers.get(i));
        for(Integer value:numbers)
            System.out.println(value);

        System.out.println();
        //REMOVING ITEMS FROM ARRAYLIST EASIER TO REMOVE FROM END AND IS HARD(SLOW) TO REMOVE FROM START
        numbers.remove(2);
        for(Integer value:numbers)
            System.out.println(value);
        //LIST INTERFACE
//        List<String> values=new ArrayList<String>();
    }
}