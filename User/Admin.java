package User;

import java.util.Scanner;

public class Admin extends User   {
    final String position = "Admin";
    
    public Admin(String username, String password) {
        super(username, password);
    }

    public static void displayAdminMenu() {
        System.out.println("Admin Menu:");
        System.out.println("1. Register User");
        System.out.println("2. Register Invoice");
        System.out.println("3. View Invoices");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
    public void changePassword() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter current password: ");
            String currentPassword = scanner.nextLine();
            if (currentPassword.equals(getPassword())) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                setPassword(newPassword);
                System.out.println("Password changed successfully for admin " + getUsername());
            } else {
                System.out.println("Incorrect current password. Password not changed.");
            }
        }
    }
private void setPassword(String newPassword) {
    }

    @Override
    public String getUserType() {
        return "Admin";
    }

}

