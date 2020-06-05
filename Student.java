public class Student extends Person implements Comparable<Student> {
  
  String uniName;
  String studentNr;


  public Student(String uniName, String studentNr, String firstName, String lastName, int age)
  {
    super(firstName, lastName, age);
    this.uniName = uniName;
    this.studentNr = studentNr;
  }

   public String fullName()
  {
    String fullName = firstName + " " + lastName.toUpperCase();
    return fullName;
  }

  public int compareTo(Student other)
  {
    //  It is used to compare the current object with the specified object. It returns

    //  positive integer, if the current object is greater than the specified object.
    //  negative integer, if the current object is less than the specified object.
    //  zero, if the current object is equal to the specified object.
    
    if (this.age == other.age)  
      return 0;  
    else if (this.age > other.age)  
      return 1;  
    else  
      return -1;  
  }    

}