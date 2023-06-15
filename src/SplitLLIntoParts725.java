public class SplitLLIntoParts725 {

//    public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, RotateList61.ListNode next) { this.val = val; this.next = next; }
//    }

    public static void main(String[] args) {

    }

    public RotateList61.ListNode[] splitListToParts(RotateList61.ListNode head, int k) {
        RotateList61.ListNode[] listNodes = new RotateList61.ListNode[k];
        RotateList61.ListNode temp = head;
        int length = 0;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        return listNodes;
    }
}
