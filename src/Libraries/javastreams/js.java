package Libraries.javastreams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student
{
    int roll;
    int marks;
    String name;

    Student(int r, String n, int m)
    {
        roll = r;
        name = n;
        marks = m;
    }
    int getRoll()
    {
        return roll;
    }
    String getName()
    {
        return name;
    }
    int getMarks()
    {
        return marks;
    }
}

public class js {
    public static void main (String[] args) {
        Stream.iterate(1, x -> x + 1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);


        Student arr[] = { new Student(110, "abc", 70),
                new Student(101, "bcd", 80),
                new Student(120, "xyz", 60) };

        Map<Integer, String> m
                = Arrays.stream(arr)
                .collect(Collectors.toMap(
                        Student::getRoll, Student::getName));

        System.out.println(m);
    }
}