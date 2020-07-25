import java.util.Scanner;
/*class Student
{
	int marks;
	String sub;
	public void accept()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the subject and marks");
		sub=scan.nextLine();
		marks=scan.nextInt();
	}
	public  void display()
	{ 
		System.out.println("subject"+"\t"+"marks"+"\n"+sub[] +"\t"+ marks[]);

	}
}*/
public class StudentMarks {
	int marks;
	String sub;
	void accept()
	{
		Scanner scan=new Scanner(System.in);
		sub=scan.nextLine();
		marks=scan.nextInt();
	}
	void display()
	{
		System.out.println(sub +  "\t\t"  + marks);
	}
	public static void main(String[] args) {
		System.out.println("enter the subject and marks");
		StudentMarks[] stud=new StudentMarks[3];
		for(int i = 0;i<stud.length;i++)
		{
			stud[i]=new StudentMarks();
			stud[i].accept();			
		}
		System.out.println("subject"+  "\t\t"  +"marks");

		for(int i = 0;i<stud.length;i++)
		{
			stud[i].display();			

		}
		
		
	}

}
