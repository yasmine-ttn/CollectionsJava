import java.util.*;

class Employee
{

    List<String> name=new ArrayList<String>();
    double age,salary;
    String fullname;
    public void sortName()
    {
        Collections.sort(name);
//        name.stream().map(s -> s.n).forEach(System.out::print);
        StringBuilder sb=new StringBuilder();
        for(String sn:name) {
            sb.append(sn);
            sb.append(" ");
        }
        this.fullname=sb.toString();
    }
    public Employee(String firstName,String lastName,double a,double s)
    {
        this.age=a;
        this.salary=s;
        this.name.add(firstName);
        this.name.add(lastName);
        sortName();

    }

    public void getDetails()
    {
        System.out.println("Name: "+ this.fullname);
        System.out.println(("Age: "+this.age));
        System.out.println("Salary: "+this.salary);
    }
}
class Sortbysalary implements Comparator<Employee> {

    // Method
    // Sorting in ascending order of salary
    public int compare(Employee a, Employee b)
    {
        if(a.salary<b.salary)
            return -1 ;
        return 1;
    }
}
public class second {
    public static void main(String[] args) {
//        Employee e[]=new Employee[5];
        ArrayList<Employee> e = new ArrayList<Employee>();

        Scanner scanner=new Scanner(System.in);
        for(int j=0;j<3;j++)
        {
           String firstName,lastName;
           double age,salary;
           System.out.println("Enter 1st name: ");
           firstName=scanner.next();
            System.out.println("Enter 2nd name: ");
           lastName=scanner.next();
           System.out.println("Enter age: ");
           age=scanner.nextDouble();
           System.out.println("Enter salary: ");
           salary=scanner.nextDouble();
           e.add(new Employee(firstName,lastName,age,salary));
        }
////        Employee e = new Employee("Zeus", "Zezz",6614, 30000);
        Collections.sort(e, new Sortbysalary());
        for(int i=0;i<e.size();i++)
        {
//            e[i].getDetails();
//            System.out.println(e.get(i));
                e.get(i).getDetails();

            System.out.println();
        }

    }
}
