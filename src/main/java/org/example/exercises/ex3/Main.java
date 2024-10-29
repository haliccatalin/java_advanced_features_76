package org.example.exercises.ex3;

import java.util.*;

/*
Student Grades Management (OOP, Collections, Optionals)
Objective: Implement a grading system for students that uses collections to store student records, Optionals to handle empty grades, and Streams for data analysis.
Exercise Steps:
Create Classes:
Define a Student class with fields like id, name, age, and a Map<String, Double> to store subject grades.
Store Students:
Use a List<Student> to hold all student records.
Operations:
Get Grades: Create a method that, given a Student and a subject name, returns an Optional<Double> for the grade in that subject. If the subject doesn’t exist, it should return Optional.empty().
Find: Use Streams to find students with an average grade above 85.
Sort: Sort students based on their average grade and then by name.
Calculate: Find the highest grade in each subject using Streams.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "Alice", 20);
        s1.addGrade("Math", 90.0);
        s1.addGrade("English", 85.0);

        Student s2 = new Student(2, "Bob", 22);
        s2.addGrade("Math", 78.0);
        s2.addGrade("English", 88.0);

        Student s3 = new Student(3, "Charlie", 21);
        s3.addGrade("Math", 92.0);
        s3.addGrade("English", 95.0);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Get grade
        Optional<Double> aliceMathGrade = s1.getGrade("Math");
        aliceMathGrade.ifPresent(grade -> System.out.println("Alice's Math grade: " + grade));

        // Find students with an average grade above 85
        List<Student> highAchievers = students.stream()
                .filter(student -> student.getAverageGrade() > 85)
                .toList();
        highAchievers.forEach(student -> System.out.println("High achiever: " + student.getName()));

        // Sort students by average grade, then by name
        students.sort(Comparator.comparingDouble(Student::getAverageGrade)
                .reversed()
                .thenComparing(Student::getName));
        students.forEach(student ->
                System.out.println(student.getName() + ": Average Grade = " + student.getAverageGrade()));

        // Find the highest grade in each subject
        Map<String, Double> highestGrades = new HashMap<>();
        students.forEach(student -> {
            student.getGrades().forEach((subject, grade) -> {
                highestGrades.merge(subject, grade, Math::max);
            });
        });
        highestGrades.forEach((subject, grade) ->
                System.out.println("Highest grade in " + subject + ": " + grade));
    }
}
