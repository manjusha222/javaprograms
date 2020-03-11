package student;
public class Grade {
		private Student student;
		private int mark[];
		private final static String O="OutStanding";
		private final static String A="V.Good";
		private final static String B="Good";
		private final static String C="Average";
		private final static String F="Fail";
		public String Grade;
		Grade(){}
		Grade(String Grade){
			this.Grade=Grade;
		}
		
		public static void main(String[] args){
			Grade g=new Grade(new Student("Raja"), new int[]{70,65,91,86,82});
			System.out.println(g.getGrade());}
		public Grade(Student s, int mark[]){
			
			this.student=s;
			this.mark=mark;
		}
		int getPercent(){
			int tot=0;
			for(int i=0; i<mark.length;i++)
				tot=tot+mark[i];
			return (tot/mark.length);
		
			
		
	}
	
	public String getGrade(){
		int percent=getPercent();
		if(percent>=90)
			return O;
	
	else if(percent<90 && percent>=80)
		return A;
	else if(percent<80 && percent>=60)
		return B;
	else if(percent<60 && percent>=50)
		return C;
	else return F;
		
	
		
	}
	
		
	}
	
	
	




