 class Student
{
private static Student student;
private Student()
{

}
public static Student getStudent()
{
if(student==null)
{
 student=new Student();
}
return student;
}
}

public class Test
{
public static void main(String args[])
{
Student s1=Student.getStudent();
System.out.println(s1.hashCode());
Student s2=Student.getStudent();
System.out.println(s2.hashCode());
}
}


