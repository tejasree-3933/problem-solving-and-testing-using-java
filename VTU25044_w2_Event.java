import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class VTU25044_w2_Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    String getName() {
        return name;
    }

    LocalDate getDate() {
        return date;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Event> events = new ArrayList<>();

       
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            String name = parts[0];
            LocalDate date = LocalDate.parse(parts[1]); // yyyy-MM-dd
            events.add(new Event(name, date));
        }

        int month = Integer.parseInt(sc.nextLine().trim()); // month number

        
        List<Event> sorted = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

      
        System.out.println(
                sorted.stream()
                        .map(Event::getName)
                        .collect(Collectors.joining(" "))
        );

        
        Event earliest = Collections.min(events, Comparator.comparing(Event::getDate));
        Event latest   = Collections.max(events, Comparator.comparing(Event::getDate));

        System.out.println(earliest.getName());
        System.out.println(latest.getName());

        
        String monthLine = sorted.stream()
                .filter(e -> e.getDate().getMonthValue() == month)
                .map(Event::getName)
                .collect(Collectors.joining(" "));

        System.out.println(monthLine);
    }
}
