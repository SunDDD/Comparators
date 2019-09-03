package com.algorithms.comparator.test;

import com.algorithms.comparator.student.Student;

import java.util.Arrays;

/**
 * @author Carlos
 * @description 测试
 * @Date 2019/9/3
 */

public class Test {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Chen", 3);
        students[1] = new Student("Kanaga", 3);
        students[2] = new Student("Gazsi", 4);
        students[3] = new Student("Furia", 1);
        students[4] = new Student("Rohde", 2);

//        Insertion.sort(students, Student.BY_NAME);
//        Insertion.sort(students, Student.BY_SECTION);
        Arrays.sort(students, Student.BY_SECTION);

        for (Student student : students) {
            System.out.println(student);
        }

    }

}
