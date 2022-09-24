package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ds0 extends zzb {

    /* renamed from: c */
    final mq0 f30991c;

    /* renamed from: d */
    final ms0 f30992d;

    /* renamed from: e */
    private final String f30993e;

    /* renamed from: f */
    private final String[] f30994f;

    ds0(mq0 mq0, ms0 ms0, String str, String[] strArr) {
        this.f30991c = mq0;
        this.f30992d = ms0;
        this.f30993e = str;
        this.f30994f = strArr;
        zzt.zzy().mo31658b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Boolean mo31403b() throws Exception {
        return Boolean.valueOf(this.f30992d.mo18569u(this.f30993e, this.f30994f, this));
    }

    /* renamed from: c */
    public final String mo31404c() {
        return this.f30993e;
    }

    public final void zza() {
        try {
            this.f30992d.mo18568t(this.f30993e, this.f30994f);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new cs0(this));
        }
    }

    public final mb3<?> zzb() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37219u1)).booleanValue() || !(this.f30992d instanceof vs0)) {
            return super.zzb();
        }
        return po0.f37726e.mo33675b(new bs0(this));
    }
}
