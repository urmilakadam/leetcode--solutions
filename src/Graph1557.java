import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph1557 {
    public static void main(String[] args) {

    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] temp = new boolean[n];
        List<Integer> result = new ArrayList<Integer>();

        for (List<Integer> edge : edges) {
            temp[edge.get(1)] = true;
        }

        for (int i = 0; i < n; i++) {
            if (!temp[i]) result.add(i);
        }
        return result;
    }
}
