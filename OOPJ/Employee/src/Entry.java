
public class Entry {
	static Employee[] employees = new Employee[100];
	static int count = 0;
	 public static void main(String args[]) {
		 int choice ;
		 do {
			 System.out.println("------------Employee Management------------------");
			 System.out.println("1: Add an Employee");
			 System.out.println("2. Display");
			 System.out.println("3. Sort");
			 System.out.println("4.Save to file");
			 System.out.println("5.Load from file");
			 System.out.println("6. Exit");
			 
			 System.out.println("Enter Choice");
			 choice = ConsoleInput.getInt();
			 
			 switch(choice) {
			 
			 case 1 : 
				 addEmployeeMenu();
				 break;
				 
				 
			 case 2: 
				 displayMenu();
				 break;
				 
			 case 3:
				 sortMenu();
				 break;
				 
			 case 4 :
				 System.out.println("Save to file");
				 break;
				 
			 case 5:
				 System.out.println("Load  from file");
				 break;
				 
			 case 6 : 
				 System.out.println("Exit");
				 break;
				 
			default : 
				 System.out.println("Invalid Choice");
			 }
			 
		 }while(choice!=6);
	 }
	 
	 static void addEmployeeMenu() {
		 int choice;
		 do {
			 System.out.println("-------Add Employee--------");
			 System.out.println("1.Manager");
			 System.out.println("2Engineer");
			 System.out.println("3.Sales Person");
			 System.out.println("4.Exit to main menu");
			 
			 
			 System.out.println("Enter choice:");
			 choice = ConsoleInput.getInt();
			 
			 switch(choice) {
			 
		        case 1:

		            System.out.println("\n--- Enter Manager Details ---");

		            System.out.print("Enter Name: ");
		            String managerName = ConsoleInput.getString();

		            System.out.print("Enter Address: ");
		            String managerAddress = ConsoleInput.getString();

		            System.out.print("Enter Age: ");
		            int managerAge = ConsoleInput.getInt();

		            System.out.print("Enter Gender (true/false): ");
		    		boolean managerGender  = Boolean.parseBoolean(ConsoleInput.getString());

		            System.out.print("Enter Basic Salary: ");
		            double managerSalary = ConsoleInput.getFloat();

		            System.out.print("Enter HRA: ");
		            float hra = ConsoleInput.getFloat();

		            employees[count] = new Manager(
		                    managerName,
		                    managerAddress,
		                    managerAge,
		                    managerGender,
		                    managerSalary,
		                    hra
		            );

		            count++;

		            System.out.println("Manager added successfully!");

		            break;
		            
		            
		        case 2:

		            System.out.println("\n--- Enter Engineer Details ---");

		            System.out.print("Enter Name: ");
		            String engineerName = ConsoleInput.getString();

		            System.out.print("Enter Address: ");
		            String engineerAddress = ConsoleInput.getString();

		            System.out.print("Enter Age: ");
		            int engineerAge = ConsoleInput.getInt();

		            System.out.print("Enter Gender (true/false): ");
		            boolean engineerGender  = Boolean.parseBoolean(ConsoleInput.getString());
		            

		            System.out.print("Enter Basic Salary: ");
		            double engineerSalary = ConsoleInput.getFloat();

		            System.out.print("Enter Overtime: ");
		            String overtime = ConsoleInput.getString();

		            employees[count] = new Engineer(
		                    engineerName,
		                    engineerAddress,
		                    engineerAge,
		                    engineerGender,
		                    engineerSalary,
		                    overtime
		            );

		            count++;

		            System.out.println("Engineer added successfully!");

		            break;
		            
		            
		        case 3:

		            System.out.println("\n--- Enter Sales Person Details ---");

		            System.out.print("Enter Name: ");
		            String salesName = ConsoleInput.getString();

		            System.out.print("Enter Address: ");
		            String salesAddress = ConsoleInput.getString();

		            System.out.print("Enter Age: ");
		            int salesAge = ConsoleInput.getInt();

		            System.out.print("Enter Gender (true/false): ");
		            boolean salesGender  = Boolean.parseBoolean(ConsoleInput.getString());

		            System.out.print("Enter Basic Salary: ");
		            double salesSalary = ConsoleInput.getFloat();

		            System.out.print("Enter Commission: ");
		            float commission = ConsoleInput.getFloat();

		            employees[count] = new SalesPerson(
		                    salesName,
		                    salesAddress,
		                    salesAge,
		                    salesGender,
		                    salesSalary,
		                    commission
		            );

		            count++;

		            System.out.println("Sales Person added successfully!");

		            break;


		        case 4:
		            System.out.println("Returning to main menu...");
		            break;


		        default:
		            System.out.println("Invalid Choice");
		         
			 }
		 }while(choice !=4);
		 
	 }
		 
		 
		    static void displayMenu() {

		        int choice;

		        do {

		            System.out.println("\n===== DISPLAY =====");
		            System.out.println("1. All Employees");
		            System.out.println("2. First Employee");
		            System.out.println("3. Next Employee");
		            System.out.println("4. Previous Employee");
		            System.out.println("5. Last Employee");
		            System.out.println("6. Exit to Main Menu");

		            System.out.print("Enter choice: ");
		            choice = ConsoleInput.getInt();

		            switch (choice) {

		            case 1:
		                displayAll();
		                break;

		            case 2:
		                System.out.println("First Employee");
		                break;

		            case 3:
		                System.out.println("Next Employee");
		                break;

		            case 4:
		                System.out.println("Previous Employee");
		                break;

		            case 5:
		                System.out.println("Last Employee");
		                break;

		            case 6:
		                break;

		            default:
		                System.out.println("Invalid choice");
		            }

		        } while (choice != 6);
		    }

		    // DISPLAY ALL
		    static void displayAll() {

		        if (count == 0) {
		            System.out.println("No employees available.");
		            return;
		        }

		        for (int i = 0; i < count; i++) {
		            employees[i].display();
		            System.out.println("----------------");
		        }
		    }

		    // SORT MENU
		    static void sortMenu() {

		        int choice;

		        do {

		            System.out.println("\n===== SORT =====");
		            System.out.println("1. All Managers");
		            System.out.println("2. All Engineers");
		            System.out.println("3. All Sales Person");
		            System.out.println("4. Ascending");
		            System.out.println("5. Descending");
		            System.out.println("6. Exit to Main Menu");

		            System.out.print("Enter choice: ");
		            choice = ConsoleInput.getInt();

		            switch (choice) {

		            case 1:
		                System.out.println("Display Managers");
		                break;

		            case 2:
		                System.out.println("Display Engineers");
		                break;

		            case 3:
		                System.out.println("Display Sales Persons");
		                break;

		            case 4:
		                System.out.println("Sort Ascending");
		                break;

		            case 5:
		                System.out.println("Sort Descending");
		                break;

		            case 6:
		                break;

		            default:
		                System.out.println("Invalid choice");
		            }

		        } while (choice != 6);
	 }
	 
}
