package csc372ct6;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    public int compare(csc372ct6.Student o1, csc372ct6.Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
