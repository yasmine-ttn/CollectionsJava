import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class one {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        List<Float> floatList=new ArrayList<Float>();
        System.out.println("Enter elements:");
        for(int i=0;i<5;i++)
        {
            float f=scanner.nextFloat();
            floatList.add(f);
        }
        float sum=0;
        System.out.println("Elements in float list:");
        for(Float values:floatList)
            System.out.println(values);
        // Getting ListIterator
        ListIterator<Float> floatListIterator
                = floatList.listIterator();

        // Traversing elements using next() method
        while (floatListIterator.hasNext()) {
            sum+=floatListIterator.next();
        }
        System.out.println("Sum of all float values is: "+sum);

    }
}
