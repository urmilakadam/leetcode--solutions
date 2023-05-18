import java.math.BigInteger;
import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        String str ="leetcode";

        System.out.println(maxVowels(str, 3));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] windowSum = new int[n-k+1];

        for(int i=0; i<n-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){
                max = Math.max(nums[j], max);
            }
            windowSum[i] = max;
        }
        return windowSum;
    }

    public String addBinary(String a, String b) {
        StringBuffer str = new StringBuffer();
        return str.toString();
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuffer s = new StringBuffer();
        for (int j : num) {
            String str = String.valueOf(j);
            s.append(str);
        }
        BigInteger value = new BigInteger(String.valueOf(s)).add(BigInteger.valueOf(k));
        String str= String.valueOf(value);
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            list.add(Integer.parseInt(String.valueOf(ch)));
        }
        return list;
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        return map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue)
                        .thenComparing(Map.Entry::getKey, Comparator.reverseOrder()))
                .mapToInt(Map.Entry::getKey)
                .toArray();

    }
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1)
            return 2147483647;
        return (int) dividend / divisor;
    }

    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            int firstCount = 0, secoundCount = 0, thirdCount = 0;
            for(int j=0; j<words[i].length(); j++){
                if("qwertyuiop".contains(words[i].charAt(j)+"") && secoundCount == 0 && thirdCount == 0)
                    firstCount++;
                else if("asdfghjkl".contains(words[i].toLowerCase().charAt(j)+"") && firstCount == 0 && thirdCount == 0)
                    secoundCount++;
                else if("zxcvbnm".contains(words[i].charAt(j)+"") && secoundCount == 0 && firstCount == 0)
                    thirdCount++;
                else
                    break;
            }
            if(firstCount == words[i].length() || secoundCount == words[i].length() || thirdCount == words[i].length())
                list.add(words[i]);
        }
        return list.toArray(String[]::new);
    }

    public static int maxVowels(String s, int k) {
        String subStr = "aeiou";
        int count = 0;

        for(int i=0; i<k; i++){
            if(subStr.contains(s.charAt(i)+"")) count++;
        }
        int maxcount = count;
        for(int i=k; i<s.length(); i++){
            if(subStr.contains(s.charAt(i)+"")) maxcount++;
            if(subStr.contains(s.charAt(i-k)+"")) maxcount--;
            count = Math.max(count, maxcount);
        }
        return count;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0; i<nums.length; i++){
            list.add(List.of(nums[i]));
            List<Integer> temp = new ArrayList<>();
            for(int j = i+1; j<nums.length; i++){
                temp.add(nums[i]);
                temp.add(nums[j]);
            }
        }
        return list;
    }
}
