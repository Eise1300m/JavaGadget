import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Register {
    
    User user = new User();
    Scanner scanner = new Scanner(System.in);

    void registerform(){

        System.out.println("----- Registeration -----");
        System.out.print("\nYour Username: ");
        String Username = scanner.nextLine();

        System.out.print("Your Password: ");
        String Password = scanner.nextLine();

        
        System.out.print("Your Contact: ");
        int Contact = scanner.nextInt();
        scanner.nextLine();

        
        System.out.print("Your Email: ");
        String Email = scanner.nextLine();

        SaveUserToFILE(Username, Password, Contact, Email);

        System.out.println("Registration Success (/)");
        scanner.close();


    }

    private void SaveUserToFILE(String name, String password, int contact, String email){

        try{
            FileWriter writer = new FileWriter("User.txt",true);

            writer.write("Username: " + name + "\n" );
            writer.write("Password: " + password + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Contact: " + contact + "\n");
            writer.write("------------------------\n");

            writer.close();
        }catch (IOException e){
            System.out.println("\nError writing File (!)");
        }
    }
}
