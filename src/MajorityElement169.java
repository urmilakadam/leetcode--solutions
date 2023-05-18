import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement169 {

    public static void main(String[] args) {
        int arr[] = {2,4,4,4,4,5,6,2,4,4};

        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
        int first = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > n)
                .map(m -> m.getKey())
                .findFirst()
                .orElse(0);
        return first;
    }

}
