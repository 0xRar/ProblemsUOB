public class RetailItem {
    String Description = new String();
    private int unitsOnHold;
    private double price;

//    setters
    public void setDescription(String description) {
        Description = description;
    }

    public void setUnitsOnHold(int unitsOnHold) {
        this.unitsOnHold = unitsOnHold;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    getters
    public String getDescription() {
        return Description;
    }

    public int getUnitsOnHold() {
        return unitsOnHold;
    }

    public double getPrice() {
        return price;
    }
    //  Isa Ebrahim(0xRar) 
}
