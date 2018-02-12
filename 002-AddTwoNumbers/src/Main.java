/**
 * Author: 王俊超
 * Date: 2015-06-18
 * Time: 09:17
 * Declaration: All Rights Reserved !!!
 */

public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();

        ListNode n11 = new ListNode(2);
        ListNode n12 = new ListNode(4);
        ListNode n13 = new ListNode(3);
        n11.next=n12;
        n12.next=n13;

        sl.printList(n11);

        ListNode n21 = new ListNode(5);
        ListNode n22 = new ListNode(6);
        ListNode n23 = new ListNode(4);
        n21.next=n22;
        n22.next=n23;

        sl.printList(n21);

        ListNode result = sl.addTwoNumbers(n11, n21);
        System.out.println("运行结果为：");
        sl.printList(result);
        System.out.println("期望结果为： 7->0->8");
    }
}


