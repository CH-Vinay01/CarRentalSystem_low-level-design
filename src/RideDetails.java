public class RideDetails {
    private int noofdays;
    private String date;
    private String startaddress;
    private int id;
    public RideDetails(int id, int noofdays,String date,String startaddress){
        this.id = id;
        this.noofdays=noofdays;
        this.date=date;
        this.startaddress = startaddress;
    }

    public String getStartaddress() {
        return startaddress;
    }

    public void setStartaddress(String startaddress) {
        this.startaddress = startaddress;
    }

    public int getNoofdays() {
        return noofdays;
    }

    public void setNoofdays(int noofdays) {
        this.noofdays = noofdays;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
