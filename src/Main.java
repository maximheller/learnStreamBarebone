import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        //exercise 1
        //createStreamAndPrint();

        //exercise 2
        //filterEvenNumbers();

        //exercise 3
        //convertToUppercase();

        //exercise 4
        //sortListOfNumbers();

        //exercise 5
        //findTheFirstElementStartingWithA();

        //extra exercise
        //findElementsStartingWithA();

        //starting here not analyzed line for line

        //exercise 6
        //findMaximumAndMinimum();

        //exercise 6 alternative
        //findMaximumAndMinimum2();

        //exercise 7
        //countStartingWithB();

        //exercise 8
        //MapNamesToLengths();

        //exercise 9
        //removeDuplicates();

        //exercise 10
        //concatenateStrings();

        //exercise 11
        //probably suboptimal
        //findSecondLargestNumber();

        //exercise 11
        //ChatGPT version
        //findSecondLargestNumber2();

        //exercise 12
        //groupElementsByFirstLetter();

        //exercise 13
        //findMostFrequentElement();

        //exercise 14
        //sortPeopleByAge();

        //exercise 15
        //not done yet


    }

    //Create a Stream from a List
    //Given a list of integers, use Streams to print each element.
    public static void createStreamAndPrint() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(System.out::println);
    }

    //Filter Even Numbers
    //Given a list of numbers, use a stream to filter out only even numbers and print them.
    //Expected Output: 10, 20, 30, 40
    public static void filterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }

    //Convert Strings to Uppercase
    //Given a list of strings, convert each string to uppercase using Streams.
    //Expected Output: "JAVA", "STREAM", "API", "PRACTICE"
    public static void convertToUppercase() {
        List<String> words = Arrays.asList("java", "stream", "api", "practice");

        List<String> uppercaseWords = words.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(uppercaseWords);
    }

    //Sort a List of Numbers
    //Given a list of numbers, sort them in ascending order using Streams.
    //Expected Output: [1, 2, 3, 4, 7, 8, 9]
    public static void sortListOfNumbers() {
        List<Integer> numbers = Arrays.asList(7, 2, 9, 4, 3, 8, 1);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }

    //Find the First Element Starting with 'A'
    //Given a list of names, find the first name that starts with 'A' using Streams.
    //Expected Output: "Alice"
    public static void findTheFirstElementStartingWithA() {
        List<String> names = Arrays.asList("Mike", "Alice", "Bob", "Amanda", "Charlie");

        Optional<String> foundName = names.stream()
                .filter(n -> n.startsWith("A"))
                .findFirst();

        //prints Optional[Alice]
        //System.out.println(foundName);

        //prints just Alice
        System.out.println(foundName.get());
    }

    //Find all elements starting with 'A'
    //Expected Output: Alice, Amanda
    public static void findElementsStartingWithA() {
        List<String> names = Arrays.asList("Mike", "Alice", "Bob", "Amanda", "Charlie");

        List<String> foundNames = names.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(foundNames);
    }

    //Find the Maximum and Minimum Values
    //Given a list of integers, find the maximum and minimum values using Streams.
    //Expected Output:
    //Max: 12
    //Min: 2
    public static void findMaximumAndMinimum() {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 12, 5);

        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.comparingInt(n -> n));

        Optional<Integer> minNumber = numbers.stream()
                .min(Comparator.comparingInt(n -> n));

        System.out.println("Max: " + maxNumber.get());
        System.out.println("Min: " + minNumber.get());
    }

    //alternative approach
    //using Comparator.naturalOrder() instead of Comparator.comparingInt(n -> n)
    public static void findMaximumAndMinimum2() {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 12, 5);

        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());

        Optional<Integer> minNumber = numbers.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Max: " + maxNumber.get());
        System.out.println("Min: " + minNumber.get());
    }

    //Count Elements Matching a Condition
    //Given a list of strings, count how many start with the letter 'B'.
    //Expected Output: Count of words starting with 'B': 4
    public static void countStartingWithB() {
        List<String> words = Arrays.asList("Banana", "Apple", "Blueberry", "Mango", "Berry", "Blackberry");

        Long wordCount = words.stream()
                .filter(n -> n.startsWith("B")).count();
        System.out.println("Count of words starting with 'B': " + wordCount);
    }

    //Map Names to Their Lengths
    //Given a list of names, create a list of integers representing the length of each name.
    //Expected Output: [5, 3, 9, 6]
    public static void MapNamesToLengths() {
        List<String> names = Arrays.asList("Alice", "Bob", "Catherine", "Daniel");

        List<Integer> namesLengths = names.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());
        System.out.println(namesLengths);
    }

    //Remove Duplicates from a List
    //Given a list with duplicate numbers, return a new list without duplicates.
    //Expected Output: [1, 2, 3, 4, 5]
    public static void removeDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 1);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }

    //Concatenate Strings
    //Given a list of words, concatenate them into a single sentence using Collectors.joining().
    //Expected Output: "Java is awesome!"
    public static void concatenateStrings() {
        List<String> words = Arrays.asList("Java", "is", "awesome!");

        String singleStream = words.stream()
                .collect(Collectors.joining(" "));
        System.out.println(singleStream);
    }


    //Find the Second Largest Number
    //Given a list of numbers, use Streams to find the second largest element.
    //Expected Output: 15
    public static void findSecondLargestNumber() {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 20, 5);

        Integer largestNumber = numbers.stream()
                .max(Comparator.comparingInt(n -> n)).get();

        //System.out.println(largestNumber);

        List<Integer> numbersWithoutLargestNumber = numbers.stream()
                        .filter(n -> n != largestNumber)
                                .collect(Collectors.toList());

        //System.out.println(numbersWithoutLargestNumber);

        Optional<Integer> secondLargestNumber = numbersWithoutLargestNumber.stream()
                .max(Comparator.comparingInt(n->n));

        System.out.println(secondLargestNumber.get());
    }

    //ChatGPT version
    public static void findSecondLargestNumber2() {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 20, 5);

        Optional<Integer> secondLargestNumber = numbers.stream()
                .distinct()  // Remove duplicates
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .skip(1)  // Skip the first (largest) element
                .findFirst();  // Get the second largest

        secondLargestNumber.ifPresent(System.out::println);  // Print if present
    }


    //Group Elements by Their First Letter
    //Given a list of words, group them by their first letter using Collectors.groupingBy().
    //Expected Output:
//    {
//        'a' -> ["apple", "apricot", "avocado"],
//        'b' -> ["banana", "blueberry"],
//        'c' -> ["cherry", "carrot"]
//    }
    public static void groupElementsByFirstLetter() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "avocado", "carrot");

        Map<Character, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));
        System.out.println(groupedWords);
    }

    //Find the Most Frequent Element
    //Given a list of numbers, find the element that appears the most.
    //Expected Output: 2
    public static void findMostFrequentElement() {
        List<Integer> numbers = Arrays.asList(3, 7, 3, 2, 7, 7, 2, 2, 2);

        Map<Integer, Long> numbersAndCount = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        //System.out.println(numbersAndCount);

        Integer mostFrequent = Collections.max(numbersAndCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println(mostFrequent);
    }


    //Custom Sorting with Streams (Sorting People by Age)
    //Given a list of Person objects (with name and age), sort them by age in descending order.
    public static void sortPeopleByAge() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 35),
                new Person("Eve", 28)
        );

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedPeople);
    }


    //Parallel Stream Performance Testing
    //Compare the performance of a sequential stream vs a parallel stream when summing large numbers.
    

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}
