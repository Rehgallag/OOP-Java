/*
	Written by : Maeve Carr
	Date:
	Desc:
*/
import java.util.*;
public class Q4EmployeeMenu
{
   public static void main(String [] args)
   {  
	   			  	
		Scanner in = new Scanner(System.in);
		//create an arrayList of employee object
		ArrayList<Employee> empList = new ArrayList<Employee>();
		String name;
		int option, idNo;
		double sal;  
      boolean found; 
		double total;
      double amt;
      char letter;
      int count;
      
		do{
			//display menu on screen
			System.out.println("\n  MAIN MENU "    );
			System.out.println("1. View all employees\n2. Add employee\n3. Remove employee\n0. Exit"    );

			System.out.print("Enter your option: "); 
			option  = in.nextInt();
			
			switch(option)
			{
				case 1:	System.out.println("\nEmployee Details: ");
							for(Employee e : empList)
							{
								System.out.println(e); //can only do this because of toString()
							} 

						break;
				case 2:	System.out.print("Enter employee name :"    );
							in.nextLine();//clears the buffer
							name = in.nextLine();
							System.out.print("Enter starting salary :"    );
							sal = in.nextDouble();

							//create an employee object
							Employee e = new Employee(name, sal); 
			
							//add the employee object to the arraylist
							empList.add(e);  

						break;
				case 3:  //remove employee
                  if(empList.isEmpty())
                     System.out.println("You have no employees...");
                  else
                  {
							System.out.print("Enter employee ID: ");
            			idNo = in.nextInt();
                     //must find employee first 
                     //then  remove
                     e = find(empList, idNo); //find returns an employee object
                     if(e != null)// if null object has not been returned
                        empList.remove(e);   //remove the employee object
                     else
                        System.out.println("employee ID: " +idNo+" does not exist" );
                  }   
                                  
						break;
            case 4:  //search for employee based on emp no
               if(empList.isEmpty())
                  System.out.println("You have no employees..");
               else
               {
                  System.out.print("Enter employee ID: ");
                  idNo = in.nextInt();
                     //find employee
                     //then display
                  found = false; //assume not found
                  
                  for(Employee emp : empList)//for each employee e in empList
                  {
                     if(idNo == emp.getEmpNo())//if a match is found
                     {
                        System.out.println(emp);   //display the employee object
                        found = true;
                        break;
                     }
                  }
                  if(!found)
                     System.out.println("employee ID: " + idNo +" does not exist" );
               }//end else
               break;
            case 5: //find lowest paid
               if(empList.isEmpty()) //if list is empty
                  System.out.println("You have no employees..");
               else
               {
                  Employee lowestYet = empList.get(0); //get the first object
                  for(Employee emp : empList)//for each emploee in empList
                  {
                     if(lowestYet.getSalary() > emp.getSalary())//check if emp has lower salary than lowestYet
                     {
                        lowestYet = emp; //set lowest yet to emp
                     }
                  }//end for
                  System.out.println("employee with lowest salary " +lowestYet);
               }
               break;
            case 6: //find highest paid
               if(empList.isEmpty()) //if list is empty
                  System.out.println("You have no employees..");
               else
               {
                  Employee highestYet = empList.get(0); //get the first object
                  for(Employee emp : empList)//for each emploee in empList
                  {
                     if(highestYet.getSalary() < emp.getSalary())//check if emp has higher salary than highestYet
                     {
                        highestYet = emp; //set highet yet to emp
                     }
                  }//end for
                  System.out.println("employee with highest salary " +highestYet);
               }
               break;
            case 7: //add up all salaries
               if(empList.isEmpty()) //if list is empty
                  System.out.println("You have no employees..");
               else
               {
                  total = 0; //reset total to 0
                  for(Employee emp : empList)//for each employee e in empList
                  {
                     total += emp.getSalary();
                  }
                System.out.println("total salaries: " + total);
               }
               break;
            case 8: //give raise to employee
               if(empList.isEmpty()) //if list is empty
                  System.out.println("You have no employees..");
               else
               {
                  System.out.print("Enter employee ID: ");
                  idNo = in.nextInt();
                     //find emplyee
                     //then give raise
                  found = false; //assume not found
                  
                  for(Employee emp : empList)//for each employee e in empList
                  {
                     if(idNo == emp.getEmpNo())//if a match is found
                     {
                        System.out.print("Enter amount of raise: ");
                        amt = in.nextDouble();
                        
                        emp.raiseSalary(amt);   //raise the salary of the employee
                        System.out.println("\nemployee ID: " +idNo +" has new salary " +emp.getSalary() );
                        found = true;
                        break;
                     }
                  }
                  if(!found)
                     System.out.println("employee ID: " +idNo +" has new salary " +emp.getSalary() );
               }//end else
               break;
            case 9:  //find employees with name beginning with letter
               if(empList.isEmpty()) //if lsit is empty
                  System.out.println("You have no employees..");
               else
               {
                  System.out.print("Enter letter: ");
                  letter = in.next().charAt(0);
                  count = 0;  //must reset count..
                  for(Employee emp: empList)//for each employee e in empList
                  {
                     if(letter == emp.getName().charAt(0))//if a match is found
                     {
                        count++;
                     }
                  }
                  System.out.println(count +" employees names begin with " +letter);
               }//end else
               break;
				case 0:
						break;
				default: 
						System.out.println("Invalid option entered.");		
			}//end switch
							
		}while(option != 0); 
	
	
	} 

}
