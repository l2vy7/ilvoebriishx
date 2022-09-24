package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.p */
public final class C8972p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f44691a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f44692b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f44693c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f44694d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f44695e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f44696f;

    public C8972p(Uri uri) {
        this((String) null, uri, "", "", false, false);
    }

    private C8972p(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f44691a = str;
        this.f44692b = uri;
        this.f44693c = str2;
        this.f44694d = str3;
        this.f44695e = z;
        this.f44696f = z2;
    }

    /* renamed from: a */
    public final <T> C4649f<T> mo37104a(String str, T t, C8965o<T> oVar) {
        return C4649f.m21400c(this, str, t, oVar);
    }

    /* renamed from: b */
    public final C4649f<String> mo37105b(String str, String str2) {
        return C4649f.m21401d(this, str, (String) null);
    }

    /* renamed from: e */
    public final C4649f<Boolean> mo37106e(String str, boolean z) {
        return C4649f.m21402e(this, str, false);
    }

    /* renamed from: f */
    public final C8972p mo37107f(String str) {
        boolean z = this.f44695e;
        if (!z) {
            return new C8972p(this.f44691a, this.f44692b, str, this.f44694d, z, this.f44696f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: h */
    public final C8972p mo37108h(String str) {
        return new C8972p(this.f44691a, this.f44692b, this.f44693c, str, this.f44695e, this.f44696f);
    }
}
