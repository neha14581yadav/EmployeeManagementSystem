import java.util.Scanner;

public class EmployeeManagementSystem {

    Scanner sc = new Scanner(System.in);

    int empId, empAge;
    double empSalary;
    String empName = "", empDepartment = "", empDesignation = "";

    boolean isEmployeeAdd = false;

    // Search Employee
    void searchEmployee() {

        int id;

        if (isEmployeeAdd) {

            System.out.println("Enter Employee ID:");
            id = sc.nextInt();

            if (empId == id) {
                viewEmployee();
            } else {
                System.out.println("Invalid Employee ID");
            }

        } else {
            System.out.println("Go and add Employee first");
        }
    }

    // View Employee
    void viewEmployee() {

        if (isEmployeeAdd) {

            System.out.println("\n----- Employee Details -----");

            System.out.println("Employee ID   : " + empId);
            System.out.println("Employee Name : " + empName);
            System.out.println("Employee Age  : " + empAge);
            System.out.println("Department    : " + empDepartment);
            System.out.println("Designation   : " + empDesignation);
            System.out.println("Salary        : " + empSalary);

        } else {

            System.out.println("Go and add Employee first");
        }
    }

    // Add Employee
    void addEmployee() {

        System.out.println("\n----- Add Employee Details -----");

        System.out.println("Enter Employee ID:");
        empId = sc.nextInt();

        sc.nextLine(); // Clear buffer

        System.out.println("Enter Employee Name:");
        empName = sc.nextLine();

        System.out.println("Enter Employee Age:");
        empAge = sc.nextInt();

        sc.nextLine(); // Clear buffer

        System.out.println("Enter Employee Department:");
        empDepartment = sc.nextLine();

        System.out.println("Enter Employee Designation:");
        empDesignation = sc.nextLine();

        System.out.println("Enter Employee Salary:");
        empSalary = sc.nextDouble();

        isEmployeeAdd = true;

        System.out.println("Employee Added Successfully!");
    }

    // Main Menu
    void mainMenu() {

        System.out.println("\n===== Employee Management System =====");

        System.out.println("1. Add Employee");
        System.out.println("2. View Employee");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Employee Report");
        System.out.println("7. Exit");
    }

    // Main Method
    public static void main(String[] args) {

        EmployeeManagementSystem obj =
                new EmployeeManagementSystem();

        int choice;

        do {

            obj.mainMenu();

            System.out.println("Please Enter Your Choice:");
            choice = obj.sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addEmployee();
                    break;

                case 2:
                    obj.viewEmployee();
                    break;

                case 3:
                    obj.searchEmployee();
                    break;

                case 4:
                    System.out.println("Update Employee feature coming soon...");
                    break;

                case 5:
                    System.out.println("Delete Employee feature coming soon...");
                    break;

                case 6:
                    System.out.println("Employee Report feature coming soon...");
                    break;

                case 7:
                    System.out.println("Thank you for using Employee Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 7);

        obj.sc.close();
    }
}
