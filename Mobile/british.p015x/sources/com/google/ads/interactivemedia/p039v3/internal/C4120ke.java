package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ke */
/* compiled from: IMASDK */
public final class C4120ke implements Parcelable {
    public static final Parcelable.Creator<C4120ke> CREATOR = new C4118kc();

    /* renamed from: A */
    public final int f17664A;

    /* renamed from: B */
    public final int f17665B;

    /* renamed from: C */
    public final int f17666C;

    /* renamed from: D */
    public final int f17667D;

    /* renamed from: E */
    public final Class<? extends C4289ql> f17668E;

    /* renamed from: F */
    private int f17669F;

    /* renamed from: a */
    public final String f17670a;

    /* renamed from: b */
    public final String f17671b;

    /* renamed from: c */
    public final String f17672c;

    /* renamed from: d */
    public final int f17673d;

    /* renamed from: e */
    public final int f17674e;

    /* renamed from: f */
    public final int f17675f;

    /* renamed from: g */
    public final int f17676g;

    /* renamed from: h */
    public final int f17677h;

    /* renamed from: i */
    public final String f17678i;

    /* renamed from: j */
    public final C4507yn f17679j;

    /* renamed from: k */
    public final String f17680k;

    /* renamed from: l */
    public final String f17681l;

    /* renamed from: m */
    public final int f17682m;

    /* renamed from: n */
    public final List<byte[]> f17683n;

    /* renamed from: o */
    public final C4276pz f17684o;

    /* renamed from: p */
    public final long f17685p;

    /* renamed from: q */
    public final int f17686q;

    /* renamed from: r */
    public final int f17687r;

    /* renamed from: s */
    public final float f17688s;

    /* renamed from: t */
    public final int f17689t;

    /* renamed from: u */
    public final float f17690u;

    /* renamed from: v */
    public final byte[] f17691v;

    /* renamed from: w */
    public final int f17692w;

    /* renamed from: x */
    public final amp f17693x;

    /* renamed from: y */
    public final int f17694y;

    /* renamed from: z */
    public final int f17695z;

    C4120ke(Parcel parcel) {
        this.f17670a = parcel.readString();
        this.f17671b = parcel.readString();
        this.f17672c = parcel.readString();
        this.f17673d = parcel.readInt();
        this.f17674e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f17675f = readInt;
        int readInt2 = parcel.readInt();
        this.f17676g = readInt2;
        this.f17677h = readInt2 != -1 ? readInt2 : readInt;
        this.f17678i = parcel.readString();
        this.f17679j = (C4507yn) parcel.readParcelable(C4507yn.class.getClassLoader());
        this.f17680k = parcel.readString();
        this.f17681l = parcel.readString();
        this.f17682m = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f17683n = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            this.f17683n.add((byte[]) aup.m14890u(parcel.createByteArray()));
        }
        C4276pz pzVar = (C4276pz) parcel.readParcelable(C4276pz.class.getClassLoader());
        this.f17684o = pzVar;
        this.f17685p = parcel.readLong();
        this.f17686q = parcel.readInt();
        this.f17687r = parcel.readInt();
        this.f17688s = parcel.readFloat();
        this.f17689t = parcel.readInt();
        this.f17690u = parcel.readFloat();
        Class cls = null;
        this.f17691v = amm.m14249s(parcel) ? parcel.createByteArray() : null;
        this.f17692w = parcel.readInt();
        this.f17693x = (amp) parcel.readParcelable(amp.class.getClassLoader());
        this.f17694y = parcel.readInt();
        this.f17695z = parcel.readInt();
        this.f17664A = parcel.readInt();
        this.f17665B = parcel.readInt();
        this.f17666C = parcel.readInt();
        this.f17667D = parcel.readInt();
        this.f17668E = pzVar != null ? C4292qo.class : cls;
    }

    /* renamed from: a */
    public final C4119kd mo16126a() {
        return new C4119kd(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p039v3.internal.C4120ke mo16127b(com.google.ads.interactivemedia.p039v3.internal.C4120ke r14) {
        /*
            r13 = this;
            if (r13 != r14) goto L_0x0003
            return r13
        L_0x0003:
            java.lang.String r0 = r13.f17681l
            int r0 = com.google.ads.interactivemedia.p039v3.internal.aln.m14042l(r0)
            java.lang.String r1 = r14.f17670a
            java.lang.String r2 = r14.f17671b
            if (r2 != 0) goto L_0x0011
            java.lang.String r2 = r13.f17671b
        L_0x0011:
            java.lang.String r3 = r13.f17672c
            r4 = 3
            r5 = 1
            if (r0 == r4) goto L_0x001a
            if (r0 != r5) goto L_0x001f
            r0 = 1
        L_0x001a:
            java.lang.String r4 = r14.f17672c
            if (r4 == 0) goto L_0x001f
            r3 = r4
        L_0x001f:
            int r4 = r13.f17675f
            r6 = -1
            if (r4 != r6) goto L_0x0026
            int r4 = r14.f17675f
        L_0x0026:
            int r7 = r13.f17676g
            if (r7 != r6) goto L_0x002c
            int r7 = r14.f17676g
        L_0x002c:
            java.lang.String r6 = r13.f17678i
            if (r6 != 0) goto L_0x003e
            java.lang.String r8 = r14.f17678i
            java.lang.String r8 = com.google.ads.interactivemedia.p039v3.internal.amm.m14203T(r8, r0)
            java.lang.String[] r9 = com.google.ads.interactivemedia.p039v3.internal.amm.m14204U(r8)
            int r9 = r9.length
            if (r9 != r5) goto L_0x003e
            r6 = r8
        L_0x003e:
            com.google.ads.interactivemedia.v3.internal.yn r5 = r13.f17679j
            if (r5 != 0) goto L_0x0045
            com.google.ads.interactivemedia.v3.internal.yn r5 = r14.f17679j
            goto L_0x004b
        L_0x0045:
            com.google.ads.interactivemedia.v3.internal.yn r8 = r14.f17679j
            com.google.ads.interactivemedia.v3.internal.yn r5 = r5.mo16833c(r8)
        L_0x004b:
            float r8 = r13.f17688s
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0058
            r9 = 2
            if (r0 != r9) goto L_0x0058
            float r8 = r14.f17688s
        L_0x0058:
            int r0 = r13.f17673d
            int r9 = r14.f17673d
            int r10 = r13.f17674e
            int r11 = r14.f17674e
            com.google.ads.interactivemedia.v3.internal.pz r14 = r14.f17684o
            com.google.ads.interactivemedia.v3.internal.pz r12 = r13.f17684o
            com.google.ads.interactivemedia.v3.internal.pz r14 = com.google.ads.interactivemedia.p039v3.internal.C4276pz.m18604a(r14, r12)
            com.google.ads.interactivemedia.v3.internal.kd r12 = r13.mo16126a()
            r12.mo16107S(r1)
            r12.mo16109U(r2)
            r12.mo16110V(r3)
            r0 = r0 | r9
            r12.mo16122ag(r0)
            r0 = r10 | r11
            r12.mo16118ac(r0)
            r12.mo16095G(r4)
            r12.mo16114Z(r7)
            r12.mo16097I(r6)
            r12.mo16112X(r5)
            r12.mo16100L(r14)
            r12.mo16104P(r8)
            com.google.ads.interactivemedia.v3.internal.ke r14 = r12.mo16115a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4120ke.mo16127b(com.google.ads.interactivemedia.v3.internal.ke):com.google.ads.interactivemedia.v3.internal.ke");
    }

    /* renamed from: c */
    public final C4120ke mo16128c(Class<? extends C4289ql> cls) {
        C4119kd a = mo16126a();
        a.mo16103O(cls);
        return a.mo16115a();
    }

    /* renamed from: d */
    public final int mo16129d() {
        int i;
        int i2 = this.f17686q;
        if (i2 == -1 || (i = this.f17687r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo16131e(C4120ke keVar) {
        if (this.f17683n.size() != keVar.f17683n.size()) {
            return false;
        }
        for (int i = 0; i < this.f17683n.size(); i++) {
            if (!Arrays.equals(this.f17683n.get(i), keVar.f17683n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C4120ke.class == obj.getClass()) {
            C4120ke keVar = (C4120ke) obj;
            int i2 = this.f17669F;
            if ((i2 == 0 || (i = keVar.f17669F) == 0 || i2 == i) && this.f17673d == keVar.f17673d && this.f17674e == keVar.f17674e && this.f17675f == keVar.f17675f && this.f17676g == keVar.f17676g && this.f17682m == keVar.f17682m && this.f17685p == keVar.f17685p && this.f17686q == keVar.f17686q && this.f17687r == keVar.f17687r && this.f17689t == keVar.f17689t && this.f17692w == keVar.f17692w && this.f17694y == keVar.f17694y && this.f17695z == keVar.f17695z && this.f17664A == keVar.f17664A && this.f17665B == keVar.f17665B && this.f17666C == keVar.f17666C && this.f17667D == keVar.f17667D && Float.compare(this.f17688s, keVar.f17688s) == 0 && Float.compare(this.f17690u, keVar.f17690u) == 0 && amm.m14233c(this.f17668E, keVar.f17668E) && amm.m14233c(this.f17670a, keVar.f17670a) && amm.m14233c(this.f17671b, keVar.f17671b) && amm.m14233c(this.f17678i, keVar.f17678i) && amm.m14233c(this.f17680k, keVar.f17680k) && amm.m14233c(this.f17681l, keVar.f17681l) && amm.m14233c(this.f17672c, keVar.f17672c) && Arrays.equals(this.f17691v, keVar.f17691v) && amm.m14233c(this.f17679j, keVar.f17679j) && amm.m14233c(this.f17693x, keVar.f17693x) && amm.m14233c(this.f17684o, keVar.f17684o) && mo16131e(keVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f17669F;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f17670a;
        int i7 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f17671b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17672c;
        if (str3 == null) {
            i = 0;
        } else {
            i = str3.hashCode();
        }
        int i8 = (((((((((hashCode2 + i) * 31) + this.f17673d) * 31) + this.f17674e) * 31) + this.f17675f) * 31) + this.f17676g) * 31;
        String str4 = this.f17678i;
        if (str4 == null) {
            i2 = 0;
        } else {
            i2 = str4.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        C4507yn ynVar = this.f17679j;
        if (ynVar == null) {
            i3 = 0;
        } else {
            i3 = ynVar.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        String str5 = this.f17680k;
        if (str5 == null) {
            i4 = 0;
        } else {
            i4 = str5.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str6 = this.f17681l;
        if (str6 == null) {
            i5 = 0;
        } else {
            i5 = str6.hashCode();
        }
        int floatToIntBits = (((((((((((((((((((((((((((((i11 + i5) * 31) + this.f17682m) * 31) + ((int) this.f17685p)) * 31) + this.f17686q) * 31) + this.f17687r) * 31) + Float.floatToIntBits(this.f17688s)) * 31) + this.f17689t) * 31) + Float.floatToIntBits(this.f17690u)) * 31) + this.f17692w) * 31) + this.f17694y) * 31) + this.f17695z) * 31) + this.f17664A) * 31) + this.f17665B) * 31) + this.f17666C) * 31) + this.f17667D) * 31;
        Class<? extends C4289ql> cls = this.f17668E;
        if (cls != null) {
            i7 = cls.hashCode();
        }
        int i12 = floatToIntBits + i7;
        this.f17669F = i12;
        return i12;
    }

    public final String toString() {
        String str = this.f17670a;
        String str2 = this.f17671b;
        String str3 = this.f17680k;
        String str4 = this.f17681l;
        String str5 = this.f17678i;
        int i = this.f17677h;
        String str6 = this.f17672c;
        int i2 = this.f17686q;
        int i3 = this.f17687r;
        float f = this.f17688s;
        int i4 = this.f17694y;
        int i5 = this.f17695z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17670a);
        parcel.writeString(this.f17671b);
        parcel.writeString(this.f17672c);
        parcel.writeInt(this.f17673d);
        parcel.writeInt(this.f17674e);
        parcel.writeInt(this.f17675f);
        parcel.writeInt(this.f17676g);
        parcel.writeString(this.f17678i);
        boolean z = false;
        parcel.writeParcelable(this.f17679j, 0);
        parcel.writeString(this.f17680k);
        parcel.writeString(this.f17681l);
        parcel.writeInt(this.f17682m);
        int size = this.f17683n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f17683n.get(i2));
        }
        parcel.writeParcelable(this.f17684o, 0);
        parcel.writeLong(this.f17685p);
        parcel.writeInt(this.f17686q);
        parcel.writeInt(this.f17687r);
        parcel.writeFloat(this.f17688s);
        parcel.writeInt(this.f17689t);
        parcel.writeFloat(this.f17690u);
        if (this.f17691v != null) {
            z = true;
        }
        amm.m14250t(parcel, z);
        byte[] bArr = this.f17691v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f17692w);
        parcel.writeParcelable(this.f17693x, i);
        parcel.writeInt(this.f17694y);
        parcel.writeInt(this.f17695z);
        parcel.writeInt(this.f17664A);
        parcel.writeInt(this.f17665B);
        parcel.writeInt(this.f17666C);
        parcel.writeInt(this.f17667D);
    }

    /* synthetic */ C4120ke(C4119kd kdVar) {
        this.f17670a = kdVar.f17638a;
        this.f17671b = kdVar.f17639b;
        this.f17672c = amm.m14252v(kdVar.f17640c);
        this.f17673d = kdVar.f17641d;
        this.f17674e = kdVar.f17642e;
        int g = kdVar.f17643f;
        this.f17675f = g;
        int h = kdVar.f17644g;
        this.f17676g = h;
        this.f17677h = h != -1 ? h : g;
        this.f17678i = kdVar.f17645h;
        this.f17679j = kdVar.f17646i;
        this.f17680k = kdVar.f17647j;
        this.f17681l = kdVar.f17648k;
        this.f17682m = kdVar.f17649l;
        this.f17683n = kdVar.f17650m == null ? Collections.emptyList() : kdVar.f17650m;
        C4276pz o = kdVar.f17651n;
        this.f17684o = o;
        this.f17685p = kdVar.f17652o;
        this.f17686q = kdVar.f17653p;
        this.f17687r = kdVar.f17654q;
        this.f17688s = kdVar.f17655r;
        int i = 0;
        this.f17689t = kdVar.f17656s == -1 ? 0 : kdVar.f17656s;
        this.f17690u = kdVar.f17657t == -1.0f ? 1.0f : kdVar.f17657t;
        this.f17691v = kdVar.f17658u;
        this.f17692w = kdVar.f17659v;
        this.f17693x = kdVar.f17660w;
        this.f17694y = kdVar.f17661x;
        this.f17695z = kdVar.f17662y;
        this.f17664A = kdVar.f17663z;
        this.f17665B = kdVar.f17634A == -1 ? 0 : kdVar.f17634A;
        this.f17666C = kdVar.f17635B != -1 ? kdVar.f17635B : i;
        this.f17667D = kdVar.f17636C;
        this.f17668E = (kdVar.f17637D != null || o == null) ? kdVar.f17637D : C4292qo.class;
    }
}
