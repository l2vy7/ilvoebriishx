package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h82 implements xa3 {

    /* renamed from: a */
    final /* synthetic */ long f32667a;

    /* renamed from: b */
    final /* synthetic */ String f32668b;

    /* renamed from: c */
    final /* synthetic */ ir2 f32669c;

    /* renamed from: d */
    final /* synthetic */ lr2 f32670d;

    /* renamed from: e */
    final /* synthetic */ px2 f32671e;

    /* renamed from: f */
    final /* synthetic */ ur2 f32672f;

    /* renamed from: g */
    final /* synthetic */ i82 f32673g;

    h82(i82 i82, long j, String str, ir2 ir2, lr2 lr2, px2 px2, ur2 ur2) {
        this.f32673g = i82;
        this.f32667a = j;
        this.f32668b = str;
        this.f32669c = ir2;
        this.f32670d = lr2;
        this.f32671e = px2;
        this.f32672f = ur2;
    }

    public final void zza(Throwable th) {
        int i;
        zzbew zzbew;
        long elapsedRealtime = this.f32673g.f33132a.elapsedRealtime() - this.f32667a;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof w72) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof gs2) {
            i = 5;
        } else {
            i = (!(th instanceof wy1) || us2.m38443a(th).f42935b != 3) ? 6 : 1;
        }
        i82.m33114g(this.f32673g, this.f32668b, i, elapsedRealtime, this.f32669c.f33471d0);
        if (this.f32673g.f33136e) {
            this.f32673g.f33133b.mo18449a(this.f32670d, this.f32669c, i, th instanceof v42 ? (v42) th : null, elapsedRealtime);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37100g6)).booleanValue()) {
            sx2 c = this.f32673g.f33134c;
            px2 px2 = this.f32671e;
            ur2 ur2 = this.f32672f;
            ir2 ir2 = this.f32669c;
            c.mo34830c(px2.mo34215a(ur2, ir2, ir2.f33489o));
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37082e6)).booleanValue()) {
            zzbew a = us2.m38443a(th);
            int i2 = a.f42935b;
            if ((i2 == 3 || i2 == 0) && (zzbew = a.f42938e) != null && !zzbew.f42937d.equals(MobileAds.ERROR_DOMAIN)) {
                a = us2.m38443a(new v42(13, a.f42938e));
            }
            this.f32673g.f33137f.mo35555d(this.f32669c, elapsedRealtime, a);
        }
    }

    public final void zzb(Object obj) {
        long elapsedRealtime = this.f32673g.f33132a.elapsedRealtime() - this.f32667a;
        i82.m33114g(this.f32673g, this.f32668b, 0, elapsedRealtime, this.f32669c.f33471d0);
        if (this.f32673g.f33136e) {
            this.f32673g.f33133b.mo18449a(this.f32670d, this.f32669c, 0, (v42) null, elapsedRealtime);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37082e6)).booleanValue()) {
            this.f32673g.f33137f.mo35555d(this.f32669c, elapsedRealtime, (zzbew) null);
        }
    }
}
