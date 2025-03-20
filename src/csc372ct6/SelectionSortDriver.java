package csc372ct6;
import java.util.Comparator;

// Driver class + selection sort implementation to test the comparators
public class SelectionSortDriver {

	public static void main(String[] args) {
		// Make an example ArrayList of students 
		Student[] students = {
			new Student("Bob McFakeName Jr.", "123 Fake St", 123),
			new Student("Pauly Shore", "123 Fake St", 124),
			new Student("Milli Vanilli", "456 Outtamy Way", 1337),
			new Student("Joe the Plumber", "789 Joe St", 128),
			new Student("Vanilla Ice", "789 Joe St", 666),
			new Student("Guy Fieri", "456 Outtamy Way", 130),
			new Student("Tommy Wiseau", "789 Middle Chicken Road", 131),
			new Student("Whitey Bulger", "1234 Alcatraz Avenue", 13512),
			new Student("Jenny", "512 Park Ave", 8675309),
		};

		// Sort by name
		System.out.println("Okay, we're going to sort by name:");
		selectionSort(students, new StudentNameComparator());
		for (Student student : students) {
			System.out.println(student.getName());
		}

		// Sort by rollno 
		System.out.println("All right people, now we're going to sort by rollno:");
		selectionSort(students, new StudentRollNumberComparator());
		for (Student student : students) {
			System.out.println(student.getRollNumber());
		}
	}

	// Use selection sort to sort the passed array in place. 
	private static void selectionSort(Student[] students, Comparator<Student> comparator) {
		// For each student 
		for (int i = 0; i < students.length; i++) {
			// Find the minimum element in the unsorted part (everything before i)
			int minIndex = i;
			for (int j = i + 1; j < students.length; j++) {
				if (comparator.compare(students[j], students[minIndex]) < 0) {
					minIndex = j;
				}
			}

			// Swap the lowest element w/ 1st element in the unsorted portion of the array
			Student temp = students[i];
			students[i] = students[minIndex];
			students[minIndex] = temp;
		}
	}

}
