public class OneWaySolution {
    public static void main(String[] args) {
        OneWaySolution ows = new OneWaySolution();
        System.out.println(ows.editCheck("abc", "dbc"));
    }

    private boolean editCheck(String str1, String str2) {
        boolean isInsert = checkInsert(str1, str2);
        boolean isRemove = checkRemove(str1, str2);
        boolean isReplace = checkReplace(str1, str2);
        return isRemove|isInsert|isReplace;
    }

    private boolean checkReplace(String str1, String str2) {
        boolean isReplace = false;
        for (int i = 0; i < str1.length(); i++) {
              if ((str1.charAt(i) != str2.charAt(i)) && !isReplace) {
                  isReplace = false;
              }

        }
    }

    private boolean checkRemove(String str1, String str2) {
        return false;
    }

    private boolean checkInsert(String str1, String str2) {
        return false;
    }
}
