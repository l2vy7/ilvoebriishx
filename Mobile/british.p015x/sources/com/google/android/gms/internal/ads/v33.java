package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class v33 {

    /* renamed from: a */
    private final String f20923a;

    /* renamed from: b */
    private final s33 f20924b;

    /* renamed from: c */
    private s33 f20925c;

    /* synthetic */ v33(String str, t33 t33) {
        s33 s33 = new s33((r33) null);
        this.f20924b = s33;
        this.f20925c = s33;
        Objects.requireNonNull(str);
        this.f20923a = str;
    }

    /* renamed from: a */
    public final v33 mo18896a(@CheckForNull Object obj) {
        s33 s33 = new s33((r33) null);
        this.f20925c.f20807b = s33;
        this.f20925c = s33;
        s33.f20806a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20923a);
        sb.append('{');
        s33 s33 = this.f20924b.f20807b;
        String str = "";
        while (s33 != null) {
            Object obj = s33.f20806a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            s33 = s33.f20807b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
