package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zz1 implements xa3<ur2> {

    /* renamed from: a */
    final /* synthetic */ a02 f42838a;

    zz1(a02 a02) {
        this.f42838a = a02;
    }

    public final void zza(Throwable th) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue()) {
            Matcher matcher = a02.f29483f.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f42838a.f29488e.mo32544g(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ur2 ur2 = (ur2) obj;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue()) {
            this.f42838a.f29488e.mo32544g(ur2.f39937b.f39519b.f35218e);
            this.f42838a.f29488e.mo32545h(ur2.f39937b.f39519b.f35219f);
        }
    }
}
