package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lk1 implements ma1, qh1 {

    /* renamed from: b */
    private final sl0 f20536b;

    /* renamed from: c */
    private final Context f20537c;

    /* renamed from: d */
    private final km0 f20538d;

    /* renamed from: e */
    private final View f20539e;

    /* renamed from: f */
    private String f20540f;

    /* renamed from: g */
    private final C8059pq f20541g;

    public lk1(sl0 sl0, Context context, km0 km0, View view, C8059pq pqVar) {
        this.f20536b = sl0;
        this.f20537c = context;
        this.f20538d = km0;
        this.f20539e = view;
        this.f20541g = pqVar;
    }

    @ParametersAreNonnullByDefault
    /* renamed from: a */
    public final void mo18123a(kj0 kj0, String str, String str2) {
        if (this.f20538d.mo18501z(this.f20537c)) {
            try {
                km0 km0 = this.f20538d;
                Context context = this.f20537c;
                km0.mo18495t(context, km0.mo18481f(context), this.f20536b.mo34722a(), kj0.zzc(), kj0.zzb());
            } catch (RemoteException e) {
                co0.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    /* renamed from: w */
    public final void mo18127w() {
    }

    public final void zze() {
    }

    public final void zzf() {
        String i = this.f20538d.mo18484i(this.f20537c);
        this.f20540f = i;
        String valueOf = String.valueOf(i);
        String str = this.f20541g == C8059pq.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f20540f = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    public final void zzj() {
        this.f20536b.mo34723c(false);
    }

    public final void zzm() {
    }

    public final void zzo() {
        View view = this.f20539e;
        if (!(view == null || this.f20540f == null)) {
            this.f20538d.mo18499x(view.getContext(), this.f20540f);
        }
        this.f20536b.mo34723c(true);
    }

    public final void zzr() {
    }
}
