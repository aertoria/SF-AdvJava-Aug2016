package students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class School {

    public static void main(String[] args) {
        Set<Student> roster = new HashSet<>();
        Set<Student> safeToPassAround = Collections.unmodifiableSet(roster);

        roster.addAll(Arrays.asList(
                Student.getFromNameGpaCourses("Fred", 3.2F, "Math", "Physics"),
                Student.getFromNameGpaCourses("Jim", 2.9F, "Art", "Journalism"),
                Student.getFromNameGpaCourses("Sheila", 4.0F, "Math", "Physics", "Astronomy"),
                Student.getFromNameGpaCourses("Alan", 4.0F)
        ));

        System.out.println("All school " + roster);

        List<Student> list = new ArrayList<>();
        list.addAll(roster);
        
        System.out.println("Fred is a student? " 
                + roster.contains(Student.getFromNameGpaCourses("Fred", 3.2F, "Math", "Physics"))
        );

        System.out.println("Fred is in list? " 
                + list.contains(Student.getFromNameGpaCourses("Fred", 3.2F, "Math", "Physics"))
        );

        System.out.println("Unsorted: " + list);        
//        Collections.sort(list);
        list.sort(null);
        System.out.println("Sorted: " + list);   
        
//        list.sort(new Student.StudentGPAComparator());
        list.sort(Student.getGpaComparator());
        System.out.println("Sorted by gpa: " + list);   
        
    }
}
