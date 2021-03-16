import java.util.*;

public class StudentTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      //create 3 Student objects
      Student s1 = new Student("Bart", 1, 32);
      Student s2 = new Student("Lisa", 2, 80);
      Student s3 = new Student("Homer", 3, 45);
      
      //declare ArrayList of students
      ArrayList <Student> studentList = new ArrayList<Student>();
      
      //Add students to ArrayList
      studentList.add(s1);
      studentList.add(s2);
      studentList.add(s3);
      
      //Print out all student details
      for(Student s: studentList)
      {
         System.out.println(s);
      }
      
      //count the number of students in the ArrayList
      System.out.println("There are " + studentList.size() + " in the List");
      
      //read in student number and display details of that student, if in the ArrayList
      System.out.println("Enter student number to search for: ");
      int idToSearch = in.nextInt();
      boolean found = false;
      
      if(studentList.isEmpty())
         System.out.println("Student List is empty - CANNOT SEARCH");
      else
      {
         for(Student s: studentList)
         {
            if(s.getIdNumber() == idToSearch)
            {
               System.out.println("Student found\n" + s);
               found = true;
            }
         }
         if(!found)
            System.out.println("Student NOT found");
      }
      
      //displau total marks of all students and the average mark
      System.out.println("\nStudents total marks and average:");
      if(studentList.isEmpty())
         System.out.println("Student List is empty - CANNOT SEARCH");
      else
      {
         double total = 0;
         double average = 0;
         for(Student s: studentList)
         {
            total = total + s.getMarks();
            average = total/studentList.size();
         }
         System.out.println("Total marks of all students is: " + total);
         System.out.println("The average marks of all students is: " + average);
      }
      
      //display details of all students who failed
      System.out.println("\nStudents who failed:");
      if(studentList.isEmpty())
         System.out.println("Student List is empty - CANNOT SEARCH");
      else
      {
         for(Student s: studentList)
         {
            if(s.getMarks() < 40)
               System.out.println(s);
         }
      }
      
      //display details of all students who got a distinction
      System.out.println("\nStudents who got a distinction:");
      if(studentList.isEmpty())
         System.out.println("Student List is empty - CANNOT SEARCH");
      else
      {
         for(Student s: studentList)
         {
            if(s.getMarks() >= 70)
               System.out.println(s);
         }
      }
      
      //read a name and shoudl count and display the name
      System.out.println("Enter name: ");
      in.nextLine(); //clear buffer - stop the skipping
      String targetName = in.nextLine();
      
      //display details of all student matchiing target name
      System.out.println("\nAll  " + targetName);
      for(Student s: studentList)//for each student in array list
      {
         if(s.getName().equalsIgnoreCase(targetName))//check if names match
         {
            System.out.println(s);//print details
         }
      }
      
      System.out.println("Enter student number you wish to remove: ");
      int noSearch = in.nextInt();
      found = false;
      
      if(studentList.isEmpty())
         System.out.println("Student List is empty - CANNOT SEARCH");
      else
      {
         for(Student s: studentList)
         {
            if(s.getIdNumber() == noSearch)
            {
               studentList.remove(s);
               found = true;
            }
         }
         if(!found)
            System.out.println("Student NOT found");
      }
   }
}