import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arrs[] = {64, 34, 25, 12, 22, 11, 90};
//        StepOneBubble sp = new StepOneBubble();
        StepTwoBubble sp = new StepTwoBubble();
        sp.TwoBubbleSort(arrs);

        System.out.println("Sorted Array ");
        System.out.println(Arrays.toString(arrs));
    }
}
