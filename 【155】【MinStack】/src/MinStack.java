/**
 * Author: 王俊超
 * Date: 2015-08-21
 * Time: 19:25
 * Declaration: All Rights Reserved !!!
 */
public class MinStack {
    private final static int DEFAULT_SIZE = 1000;
    private int[] stack;
    private int[] minIndex; // 用于保存前n个数据的栈中最小元素的下标
    private int min = Integer.MAX_VALUE; // 用于记录插入过程中的最小数据
    private int index = -1; // 记录最小元素在stack中的位置
    private int current = -1;

    /**
     * <pre>
     * 原题
     * Design a stack that supports push, pop, top, and retrieving
     * the minimum element in constant time.
     * push(x) 