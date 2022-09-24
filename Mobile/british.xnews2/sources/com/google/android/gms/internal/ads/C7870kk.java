package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.kk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7870kk {

    /* renamed from: d */
    public static final C7870kk f34351d = new C7870kk(new C7834jk[0]);

    /* renamed from: a */
    public final int f34352a;

    /* renamed from: b */
    private final C7834jk[] f34353b;

    /* renamed from: c */
    private int f34354c;

    public C7870kk(C7834jk... jkVarArr) {
        this.f34353b = jkVarArr;
        this.f34352a = jkVarArr.length;
    }

    /* renamed from: a */
    public final int mo33099a(C7834jk jkVar) {
        for (int i = 0; i < this.f34352a; i++) {
            if (this.f34353b[i] == jkVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C7834jk mo33100b(int i) {
        return this.f34353b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7870kk.class == obj.getClass()) {
            C7870kk kkVar = (C7870kk) obj;
            return this.f34352a == kkVar.f34352a && Arrays.equals(this.f34353b, kkVar.f34353b);
        }
    }

    public final int hashCode() {
        int i = this.f34354c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f34353b);
        this.f34354c = hashCode;
        return hashCode;
    }
}
