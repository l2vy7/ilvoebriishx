package com.startapp.sdk.adsbase.adinformation;

import com.startapp.C5010hb;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import java.io.Serializable;

/* compiled from: Sta */
public class AdInformationOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean enable = true;
    private boolean enableOverride = false;
    @C5010hb(type = AdInformationPositions.Position.class)
    private AdInformationPositions.Position position = AdInformationPositions.Position.getByName(AdInformationPositions.f54514a);
    private boolean positionOverride = false;

    private AdInformationOverrides() {
    }

    /* renamed from: a */
    public static AdInformationOverrides m23167a() {
        return new AdInformationOverrides();
    }

    /* renamed from: b */
    public AdInformationPositions.Position mo21014b() {
        return this.position;
    }

    /* renamed from: c */
    public boolean mo21015c() {
        return this.enable;
    }

    /* renamed from: d */
    public boolean mo21016d() {
        return this.enableOverride;
    }

    /* renamed from: e */
    public boolean mo21017e() {
        return this.positionOverride;
    }

    /* renamed from: a */
    public void mo21013a(boolean z) {
        this.enable = z;
        this.enableOverride = true;
    }

    /* renamed from: a */
    public void mo21012a(AdInformationPositions.Position position2) {
        this.position = position2;
        if (position2 != null) {
            this.positionOverride = true;
        } else {
            this.positionOverride = false;
        }
    }
}
