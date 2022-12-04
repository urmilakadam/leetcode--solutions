import java.util.ArrayList;
import java.util.List;

public class TreeTest {
    static Node root;
    static class Node {
        String content;
        List<Node> children = new ArrayList<>();
        public Node(String content) {
            this.content = content;
        }
    }

    public static void main(String[] args){

        root = new Node("20");
        (root.children).add(new Node("10"));
        (root.children).add(new Node("30"));
        (root.children.get(0).children).add(new Node("15"));
        (root.children.get(0).children).add(new Node("20"));
        (root.children.get(1).children).add(new Node("35"));
        (root.children.get(1).children).add(new Node("40"));
        (root.children.get(0).children.get(1).children).add(new Node("25"));
        (root.children.get(0).children.get(1).children).add(new Node("50"));
        (root.children.get(0).children.get(1).children.get(0).children).add(new Node("80"));

        printTreeNodes(root,0);
    }


    private static void printTreeNodes(Node node, int count) {
        if (node != null) {
            System.out.println("->"+node.content);
            List<Node> children = node.children;
            if (children != null) {
                for (Node child: children) {
                    count ++;
                    int i=0;
                    while(i < count) {
                        System.out.print(" ");
                        i++;
                    }
                    printTreeNodes(child, count);
                    count--;
                }
            }
        }
    }
}
