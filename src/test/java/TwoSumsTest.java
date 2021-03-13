import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumsTest {
    @Test
    void testIncorrectInput(){
        int[] nums = {3,2,4};
        int target = 9;

        Assertions.assertThrows(IllegalArgumentException.class, () ->{
           Main.twoSums(nums, target);
        });
    }
    @Test
    void testResultPositive(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedResult = {2,1};

        assertArrayEquals(expectedResult, Main.twoSums(nums, target));
    }
}
