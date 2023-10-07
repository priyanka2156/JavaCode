class NullPointerExcep {
    public static void main(String[] args) {
        String str = "GOD";
        try {
            System.out.println(str.toLowerCase());
        } catch (NullPointerException n) {
            System.out.println("null can't be casted");
        }
    }
}
