import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        Admin admin = new Admin();
        Driver driver = new Driver();
        Car car  = new Car();
        Bike bike = new Bike();



        boolean ulg = false;
        boolean alg = false;
        boolean dlg = false;
        boolean driverflag = false;





        System.out.println("__________________________________________________________________________");
        System.out.println("Welcome for Z-Car Applications");
        System.out.println("Enter type of Account : ");
        System.out.println("If User enter 1");
        System.out.println("Tf Admin enter 2");
        System.out.println("If Driver enter 3");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("Login OR SignUp");
        System.out.println("For Login enter 1");
        System.out.println("For SignUp enter 2");
        int los = sc.nextInt();
        if(type == 1 && los ==1){
            if(user.login()){
                System.out.println("Login Succeccful");
                ulg = true;

            }
        } else if (type == 1 && los ==2) {
            if(user.signup()){
                System.out.println("User Registered Successfully");
                ulg = true;
            }
        } else if (type == 2 && los == 1) {
            if(admin.login()){
                System.out.println("Login Successful");
                alg = true;
            }
        } else if (type == 2 && los == 2) {
            System.out.println("You cant SignUp Contact Admin :");
        } else if (type == 3 && los == 1) {
            if(driver.login()){
                System.out.println("Login Successfull");
                dlg = true;
            }
        } else if (type == 3 && los == 2) {
            if(user.signup()){
                System.out.println("Driver Registration Successfull");
                dlg = true;
            }
        }else{
            System.out.println();
            System.out.println("Invalid");
        }
        if(ulg){
            System.out.println("Enter the type of Vehicle you want to rent :");
            System.out.println("If Car press 1...");
            System.out.println("If bike press 2...");
            int corb = sc.nextInt();
            sc.nextLine();
            if(corb == 1){
                if (user.getlicence(user.getEmail()) != 1) {
                    System.out.println("You not having Specified Licence for Car");
                    System.out.println("Adding driver Automatically :");
                    driverflag = true;
                }
                car.carFull(driverflag, user.getEmail(),user);
            } else if (corb == 2) {
                if (user.getlicence(user.getEmail()) != 0 && user.getlicence(user.getEmail()) != 1) {
                    System.out.println("You not having Specified Licence for Bike");
                    System.out.println("Adding driver Automatically :");
                    driverflag = true;
                }
                bike.bikeFull(driverflag,user.getEmail(),user);
            }
        } else if (alg) {
            admin.services(user,driver,admin,car,bike);
        } else if (dlg) {
            driver.services();
        } else{
            System.out.println("Invalid");
        }
    }
}