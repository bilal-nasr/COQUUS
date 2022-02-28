package model.Builderpattern;




class Recipe {
    private String timer;
    private String ingredient;
    private String instructions;
    
    public void setIngredient(String ingredient)
    {
        this.ingredient = ingredient;
    }
    public void setTimer(String timer)
    {
        this.timer = timer;
    }
    public void setInstructions(String instructions)
    {
        this.instructions = instructions;
    }
    
    public String toString(){
        return "Recipe {ingredient: " +ingredient+ ", timer: " +timer+ ", instructions: "+instructions+ "}";
    }
}
