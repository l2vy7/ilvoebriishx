package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bh2 implements uu3<zg2> {

    /* renamed from: a */
    private final iv3<nb3> f30001a;

    /* renamed from: b */
    private final iv3<bs2> f30002b;

    /* renamed from: c */
    private final iv3<PackageInfo> f30003c;

    /* renamed from: d */
    private final iv3<zzg> f30004d;

    public bh2(iv3<nb3> iv3, iv3<bs2> iv32, iv3<PackageInfo> iv33, iv3<zzg> iv34) {
        this.f30001a = iv3;
        this.f30002b = iv32;
        this.f30003c = iv33;
        this.f30004d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new zg2(nb3, ((da1) this.f30002b).mo31191a(), this.f30003c.zzb(), ((dt2) this.f30004d).zzb());
    }
}
