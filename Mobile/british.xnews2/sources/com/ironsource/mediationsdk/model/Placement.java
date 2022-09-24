package com.ironsource.mediationsdk.model;

public class Placement {

    /* renamed from: a */
    private int f51340a;

    /* renamed from: b */
    private String f51341b;

    /* renamed from: c */
    private boolean f51342c;

    /* renamed from: d */
    private String f51343d;

    /* renamed from: e */
    private int f51344e;

    /* renamed from: f */
    private C11426l f51345f;

    public Placement(int i, String str, boolean z, String str2, int i2, C11426l lVar) {
        this.f51340a = i;
        this.f51341b = str;
        this.f51342c = z;
        this.f51343d = str2;
        this.f51344e = i2;
        this.f51345f = lVar;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f51340a = interstitialPlacement.getPlacementId();
        this.f51341b = interstitialPlacement.getPlacementName();
        this.f51342c = interstitialPlacement.isDefault();
        this.f51345f = interstitialPlacement.getPlacementAvailabilitySettings();
    }

    public C11426l getPlacementAvailabilitySettings() {
        return this.f51345f;
    }

    public int getPlacementId() {
        return this.f51340a;
    }

    public String getPlacementName() {
        return this.f51341b;
    }

    public int getRewardAmount() {
        return this.f51344e;
    }

    public String getRewardName() {
        return this.f51343d;
    }

    public boolean isDefault() {
        return this.f51342c;
    }

    public String toString() {
        return "placement name: " + this.f51341b + ", reward name: " + this.f51343d + " , amount: " + this.f51344e;
    }
}
