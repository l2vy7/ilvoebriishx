package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.k6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4657k6 {

    /* renamed from: a */
    final String f21235a;

    /* renamed from: b */
    final Uri f21236b;

    /* renamed from: c */
    final String f21237c;

    /* renamed from: d */
    final String f21238d;

    /* renamed from: e */
    final boolean f21239e;

    /* renamed from: f */
    final boolean f21240f;

    /* renamed from: g */
    final boolean f21241g;

    /* renamed from: h */
    final boolean f21242h;
    @Nullable

    /* renamed from: i */
    final C9328r6 f21243i;

    public C4657k6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C9328r6) null);
    }

    private C4657k6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable C9328r6 r6Var) {
        this.f21235a = null;
        this.f21236b = uri;
        this.f21237c = "";
        this.f21238d = "";
        this.f21239e = z;
        this.f21240f = false;
        this.f21241g = false;
        this.f21242h = false;
        this.f21243i = null;
    }

    /* renamed from: a */
    public final C4657k6 mo19201a() {
        if (this.f21237c.isEmpty()) {
            return new C4657k6((String) null, this.f21236b, this.f21237c, this.f21238d, true, false, false, false, (C9328r6) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final C4659n6 mo19202b(String str, double d) {
        return new C4655i6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: c */
    public final C4659n6 mo19203c(String str, long j) {
        return new C4653g6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: d */
    public final C4659n6 mo19204d(String str, String str2) {
        return new C4656j6(this, str, str2, true);
    }

    /* renamed from: e */
    public final C4659n6 mo19205e(String str, boolean z) {
        return new C4654h6(this, str, Boolean.valueOf(z), true);
    }
}
