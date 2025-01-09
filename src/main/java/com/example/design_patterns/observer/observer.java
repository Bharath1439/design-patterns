package com.example.design_patterns.observer;

import com.example.design_patterns.observer.listner.AppNotificationListener;
import com.example.design_patterns.observer.listner.EmailNotificationListener;
import com.example.design_patterns.observer.objects.FacebookUser;
import com.example.design_patterns.observer.objects.FollowType;
import com.example.design_patterns.observer.publisher.FbPage;

public class observer {

    public static void main(String [] args){
        FbPage FbPage = new FbPage("Coding Memes");

        FacebookUser john = new FacebookUser("John", "john@gmail.com");
        FacebookUser jane = new FacebookUser("Jane", "jane@gmail.com");

        // Observer Pattern

        // John
        AppNotificationListener johnAppNotification = new AppNotificationListener(john);

        FbPage.follow(FollowType.VIDEO, johnAppNotification);
        FbPage.follow(FollowType.LIVE_STREAM, johnAppNotification);
        FbPage.follow(FollowType.ARTICLE, johnAppNotification);

        // Jane
        EmailNotificationListener janeEmailNotification = new EmailNotificationListener(jane);
        AppNotificationListener janeAppNotification = new AppNotificationListener(jane);

        FbPage.follow(FollowType.VIDEO, janeEmailNotification);
        FbPage.follow(FollowType.LIVE_STREAM, janeEmailNotification);
        FbPage.follow(FollowType.LIVE_STREAM, janeAppNotification);

        // Notify
        FbPage.startLiveStream("https://example.com/livestream");
        FbPage.publishVideo("https://example.com/video");

        FbPage.unfollow(FollowType.LIVE_STREAM, janeAppNotification);

        FbPage.startLiveStream("https://example.com/other-livestream");
        FbPage.publishArticle("https://example.com/article");
    }
}
