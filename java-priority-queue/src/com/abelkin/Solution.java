package com.abelkin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;

class Student implements Comparable {
    private int id;
    private String name;
    private double cgpa;
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getID() {
        return id;
    }
    String getName() {
        return name;
    }

    double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        Student s2 = (Student)o;
        return (this.cgpa < s2.cgpa) ? 1 : ((this.cgpa > s2.cgpa ) ? -1 :
                (this.name.compareTo(s2.name) != 0) ? this.name.compareTo(s2.name) :
                        (Integer.compare(this.id, s2.id)));
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        for (String event : events) {
            String[] els = event.split(" ");
            if (els.length > 1) {
                queue.add(new Student(Integer.parseInt(els[3]), els[1], Double.parseDouble(els[2])));
            } else {
                queue.poll();
            }
        }
        Student[] resArray = queue.toArray(new Student[0]);
        Arrays.sort(resArray);
        return Arrays.asList(resArray);
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}