import java.util.Scanner;

interface Client {
    void input(); // public +abstract

    void output(); // public +abstract

}

class Avni implements Client {
    String name;
    double sal;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the username: ");
        name = r.nextLine();
        System.out.println("Enter the salary: ");
        sal = r.nextDouble();
    }

    public void output() {
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        Client c = new Avni();
        c.input();
        c.output();
    }
}
