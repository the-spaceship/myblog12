package com.myblog1.myblog12;




import org.apache.catalina.webresources.EmptyResourceSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;



public class TestClass1 {

    public static void main(String[] args) {
  List<Employee> employees = Arrays.asList(
        new Employee("mike",31, "chennai"),
        new Employee("adam", 25, "chennai"),
        new Employee("stallin",31, "pune"),
          new Employee("sam", 34,"bengaluru")
  );
  Map<Integer,List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e->e.getAge()));
     for(Map.Entry<Integer, List<Employee>> entry:  collect.entrySet()){
         int age = entry.getKey();
        List<Employee> employeeswithAge = entry.getValue();
         System.out.println("age:" +age+ "---");
         for(Employee e: employeeswithAge){
             System.out.println(e.getCity());
             System.out.println(e.getName());
         }
     }
   }
}



