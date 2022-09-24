package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {

    /* renamed from: a */
    private int f51322a;

    /* renamed from: b */
    private String f51323b;

    /* renamed from: c */
    private boolean f51324c;

    /* renamed from: d */
    private C11426l f51325d;

    public InterstitialPlacement(int i, String str, boolean z, C11426l lVar) {
        this.f51322a = i;
        this.f51323b = str;
        this.f51324c = z;
        this.f51325d = lVar;
    }

    public C11426l getPlacementAvailabilitySettings() {
        return this.f51325d;
    }

    public int getPlacementId() {
        return this.f51322a;
    }

    public String getPlacementName() {
        return this.f51323b;
    }

    public boolean isDefault() {
        return this.f51324c;
    }

    public String toString() {
        return "placement name: " + this.f51323b;
    }
}
