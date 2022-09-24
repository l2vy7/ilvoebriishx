package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qe2 implements zi2 {

    /* renamed from: g */
    private static final Object f37996g = new Object();

    /* renamed from: a */
    private final String f37997a;

    /* renamed from: b */
    private final String f37998b;

    /* renamed from: c */
    private final c81 f37999c;

    /* renamed from: d */
    private final at2 f38000d;

    /* renamed from: e */
    private final bs2 f38001e;

    /* renamed from: f */
    private final zzg f38002f = zzt.zzo().mo18583h();

    public qe2(String str, String str2, c81 c81, at2 at2, bs2 bs2) {
        this.f37997a = str;
        this.f37998b = str2;
        this.f37999c = c81;
        this.f38000d = at2;
        this.f38001e = bs2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34326a(Bundle bundle, Bundle bundle2) {
        String str;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37035Z3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37027Y3)).booleanValue()) {
                synchronized (f37996g) {
                    this.f37999c.mo30860d(this.f38001e.f30087d);
                    bundle2.putBundle("quality_signals", this.f38000d.mo30488a());
                }
            } else {
                this.f37999c.mo30860d(this.f38001e.f30087d);
                bundle2.putBundle("quality_signals", this.f38000d.mo30488a());
            }
        }
        bundle2.putString("seq_num", this.f37997a);
        if (this.f38002f.zzL()) {
            str = "";
        } else {
            str = this.f37998b;
        }
        bundle2.putString("session_id", str);
    }

    public final mb3 zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37035Z3)).booleanValue()) {
            this.f37999c.mo30860d(this.f38001e.f30087d);
            bundle.putAll(this.f38000d.mo30488a());
        }
        return bb3.m30649i(new pe2(this, bundle));
    }
}
