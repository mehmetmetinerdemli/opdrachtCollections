package be.intecbrussels;

public class ProductFactory {


    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    ProductSorter productSorter = new ProductSorter();

    public ProductFactory (ProductSorter  productSorter) {

    }

    public void createProduct(int amount) {



    }

    public ProductFactory(String[] foodProducts, String[] healthProducts, String[] electricProducts) {
        this.foodProducts = foodProducts;
        this.healthProducts = healthProducts;
        this.electricProducts = electricProducts;
    }

    public String[] getFoodProducts() {
        return foodProducts;
    }

    public void setFoodProducts(String[] foodProducts) {
        this.foodProducts = foodProducts;
    }

    public String[] getHealthProducts() {
        return healthProducts;
    }

    public void setHealthProducts(String[] healthProducts) {
        this.healthProducts = healthProducts;
    }

    public String[] getElectricProducts() {
        return electricProducts;
    }

    public void setElectricProducts(String[] electricProducts) {
        this.electricProducts = electricProducts;
    }
}
