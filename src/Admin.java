import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Admin {
    private HashMap<String,AdminDetails> admins= new HashMap<>();
    AdminDetails ad1 = new AdminDetails("Vinay", "vinay@gmail.com","Zail@123");
    AdminDetails ad2 = new AdminDetails("Vinay2","vinay1@gmail.com","Zail@123");
    Scanner sc = new Scanner(System.in);
    public Admin(){
        admins.put(ad1.getEmail(),ad1);
        admins.put(ad2.getEmail(),ad2);
    }
    public boolean login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Email : ");
        String email = sc.nextLine();
        System.out.print("Please enter Password : ");
        String pass = sc.nextLine();
        if(isUsersExists(email)){
            if(verifypassword(email,pass)) {
                System.out.println("Login Successfull");
                return true;
            }
            System.out.println("Invalid Login Details");
        }
        return false;
    }

    public boolean isUsersExists(String email){
        return admins.containsKey(email);
    }
    public boolean verifypassword(String email , String pass){
        return (Objects.equals(admins.get(email).getPass(), pass));
    }
    public void addperson(AdminDetails u){
        admins.put(u.getEmail(),u);
    }
    public void display(){
        for(String e : admins.keySet()) {
            System.out.println(admins.get(e).getName());
        }
    }
    public void services(User user, Driver driver, Admin admin,Car car,Bike bike){
        System.out.println("What type of Service Do You Want : ");
        System.out.println("add admin press 1");
        System.out.println("display users press 2");
        System.out.println("display Drivers press 3");
        System.out.println("add car press 4");
        System.out.println("add bike press 5");
        Scanner sc  = new Scanner(System.in);
        int slt = sc.nextInt();
        sc.nextLine();
        if(slt == 1){
            System.out.println("enter the person details");
            System.out.println("enter the name : ");
            String name = sc.nextLine();
            System.out.println("enter the email id : ");
            String email = sc.nextLine();
            System.out.println("enter the pass : ");
            String pass = sc.nextLine();
            AdminDetails adminDetails = new AdminDetails(name,email,pass);
            addperson(adminDetails);
            System.out.println("Now "+ name+" is Admin");
            System.out.println();
            System.out.println("Displaying all admins Names check : ");
            display();
        } else if (slt==2) {
            user.display();
        } else if (slt == 3) {
            driver.display();
        } else if (slt == 4) {
            System.out.println("Enter Car details");
            System.out.print("Enter Car Id : ");
            int id = sc.nextInt();sc.nextLine();
            System.out.print("Enter Car name : ");
            String name = sc.nextLine();
            System.out.print("Enter Car Milage : ");
            int milage = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Car  type: ");
            String type = sc.nextLine();
            System.out.print("Enter Car seats : ");
            int seats = sc.nextInt();
            CarDetails cardetails = new CarDetails(id,name,milage,type,seats);
            car.addCar(cardetails);
            car.displayVehicles();
        } else if (slt == 5) {
            System.out.println("Enter Bike details");
            System.out.print("Enter Bike Id : ");
            int id = sc.nextInt();sc.next();
            System.out.print("Enter Bike name : ");
            String name = sc.nextLine();
            System.out.print("Enter Bike Milage : ");
            int milage = sc.nextInt();
            System.out.print("Enter Bike  type: ");
            String type = sc.nextLine();
            BikeDetails bikeDetails = new BikeDetails(id,name,milage,type);
            bike.addBike(bikeDetails);
            bike.displayVehicles();
        } else{
            System.out.println("Underdevelopment");
        }
    }
}
