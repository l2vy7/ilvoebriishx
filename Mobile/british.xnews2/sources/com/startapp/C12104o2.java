package com.startapp;

import android.content.Context;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* renamed from: com.startapp.o2 */
/* compiled from: Sta */
public class C12104o2 implements C5015nb.C5016a {

    /* renamed from: a */
    public final /* synthetic */ Context f53947a;

    /* renamed from: b */
    public final /* synthetic */ AdEventListener f53948b;

    /* renamed from: c */
    public final /* synthetic */ InterstitialAd f53949c;

    public C12104o2(Context context, AdEventListener adEventListener, InterstitialAd interstitialAd) {
        this.f53947a = context;
        this.f53948b = adEventListener;
        this.f53949c = interstitialAd;
    }

    /* renamed from: a */
    public void mo20681a(boolean z, long j, long j2, boolean z2) {
        C5011i.m22895b(this.f53947a, this.f53948b, this.f53949c, true);
    }

    /* renamed from: a */
    public void mo20680a(int i, String str) {
        C5011i.m22895b(this.f53947a, this.f53948b, this.f53949c, true);
    }
}
