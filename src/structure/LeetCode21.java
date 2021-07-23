package structure;


/**
 * @author zhaoyx
 * @date 2021/7/23 15:30
 * 合并两个有序链表
 */
public class LeetCode21 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prep = new ListNode(-1);
        ListNode pre = prep;
        prep.next = pre;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                pre.next = l2;
                l2 = l2.next;
            } else {
                pre.next = l1;
                l1 = l1.next;
            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return prep.next;
    }

    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode prep = new ListNode(-1);
        ListNode pre = prep;
        prep.next = pre;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                pre.next = l2;
                l2 = l2.next;
            } else {
                pre.next = l1;
                l1 = l1.next;
            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return prep.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


