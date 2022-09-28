import java.util.*;

class Employees {
    int age;
    String name;
    String designation;

    Employees(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {
        return "(age is->" + age + "," + "name is->" + name + "," + "desination is->" + designation + ")";
    }

}

public class Fourth{

    public static void main(String args[]) {
        Employees e1 = new Employees(20, "Yasu", "trainee");
        Employees e2 = new Employees(28, "Kenny", "manager");
        Employees e3 = new Employees(27, "Shipra", "director");
        Employees e4 = new Employees(38, "Deepu", "CEO");

        Map<Employees, Integer> map = new LinkedHashMap<>();

        map.put(e1, 150);
        map.put(e2, 2000);
        map.put(e3, 3882);
        map.put(e4, 1855232);
        for (Employees key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}