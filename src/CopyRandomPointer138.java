import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyRandomPointer138 {

    public static void main(String[] args) {
        int[] nums ={4,14,2};
        System.out.println(totalHammingDistance(nums));
    }

    public static int totalHammingDistance(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++) {
                sum += hammingDistance(nums[i], nums[j]);
            }
        }
        return sum;
    }

    public static int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        while(num > 0){
            int andOp = num & (num - 1);
            num = andOp;
            count++;
        }
        return count;
    }
}
