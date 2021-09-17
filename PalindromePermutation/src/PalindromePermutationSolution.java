import com.sun.deploy.util.StringUtils;

public class PalindromePermutationSolution {
    public static void main(String[] args) {
        PalindromePermutationSolution pps =  new PalindromePermutationSolution();
        System.out.println(pps.isPalindromePermutation("aabhhkkiitt"));
    }

    private boolean isPalindromePermutation(String str) {
        String strlow = str.toLowerCase();
        int[] charTracker = new int[128];
        for (int i = 0; i < strlow.length(); i++) {
            charTracker[strlow.charAt(i)]++;
        }
        int loopbreaker = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if (charTracker[i] % 2 != 0) {
                loopbreaker++;
                if (loopbreaker > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
