public class URLifySolution {

    public static void main(String[] args) {
        URLifySolution us = new URLifySolution();
        char [] input = "Ankit Gupta Tanvi".toCharArray();
        us.transform(input, 20);
        System.out.println(input);
    }

    private void transform(char[] input, int len) {
        int spaces = 0;
        int newlen = 0;
        for (char c : input) {
            if (c == ' ') {
                spaces++;
            }
        }
        newlen = len + spaces * 2;
        input[newlen - 1] = '\0';
        for (int i = input.length - 1; i >= 0 ; i--) {
            if (input[i] == ' ') {
                input[newlen - 1] = '0';
                input[newlen - 2] = '2';
                input[newlen - 3] = '%';
                newlen = newlen - 3;
            } else {
                input[newlen - 1] = input[i];
                newlen--;
            }
        }
    }
}
