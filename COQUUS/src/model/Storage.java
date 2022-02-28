package model;

public class Storage {

    private String name;
    private int quantity;
    private String imgscr;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setImgscr(String imgscr) {
        this.imgscr = imgscr;
    }
    public String getImgscr() {
        return imgscr;
    }
}
