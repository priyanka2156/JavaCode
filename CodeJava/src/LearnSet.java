
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
// import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("priya", 2));
        studentSet.add(new Student(null, 0));
        studentSet.add(new Student("avni", 5));

        studentSet.add(new Student("riya", 9));

        System.out.println(studentSet);

        // Set<Integer> set = new LinkedHashSet<>();
        // Set<Integer> set = new TreeSet<>();
        // set.add(23);
        // set.add(2);
        // set.add(83);
        // set.add(63);

        // System.out.println(set);
        // set.remove(83);
        // System.out.println(set);

        // System.out.println(set.contains(2));
        // System.out.println(set.isEmpty());
        // System.out.println(set.size());

        // set.clear();
        // System.out.println(set);

    }
}
