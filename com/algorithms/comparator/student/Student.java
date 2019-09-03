package com.algorithms.comparator.student;

import java.util.Comparator;

/**
 * @author Carlos
 * @description 学生类 测试比较器
 * @Date 2019/9/3
 */

public class Student {

    public static final Comparator<Student> BY_NAME = new ByName();
    public static final Comparator<Student> BY_SECTION = new BySection();

    private final String name;
    private final int section;

    public Student(String name, int section) {
        this.name = name;
        this.section = section;
    }

    private static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student v, Student w) {
            return v.name.compareTo(w.name);
        }
    }

    private static class BySection implements Comparator<Student> {
        @Override
        public int compare(Student v, Student w) {
            return v.section - w.section;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", section=" + section +
                '}';
    }
}
