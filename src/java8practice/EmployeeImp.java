package java8practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeImp {


    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(500,"shiva",150000));
        list.add(new Employee(504,"kalyan",120000));
        list.add(new Employee(499,"venkata",100000));
        list.add(new Employee(507,"yerva",45000));

        System.out.println("Initial List : ");
        list.forEach(System.out::println);

        Comparator<Employee> sortByName=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Employee> sortById=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        };

        Comparator<Employee> salary=(Employee e1,Employee e2)-> (int) (e1.getSalary()-e2.getSalary());

        Collections.sort(list, salary);
        System.out.println("\n Standard Sorted by Name : ");
        list.forEach(System.out::println);

        Comparator<Employee> lamdbaSortById=Comparator.comparingInt(Employee::getId);
        list.sort(lamdbaSortById);
        System.out.println("Sorted  by Id: ");
        list.forEach(System.out::println);

        Comparator<Employee> lamdbaSortBySalary= Comparator.comparingDouble(Employee::getSalary).reversed();
        list.sort(lamdbaSortBySalary);

        System.out.println("Sorted  by salary: ");
        list.forEach(System.out::println);
    }
}
