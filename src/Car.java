import java.util.HashMap;
import java.util.Scanner;

public class Car {
    private HashMap<Integer,CarDetails> cars = new HashMap<>();
    Invoice invoice = new Invoice();
    CarDetails car1 = new CarDetails(200001,"Suzuki Swift",20,"Normal", 4);
    CarDetails car2 = new CarDetails(200002,"Suzuki Dizire",20,"Normal", 4);
    CarDetails car3 = new CarDetails(200003,"Hyundai i20",20,"Normal", 4);
    CarDetails car4 = new CarDetails(200004,"Toyota Inova",15,"SUV", 7);
    CarDetails car5 = new CarDetails(200005,"MG hector",15,"SUV", 7);
    CarDetails car6 = new CarDetails(200006,"Suzuki Shift",20,"Normal", 4);
    CarDetails car7 = new CarDetails(200007,"Suzuki Dizire",20,"Normal", 4);


    public Car(){
        this.cars.put(car1.getId(),car1);
        this.cars.put(car2.getId(),car2);
        this.cars.put(car3.getId(),car3);
        this.cars.put(car4.getId(),car4);
        this.cars.put(car5.getId(),car5);
        this.cars.put(car6.getId(),car6);
        this.cars.put(car7.getId(),car7);
    }

    public void displayVehicles() {
        System.out.println("Cars Avaliable in System :");
        System.out.println("___________________________________________");
        for(Integer x : cars.keySet()){
            System.out.println("Cars Id : " + cars.get(x).getId());
            System.out.println("Cars Name : " + cars.get(x).getName());
            System.out.println("Cars Milage : " + cars.get(x).getMilage());
            System.out.println("Cars Seats : " + cars.get(x).getSeats());
            System.out.println("Cars Type : " + cars.get(x).getType());
            System.out.println("___________________");
        }
    }

    public void addCar(CarDetails c) {
        this.cars.put(c.getId(),c);
    }

    public void carFull(boolean driverflag,String email,User user){
        displayVehicles();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Car from above List :");
        System.out.println("Enter the Car Id you want to take");
        int select = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter date you want to rent : ");
        String date = sc.nextLine();
        System.out.print("How many days you want the car : ");
        int noofdays = sc.nextInt();
        System.out.println("Selected Car is :"+ cars.get(select));
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
        System.out.println("Total Amount : " + invoice.generateinvoicecar(driverflag,noofdays));
    }

}
