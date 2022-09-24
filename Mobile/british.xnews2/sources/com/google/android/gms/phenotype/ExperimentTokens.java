package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p256v4.C11058b;
import p257v5.C11061c;

public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new C11061c();

    /* renamed from: j */
    private static final byte[][] f46974j;

    /* renamed from: k */
    private static final ExperimentTokens f46975k;

    /* renamed from: l */
    private static final C9979a f46976l = new C9980a();

    /* renamed from: m */
    private static final C9979a f46977m = new C9981b();

    /* renamed from: n */
    private static final C9979a f46978n = new C9982c();

    /* renamed from: o */
    private static final C9979a f46979o = new C9983d();

    /* renamed from: b */
    private final String f46980b;

    /* renamed from: c */
    private final byte[] f46981c;

    /* renamed from: d */
    private final byte[][] f46982d;

    /* renamed from: e */
    private final byte[][] f46983e;

    /* renamed from: f */
    private final byte[][] f46984f;

    /* renamed from: g */
    private final byte[][] f46985g;

    /* renamed from: h */
    private final int[] f46986h;

    /* renamed from: i */
    private final byte[][] f46987i;

    /* renamed from: com.google.android.gms.phenotype.ExperimentTokens$a */
    private interface C9979a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f46974j = bArr;
        f46975k = new ExperimentTokens("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f46980b = str;
        this.f46981c = bArr;
        this.f46982d = bArr2;
        this.f46983e = bArr3;
        this.f46984f = bArr4;
        this.f46985g = bArr5;
        this.f46986h = iArr;
        this.f46987i = bArr6;
    }

    /* renamed from: C0 */
    private static List<Integer> m45573C0(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: D0 */
    private static List<String> m45574D0(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: E0 */
    private static void m45575E0(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            return C9985f.m45576a(this.f46980b, experimentTokens.f46980b) && Arrays.equals(this.f46981c, experimentTokens.f46981c) && C9985f.m45576a(m45574D0(this.f46982d), m45574D0(experimentTokens.f46982d)) && C9985f.m45576a(m45574D0(this.f46983e), m45574D0(experimentTokens.f46983e)) && C9985f.m45576a(m45574D0(this.f46984f), m45574D0(experimentTokens.f46984f)) && C9985f.m45576a(m45574D0(this.f46985g), m45574D0(experimentTokens.f46985g)) && C9985f.m45576a(m45573C0(this.f46986h), m45573C0(experimentTokens.f46986h)) && C9985f.m45576a(m45574D0(this.f46987i), m45574D0(experimentTokens.f46987i));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f46980b;
        if (str2 == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", ");
        byte[] bArr = this.f46981c;
        sb.append("direct");
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m45575E0(sb, "GAIA", this.f46982d);
        sb.append(", ");
        m45575E0(sb, "PSEUDO", this.f46983e);
        sb.append(", ");
        m45575E0(sb, "ALWAYS", this.f46984f);
        sb.append(", ");
        m45575E0(sb, "OTHER", this.f46985g);
        sb.append(", ");
        int[] iArr = this.f46986h;
        sb.append("weak");
        sb.append("=");
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        m45575E0(sb, "directs", this.f46987i);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f46980b, false);
        C11058b.m49520f(parcel, 3, this.f46981c, false);
        C11058b.m49521g(parcel, 4, this.f46982d, false);
        C11058b.m49521g(parcel, 5, this.f46983e, false);
        C11058b.m49521g(parcel, 6, this.f46984f, false);
        C11058b.m49521g(parcel, 7, this.f46985g, false);
        C11058b.m49528n(parcel, 8, this.f46986h, false);
        C11058b.m49521g(parcel, 9, this.f46987i, false);
        C11058b.m49516b(parcel, a);
    }
}
