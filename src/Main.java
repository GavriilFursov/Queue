import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static List<Person> generateClients() {
        Person Mark = new Person("Миша", 15, 3);
        Person Giovanni = new Person("Джовани", 18, 2);
        Person Malario = new Person("Маларио", 11, 1);
        Person Jack = new Person("Джек", 12, 4);
        Person Markus = new Person("Маркус", 13, 5);
        ArrayList<Person> child = new ArrayList<>();
        child.add(Mark);
        child.add(Giovanni);
        child.add(Malario);
        child.add(Jack);
        child.add(Markus);
        return child;
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person s = queue.poll();
            if (s.ticket > 0) {
                System.out.println(s.name + ", билетов осталось: " + s.spendingTicket());
                queue.offer(s);
            }
        }
    }
}