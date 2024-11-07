public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory productHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.productHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return productHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);  // Use the inherited addToWarehouse
        productHistory.add(getBalance());  // Track new balance after adding
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double a = super.takeFromWarehouse(amount);  // Use the inherited takeFromWarehouse
        productHistory.add(getBalance());  // Track new balance after taking
        return a;
    }

    public void printAnalysis(){
        System.out.println("Product: "+ getName());
        System.out.println("History: "+ productHistory);
        System.out.println("Largest amount of product: "+ productHistory.maxValue());
        System.out.println("Smallest amount of product: "+ productHistory.minValue());
        System.out.println("Average: "+ productHistory.average());


    }

    @Override
    public String toString() {
        return getName() + ": balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
