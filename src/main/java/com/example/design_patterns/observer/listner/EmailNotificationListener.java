package com.example.design_patterns.observer.listner;

import com.example.design_patterns.observer.objects.FacebookUser;

public class EmailNotificationListener implements IEventListener{
    private FacebookUser user;

    public EmailNotificationListener(FacebookUser user) {
        this.user = user;
    }

    @Override
    public void update(String eventType, String displayName, String url) {
        System.out.println(
                "Email Notification >> Hey " + this.user.getFirstName() + ", " +
                        displayName + " posted new content: " + eventType + " >> " + url);
    }
}
