package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* renamed from: com.google.android.gms.internal.ads.lp */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7912lp {

    /* renamed from: a */
    private C8136rw f35154a;

    /* renamed from: b */
    private final Context f35155b;

    /* renamed from: c */
    private final String f35156c;

    /* renamed from: d */
    private final C4618oy f35157d;
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: e */
    private final int f35158e;

    /* renamed from: f */
    private final AppOpenAd.AppOpenAdLoadCallback f35159f;

    /* renamed from: g */
    private final qc0 f35160g = new qc0();

    /* renamed from: h */
    private final C8134ru f35161h;

    public C7912lp(Context context, String str, C4618oy oyVar, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f35155b = context;
        this.f35156c = str;
        this.f35157d = oyVar;
        this.f35158e = i;
        this.f35159f = appOpenAdLoadCallback;
        this.f35161h = C8134ru.f38776a;
    }

    /* renamed from: a */
    public final void mo33369a() {
        try {
            this.f35154a = C8241uv.m38462a().mo34794d(this.f35155b, zzbfi.m40642D0(), this.f35156c, this.f35160g);
            zzbfo zzbfo = new zzbfo(this.f35158e);
            C8136rw rwVar = this.f35154a;
            if (rwVar != null) {
                rwVar.zzI(zzbfo);
                this.f35154a.zzH(new C8304wo(this.f35159f, this.f35156c));
                this.f35154a.zzaa(this.f35161h.mo34626a(this.f35155b, this.f35157d));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
