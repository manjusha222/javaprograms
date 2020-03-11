package student;
import java.util.Comparator;
public class Studentnamecomparator implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1){
		Student s1=(Student)arg0;
		Student s2=(Student)arg1;
		if(s1.getStudentName().trim().equals(s2.getStudentName().trim()))
				return 1;
		
				else 
					return 2;
	}

}
