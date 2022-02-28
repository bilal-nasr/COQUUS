package model.Observer;

import java.util.List;


public class NotificationSubject implements CoquusSubject {
    private List<Observer> observers;
    String news;
    public void SubscribeObserver(Observer ob){
        ob.update();
    }
    public void UnSubscribeObserver(Observer ob){
        ob.update();
    }

    public void SetNews(String news){
        this.news = news;
    }
    public String getNews(){
        return news;
    }
    
    @Override
    public void NotifyObserver() {
        // TODO Auto-generated method stub
        for(Observer ob:observers)
            ob.update();
    }

}