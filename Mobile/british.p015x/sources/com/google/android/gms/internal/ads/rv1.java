package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rv1 implements ew2 {

    /* renamed from: b */
    private final Map<wv2, Long> f38783b = new HashMap();

    /* renamed from: c */
    private final jv1 f38784c;

    /* renamed from: d */
    private final C6483e f38785d;

    /* renamed from: e */
    private final Map<wv2, qv1> f38786e = new HashMap();

    public rv1(jv1 jv1, Set<qv1> set, C6483e eVar) {
        this.f38784c = jv1;
        for (qv1 next : set) {
            this.f38786e.put(next.f38292c, next);
        }
        this.f38785d = eVar;
    }

    /* renamed from: a */
    private final void m37258a(wv2 wv2, boolean z) {
        wv2 b = this.f38786e.get(wv2).f38291b;
        String str = true != z ? "f." : "s.";
        if (this.f38783b.containsKey(b)) {
            long elapsedRealtime = this.f38785d.elapsedRealtime() - this.f38783b.get(b).longValue();
            Map<String, String> a = this.f38784c.mo32989a();
            String c = this.f38786e.get(wv2).f38290a;
            String concat = c.length() != 0 ? "label.".concat(c) : new String("label.");
            String valueOf = String.valueOf(Long.toString(elapsedRealtime));
            a.put(concat, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: g */
    public final void mo18539g(wv2 wv2, String str) {
        this.f38783b.put(wv2, Long.valueOf(this.f38785d.elapsedRealtime()));
    }

    /* renamed from: l */
    public final void mo18540l(wv2 wv2, String str, Throwable th) {
        String str2;
        if (this.f38783b.containsKey(wv2)) {
            long elapsedRealtime = this.f38785d.elapsedRealtime() - this.f38783b.get(wv2).longValue();
            Map<String, String> a = this.f38784c.mo32989a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            if (valueOf2.length() != 0) {
                str2 = "f.".concat(valueOf2);
            } else {
                str2 = new String("f.");
            }
            a.put(concat, str2);
        }
        if (this.f38786e.containsKey(wv2)) {
            m37258a(wv2, false);
        }
    }

    /* renamed from: n */
    public final void mo18541n(wv2 wv2, String str) {
        String str2;
        if (this.f38783b.containsKey(wv2)) {
            long elapsedRealtime = this.f38785d.elapsedRealtime() - this.f38783b.get(wv2).longValue();
            Map<String, String> a = this.f38784c.mo32989a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            if (valueOf2.length() != 0) {
                str2 = "s.".concat(valueOf2);
            } else {
                str2 = new String("s.");
            }
            a.put(concat, str2);
        }
        if (this.f38786e.containsKey(wv2)) {
            m37258a(wv2, true);
        }
    }

    /* renamed from: z */
    public final void mo18543z(wv2 wv2, String str) {
    }
}
