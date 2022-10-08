public class MiddleOfLL876 {
    private static ListNode head;
    public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String[] args) {
        push(2);
        push(4);
        push(6);
        push(5);
        push(3);
        push(7);

       middleNode();
        display();

    }

    public static void display(){
        ListNode temp = head;

        while( temp !=null ){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static ListNode middleNode() {

        ListNode temp = head;
        int size = 0;

        while(temp!=null){
            temp = temp.next;
            size++;
        }

        int count=0;

        while(count < size/2){
            head = head.next;
            count++;
        }

        return head;

    }

}
