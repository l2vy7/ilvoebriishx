package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class qh0 {
    @GuardedBy("InternalQueryInfoGenerator.class")

    /* renamed from: d */
    private static wm0 f38133d;

    /* renamed from: a */
    private final Context f38134a;

    /* renamed from: b */
    private final AdFormat f38135b;

    /* renamed from: c */
    private final C4618oy f38136c;

    public qh0(Context context, AdFormat adFormat, C4618oy oyVar) {
        this.f38134a = context;
        this.f38135b = adFormat;
        this.f38136c = oyVar;
    }

    /* renamed from: a */
    public static wm0 m36474a(Context context) {
        wm0 wm0;
        synchronized (qh0.class) {
            if (f38133d == null) {
                f38133d = C8241uv.m38462a().mo34802q(context, new qc0());
            }
            wm0 = f38133d;
        }
        return wm0;
    }

    /* renamed from: b */
    public final void mo34343b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbfd zzbfd;
        wm0 a = m36474a(this.f38134a);
        if (a == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        C10487a m6 = C10489b.m48195m6(this.f38134a);
        C4618oy oyVar = this.f38136c;
        if (oyVar == null) {
            zzbfd = new C4617ou().mo18612a();
        } else {
            zzbfd = C8134ru.f38776a.mo34626a(this.f38134a, oyVar);
        }
        try {
            a.zze(m6, new zzchx((String) null, this.f38135b.name(), (zzbfi) null, zzbfd), new ph0(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
