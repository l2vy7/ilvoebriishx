package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fa1 extends C7626dy {

    /* renamed from: b */
    private final String f31678b;

    /* renamed from: c */
    private final String f31679c;

    /* renamed from: d */
    private final String f31680d;

    /* renamed from: e */
    private final List<zzbfm> f31681e;

    /* renamed from: f */
    private final long f31682f;

    /* renamed from: g */
    private final String f31683g;

    public fa1(ir2 ir2, String str, w42 w42, lr2 lr2) {
        String str2;
        String str3;
        String str4 = null;
        if (ir2 == null) {
            str2 = null;
        } else {
            str2 = ir2.f33462Y;
        }
        this.f31679c = str2;
        if (lr2 == null) {
            str3 = null;
        } else {
            str3 = lr2.f35215b;
        }
        this.f31680d = str3;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str4 = ir2.f33497w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f31678b = str4 != null ? str4 : str;
        this.f31681e = w42.mo35553b();
        this.f31682f = zzt.zzA().currentTimeMillis() / 1000;
        this.f31683g = (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36974R6)).booleanValue() || lr2 == null || TextUtils.isEmpty(lr2.f35221h)) ? "" : lr2.f35221h;
    }

    public final long zzc() {
        return this.f31682f;
    }

    public final String zzd() {
        return this.f31683g;
    }

    public final String zze() {
        return this.f31678b;
    }

    public final String zzf() {
        return this.f31679c;
    }

    public final List<zzbfm> zzg() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37082e6)).booleanValue()) {
            return null;
        }
        return this.f31681e;
    }

    public final String zzh() {
        return this.f31680d;
    }
}
