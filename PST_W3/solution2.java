import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Complete the code
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            studentList.add(new Student(id, fname, cgpa));
            testCases--;
        }

        // Sorting using Comparator (NO lambda)
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa()); // CGPA desc
                } else if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname()); // Name asc
                } else {
                    return s1.getId() - s2.getId(); // ID asc
                }
            }
        });

        // Output
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

        in.close();
    }
}
