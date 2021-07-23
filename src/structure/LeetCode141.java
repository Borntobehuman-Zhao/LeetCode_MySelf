package structure;


import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaoyx
 * @date 2021/7/23 15:15
 */
public class LeetCode141 {
    public static void main(String[] args) {

    }

    //循环用set记录该结点是否出现，利用了set的唯一性。
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    //快慢指针，如果有环，慢指针一定能追上快指针，以快指针的是否能走到头为结束标志。
    public static boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    class ListNode {
        public int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}


