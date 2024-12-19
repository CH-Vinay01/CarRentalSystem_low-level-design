import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Driver {
    private HashMap<String , DriverDetails> drivers = new HashMap<String, DriverDetails>();
    DriverDetails d1 = new DriverDetails("Ram","ram@gmail.com", "Zail", "8959849494","Male", "9837 5883 8458", "LMV","Bhavanipuram, Vijayawada");
    DriverDetails d2 = new DriverDetails("Shanmukh","shanmukh@gmail.com", "Zail", "6303456721","Male", "5764 5984 5858", "LMV","Sairam, Vijayawada");
    DriverDetails d3 = new DriverDetails("Krish","krish@gmail.com", "Zail", "9392565656","Male", "4756 8487 7584", "LMV","Chittinagar, Vijayawada");
    HashMap<Integer,RideDetails> rides = new HashMap<>();
    RideDetails r1 = new RideDetails(12301,4,"20-12-2024","Vij");
    RideDetails r2 = new RideDetails(12302,10,"18-12-2024","Vij");
    RideDetails r3 = new RideDetails(12303,7,"24-12-2024","Vij");
    public Driver(){
        this.drivers.put(d1.getEmail(),d1);
        this.drivers.put(d2.getEmail(),d2);
        this.drivers.put(d3.getEmail(),d3);
        this.rides.put(r1.getId(),r1);
        this.rides.put(r2.getId(),r2);
        this.rides.put(r3.getId(),r3);
    }

    public boolean signup(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Name : ");
        String name = sc.nextLine();

        System.out.print("Please enter Email : ");
        String email = sc.nextLine();

        System.out.print("Please enter Password : ");
        String pass = sc.nextLine();

        System.out.print("Please enter Mobile Number : ");
        String mobile = sc.nextLine();

        System.out.print("Please enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Please enter Aadhar Number : ");
        String  aadharno = sc.nextLine();

        System.out.println("Please enter Address : ");
        String address = sc.nextLine();

        System.out.print("Please enter the Licence type : ");
        String lt = sc.nextLine();
        DriverDetails ud = new DriverDetails(name, email, pass, mobile, gender, aadharno, lt, address);
        addperson(ud);
        System.out.println("_____________________________________________________________________________");
        System.out.println();
        System.out.println("       ----->Driver Registration Successfull<-----");
        return login();
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
        return drivers.containsKey(email);
    }
    public boolean verifypassword(String email , String pass){
        return (Objects.equals(drivers.get(email).getPass(), pass));
    }
    public void addperson(DriverDetails u){
        drivers.put(u.getEmail(),u);
    }
    public void display(){
        for(String e : drivers.keySet()) {
            System.out.println(drivers.get(e).getName());
        }
    }
    public void displayrides(){
        for(Integer i : rides.keySet()){
            System.out.println("______________________");
            System.out.println("Ride Id : "+rides.get(i).getId());
            System.out.println("Ride Start date : "+rides.get(i).getDate());
            System.out.println("Ride address : "+rides.get(i).getStartaddress());
            System.out.println("Ride No of days of Ride : "+rides.get(i).getNoofdays());
        }
    }
    public String getLicence(String email){
        return drivers.get(email).getLt();
    }
    public void services(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the type of Services : ");
        System.out.print("To Display Rides : press 1 ------> : ");
        int st = sc.nextInt();
        System.out.println("_____________________________________________________________________________");
        sc.nextLine();
        displayrides();
    }
}
