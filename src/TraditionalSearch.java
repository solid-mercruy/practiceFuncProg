import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, Animal::canHop);
        print(animals, Animal::canSwim);
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker){
        animals.stream()
                .filter(checker)
                .forEach(a -> System.out.print(a + " Kosoo "));
        System.out.println();
    }
}
