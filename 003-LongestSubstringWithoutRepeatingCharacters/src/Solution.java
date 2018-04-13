import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: 王俊超
 * Date: 2015-06-17
 * Time: 20:46
 * Declaration: All Rights Reserved !!!
 */
public class Solution {
    /**
     * <pre>
     * Given a string, find the length of the longest substring without repeating characters.
     * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
     * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
     *
     * 题目大意：
     * 给定一个字符串，找字符中的最大非重复子串，返回该子串的长度。例如： 字符串"abcabcbb"的最大非重复子串
     * 为"abc"， 长度为3；字符串"bbbbb"的最大非重复子串为"b"， 长度为1。
     * 解题思路：
     * 用now记录当当处理的开始位置
     * 历遍字符串，当当前字符从开始位置now开始已经出现过的时候，子串开始位置+1，否则更新map中的hash值为当前位置。
     * </pre>
     *
     *
     * 解题思路：
     *
     * 借助hashmap来解决，map的键key存放字符串中出现的字符，值value存放该字符当前的位置。
     *
     * 首先创建一个头指针now，指向当前子串的开头，maxLength保存当前最大长度；
     * 刚开始，now指向字符串的第一个字符，随着遍历字符串，如果map中不包含当前字符，
     * 那么now不变，用字符当前位置和now的位置相减，然后再与最大长度进行比较，更新maxLength；
     * 再将当前字符以及它的位置保存到map中；
     * 如果map中包含当前字符，则需改变头指针now所指的位置（将头指针当前位置与map中当前字符所存位置的下一个位置进行比较，
     * 选择最大者作为最新头指针所指位置），然后再更新maxLength；
     * 不管map中有无当前字符，都需在map中更新，记录字符最近出现的位置。
     *
     * 比如：abba
     *
     * （1）初始：maxLength=0；
     *
     * （2）abba：第一个字符a。map中不含该字符，now 指向第一个a； map中添加该字符及其位置，<a,0>； maxLength=1；
     *
     * （3）abba：第二个字符b。map中不含该字符，now指向第一个a； map中添加该字符及其位置，<b,1>； maxLength=2；
     *
     * （4）abba：第三个字符b。map中含有相同字符b，now更新，指向2  { [（map中b的位置为1 ) +1 ] > (now=0）}；
     *           map中更新该字符及其位置，<b,2>； maxLength=1；
     *
     * （5）abba：第四个字符a。map中含有该字符，更新map种该字符最新位置，<a,3>；now指向第二个b，maxLength=2；
     *
     *
     *
     * @param s
     * @return
     */
    // 可以处理所有的UTF-8字符
    public int lengthOfLongestSubstring(String s) {
        // 字符串输入不合法
        if (s == null) {
            return 0;
        }

        // 当前处理的开始位置
        int now = 0;
        // 保存结果
        int maxLength = 0;
        // 访问标记，记录最新一次访问的字符和位置
        Map<Character, Integer> map = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) && map.get(ch) >= now) {
                // 如果字符已经出现过(在标记开位置算起)，就重新标记now
                now = map.get(ch) + 1;
            } else {
                // 如果没有出现过就求最大的非重复子串的长度
                maxLength = Math.max(maxLength, i - now + 1);
            }
            // 更新访问记录
            map.put(ch, i);
        }
        return maxLength;
    }

    // 只考虑ASCII字符
    public int lengthOfLongestSubstring2(String s) {
        // 字符串输入不合法
        if (s == null) {
            return 0;
        }

        // 标记字符是否出现过，并且记录是的最新一次访问的元素的位置
        int[] appear = new int[256];
        // 初始化为-1
        Arrays.fill(appear, -1);
        // 当前处理的开始位置
        int now = 0;
        // 保存结果
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // 如果字符已经出现过(在标记开位置)，就重新标记now
            if (appear[s.charAt(i)] >= now) {
                now = i + 1;
            }
            // 如果没有出现过就求最大的非重复子串的长度
            else {
                maxLength = Math.max(maxLength, i - now + 1);
            }
            // 标记第i个字符已经被访问过（最新是第i个位置）
            appear[s.charAt(i)] = i;
        }

        return maxLength;
    }
}
