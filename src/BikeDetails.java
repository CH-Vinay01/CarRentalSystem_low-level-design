public class BikeDetails{
    private int id;
    private String name;
    private int milage;
    private String type;
    private int seats;
    private int cnt;

    public BikeDetails(int id, String name, int milage, String type){
        this.id = id;
        this.name=name;
        this.milage=milage;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return 2;
    }

    public void setSeats(int seats) {
        this.seats = 2;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }


}
