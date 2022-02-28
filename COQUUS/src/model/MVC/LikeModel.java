package model.MVC;

public class LikeModel {
    private int like;

    public LikeModel(int like){
        this.like = like;
    }

    public int getLikeNb() {
        return like;
    }

    public void IncLike(){
        like++;
        //setChanged();
        IncLike();
    }
}
