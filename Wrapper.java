package student;

public class Wrapper {
public static void main(String[] args){
	Integer x=10;
	change(x);
	System.out.println(x);
}
static void change(Integer i){
	i=20;
	//System.out.println(i);
}

}
