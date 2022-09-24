package com.startapp.sdk.ads.video;

import com.startapp.C12132pb;
import com.startapp.C5010hb;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.vast.C12255a;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.omsdk.AdVerification;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 7139790917892812511L;
    @C5010hb(type = VerificationDetails.class)
    private VerificationDetails[] adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @C5010hb(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    @C5010hb(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: Sta */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    /* renamed from: a */
    public void mo45968a(String str) {
        this.localVideoPath = str;
    }

    /* renamed from: b */
    public String mo45970b() {
        return this.clickUrl;
    }

    /* renamed from: c */
    public String mo45971c() {
        return this.localVideoPath;
    }

    /* renamed from: d */
    public String mo45972d() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    /* renamed from: e */
    public String mo45973e() {
        return this.postRollHtml;
    }

    /* renamed from: f */
    public PostRollType mo45974f() {
        return this.postRoll;
    }

    /* renamed from: g */
    public long mo45975g() {
        return this.skippableAfter;
    }

    /* renamed from: h */
    public VideoTrackingDetails mo45976h() {
        return this.videoTrackingDetails;
    }

    /* renamed from: i */
    public String mo45977i() {
        return this.videoUrl;
    }

    /* renamed from: j */
    public boolean mo45978j() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    /* renamed from: k */
    public boolean mo45979k() {
        return this.clickable;
    }

    /* renamed from: l */
    public boolean mo45980l() {
        return this.closeable;
    }

    /* renamed from: m */
    public boolean mo45981m() {
        return this.skippable;
    }

    /* renamed from: n */
    public boolean mo45982n() {
        return this.isVideoMuted;
    }

    /* renamed from: o */
    public void mo45983o() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(C12132pb pbVar, VideoConfig videoConfig, boolean z) {
        this.videoTrackingDetails = new VideoTrackingDetails(pbVar);
        this.videoUrl = pbVar.mo45681k();
        Integer o = pbVar.mo45685o();
        boolean z2 = true;
        if (z) {
            this.skippableAfter = o != null ? (long) o.intValue() : videoConfig.mo21006m();
            this.skippable = true;
        } else {
            this.skippable = false;
        }
        String c = pbVar.mo45673c();
        this.clickUrl = c;
        this.clickable = c == null ? false : z2;
        this.postRoll = PostRollType.NONE;
        C12255a f = pbVar.mo45676f();
        if (f != null) {
            this.postRollHtml = f.mo46090c().mo46085a();
            this.postRollClickThroughUrl = f.mo46088a();
        }
        mo45967a(new AdVerification((VerificationDetails[]) pbVar.mo45672b().toArray(new VerificationDetails[0])));
    }

    /* renamed from: a */
    public void mo45969a(boolean z) {
        this.isVideoMuted = z;
    }

    /* renamed from: a */
    public AdVerification mo45966a() {
        return new AdVerification(this.adVerifications);
    }

    /* renamed from: a */
    public void mo45967a(AdVerification adVerification) {
        if (adVerification.mo46490a() != null) {
            this.adVerifications = (VerificationDetails[]) adVerification.mo46490a().toArray(new VerificationDetails[0]);
        }
    }
}
