public class code165 {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for(int n = 0; n < Math.max(v1.length, v2.length); n++){
            int i = (n < v1.length ? Integer.parseInt(v1[n]) : 0);
            int j = (n < v2.length ? Integer.parseInt(v2[n]) : 0);
            if (i > j) {
                return 1;
            }
            if (i < j) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s1 = new String("1.01");
        String s2 = new String("1.001.1");
        int result = compareVersion(s1, s2);
        System.out.println(result);
    }
}
