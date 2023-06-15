public class RotateList61 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) {
        int count = 0, length=0;
        ListNode tempForLength = head;
        while(tempForLength != null){
            tempForLength = tempForLength.next;
            length++;
        }

        if(k == 0 || length == 1 || head == null) return head;

        if(length <= 2){

            while(count < k ){
                ListNode temp = head.next;
                head.next = null;
                temp.next = head;
                head = temp;
                count++;
            }
        }else{
            k = k % length;
            while(count < k ){
                ListNode node = head;
                while(node.next.next != null){
                    node = node.next;
                }
                ListNode temp = node.next;
                node.next = null;
                temp.next = head;
                head = temp;
                count++;
            }
        }
        return head;
    }

}
