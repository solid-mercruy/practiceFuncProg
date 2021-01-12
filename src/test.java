import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {

    public static void printPeople(
            final String message, final List<Person> people){
        System.out.println(message);
        people.forEach(System.out::println);
    }
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35)
        );

        List<Person> OlderThan20 =
                people.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        printPeople("people older than 20 years: ", OlderThan20);
    }
}
