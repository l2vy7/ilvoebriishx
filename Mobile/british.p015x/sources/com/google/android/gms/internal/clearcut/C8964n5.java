package com.google.android.gms.internal.clearcut;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.n5 */
public final class C8964n5 extends C8998s4<C8964n5> implements Cloneable {

    /* renamed from: A */
    private C8872c5 f44650A;

    /* renamed from: B */
    public boolean f44651B;

    /* renamed from: d */
    public long f44652d = 0;

    /* renamed from: e */
    public long f44653e = 0;

    /* renamed from: f */
    private long f44654f = 0;

    /* renamed from: g */
    private String f44655g = "";

    /* renamed from: h */
    public int f44656h = 0;

    /* renamed from: i */
    private String f44657i = "";

    /* renamed from: j */
    private int f44658j = 0;

    /* renamed from: k */
    private boolean f44659k = false;

    /* renamed from: l */
    private C8971o5[] f44660l = C8971o5.m42159i();

    /* renamed from: m */
    private byte[] f44661m;

    /* renamed from: n */
    private C8864b5 f44662n;

    /* renamed from: o */
    public byte[] f44663o;

    /* renamed from: p */
    private String f44664p;

    /* renamed from: q */
    private String f44665q;

    /* renamed from: r */
    private C8938k5 f44666r;

    /* renamed from: s */
    private String f44667s;

    /* renamed from: t */
    public long f44668t;

    /* renamed from: u */
    private C8945l5 f44669u;

    /* renamed from: v */
    public byte[] f44670v;

    /* renamed from: w */
    private String f44671w;

    /* renamed from: x */
    private int f44672x;

    /* renamed from: y */
    private int[] f44673y;

    /* renamed from: z */
    private long f44674z;

    public C8964n5() {
        byte[] bArr = C8852a5.f44392h;
        this.f44661m = bArr;
        this.f44662n = null;
        this.f44663o = bArr;
        this.f44664p = "";
        this.f44665q = "";
        this.f44666r = null;
        this.f44667s = "";
        this.f44668t = 180000;
        this.f44669u = null;
        this.f44670v = bArr;
        this.f44671w = "";
        this.f44672x = 0;
        this.f44673y = C8852a5.f44385a;
        this.f44674z = 0;
        this.f44650A = null;
        this.f44651B = false;
        this.f44739c = null;
        this.f44796b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C8964n5 clone() {
        try {
            C8964n5 n5Var = (C8964n5) super.clone();
            C8971o5[] o5VarArr = this.f44660l;
            if (o5VarArr != null && o5VarArr.length > 0) {
                n5Var.f44660l = new C8971o5[o5VarArr.length];
                int i = 0;
                while (true) {
                    C8971o5[] o5VarArr2 = this.f44660l;
                    if (i >= o5VarArr2.length) {
                        break;
                    }
                    if (o5VarArr2[i] != null) {
                        n5Var.f44660l[i] = (C8971o5) o5VarArr2[i].clone();
                    }
                    i++;
                }
            }
            C8864b5 b5Var = this.f44662n;
            if (b5Var != null) {
                n5Var.f44662n = b5Var;
            }
            C8938k5 k5Var = this.f44666r;
            if (k5Var != null) {
                n5Var.f44666r = (C8938k5) k5Var.clone();
            }
            C8945l5 l5Var = this.f44669u;
            if (l5Var != null) {
                n5Var.f44669u = (C8945l5) l5Var.clone();
            }
            int[] iArr = this.f44673y;
            if (iArr != null && iArr.length > 0) {
                n5Var.f44673y = (int[]) iArr.clone();
            }
            C8872c5 c5Var = this.f44650A;
            if (c5Var != null) {
                n5Var.f44650A = c5Var;
            }
            return n5Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo36988a(C8984q4 q4Var) throws IOException {
        long j = this.f44652d;
        if (j != 0) {
            q4Var.mo37129u(1, j);
        }
        String str = this.f44655g;
        if (str != null && !str.equals("")) {
            q4Var.mo37122c(2, this.f44655g);
        }
        C8971o5[] o5VarArr = this.f44660l;
        int i = 0;
        if (o5VarArr != null && o5VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C8971o5[] o5VarArr2 = this.f44660l;
                if (i2 >= o5VarArr2.length) {
                    break;
                }
                C8971o5 o5Var = o5VarArr2[i2];
                if (o5Var != null) {
                    q4Var.mo37121b(3, o5Var);
                }
                i2++;
            }
        }
        byte[] bArr = this.f44661m;
        byte[] bArr2 = C8852a5.f44392h;
        if (!Arrays.equals(bArr, bArr2)) {
            q4Var.mo37123d(4, this.f44661m);
        }
        if (!Arrays.equals(this.f44663o, bArr2)) {
            q4Var.mo37123d(6, this.f44663o);
        }
        C8938k5 k5Var = this.f44666r;
        if (k5Var != null) {
            q4Var.mo37121b(7, k5Var);
        }
        String str2 = this.f44664p;
        if (str2 != null && !str2.equals("")) {
            q4Var.mo37122c(8, this.f44664p);
        }
        C8864b5 b5Var = this.f44662n;
        if (b5Var != null) {
            q4Var.mo37127o(9, b5Var);
        }
        int i3 = this.f44656h;
        if (i3 != 0) {
            q4Var.mo37126l(11, i3);
        }
        String str3 = this.f44665q;
        if (str3 != null && !str3.equals("")) {
            q4Var.mo37122c(13, this.f44665q);
        }
        String str4 = this.f44667s;
        if (str4 != null && !str4.equals("")) {
            q4Var.mo37122c(14, this.f44667s);
        }
        long j2 = this.f44668t;
        if (j2 != 180000) {
            q4Var.mo37124j(15, 0);
            q4Var.mo37130w(C8984q4.m42300v(j2));
        }
        C8945l5 l5Var = this.f44669u;
        if (l5Var != null) {
            q4Var.mo37121b(16, l5Var);
        }
        long j3 = this.f44653e;
        if (j3 != 0) {
            q4Var.mo37129u(17, j3);
        }
        if (!Arrays.equals(this.f44670v, bArr2)) {
            q4Var.mo37123d(18, this.f44670v);
        }
        int[] iArr = this.f44673y;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f44673y;
                if (i >= iArr2.length) {
                    break;
                }
                q4Var.mo37126l(20, iArr2[i]);
                i++;
            }
        }
        C8872c5 c5Var = this.f44650A;
        if (c5Var != null) {
            q4Var.mo37127o(23, c5Var);
        }
        String str5 = this.f44671w;
        if (str5 != null && !str5.equals("")) {
            q4Var.mo37122c(24, this.f44671w);
        }
        boolean z = this.f44651B;
        if (z) {
            q4Var.mo37125k(25, z);
        }
        String str6 = this.f44657i;
        if (str6 != null && !str6.equals("")) {
            q4Var.mo37122c(26, this.f44657i);
        }
        super.mo36988a(q4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo36990d() {
        int[] iArr;
        int d = super.mo36990d();
        long j = this.f44652d;
        if (j != 0) {
            d += C8984q4.m42294m(1, j);
        }
        String str = this.f44655g;
        if (str != null && !str.equals("")) {
            d += C8984q4.m42292h(2, this.f44655g);
        }
        C8971o5[] o5VarArr = this.f44660l;
        int i = 0;
        if (o5VarArr != null && o5VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C8971o5[] o5VarArr2 = this.f44660l;
                if (i2 >= o5VarArr2.length) {
                    break;
                }
                C8971o5 o5Var = o5VarArr2[i2];
                if (o5Var != null) {
                    d += C8984q4.m42291g(3, o5Var);
                }
                i2++;
            }
        }
        byte[] bArr = this.f44661m;
        byte[] bArr2 = C8852a5.f44392h;
        if (!Arrays.equals(bArr, bArr2)) {
            d += C8984q4.m42293i(4, this.f44661m);
        }
        if (!Arrays.equals(this.f44663o, bArr2)) {
            d += C8984q4.m42293i(6, this.f44663o);
        }
        C8938k5 k5Var = this.f44666r;
        if (k5Var != null) {
            d += C8984q4.m42291g(7, k5Var);
        }
        String str2 = this.f44664p;
        if (str2 != null && !str2.equals("")) {
            d += C8984q4.m42292h(8, this.f44664p);
        }
        C8864b5 b5Var = this.f44662n;
        if (b5Var != null) {
            d += C8947m0.m41942O(9, b5Var);
        }
        int i3 = this.f44656h;
        if (i3 != 0) {
            d += C8984q4.m42302y(11) + C8984q4.m42303z(i3);
        }
        String str3 = this.f44665q;
        if (str3 != null && !str3.equals("")) {
            d += C8984q4.m42292h(13, this.f44665q);
        }
        String str4 = this.f44667s;
        if (str4 != null && !str4.equals("")) {
            d += C8984q4.m42292h(14, this.f44667s);
        }
        long j2 = this.f44668t;
        if (j2 != 180000) {
            d += C8984q4.m42302y(15) + C8984q4.m42301x(C8984q4.m42300v(j2));
        }
        C8945l5 l5Var = this.f44669u;
        if (l5Var != null) {
            d += C8984q4.m42291g(16, l5Var);
        }
        long j3 = this.f44653e;
        if (j3 != 0) {
            d += C8984q4.m42294m(17, j3);
        }
        if (!Arrays.equals(this.f44670v, bArr2)) {
            d += C8984q4.m42293i(18, this.f44670v);
        }
        int[] iArr2 = this.f44673y;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.f44673y;
                if (i >= iArr.length) {
                    break;
                }
                i4 += C8984q4.m42303z(iArr[i]);
                i++;
            }
            d = d + i4 + (iArr.length * 2);
        }
        C8872c5 c5Var = this.f44650A;
        if (c5Var != null) {
            d += C8947m0.m41942O(23, c5Var);
        }
        String str5 = this.f44671w;
        if (str5 != null && !str5.equals("")) {
            d += C8984q4.m42292h(24, this.f44671w);
        }
        if (this.f44651B) {
            d += C8984q4.m42302y(25) + 1;
        }
        String str6 = this.f44657i;
        return (str6 == null || str6.equals("")) ? d : d + C8984q4.m42292h(26, this.f44657i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8964n5)) {
            return false;
        }
        C8964n5 n5Var = (C8964n5) obj;
        if (this.f44652d != n5Var.f44652d || this.f44653e != n5Var.f44653e) {
            return false;
        }
        String str = this.f44655g;
        if (str == null) {
            if (n5Var.f44655g != null) {
                return false;
            }
        } else if (!str.equals(n5Var.f44655g)) {
            return false;
        }
        if (this.f44656h != n5Var.f44656h) {
            return false;
        }
        String str2 = this.f44657i;
        if (str2 == null) {
            if (n5Var.f44657i != null) {
                return false;
            }
        } else if (!str2.equals(n5Var.f44657i)) {
            return false;
        }
        if (!C9026w4.m42467c(this.f44660l, n5Var.f44660l) || !Arrays.equals(this.f44661m, n5Var.f44661m)) {
            return false;
        }
        C8864b5 b5Var = this.f44662n;
        if (b5Var == null) {
            if (n5Var.f44662n != null) {
                return false;
            }
        } else if (!b5Var.equals(n5Var.f44662n)) {
            return false;
        }
        if (!Arrays.equals(this.f44663o, n5Var.f44663o)) {
            return false;
        }
        String str3 = this.f44664p;
        if (str3 == null) {
            if (n5Var.f44664p != null) {
                return false;
            }
        } else if (!str3.equals(n5Var.f44664p)) {
            return false;
        }
        String str4 = this.f44665q;
        if (str4 == null) {
            if (n5Var.f44665q != null) {
                return false;
            }
        } else if (!str4.equals(n5Var.f44665q)) {
            return false;
        }
        C8938k5 k5Var = this.f44666r;
        if (k5Var == null) {
            if (n5Var.f44666r != null) {
                return false;
            }
        } else if (!k5Var.equals(n5Var.f44666r)) {
            return false;
        }
        String str5 = this.f44667s;
        if (str5 == null) {
            if (n5Var.f44667s != null) {
                return false;
            }
        } else if (!str5.equals(n5Var.f44667s)) {
            return false;
        }
        if (this.f44668t != n5Var.f44668t) {
            return false;
        }
        C8945l5 l5Var = this.f44669u;
        if (l5Var == null) {
            if (n5Var.f44669u != null) {
                return false;
            }
        } else if (!l5Var.equals(n5Var.f44669u)) {
            return false;
        }
        if (!Arrays.equals(this.f44670v, n5Var.f44670v)) {
            return false;
        }
        String str6 = this.f44671w;
        if (str6 == null) {
            if (n5Var.f44671w != null) {
                return false;
            }
        } else if (!str6.equals(n5Var.f44671w)) {
            return false;
        }
        if (!C9026w4.m42465a(this.f44673y, n5Var.f44673y)) {
            return false;
        }
        C8872c5 c5Var = this.f44650A;
        if (c5Var == null) {
            if (n5Var.f44650A != null) {
                return false;
            }
        } else if (!c5Var.equals(n5Var.f44650A)) {
            return false;
        }
        if (this.f44651B != n5Var.f44651B) {
            return false;
        }
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            return this.f44739c.equals(n5Var.f44739c);
        }
        C9012u4 u4Var2 = n5Var.f44739c;
        return u4Var2 == null || u4Var2.mo37183a();
    }

    /* renamed from: g */
    public final /* synthetic */ C9033x4 mo36992g() throws CloneNotSupportedException {
        return (C8964n5) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ C8998s4 mo36993h() throws CloneNotSupportedException {
        return (C8964n5) clone();
    }

    public final int hashCode() {
        long j = this.f44652d;
        long j2 = this.f44653e;
        int hashCode = (((((C8964n5.class.getName().hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31 * 31;
        String str = this.f44655g;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f44656h) * 31;
        String str2 = this.f44657i;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i2 = 1237;
        int f = ((((((hashCode2 + hashCode3) * 31 * 31) + 1237) * 31) + C9026w4.m42470f(this.f44660l)) * 31) + Arrays.hashCode(this.f44661m);
        C8864b5 b5Var = this.f44662n;
        int hashCode4 = ((((f * 31) + (b5Var == null ? 0 : b5Var.hashCode())) * 31) + Arrays.hashCode(this.f44663o)) * 31;
        String str3 = this.f44664p;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44665q;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        C8938k5 k5Var = this.f44666r;
        int hashCode7 = ((hashCode6 * 31) + (k5Var == null ? 0 : k5Var.hashCode())) * 31;
        String str5 = this.f44667s;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j3 = this.f44668t;
        C8945l5 l5Var = this.f44669u;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (l5Var == null ? 0 : l5Var.hashCode())) * 31) + Arrays.hashCode(this.f44670v)) * 31;
        String str6 = this.f44671w;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        C8872c5 c5Var = this.f44650A;
        int d = (((((hashCode9 + hashCode10) * 31 * 31) + C9026w4.m42468d(this.f44673y)) * 31 * 31) + (c5Var == null ? 0 : c5Var.hashCode())) * 31;
        if (this.f44651B) {
            i2 = 1231;
        }
        int i3 = (d + i2) * 31;
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            i = this.f44739c.hashCode();
        }
        return i3 + i;
    }
}
