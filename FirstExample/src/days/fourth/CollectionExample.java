package days.fourth;

        ///@justas



import java.util.*;

public class CollectionExample {

    public static void main(String[] args)
    {
        //listExample();
        //setExample();
        mapExample();

       // user user = new user("justas","janiska");
        //System.out.println(user.getName() + " " + user.getSurname());
    }

    private static void mapExample(){
        Map<Integer, String> cars = new HashMap<>();
        cars.put(1998,"audi");
        cars.put(1995,"bmw");
        cars.put(2004,"toyota");

        cars.keySet().forEach(k -> System.out.println("key "+ k + " value " +cars.get(k)));
        System.out.println(cars.size());
        System.out.println();
    }

       private static void setExample(){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        //numbers.add(3); //antra kart to pacio nespausdins, jei norim tada LIST naudot reik.
        numbers.forEach(System.out::println);

        for(Integer numb : numbers){
            System.out.println(numb);
        }
       }

    private static void listExample(){

        List<String> names = new ArrayList<>();

        names.add("JOnas");
        names.add("ignas");
        names.add("antanas");
        names.add("tomas");

        System.out.println(names.size());
        System.out.println(names.get(2));
        names.forEach(System.out::println);
        System.out.println(names.contains("antanas"));

    }

}
