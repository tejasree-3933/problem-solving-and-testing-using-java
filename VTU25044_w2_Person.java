import java.util.*;
import java.util.stream.*;

class VTU25044_w2_Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    
    static boolean isOlderThan(Person p, int limit) {
        return p.age > limit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();

  
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            people.add(new Person(name, age));
        }

        int ageLimit = Integer.parseInt(sc.nextLine().trim());

       
        List<String> sortedNames = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .collect(Collectors.toList());

   
        List<String> olderNames = people.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.toList());


        List<String> upperNames = people.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

     
        System.out.println(String.join(" ", sortedNames));
        System.out.println(String.join(" ", olderNames));
        System.out.println(String.join(" ", upperNames));
    }
}
