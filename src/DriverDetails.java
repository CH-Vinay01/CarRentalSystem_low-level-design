public class DriverDetails {
    private String name;
    private String pass;
    private String email;
    private String mobile;
    private String gender;
    private String aadharno;
    private String  address;
    private String lt;

    public DriverDetails(String name, String email, String pass, String mobile, String gender, String aadharno,String lt, String address){
        this.name = name;
        this.email=email;
        this.pass = pass;
        this.mobile = mobile;
        this.gender = gender;
        this.aadharno = aadharno;
        this.lt = lt;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }
}
