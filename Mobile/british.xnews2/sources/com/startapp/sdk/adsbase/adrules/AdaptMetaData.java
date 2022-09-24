package com.startapp.sdk.adsbase.adrules;

import com.startapp.C5010hb;
import java.io.Serializable;

/* compiled from: Sta */
public class AdaptMetaData implements Serializable {

    /* renamed from: a */
    public static transient AdaptMetaData f54531a = new AdaptMetaData();
    @C5010hb(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "4.10.2";

    private AdaptMetaData() {
    }

    /* renamed from: a */
    public AdRules mo46145a() {
        return this.adRules;
    }
}
