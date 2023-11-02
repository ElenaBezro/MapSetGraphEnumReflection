package class4_EnumReflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPractice {
    static class Person {
        private String name;
        private String city;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Person person = new Person();
        person.setName("Lena");
        for (Field field : person.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }

        for (Method method : person.getClass().getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        String name = (String) person.getClass().getMethod("getName").invoke(person);
        System.out.println(name);

        System.out.println(person.getClass());

        //Exc 2

        Class<?> carClass = Car.class;

    }

    static class Car {
        String make;
        String model;
        int year;

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
    //TODO:
    //Write a Java program that uses reflection to dynamically create an instance of the Car class, set its field values, and invoke its methods.
    //Get the Constructor object for the Car class and create an instance of Car using reflection.
    //Set the values of the private fields make, model, and year using reflection.
    //Invoke the public methods to get the values of these fields and print them.
    //Ensure you handle exceptions properly when working with reflection
}
