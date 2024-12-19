import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class User{
    private String email;
    private HashMap<String, UserDetails> users = new HashMap<>();
    UserDetails u1 = new UserDetails("Vinay", "vinay@gmail.com","Zail", "9392287123","Male", "8724 3874 8473","LMV","Chittinagar Vijayawada");

    public User(){
        users.put(u1.getEmail(),u1);
    }
    public boolean signup(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Name : ");
        String name = sc.nextLine();

        System.out.print("Please enter Email : ");
        String email = sc.nextLine();

        if(isUsersExists(email)){
            System.out.println("User Already please Login");
            return false;
        }else {

            System.out.print("Please enter Password : ");
            String pass = sc.nextLine();

            System.out.print("Please enter Mobile Number : ");
            String mobile = sc.nextLine();

            System.out.print("Please enter Gender : ");
            String gender = sc.nextLine();

            System.out.print("Please enter Aadhar Number : ");
            String aadharno = sc.nextLine();

            System.out.println("Please enter Address : ");
            String address = sc.nextLine();

            System.out.print("Please enter the Licence type : ");
            String lt = sc.nextLine();

            UserDetails ud = new UserDetails(name, email, pass, mobile, gender, aadharno, lt, address);
            addperson(ud);
            return login();
        }
    }
    public boolean login(){
        System.out.println();
        System.out.println("_________________________________________________________________________________");
        System.out.println();
        System.out.println("Please Enter your login details : ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Email : ");
        String email = sc.nextLine();
        setEmail(email);
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
        return users.containsKey(email);
    }
    public boolean verifypassword(String email , String pass){
        return (Objects.equals(users.get(email).getPass(), pass));
    }
    public void addperson(UserDetails u){
        users.put(u.getEmail(),u);
    }
    public void display(){
        for(String e : users.keySet()) {
            System.out.println(users.get(e).getName());
        }
    }
    public int getlicence(String email){
        if(users.get(email).getLt().equals("LMV") || users.get(email).getLt().equals("INTERNATIONALLMV")){
            return 1;
        }else if(users.get(email).getLt().equals("MCWG") || users.get(email).getLt().equals("INTERNATIONALMCWG")){
            return 0;
        }
        else{
            return -1;
        }
    }
    public UserDetails getbyemail(String email)
    {
        return users.get(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
