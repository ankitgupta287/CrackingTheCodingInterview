import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class CheckPermutationSolution {
    public boolean isPermutation (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char [] str1arr = str1.toCharArray();
        char [] str2arr = str2.toCharArray();
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        return Arrays.equals(str1arr, str2arr);
    }

    public boolean isPermutation2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int [] tracker1 = new int[128];
        int [] tracker2 = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            tracker1[str1.charAt(i)]++;
            tracker2[str2.charAt(i)]++;
        }
        return Arrays.equals(tracker1, tracker2);
    }
    public static void main(String[] args) {
        CheckPermutationSolution cps =  new CheckPermutationSolution();
        System.out.println(cps.isPermutation("abc", "abd"));
        System.out.println("2 " + cps.isPermutation2("abc", "cab"));
    }
}
