package com.algorithms.comparator.insertion;

import java.util.Comparator;

/**
 * @author Carlos
 * @description 测试比较器(Comparator) 使用插入排序
 * @Date 2019/9/3
 */

public class Insertion {

    public static void sort(Object[] a, Comparator comparator) {

        int N = a.length;

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >= 1 && less(comparator, a[j], a[j - 1]); j--)

                exch(a, j, j - 1);

        }

    }

    private static void exch(Object[] a, int i, int j) {

        Object t = a[i];
        a[i] = a[j];
        a[j] = t;

    }

    private static boolean less(Comparator comparator, Object v, Object w) {

        return comparator.compare(v, w) < 0;

    }

}
