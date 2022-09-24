package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
import p257v4.C11058b;
import p258v5.C11062d;

public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new C11062d();

    /* renamed from: j */
    private static final Comparator<zzi> f46988j = new C9984e();

    /* renamed from: b */
    public final String f46989b;

    /* renamed from: c */
    private final long f46990c;

    /* renamed from: d */
    private final boolean f46991d;

    /* renamed from: e */
    private final double f46992e;

    /* renamed from: f */
    private final String f46993f;

    /* renamed from: g */
    private final byte[] f46994g;

    /* renamed from: h */
    private final int f46995h;

    /* renamed from: i */
    public final int f46996i;

    public zzi(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f46989b = str;
        this.f46990c = j;
        this.f46991d = z;
        this.f46992e = d;
        this.f46993f = str2;
        this.f46994g = bArr;
        this.f46995h = i;
        this.f46996i = i2;
    }

    /* renamed from: C0 */
    private static int m45577C0(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.f46989b.compareTo(zzi.f46989b);
        if (compareTo != 0) {
            return compareTo;
        }
        int C0 = m45577C0(this.f46995h, zzi.f46995h);
        if (C0 != 0) {
            return C0;
        }
        int i = this.f46995h;
        if (i == 1) {
            long j = this.f46990c;
            long j2 = zzi.f46990c;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        } else if (i == 2) {
            boolean z = this.f46991d;
            if (z == zzi.f46991d) {
                return 0;
            }
            return z ? 1 : -1;
        } else if (i == 3) {
            return Double.compare(this.f46992e, zzi.f46992e);
        } else {
            if (i == 4) {
                String str = this.f46993f;
                String str2 = zzi.f46993f;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i == 5) {
                byte[] bArr = this.f46994g;
                byte[] bArr2 = zzi.f46994g;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i2 = 0; i2 < Math.min(this.f46994g.length, zzi.f46994g.length); i2++) {
                    int i3 = this.f46994g[i2] - zzi.f46994g[i2];
                    if (i3 != 0) {
                        return i3;
                    }
                }
                return m45577C0(this.f46994g.length, zzi.f46994g.length);
            } else {
                int i4 = this.f46995h;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i4);
                throw new AssertionError(sb.toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (C9985f.m45576a(this.f46989b, zzi.f46989b) && (i = this.f46995h) == zzi.f46995h && this.f46996i == zzi.f46996i) {
                if (i != 1) {
                    if (i == 2) {
                        return this.f46991d == zzi.f46991d;
                    }
                    if (i == 3) {
                        return this.f46992e == zzi.f46992e;
                    }
                    if (i == 4) {
                        return C9985f.m45576a(this.f46993f, zzi.f46993f);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.f46994g, zzi.f46994g);
                    }
                    int i2 = this.f46995h;
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid enum value: ");
                    sb.append(i2);
                    throw new AssertionError(sb.toString());
                } else if (this.f46990c == zzi.f46990c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Flag(");
        sb.append(this.f46989b);
        sb.append(", ");
        int i = this.f46995h;
        if (i == 1) {
            sb.append(this.f46990c);
        } else if (i == 2) {
            sb.append(this.f46991d);
        } else if (i != 3) {
            if (i == 4) {
                sb.append("'");
                str = this.f46993f;
            } else if (i != 5) {
                String str2 = this.f46989b;
                int i2 = this.f46995h;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb2.append("Invalid type: ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(i2);
                throw new AssertionError(sb2.toString());
            } else if (this.f46994g == null) {
                sb.append("null");
            } else {
                sb.append("'");
                str = Base64.encodeToString(this.f46994g, 3);
            }
            sb.append(str);
            sb.append("'");
        } else {
            sb.append(this.f46992e);
        }
        sb.append(", ");
        sb.append(this.f46995h);
        sb.append(", ");
        sb.append(this.f46996i);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f46989b, false);
        C11058b.m49531q(parcel, 3, this.f46990c);
        C11058b.m49517c(parcel, 4, this.f46991d);
        C11058b.m49522h(parcel, 5, this.f46992e);
        C11058b.m49537w(parcel, 6, this.f46993f, false);
        C11058b.m49520f(parcel, 7, this.f46994g, false);
        C11058b.m49527m(parcel, 8, this.f46995h);
        C11058b.m49527m(parcel, 9, this.f46996i);
        C11058b.m49516b(parcel, a);
    }
}
