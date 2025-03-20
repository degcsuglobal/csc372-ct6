package csc372ct6;

import java.util.Comparator;

//A comparator that compares two students on the basis of their rollno (rollnumber).
public class StudentRollNumberComparator implements Comparator<Student> {

	public int compare(csc372ct6.Student o1, csc372ct6.Student o2) {
		return o1.getRollNumber() - o2.getRollNumber();
	}

}
