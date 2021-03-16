public class Student
{
   //instance variables
   private String name;
   private int idNumber;
   private double marks;
   
   //constructors
   public Student(String nameIn, int idNoIn, double marksIn)
   {
      name = nameIn;
      idNumber = idNoIn;
      marks = marksIn;
   }
  
   //methods
   public String getName()
   {
      return name;
   }
   
   public int getIdNumber()
   {
      return idNumber;
   }
   
   public double getMarks()
   {  
      return marks;
   }
   
   public String toString()
   {
      String s = "";
      s += "Student # " + idNumber + ": " + name + ", " + " result:  " + marks;
      
      return s;
   }
    
   public boolean equals(Student other)
   {  
      return idNumber == other.idNumber &&
         name.equals(other.name) &&
         marks == other.marks;
         
      //It may be enough to test for equality on
      //student ID no and name only
   }

}

