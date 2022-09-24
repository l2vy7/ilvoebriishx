package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uw1 {

    /* renamed from: a */
    private final a80 f40003a;

    uw1(a80 a80) {
        this.f40003a = a80;
    }

    /* renamed from: s */
    private final void m38505s(tw1 tw1) throws RemoteException {
        String str;
        String a = tw1.m38036a(tw1);
        if (a.length() != 0) {
            str = "Dispatching AFMA event on publisher webview: ".concat(a);
        } else {
            str = new String("Dispatching AFMA event on publisher webview: ");
        }
        co0.zzi(str);
        this.f40003a.mo30322a(a);
    }

    /* renamed from: a */
    public final void mo35310a() throws RemoteException {
        m38505s(new tw1("initialize", (sw1) null));
    }

    /* renamed from: b */
    public final void mo35311b(long j) throws RemoteException {
        tw1 tw1 = new tw1(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdClicked";
        this.f40003a.mo30322a(tw1.m38036a(tw1));
    }

    /* renamed from: c */
    public final void mo35312c(long j) throws RemoteException {
        tw1 tw1 = new tw1(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdClosed";
        m38505s(tw1);
    }

    /* renamed from: d */
    public final void mo35313d(long j, int i) throws RemoteException {
        tw1 tw1 = new tw1(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdFailedToLoad";
        tw1.f39556d = Integer.valueOf(i);
        m38505s(tw1);
    }

    /* renamed from: e */
    public final void mo35314e(long j) throws RemoteException {
        tw1 tw1 = new tw1(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdLoaded";
        m38505s(tw1);
    }

    /* renamed from: f */
    public final void mo35315f(long j) throws RemoteException {
        tw1 tw1 = new tw1(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onNativeAdObjectNotAvailable";
        m38505s(tw1);
    }

    /* renamed from: g */
    public final void mo35316g(long j) throws RemoteException {
        tw1 tw1 = new tw1(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdOpened";
        m38505s(tw1);
    }

    /* renamed from: h */
    public final void mo35317h(long j) throws RemoteException {
        tw1 tw1 = new tw1("creation", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "nativeObjectCreated";
        m38505s(tw1);
    }

    /* renamed from: i */
    public final void mo35318i(long j) throws RemoteException {
        tw1 tw1 = new tw1("creation", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "nativeObjectNotCreated";
        m38505s(tw1);
    }

    /* renamed from: j */
    public final void mo35319j(long j) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdClicked";
        m38505s(tw1);
    }

    /* renamed from: k */
    public final void mo35320k(long j) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onRewardedAdClosed";
        m38505s(tw1);
    }

    /* renamed from: l */
    public final void mo35321l(long j, yj0 yj0) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onUserEarnedReward";
        tw1.f39557e = yj0.zzf();
        tw1.f39558f = Integer.valueOf(yj0.zze());
        m38505s(tw1);
    }

    /* renamed from: m */
    public final void mo35322m(long j, int i) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onRewardedAdFailedToLoad";
        tw1.f39556d = Integer.valueOf(i);
        m38505s(tw1);
    }

    /* renamed from: n */
    public final void mo35323n(long j, int i) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onRewardedAdFailedToShow";
        tw1.f39556d = Integer.valueOf(i);
        m38505s(tw1);
    }

    /* renamed from: o */
    public final void mo35324o(long j) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onAdImpression";
        m38505s(tw1);
    }

    /* renamed from: p */
    public final void mo35325p(long j) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onRewardedAdLoaded";
        m38505s(tw1);
    }

    /* renamed from: q */
    public final void mo35326q(long j) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onNativeAdObjectNotAvailable";
        m38505s(tw1);
    }

    /* renamed from: r */
    public final void mo35327r(long j) throws RemoteException {
        tw1 tw1 = new tw1("rewarded", (sw1) null);
        tw1.f39553a = Long.valueOf(j);
        tw1.f39555c = "onRewardedAdOpened";
        m38505s(tw1);
    }
}
