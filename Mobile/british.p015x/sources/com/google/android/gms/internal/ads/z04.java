package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z04 {

    /* renamed from: f */
    public static final wx3<z04> f21030f = yz3.f42247a;

    /* renamed from: a */
    public final int f21031a;

    /* renamed from: b */
    public final int f21032b;

    /* renamed from: c */
    public final int f21033c;

    /* renamed from: d */
    public final byte[] f21034d;

    /* renamed from: e */
    private int f21035e;

    public z04(int i, int i2, int i3, byte[] bArr) {
        this.f21031a = i;
        this.f21032b = i2;
        this.f21033c = i3;
        this.f21034d = bArr;
    }

    @Pure
    /* renamed from: a */
    public static int m21252a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* renamed from: b */
    public static int m21253b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z04.class == obj.getClass()) {
            z04 z04 = (z04) obj;
            return this.f21031a == z04.f21031a && this.f21032b == z04.f21032b && this.f21033c == z04.f21033c && Arrays.equals(this.f21034d, z04.f21034d);
        }
    }

    public final int hashCode() {
        int i = this.f21035e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f21031a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f21032b) * 31) + this.f21033c) * 31) + Arrays.hashCode(this.f21034d);
        this.f21035e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f21031a;
        int i2 = this.f21032b;
        int i3 = this.f21033c;
        boolean z = this.f21034d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
