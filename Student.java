package student;

 class Student {
	public String StudentName;
public int[] StudentMarks;
	
Student(){}

Student(String StudentName){
	this.StudentName=StudentName;
	
}
public void setStudentName(String StudentName){
	this.StudentName=StudentName;
}
public String getStudentName(){
	return StudentName;
}

}
