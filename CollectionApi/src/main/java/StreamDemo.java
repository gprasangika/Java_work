import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class StreamDemo {
    static void main(String[] args) {

        List<Integer> nums = List.of(4,6,7,5,2,9,2);

//        Predicate<Integer> isOdd = new Predicate<Integer>() {
//
//            @Override
//            public boolean test(Integer n) {
//                return n % 2 != 0;
//            }
//        };
//        StreamSupport.
//        Stream<Integer> stream1 = nums.stream(); // stream() in Collection interface inherited in List interface // returns ReferencePipeline.Head type object - grand parent Stream interface
//
//        // filter() and map() are intermediate operations // intermediate operations are not executed if no terminal operation later
//        Stream<Integer> stream2 = stream1.filter(n -> n % 2 != 0).map(e -> e*2); // filter() and map() in ReferencePipeline and returns ReferencePipeline.StatelessOp type object - ancestor Stream interface
//

        // a - carry, b - current element initially a is 0 as defined // reduce() is terminal operation
//        int sum = stream2.reduce(0, (a,b) -> a+b); // reduce() in ReferencePipeline class - returns Integer data here auto-unboxed to int

        int sum = nums.stream()
                .filter(n -> n % 2 != 0)
                .map(e -> e*2)
                .reduce(0, (a,b) -> a+b);
//        stream2.forEach(e -> System.out.println(e));

        System.out.println(sum);




// Following method is too complex for large amount of data. So stream API is used
//        List<Integer> oddNums = new ArrayList<>();
//
//        for(int n: nums) {
//            if (n % 2 != 0) {
//                oddNums.add(n*2);
//            }
//        }
//
//        int total = 0;
//        for(int i: oddNums) {
//            total += i;
//        }
//
//        System.out.println(total);

    }
}
