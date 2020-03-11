package student;

public class Studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s2.setStudentName("karuna");
		s1.setStudentName("karuna");

	
	Studentnamecomparator sc=new Studentnamecomparator();
	if(sc.compare(s1,s2)==1){
		System.out.println("both objects have same name");
		
		
	}
	else
	{
		System.out.println("both objects have differnt name");
		
		
	}

}
}
