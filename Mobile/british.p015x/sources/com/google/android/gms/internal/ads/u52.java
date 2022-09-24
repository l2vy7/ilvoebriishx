package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzaw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u52 implements uu3<t52> {

    /* renamed from: a */
    private final iv3<k51> f39783a;

    /* renamed from: b */
    private final iv3<Context> f39784b;

    /* renamed from: c */
    private final iv3<Executor> f39785c;

    /* renamed from: d */
    private final iv3<vs1> f39786d;

    /* renamed from: e */
    private final iv3<bs2> f39787e;

    /* renamed from: f */
    private final iv3<p33<ir2, zzaw>> f39788f;

    public u52(iv3<k51> iv3, iv3<Context> iv32, iv3<Executor> iv33, iv3<vs1> iv34, iv3<bs2> iv35, iv3<p33<ir2, zzaw>> iv36) {
        this.f39783a = iv3;
        this.f39784b = iv32;
        this.f39785c = iv33;
        this.f39786d = iv34;
        this.f39787e = iv35;
        this.f39788f = iv36;
    }

    /* renamed from: a */
    public final t52 zzb() {
        return new t52(this.f39783a.zzb(), this.f39784b.zzb(), this.f39785c.zzb(), this.f39786d.zzb(), ((da1) this.f39787e).mo31191a(), this.f39788f.zzb());
    }
}
