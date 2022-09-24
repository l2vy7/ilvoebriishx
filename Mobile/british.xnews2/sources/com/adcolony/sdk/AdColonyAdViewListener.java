package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a */
    String f10532a = "";

    /* renamed from: b */
    AdColonyAdSize f10533b;

    /* renamed from: c */
    C2829j0 f10534c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdSize mo9400a() {
        return this.f10533b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2829j0 mo9404b() {
        return this.f10534c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9405c() {
        return this.f10532a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9402a(C2829j0 j0Var) {
        this.f10534c = j0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9403a(String str) {
        this.f10532a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9401a(AdColonyAdSize adColonyAdSize) {
        this.f10533b = adColonyAdSize;
    }
}
