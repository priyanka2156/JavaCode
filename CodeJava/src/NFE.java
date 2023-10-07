//NumberFormatEXception

class NFE {
    public static void main(String[] args) {

        String str = "ankit";
        try {

            int a = Integer.parseInt(str);
            System.out.println(a);
            System.out.println("String NumberFormatException");
        } catch (NumberFormatException n) {
            System.out.println(" String " + str + " can't be converted to Integer ");
        }
        System.out.println("Main method ended");
    }
}
