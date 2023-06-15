public class Main {
    public static void main(String[] args) {
        RotateList61 rotateList61 = new RotateList61();
        RotateList61.ListNode head = new RotateList61.ListNode(1, new RotateList61.ListNode(2, null));
        RotateList61.ListNode listNode = rotateList61.rotateRight(head, 1);
        while(listNode !=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}