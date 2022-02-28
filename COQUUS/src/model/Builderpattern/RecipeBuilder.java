
package model.Builderpattern;

abstract class RecipeBuilder {
    protected Recipe r;
    
    public Recipe getRecipe(){
        return r;
    }
    
    public void createNewRecipe(){
        r = new Recipe();
    }
    
   /* public void clearRecipe(){
        r = NULL;
    }*/
    
    public abstract void buildIngredient();
    public abstract void buildTimer();
    public abstract void buildInstructions();

}
