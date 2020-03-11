package student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;



class Student implements Serializable{
	private int studentId;
	private String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}

public class Saveobjects {
	public static void main(String[] args) throws IOException{
		//create Student object
		Student s1=new Student();
		//create input stream reader object
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter studentId:");
		s1.setstudentId(Integer.parseInt(br.readLine()));
		System.out.println("Enter StudentName:");
		s1.setStudentName(br.readLine());
		saveStudent(s1);
		
}

	public static void saveStudent(Student s) throws IOException{
		File file=new File("C:\\Users\\TSSVJW-training1\\Desktop\\student.txt");
		FileOutputStream fos=new FileOutputStream(file);
		//create object output stream object
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//create file object output stream object
		oos.writeObject(s);
		System.out.println("student object is saved successfully");
	}

}
