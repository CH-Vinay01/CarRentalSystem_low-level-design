import java.util.HashMap;
import java.util.Scanner;

public class Bike{
    private HashMap<Integer, BikeDetails> bikes = new HashMap<>();
    Invoice invoice = new Invoice();
    BikeDetails bike1 = new BikeDetails(100001,"Honda Unicon",50,"Normal");
    BikeDetails bike2 = new BikeDetails(100002,"TVS Platina",70,"Normal");
    BikeDetails bike3 = new BikeDetails(100003,"Yamaha R15",40,"Sports");
    BikeDetails bike4 = new BikeDetails(100004,"KTM 150",50,"Montain");
    BikeDetails bike5 = new BikeDetails(100005,"Royal and Field Classic 350",35,"Normal");

    public Bike(){
        bikes.put(bike1.getId(),bike1);
        bikes.put(bike2.getId(),bike2);
        bikes.put(bike3.getId(),bike3);
        bikes.put(bike4.getId(),bike4);
        bikes.put(bike5.getId(),bike5);
    }

    public void displayVehicles() {
        System.out.println("Bikes Avaliable in System :");
        System.out.println("___________________________________________");
        for(Integer x : bikes.keySet()){
            System.out.println("Bikes Id : " + bikes.get(x).getId());
            System.out.println("Bikes Name : " + bikes.get(x).getName());
            System.out.println("Bikes Milage : " + bikes.get(x).getMilage());
            System.out.println("Bikes Seats : " + bikes.get(x).getSeats());
            System.out.println("Bikes Type : " + bikes.get(x).getType());
            System.out.println("___________________");
        }
        System.out.println();
    }

    public void addBike(BikeDetails b) {
        this.bikes.put(b.getId(),b);
    }
    public void bikeFull(boolean driverflag , String email,User user){
        displayVehicles();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Bike from above List :");
        System.out.println("Enter the Bike Id you want to take");
        int select = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter date you want to rent : ");
        String date = sc.nextLine();
        System.out.print("How many days you want the Bike : ");
        int noofdays = sc.nextInt();
        System.out.println("Selected Bike is :"+ bikes.get(select));
        System.out.println();
        System.out.println("_______________________________________________________________________________________");
        System.out.println();
        System.out.println("             Invoice");
        System.out.println("______________________________________");
        sc.nextLine();
        System.out.println("Name            : " + user.getbyemail(email).getName());
        System.out.println("Email           : " + user.getbyemail(email).getEmail());
        System.out.println("Gender          : " + user.getbyemail(email).getGender());
        System.out.println("Address         : " + user.getbyemail(email).getAddress());
        System.out.println("Phone Number    : " + user.getbyemail(email).getMobile());
        System.out.println("Aadhar No       : " + user.getbyemail(email).getAadharno());
        System.out.println("No of Days      : "+noofdays);
        System.out.println("Date              : "+date);
        System.out.println("________________________________________");
        System.out.println("Total Amount : " + invoice.generateinvoicebike(driverflag,noofdays));
    }
}
