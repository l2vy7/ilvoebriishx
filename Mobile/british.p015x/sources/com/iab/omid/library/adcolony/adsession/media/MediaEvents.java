package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.p043b.C4835f;
import com.iab.omid.library.adcolony.p045d.C4843b;
import com.iab.omid.library.adcolony.p045d.C4847e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {

    /* renamed from: a */
    private final C4826a f21671a;

    private MediaEvents(C4826a aVar) {
        this.f21671a = aVar;
    }

    /* renamed from: a */
    private void m22248a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    /* renamed from: b */
    private void m22249b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        C4826a aVar = (C4826a) adSession;
        C4847e.m22345a((Object) adSession, "AdSession is null");
        C4847e.m22353g(aVar);
        C4847e.m22344a(aVar);
        C4847e.m22348b(aVar);
        C4847e.m22351e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo20162a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4847e.m22345a((Object) interactionType, "InteractionType is null");
        C4847e.m22349c(this.f21671a);
        JSONObject jSONObject = new JSONObject();
        C4843b.m22329a(jSONObject, "interactionType", interactionType);
        this.f21671a.getAdSessionStatePublisher().mo20165a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("bufferFinish");
    }

    public void bufferStart() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("bufferStart");
    }

    public void complete() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("complete");
    }

    public void firstQuartile() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("firstQuartile");
    }

    public void midpoint() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("midpoint");
    }

    public void pause() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C4847e.m22345a((Object) playerState, "PlayerState is null");
        C4847e.m22349c(this.f21671a);
        JSONObject jSONObject = new JSONObject();
        C4843b.m22329a(jSONObject, "state", playerState);
        this.f21671a.getAdSessionStatePublisher().mo20165a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("resume");
    }

    public void skipped() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("skipped");
    }

    public void start(float f, float f2) {
        m22248a(f);
        m22249b(f2);
        C4847e.m22349c(this.f21671a);
        JSONObject jSONObject = new JSONObject();
        C4843b.m22329a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4843b.m22329a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4843b.m22329a(jSONObject, "deviceVolume", Float.valueOf(C4835f.m22294a().mo20147d()));
        this.f21671a.getAdSessionStatePublisher().mo20165a(TtmlNode.START, jSONObject);
    }

    public void thirdQuartile() {
        C4847e.m22349c(this.f21671a);
        this.f21671a.getAdSessionStatePublisher().mo20163a("thirdQuartile");
    }

    public void volumeChange(float f) {
        m22249b(f);
        C4847e.m22349c(this.f21671a);
        JSONObject jSONObject = new JSONObject();
        C4843b.m22329a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4843b.m22329a(jSONObject, "deviceVolume", Float.valueOf(C4835f.m22294a().mo20147d()));
        this.f21671a.getAdSessionStatePublisher().mo20165a("volumeChange", jSONObject);
    }
}
