public class PersonAndStudentTest
{
  
  public static void main(String[] args)
  {
    Person me = new Person("Peter","Hansen",  26);
    System.out.println("The full name of the person is: " + me.fullName());
    Student student = new Student("DTU", "s11111","Peter", "Hansen", 26);
    System.out.println("The student number is: " + student.studentNr);
    System.out.println("The full name of the student is: " + student.fullName());
  }
}