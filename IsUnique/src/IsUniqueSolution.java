public class IsUniqueSolution {
    public boolean isUnique (String str) {
        if (str.length() > 128) {
            return false;
        } else {
            boolean [] tracker = new boolean[128];
            for (int i = 0; i < str.length(); i++) {
                tracker[str.charAt(i)] = !tracker[str.charAt(i)];
                if (tracker[str.charAt(i)]) {
                    continue;
                } else {
                    return tracker[str.charAt(i)];
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        IsUniqueSolution ius = new IsUniqueSolution();
        System.out.println(ius.isUnique("aba"));
    }
}
