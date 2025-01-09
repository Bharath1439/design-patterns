package com.example.design_patterns.observer.publisher;

import com.example.design_patterns.observer.listner.IEventListener;
import com.example.design_patterns.observer.objects.FollowType;

public class FbPage {

    private String displayName;
    private EventManager eventManager;

    public FbPage(String displayName){
        this.displayName = displayName;
        this.eventManager = new EventManager(FollowType.VIDEO, FollowType.LIVE_STREAM, FollowType.ARTICLE);

    }
    public void follow(String eventType, IEventListener listener) {
        this.eventManager.subscribe(eventType, listener);
    }

    public void unfollow(String eventType, IEventListener listener) {
        this.eventManager.unsubscribe(eventType, listener);
    }

    public void publishVideo(String url) {
        this.eventManager.notify(FollowType.VIDEO, this.displayName, url);
    }

    public void startLiveStream(String url) {
        this.eventManager.notify(FollowType.LIVE_STREAM, this.displayName, url);
    }

    public void publishArticle(String url) {
        this.eventManager.notify(FollowType.ARTICLE, this.displayName, url);
    }

}
