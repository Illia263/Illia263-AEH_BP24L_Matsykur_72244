public class lab09 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("W-01", 5000, "Default Owner", "default@email.com", "000-000-000");

        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        warehouse.addGoods(1000); 
    }
}