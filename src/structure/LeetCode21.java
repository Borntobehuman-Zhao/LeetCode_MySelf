package structure;


/**
 * @author zhaoyx
 * @date 2021/7/23 15:30
 * 合并两个有序链表
 */
public class LeetCode21 {
    public static void main(String[] args) {

    }

    //暴力循环，比较大小，将较小的和指针同时移动，确保指针在下一个数前。循环玩一个链表后，处理剩下的链表
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

    //递归求解，自顶向下，某个链表为空，返回另一个，否则比较两个链表的头结点，将较小的指针的next指向其余结点的集合。
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        return l1;
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


