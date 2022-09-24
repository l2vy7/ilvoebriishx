package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8281w {

    /* renamed from: G */
    private static final C8281w f40600G = new C8281w(new ge4());

    /* renamed from: H */
    public static final wx3<C8281w> f40601H = gc4.f32242a;

    /* renamed from: A */
    public final int f40602A;

    /* renamed from: B */
    public final int f40603B;

    /* renamed from: C */
    public final int f40604C;

    /* renamed from: D */
    public final int f40605D;

    /* renamed from: E */
    public final int f40606E;

    /* renamed from: F */
    private int f40607F;

    /* renamed from: a */
    public final String f40608a;

    /* renamed from: b */
    public final String f40609b;

    /* renamed from: c */
    public final String f40610c;

    /* renamed from: d */
    public final int f40611d;

    /* renamed from: e */
    public final int f40612e;

    /* renamed from: f */
    public final int f40613f;

    /* renamed from: g */
    public final int f40614g;

    /* renamed from: h */
    public final int f40615h;

    /* renamed from: i */
    public final String f40616i;

    /* renamed from: j */
    public final zzdd f40617j;

    /* renamed from: k */
    public final String f40618k;

    /* renamed from: l */
    public final String f40619l;

    /* renamed from: m */
    public final int f40620m;

    /* renamed from: n */
    public final List<byte[]> f40621n;

    /* renamed from: o */
    public final zzs f40622o;

    /* renamed from: p */
    public final long f40623p;

    /* renamed from: q */
    public final int f40624q;

    /* renamed from: r */
    public final int f40625r;

    /* renamed from: s */
    public final float f40626s;

    /* renamed from: t */
    public final int f40627t;

    /* renamed from: u */
    public final float f40628u;

    /* renamed from: v */
    public final byte[] f40629v;

    /* renamed from: w */
    public final int f40630w;

    /* renamed from: x */
    public final z04 f40631x;

    /* renamed from: y */
    public final int f40632y;

    /* renamed from: z */
    public final int f40633z;

    private C8281w(ge4 ge4) {
        this.f40608a = ge4.f32255a;
        this.f40609b = ge4.f32256b;
        this.f40610c = d13.m20312k(ge4.f32257c);
        this.f40611d = ge4.f32258d;
        int i = 0;
        this.f40612e = 0;
        int L = ge4.f32259e;
        this.f40613f = L;
        int T = ge4.f32260f;
        this.f40614g = T;
        this.f40615h = T != -1 ? T : L;
        this.f40616i = ge4.f32261g;
        this.f40617j = ge4.f32262h;
        this.f40618k = ge4.f32263i;
        this.f40619l = ge4.f32264j;
        this.f40620m = ge4.f32265k;
        this.f40621n = ge4.f32266l == null ? Collections.emptyList() : ge4.f32266l;
        zzs b0 = ge4.f32267m;
        this.f40622o = b0;
        this.f40623p = ge4.f32268n;
        this.f40624q = ge4.f32269o;
        this.f40625r = ge4.f32270p;
        this.f40626s = ge4.f32271q;
        this.f40627t = ge4.f32272r == -1 ? 0 : ge4.f32272r;
        this.f40628u = ge4.f32273s == -1.0f ? 1.0f : ge4.f32273s;
        this.f40629v = ge4.f32274t;
        this.f40630w = ge4.f32275u;
        this.f40631x = ge4.f32276v;
        this.f40632y = ge4.f32277w;
        this.f40633z = ge4.f32278x;
        this.f40602A = ge4.f32279y;
        this.f40603B = ge4.f32280z == -1 ? 0 : ge4.f32280z;
        this.f40604C = ge4.f32252A != -1 ? ge4.f32252A : i;
        this.f40605D = ge4.f32253B;
        this.f40606E = (ge4.f32254C != 0 || b0 == null) ? ge4.f32254C : 1;
    }

    /* renamed from: a */
    public final int mo35520a() {
        int i;
        int i2 = this.f40624q;
        if (i2 == -1 || (i = this.f40625r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final ge4 mo35521b() {
        return new ge4(this, (hd4) null);
    }

    /* renamed from: c */
    public final C8281w mo35522c(int i) {
        ge4 ge4 = new ge4(this, (hd4) null);
        ge4.mo32069a(i);
        return new C8281w(ge4);
    }

    /* renamed from: d */
    public final boolean mo35523d(C8281w wVar) {
        if (this.f40621n.size() != wVar.f40621n.size()) {
            return false;
        }
        for (int i = 0; i < this.f40621n.size(); i++) {
            if (!Arrays.equals(this.f40621n.get(i), wVar.f40621n.get(i))) {
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
        if (obj != null && C8281w.class == obj.getClass()) {
            C8281w wVar = (C8281w) obj;
            int i2 = this.f40607F;
            if ((i2 == 0 || (i = wVar.f40607F) == 0 || i2 == i) && this.f40611d == wVar.f40611d && this.f40613f == wVar.f40613f && this.f40614g == wVar.f40614g && this.f40620m == wVar.f40620m && this.f40623p == wVar.f40623p && this.f40624q == wVar.f40624q && this.f40625r == wVar.f40625r && this.f40627t == wVar.f40627t && this.f40630w == wVar.f40630w && this.f40632y == wVar.f40632y && this.f40633z == wVar.f40633z && this.f40602A == wVar.f40602A && this.f40603B == wVar.f40603B && this.f40604C == wVar.f40604C && this.f40605D == wVar.f40605D && this.f40606E == wVar.f40606E && Float.compare(this.f40626s, wVar.f40626s) == 0 && Float.compare(this.f40628u, wVar.f40628u) == 0 && d13.m20317p(this.f40608a, wVar.f40608a) && d13.m20317p(this.f40609b, wVar.f40609b) && d13.m20317p(this.f40616i, wVar.f40616i) && d13.m20317p(this.f40618k, wVar.f40618k) && d13.m20317p(this.f40619l, wVar.f40619l) && d13.m20317p(this.f40610c, wVar.f40610c) && Arrays.equals(this.f40629v, wVar.f40629v) && d13.m20317p(this.f40617j, wVar.f40617j) && d13.m20317p(this.f40631x, wVar.f40631x) && d13.m20317p(this.f40622o, wVar.f40622o) && mo35523d(wVar)) {
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
        int i6 = this.f40607F;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f40608a;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f40609b;
        int hashCode = (i8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f40610c;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i9 = (((((((hashCode + i2) * 31) + this.f40611d) * 961) + this.f40613f) * 31) + this.f40614g) * 31;
        String str4 = this.f40616i;
        if (str4 == null) {
            i3 = 0;
        } else {
            i3 = str4.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        zzdd zzdd = this.f40617j;
        if (zzdd == null) {
            i4 = 0;
        } else {
            i4 = zzdd.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str5 = this.f40618k;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str6 = this.f40619l;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((i12 + i7) * 31) + this.f40620m) * 31) + ((int) this.f40623p)) * 31) + this.f40624q) * 31) + this.f40625r) * 31) + Float.floatToIntBits(this.f40626s)) * 31) + this.f40627t) * 31) + Float.floatToIntBits(this.f40628u)) * 31) + this.f40630w) * 31) + this.f40632y) * 31) + this.f40633z) * 31) + this.f40602A) * 31) + this.f40603B) * 31) + this.f40604C) * 31) + this.f40605D) * 31) + this.f40606E;
        this.f40607F = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String str = this.f40608a;
        String str2 = this.f40609b;
        String str3 = this.f40618k;
        String str4 = this.f40619l;
        String str5 = this.f40616i;
        int i = this.f40615h;
        String str6 = this.f40610c;
        int i2 = this.f40624q;
        int i3 = this.f40625r;
        float f = this.f40626s;
        int i4 = this.f40632y;
        int i5 = this.f40633z;
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
}
