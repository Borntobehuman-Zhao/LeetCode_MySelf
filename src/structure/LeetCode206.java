package structure;

/**
 * @author zhaoyx
 * @date 2021/8/5 15:29
 */
public class LeetCode206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }

    class ListNode {
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

