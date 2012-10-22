
package genericslab;

import java.util.*;
public class GenericsLAB {

    public static void main(String[] args) {
    List listNonGeneric = new ArrayList();
    
    listNonGeneric.add("Guitar");
    listNonGeneric.add("Drums");
    listNonGeneric.add("Programming");
    
    for(Object s: listNonGeneric){
        System.out.println(s.toString());
    }
    
    System.out.println("");
        
    List<Employee> listGeneric = new ArrayList<>();
    
    Employee employee1 = new Employee("Nowak","Brent","111-22-3333");
    Employee employee2 = new Employee("Smith","John","222-33-4444");
    Employee employee3 = new Employee("Meander","Jill","111-22-3333");
    
    listGeneric.add(employee1);
    listGeneric.add(employee2);
    listGeneric.add(employee3);
    
    for (Employee e : listGeneric){
        System.out.println(e.getFirstName());
    }
    
    System.out.println("");
    
    List listNonGenericMultObj = new ArrayList();
    
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    
    listNonGenericMultObj.add(employee1);
    listNonGenericMultObj.add(employee2);
    listNonGenericMultObj.add(dog1);
    listNonGenericMultObj.add(dog2);
    
    for (Object e : listNonGenericMultObj){
        if (e instanceof Employee){
        ((Employee)e).getFirstName();
    }else if (e instanceof Dog){
        ((Dog)e).getName();
        }
    }
    
    
    Set<Employee> employeeSet = new HashSet<>();
    
    employeeSet.add(employee1);
    employeeSet.add(employee2);
    employeeSet.add(employee3);
    
    System.out.println(employeeSet);
    
    List<Employee> employeeSetList = new ArrayList<>(employeeSet);
    
    for (Employee i : employeeSetList){
        System.out.println(i.getFirstName());
    }
    
            
    
    
    
    
    
    
    }
}
