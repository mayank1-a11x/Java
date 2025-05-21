public class StringFunc {
    public boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public String concate(String s1, String s2) {
        return s1 + s2;
    }

    public String copyString(String ori) {
        return new String(ori);
    }

    public static void main(String[] args) {
        StringFunc o = new StringFunc();

        String s1 = "hello";
        String s2 = "world";

        System.out.println("Comparing: " + o.compare(s1, s2));
        System.out.println("Concate: " + o.concate(s1, s2));

        String newString = o.copyString(s2);
        System.out.println("Copy String: " + newString);
    }
}
