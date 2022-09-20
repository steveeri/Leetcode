import com.summerland.training.*;

public class LeetCode {

    public static void main (String[] args) {

        System.out.println("main called");

        Problem prob = new LongestSubstring();

        prob.prepare();
        prob.solve();
        prob.report();

        System.out.println("main ended");
    }
}
