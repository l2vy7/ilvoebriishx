package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.p049b.C4885f;
import com.iab.omid.library.ironsrc.p051d.C4893b;
import com.iab.omid.library.ironsrc.p051d.C4897e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4876a adSession;

    private MediaEvents(C4876a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        C4876a aVar = (C4876a) adSession2;
        C4897e.m22566a((Object) adSession2, "AdSession is null");
        C4897e.m22574g(aVar);
        C4897e.m22565a(aVar);
        C4897e.m22569b(aVar);
        C4897e.m22572e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo20348a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C4897e.m22566a((Object) interactionType, "InteractionType is null");
        C4897e.m22570c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4893b.m22550a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo20351a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("bufferFinish");
    }

    public final void bufferStart() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("bufferStart");
    }

    public final void complete() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("complete");
    }

    public final void firstQuartile() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("firstQuartile");
    }

    public final void midpoint() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("midpoint");
    }

    public final void pause() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("pause");
    }

    public final void playerStateChange(PlayerState playerState) {
        C4897e.m22566a((Object) playerState, "PlayerState is null");
        C4897e.m22570c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4893b.m22550a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo20351a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("resume");
    }

    public final void skipped() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4897e.m22570c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4893b.m22550a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4893b.m22550a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4893b.m22550a(jSONObject, "deviceVolume", Float.valueOf(C4885f.m22515a().mo20333d()));
        this.adSession.getAdSessionStatePublisher().mo20351a(TtmlNode.START, jSONObject);
    }

    public final void thirdQuartile() {
        C4897e.m22570c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo20349a("thirdQuartile");
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C4897e.m22570c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4893b.m22550a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4893b.m22550a(jSONObject, "deviceVolume", Float.valueOf(C4885f.m22515a().mo20333d()));
        this.adSession.getAdSessionStatePublisher().mo20351a("volumeChange", jSONObject);
    }
}
