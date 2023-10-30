package class1_Set.morning;

import java.util.Set;
import java.util.TreeSet;

public class Exercise4 {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Lena", 12));
        personSet.add(new Person("Luna", 5));
        personSet.add(new Person("Nona", 8));

        for (Person person: personSet) {
            System.out.println(person);
        }
    }

    static class Person implements Comparable<Person>{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Person o) {
            if (age > o.getAge()) {
                return 1;
            }
            if (age < o.getAge()) {
                return -1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Person{name: " + getName() + ", age: " + getAge() + "}";
        }
    }
}
