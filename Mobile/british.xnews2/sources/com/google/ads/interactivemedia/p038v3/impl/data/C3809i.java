package com.google.ads.interactivemedia.p038v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.i */
/* compiled from: IMASDK */
final class C3809i implements C3760a {
    private String appState;
    private String eventId;
    private Long nativeTime;
    private C3778ar nativeViewBounds;
    private Boolean nativeViewHidden;
    private C3778ar nativeViewVisibleBounds;
    private Double nativeVolume;
    private String queryId;

    C3809i() {
    }

    public C3760a appState(String str) {
        Objects.requireNonNull(str, "Null appState");
        this.appState = str;
        return this;
    }

    public C3787b build() {
        String str;
        String str2 = "";
        if (this.queryId == null) {
            str2 = str2.concat(" queryId");
        }
        if (this.eventId == null) {
            str2 = String.valueOf(str2).concat(" eventId");
        }
        if (this.appState == null) {
            str2 = String.valueOf(str2).concat(" appState");
        }
        if (this.nativeTime == null) {
            str2 = String.valueOf(str2).concat(" nativeTime");
        }
        if (this.nativeVolume == null) {
            str2 = String.valueOf(str2).concat(" nativeVolume");
        }
        if (this.nativeViewHidden == null) {
            str2 = String.valueOf(str2).concat(" nativeViewHidden");
        }
        if (this.nativeViewBounds == null) {
            str2 = String.valueOf(str2).concat(" nativeViewBounds");
        }
        if (this.nativeViewVisibleBounds == null) {
            str2 = String.valueOf(str2).concat(" nativeViewVisibleBounds");
        }
        if (str2.isEmpty()) {
            return new C3810j(this.queryId, this.eventId, this.appState, this.nativeTime.longValue(), this.nativeVolume.doubleValue(), this.nativeViewHidden.booleanValue(), this.nativeViewBounds, this.nativeViewVisibleBounds);
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public C3760a eventId(String str) {
        Objects.requireNonNull(str, "Null eventId");
        this.eventId = str;
        return this;
    }

    public C3760a nativeTime(long j) {
        this.nativeTime = Long.valueOf(j);
        return this;
    }

    public C3760a nativeViewBounds(C3778ar arVar) {
        Objects.requireNonNull(arVar, "Null nativeViewBounds");
        this.nativeViewBounds = arVar;
        return this;
    }

    public C3760a nativeViewHidden(boolean z) {
        this.nativeViewHidden = Boolean.valueOf(z);
        return this;
    }

    public C3760a nativeViewVisibleBounds(C3778ar arVar) {
        Objects.requireNonNull(arVar, "Null nativeViewVisibleBounds");
        this.nativeViewVisibleBounds = arVar;
        return this;
    }

    public C3760a nativeVolume(double d) {
        this.nativeVolume = Double.valueOf(d);
        return this;
    }

    public C3760a queryId(String str) {
        Objects.requireNonNull(str, "Null queryId");
        this.queryId = str;
        return this;
    }
}
