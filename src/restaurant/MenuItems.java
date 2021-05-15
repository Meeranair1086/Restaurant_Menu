package restaurant;

public class MenuItems {



    private String name;
    private double price;
    private String description;
    private String category;

    /* public MenuItems(String itemName,double itemPrice,String itemDescription,String itemCategory) {
    name=itemName;
    price=itemPrice;
    description=itemDescription;
    category=itemCategory;

    }*/


    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }




    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
