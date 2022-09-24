package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import java.util.concurrent.Executor;
import p006a5.C6492o;
import p133q.C5918d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i62 implements r42<zi1> {

    /* renamed from: a */
    private final Context f33106a;

    /* renamed from: b */
    private final xj1 f33107b;

    /* renamed from: c */
    private final Executor f33108c;

    /* renamed from: d */
    private final hr2 f33109d;

    public i62(Context context, Executor executor, xj1 xj1, hr2 hr2) {
        this.f33106a = context;
        this.f33107b = xj1;
        this.f33108c = executor;
        this.f33109d = hr2;
    }

    /* renamed from: d */
    private static String m33085d(ir2 ir2) {
        try {
            return ir2.f33497w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        return (this.f33106a instanceof Activity) && C6492o.m28279b() && o10.m20748g(this.f33106a) && !TextUtils.isEmpty(m33085d(ir2));
    }

    /* renamed from: b */
    public final mb3<zi1> mo31510b(ur2 ur2, ir2 ir2) {
        String d = m33085d(ir2);
        return bb3.m30654n(bb3.m30649i(null), new h62(this, d != null ? Uri.parse(d) : null, ur2, ir2), this.f33108c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo32562c(Uri uri, ur2 ur2, ir2 ir2, Object obj) throws Exception {
        try {
            C5918d a = new C5918d.C5919a().mo22909a();
            a.f24786a.setData(uri);
            zzc zzc = new zzc(a.f24786a, (zzu) null);
            uo0 uo0 = new uo0();
            aj1 c = this.f33107b.mo35762c(new e71(ur2, ir2, (String) null), new ej1(new g62(uo0), (xt0) null));
            uo0.zzd(new AdOverlayInfoParcel(zzc, (C7659eu) null, c.mo30388h(), (zzw) null, new zzcjf(0, 0, false, false, false), (xt0) null, (gi1) null));
            this.f33109d.mo32437a();
            return bb3.m30649i(c.mo30389i());
        } catch (Throwable th) {
            co0.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
