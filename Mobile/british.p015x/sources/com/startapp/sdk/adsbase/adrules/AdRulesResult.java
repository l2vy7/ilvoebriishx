package com.startapp.sdk.adsbase.adrules;

import java.io.Serializable;

/* compiled from: Sta */
public class AdRulesResult implements Serializable {
    private static final long serialVersionUID = 1;
    private String reason;
    private boolean shouldDisplayAd;

    public AdRulesResult(boolean z, String str) {
        this.shouldDisplayAd = z;
        this.reason = str;
    }

    /* renamed from: a */
    public String mo21024a() {
        String str = this.reason;
        return str != null ? str.split(" ")[0] : "";
    }

    /* renamed from: b */
    public boolean mo21025b() {
        return this.shouldDisplayAd;
    }
}
