package model;

public class Recipe {
    private String name;
    private String imgscr;
    private int chefID;
    private String description;

    public Recipe(String name,String description,String imgscr,int chefID){
        this.chefID = chefID;
        this.imgscr = imgscr;
        this.description = description;
        this.name = name;
    }

    public void setchefID(int chefID) {
        this.chefID = chefID;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImgscr(String imgscr) {
        this.imgscr = imgscr;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getchefID() {
        return chefID;
    }
    public String getDescription() {
        return description;
    }
    public String getImgscr() {
        return imgscr;
    }
    public String getName() {
        return name;
    }

    
}
