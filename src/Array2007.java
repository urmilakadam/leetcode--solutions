import java.util.*;

public class Array2007 {
    public static void main(String[] args) {
        //5,8],[3,9],[5,12],[16,5
        int[] array = {10,4,8,3};
        String str = "codeleet";
        System.out.println(Arrays.toString(leftRigthDifference(array)));
    }

    public static String restoreString(String s, int[] indices) {
        char[] ch= s.toCharArray();
        StringBuilder str = new StringBuilder("");
        Map<Integer, Character> map =  new HashMap<>();
        for(int i=0; i<indices.length; i++){
            map.put(indices[i], ch[i]);
        }

        for(int i=0; i<indices.length; i++){
            str.append(map.get(i));
        }

        return str.toString();

    }


    public static int[] leftRigthDifference(int[] nums) {
        if(nums.length == 1) return new int[]{0};

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list =  new ArrayList<>();
        list.contains(1);

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;

        for(int i=1; i<nums.length; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            result[i] = leftSum[i] > rightSum[i] ? leftSum[i] - rightSum[i] : rightSum[i] - leftSum[i];
        }
        return result;
    }

}
