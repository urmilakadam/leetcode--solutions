import java.util.*;
import java.util.function.Function;

public class KthLargestElement215 {

    public static void main(String[] args) {
//        int[] num = {3,2,3,1,2,4,5,5,6};
//        System.out.println(findKthLargest(num, 4));
        char []chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
        System.out.println(Arrays.toString(chars));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        for (int num : nums) {
            minHeap.offer(num);
        }

        for (int element : nums) {
            count++;
            if (count == k) {
                return minHeap.poll();
            }
            minHeap.poll();
        }
        return 0;
    }

    public static int compress(char[] chars) {
        if(chars.length == 0) return 1;
        String result = "";
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : chars) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for (Character key : charCountMap.keySet()) {
            if (charCountMap.get(key) == 1) {
                result = result + key;
            } else result = result + key + charCountMap.get(key);
        }

        for (int i = 0; i < chars.length && i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();

    }

    public int partitionString(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
        }
        int max = map.values().stream().mapToInt(i->i).max().orElse(0);

        return max;
    }

}
