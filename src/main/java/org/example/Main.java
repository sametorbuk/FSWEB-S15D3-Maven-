package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(24,"orbuk","samet"));
        employees.add(new Employee(23,"karakoca","pelin"));
        employees.add(new Employee(21,"kurban","doğukan"));
        employees.add(new Employee(24 ,"samet" ,"orbuk"));



    }



    public static List findDuplicates(List input){
        List copie = new ArrayList<>(input);
        List repeaters = new ArrayList<>();
        List unique = new ArrayList<>();


        for(Object emp : copie){

            if (!unique.contains(emp)){
                unique.add(emp);
            } else{
                repeaters.add(emp);
            }

        }

        return repeaters;


    }


    public static Map findUniques(List input) {
        List copie = new LinkedList(input);
        Set<Employee> toMakeUnique = new HashSet<>();
        Map<Integer, Employee> uniqueMap = new HashMap<>();


        for (Object emp : copie) {
            toMakeUnique.add((Employee) emp);
        }

        int id = 1;
        for (Employee emp : toMakeUnique) {
            uniqueMap.put(id, emp);
            id++;
        }


        return uniqueMap;

    }





















}