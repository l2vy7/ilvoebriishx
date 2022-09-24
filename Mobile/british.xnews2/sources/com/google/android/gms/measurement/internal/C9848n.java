package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.n */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9848n {

    /* renamed from: a */
    final String f46484a;

    /* renamed from: b */
    final String f46485b;

    /* renamed from: c */
    final String f46486c;

    /* renamed from: d */
    final long f46487d;

    /* renamed from: e */
    final long f46488e;

    /* renamed from: f */
    final zzas f46489f;

    C9848n(C4670h4 h4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzas zzas;
        C4604n.m20094g(str2);
        C4604n.m20094g(str3);
        this.f46484a = str2;
        this.f46485b = str3;
        this.f46486c = true == TextUtils.isEmpty(str) ? null : str;
        this.f46487d = j;
        this.f46488e = j2;
        if (j2 != 0 && j2 > j) {
            h4Var.mo19276j().mo19287w().mo38857b("Event created with reverse previous/current timestamps. appId", C4667d3.m21474z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzas = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    h4Var.mo19276j().mo19282q().mo38856a("Param name can't be null");
                    it.remove();
                } else {
                    Object n = h4Var.mo19372N().mo19318n(str4, bundle2.get(str4));
                    if (n == null) {
                        h4Var.mo19276j().mo19287w().mo38857b("Param value can't be null", h4Var.mo19363D().mo39321e(str4));
                        it.remove();
                    } else {
                        h4Var.mo19372N().mo19291B(bundle2, str4, n);
                    }
                }
            }
            zzas = new zzas(bundle2);
        }
        this.f46489f = zzas;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9848n mo39073a(C4670h4 h4Var, long j) {
        return new C9848n(h4Var, this.f46486c, this.f46484a, this.f46485b, this.f46487d, j, this.f46489f);
    }

    public final String toString() {
        String str = this.f46484a;
        String str2 = this.f46485b;
        String obj = this.f46489f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + obj.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    private C9848n(C4670h4 h4Var, String str, String str2, String str3, long j, long j2, zzas zzas) {
        C4604n.m20094g(str2);
        C4604n.m20094g(str3);
        C4604n.m20098k(zzas);
        this.f46484a = str2;
        this.f46485b = str3;
        this.f46486c = true == TextUtils.isEmpty(str) ? null : str;
        this.f46487d = j;
        this.f46488e = j2;
        if (j2 != 0 && j2 > j) {
            h4Var.mo19276j().mo19287w().mo38858c("Event created with reverse previous/current timestamps. appId, name", C4667d3.m21474z(str2), C4667d3.m21474z(str3));
        }
        this.f46489f = zzas;
    }
}
