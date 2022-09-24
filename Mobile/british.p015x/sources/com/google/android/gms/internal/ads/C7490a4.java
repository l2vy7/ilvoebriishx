package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7490a4 {

    /* renamed from: a */
    private String f29518a;

    /* renamed from: b */
    private Uri f29519b;

    /* renamed from: c */
    private final C7563c6 f29520c = new C7563c6();

    /* renamed from: d */
    private final C7752hc f29521d = new C7752hc((C7751hb) null);

    /* renamed from: e */
    private final List f29522e = Collections.emptyList();

    /* renamed from: f */
    private final p63<C7762hm> f29523f = p63.m20814A();

    /* renamed from: g */
    private final C7829jf f29524g = new C7829jf();

    /* renamed from: a */
    public final C7490a4 mo30301a(String str) {
        this.f29518a = str;
        return this;
    }

    /* renamed from: b */
    public final C7490a4 mo30302b(Uri uri) {
        this.f29519b = uri;
        return this;
    }

    /* renamed from: c */
    public final C7764ho mo30303c() {
        Uri uri = this.f29519b;
        C7761hl hlVar = uri != null ? new C7761hl(uri, (String) null, (C7790id) null, (C8391z2) null, this.f29522e, (String) null, this.f29523f, (Object) null, (C7723gk) null) : null;
        String str = this.f29518a;
        if (str == null) {
            str = "";
        }
        return new C7764ho(str, new C7713ga(this.f29520c, (C7675f9) null), hlVar, new C7831jh(this.f29524g), C7916lt.f35237t, (C7726gn) null);
    }
}
