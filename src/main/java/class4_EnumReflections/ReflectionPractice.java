package class4_EnumReflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPractice {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lena");
        for (Field field : person.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }

        for (Method method : person.getClass().getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        String name = null;
        try {
            name = (String) person.getClass().getMethod("getName").invoke(person);
        } catch (IllegalAccessException | InvocationTargetException
                 | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name);

        System.out.println(person.getClass());

        //Exc 2
        try {
            Class<?> carClass = Class.forName("Car");
            Constructor<?> constructor = carClass.getConstructor();
            Car instance = (Car) constructor.newInstance();
            Method methodSet = instance.getClass().getMethod("setYear", int.class);
            methodSet.invoke(instance, 1900);

            Method methodGet = instance.getClass().getMethod("getYear");
            int year = (int) methodGet.invoke(instance);
            System.out.println(year);

        } catch (ClassNotFoundException | InvocationTargetException
                 | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

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
}
