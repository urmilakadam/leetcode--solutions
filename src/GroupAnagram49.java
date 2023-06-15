import java.util.*;

public class GroupAnagram49 {

    public static void main(String[] args) {
        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> l = map.getOrDefault(sorted, new ArrayList());
            l.add(str);
            map.put(sorted, l);
        }
        return new ArrayList<>(map.values());
    }
}
