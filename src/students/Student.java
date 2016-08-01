package students;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class Student implements Comparable<Student> {
    private String name;
    private float gpa;
    private Set<String> courses;
//
//    public Student(String name, float gpa, String ... courses) {
//        if (name == null) throw new IllegalArgumentException("must have a name");
//        if (gpa < 0 || gpa > 4.0F) throw new IllegalArgumentException("invalid gpa");
//        this.name = name;
//        this.gpa = gpa;
//        this.courses = new HashSet<String>();
//        this.courses.addAll(Arrays.asList(courses));
//    }
//    
    private Student() {}
    
    public static Student getFromNameGpaCourses(String name, float gpa, String ... courses) {
        if (name == null) throw new IllegalArgumentException("must have a name");
        if (gpa < 0 || gpa > 4.0F) throw new IllegalArgumentException("invalid gpa");
//        if (courses.length == 0) throw new IllegalArgumentException("Must take courses");
        Student self = new Student();
        self.name = name;
        self.gpa = gpa;
        self.courses = new HashSet<String>();
        self.courses.addAll(Arrays.asList(courses));
        return self;
    }

    @Override
    final public boolean equals(Object other) {
        if (!(other instanceof Student)) return false;
        Student s2 = (Student)other;
//        String s = other.name;
        return this.name.equals(s2.name);
    }
    
    @Override
    final public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + ", courses=" + courses + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    
}
