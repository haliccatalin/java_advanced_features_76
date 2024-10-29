package org.example.exercises.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Student {
    private int id;
    private String name;
    private int age;
    private Map<String, Double> grades;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, double grade) {
        grades.put(subject, grade);
    }

    public Optional<Double> getGrade(String subject) {
        return Optional.ofNullable(grades.get(subject));
    }

    public double getAverageGrade() {
        return grades.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }
}
