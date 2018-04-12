public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();

        int result1 = sl.lengthOfLongestSubstring("bbbbb");
        System.out.println("运行结果为：" + result1);
        System.out.println("期望结果为： 1");

        int result2 = sl.lengthOfLongestSubstring("abcabcbb");
        System.out.println("运行结果为：" + result2);
        System.out.println("期望结果为： 3");
    }
}


