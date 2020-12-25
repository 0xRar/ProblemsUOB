public class MainRetail {
    public static void main(String[] args) {
        RetailItem Jeans = new RetailItem();
        RetailItem Jacket = new RetailItem();
        RetailItem Shirt = new RetailItem();

        Jeans.setDescription("Designer Jeans");
        Jeans.setUnitsOnHold(40);
        Jeans.setPrice(34.95);

        Jacket.setDescription("Jacket");
        Jacket.setUnitsOnHold(12);
        Jacket.setPrice(59.95);

        Shirt.setDescription("Shirt");
        Shirt.setUnitsOnHold(20);
        Shirt.setPrice(24.95);


        System.out.println("Descreption   Units On Hold   Price");
        System.out.println("---------------------------------------");
        System.out.println(Jeans.getDescription() +"\t \t"+ Jeans.getUnitsOnHold() +" \t\t"+ Jeans.getPrice());
        System.out.println("---------------------------------------");
        System.out.println(Jacket.getDescription() +"\t\t\t\t"+ Jacket.getUnitsOnHold() +" \t\t"+ Jacket.getPrice());
        System.out.println("---------------------------------------");
        System.out.println(Shirt.getDescription() +"\t\t\t\t"+ Shirt.getUnitsOnHold() +" \t\t"+ Shirt.getPrice());

    }
    //  Isa Ebrahim(0xRar) 
}
