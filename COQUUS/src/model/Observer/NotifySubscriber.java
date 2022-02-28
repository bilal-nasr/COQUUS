package model.Observer;

import javax.security.auth.Subject;

class NotifySubscriber implements Observer {
    Subject subject;
    
    public void update() {
         System.out.println( " this notification is updated ");
    }


}