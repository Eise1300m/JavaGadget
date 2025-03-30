import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class Login {

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        
        boolean isValid = false;

        while (!isValid) { 
            System.out.print("Please enter your UserNAME: ");
            String username = scanner.nextLine();

            System.out.print("Please enter your PassWORD: ");
            String password = scanner.nextLine();
            
            isValid = validateCredentials(username, password);

            if (!isValid) {
                System.out.println("Login Failed. Please try again. (!)\n");
            }
        }

        System.out.println("\nLogin successful (/)");
        scanner.close();
    }

    private boolean validateCredentials(String searchUsername, String searchPassword) {
        
        try {
            File file = new File("User.txt");
            Scanner read = new Scanner(file);

            boolean userFOUND = false;
            boolean passwordMATCH = false;

            while (read.hasNextLine()) {
                String line = read.nextLine().trim();

                if (line.startsWith("Username: ") && line.length() > 10) {
                    String fileUsername = line.substring(10);
                    if (fileUsername.equals(searchUsername)) {
                        userFOUND = true;
                    }
                }

                if (line.startsWith("Password: ") && line.length() > 10) {
                    String filePassword = line.substring(10);
                    if (filePassword.equals(searchPassword)) {
                        passwordMATCH = true;
                    }
                }

                if (line.equals("-----------------------")) {
                    if (userFOUND && passwordMATCH) {
                        read.close();
                        return true; 
                    }
                    userFOUND = false;
                    passwordMATCH = false;
                }
            }

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! (!)");
        }

        return false; 
    }
}
