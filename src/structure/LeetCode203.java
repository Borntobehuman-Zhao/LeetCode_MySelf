package structure;

/**
 * @author zhaoyx
 * @date 2021/8/5 10:47
 */
public class LeetCode203 {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode rs = temp;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return rs.next;
    }

    public static ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements1(head.next, val);
        return head.val == val ? head.next : head;
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



