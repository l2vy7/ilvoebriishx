package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u22 implements ew2 {

    /* renamed from: b */
    private final Map<wv2, String> f39741b = new HashMap();

    /* renamed from: c */
    private final Map<wv2, String> f39742c = new HashMap();

    /* renamed from: d */
    private final mw2 f39743d;

    public u22(Set<t22> set, mw2 mw2) {
        this.f39743d = mw2;
        for (t22 next : set) {
            this.f39741b.put(next.f39259b, next.f39258a);
            this.f39742c.put(next.f39260c, next.f39258a);
        }
    }

    /* renamed from: g */
    public final void mo18539g(wv2 wv2, String str) {
        String str2;
        mw2 mw2 = this.f39743d;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "task.".concat(valueOf);
        } else {
            str2 = new String("task.");
        }
        mw2.mo33604d(str2);
        if (this.f39741b.containsKey(wv2)) {
            mw2 mw22 = this.f39743d;
            String valueOf2 = String.valueOf(this.f39741b.get(wv2));
            mw22.mo33604d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    /* renamed from: l */
    public final void mo18540l(wv2 wv2, String str, Throwable th) {
        String str2;
        mw2 mw2 = this.f39743d;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "task.".concat(valueOf);
        } else {
            str2 = new String("task.");
        }
        mw2.mo33605e(str2, "f.");
        if (this.f39742c.containsKey(wv2)) {
            mw2 mw22 = this.f39743d;
            String valueOf2 = String.valueOf(this.f39742c.get(wv2));
            mw22.mo33605e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }

    /* renamed from: n */
    public final void mo18541n(wv2 wv2, String str) {
        String str2;
        mw2 mw2 = this.f39743d;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "task.".concat(valueOf);
        } else {
            str2 = new String("task.");
        }
        mw2.mo33605e(str2, "s.");
        if (this.f39742c.containsKey(wv2)) {
            mw2 mw22 = this.f39743d;
            String valueOf2 = String.valueOf(this.f39742c.get(wv2));
            mw22.mo33605e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    /* renamed from: z */
    public final void mo18543z(wv2 wv2, String str) {
    }
}
