package model.Singleton;

public class FollowRecipe {
	private static FollowRecipe FollowRecipe_instance;
    
	public static FollowRecipe getInstatnce() {
		if(FollowRecipe_instance==null) {
			FollowRecipe_instance = new FollowRecipe();
		}
		return FollowRecipe_instance;
	}

}
