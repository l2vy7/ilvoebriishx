package com.startapp.sdk.adsbase.cache;

import java.io.Serializable;

/* compiled from: Sta */
public class CachedVideoAd implements Serializable {
    private static final long serialVersionUID = 1;
    private String filename;
    private long lastUseTimestamp;
    private String videoLocation;

    public CachedVideoAd(String str) {
        this.filename = str;
    }

    /* renamed from: a */
    public String mo46159a() {
        return this.videoLocation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedVideoAd cachedVideoAd = (CachedVideoAd) obj;
        String str = this.filename;
        if (str == null) {
            if (cachedVideoAd.filename != null) {
                return false;
            }
        } else if (!str.equals(cachedVideoAd.filename)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.filename;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    /* renamed from: a */
    public void mo46161a(String str) {
        this.videoLocation = str;
    }

    /* renamed from: a */
    public void mo46160a(long j) {
        this.lastUseTimestamp = j;
    }
}
