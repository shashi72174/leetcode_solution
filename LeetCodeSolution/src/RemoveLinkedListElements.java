class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while(head!=null) {
            if(head.val!=val) {
                while(curr.next!=null){
                    curr = curr.next;
                }
                ListNode node = new ListNode(head.val);
                curr.next = node;
            }
            head = head.next;
        }
        return dummyHead.next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(6);

        removeElements(head.next,6);

    }



}
