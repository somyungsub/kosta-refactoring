package code.refactoring.dataarrange_6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	
	private Set _courses;
	public Person() {
		_courses = new HashSet<>();
	}
	public Set getCourses() {
//		return _courses;
		return Collections.unmodifiableSet(_courses);
	}
	public void setCourses(Set arg) {
//		_courses = arg;
	}
	
	public void addCourse(Course course) {
		_courses.add(course);
	}
	
	public void removeCourse(Course course) {
		_courses.remove(course);
	}
	
	public int searchCourse() {
		Iterator iter = getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) count ++;
		}
		return count;
	}
}

