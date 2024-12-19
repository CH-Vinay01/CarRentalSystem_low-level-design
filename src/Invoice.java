public class Invoice {
    public int generateinvoicecar(boolean driverflag, int noofdays){
        if(driverflag){
            return noofdays*1500 + noofdays*2000;
        }else{
            return noofdays*2000;
        }
    }
    public int generateinvoicebike(boolean driverflag, int noofdays){
        if(driverflag){
            return noofdays*300 + noofdays*500;
        }else{
            return noofdays*500;
        }
    }
}
