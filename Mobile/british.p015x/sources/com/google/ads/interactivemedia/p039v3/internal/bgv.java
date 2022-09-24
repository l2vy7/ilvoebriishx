package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgv */
/* compiled from: IMASDK */
public final class bgv extends biw {

    /* renamed from: b */
    private static final Reader f16310b = new bgu();

    /* renamed from: c */
    private static final Object f16311c = new Object();

    /* renamed from: d */
    private Object[] f16312d = new Object[32];

    /* renamed from: e */
    private int f16313e = 0;

    /* renamed from: f */
    private String[] f16314f = new String[32];

    /* renamed from: g */
    private int[] f16315g = new int[32];

    public bgv(bey bey) {
        super(f16310b);
        m15870w(bey);
    }

    /* renamed from: u */
    private final Object m15868u() {
        return this.f16312d[this.f16313e - 1];
    }

    /* renamed from: v */
    private final Object m15869v() {
        Object[] objArr = this.f16312d;
        int i = this.f16313e - 1;
        this.f16313e = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: w */
    private final void m15870w(Object obj) {
        int i = this.f16313e;
        Object[] objArr = this.f16312d;
        if (i == objArr.length) {
            int i2 = i + i;
            this.f16312d = Arrays.copyOf(objArr, i2);
            this.f16315g = Arrays.copyOf(this.f16315g, i2);
            this.f16314f = (String[]) Arrays.copyOf(this.f16314f, i2);
        }
        Object[] objArr2 = this.f16312d;
        int i3 = this.f16313e;
        this.f16313e = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: x */
    private final String m15871x() {
        String valueOf = String.valueOf(mo15100o());
        return valueOf.length() != 0 ? " at path ".concat(valueOf) : new String(" at path ");
    }

    /* renamed from: y */
    private final void m15872y(int i) throws IOException {
        if (mo15101p() != i) {
            String a = bix.m15972a(i);
            String a2 = bix.m15972a(mo15101p());
            String x = m15871x();
            int length = String.valueOf(a).length();
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(a2).length() + String.valueOf(x).length());
            sb.append("Expected ");
            sb.append(a);
            sb.append(" but was ");
            sb.append(a2);
            sb.append(x);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo15085a() throws IOException {
        m15872y(1);
        m15870w(((bew) m15868u()).iterator());
        this.f16315g[this.f16313e - 1] = 0;
    }

    /* renamed from: b */
    public final void mo15086b() throws IOException {
        m15872y(2);
        m15869v();
        m15869v();
        int i = this.f16313e;
        if (i > 0) {
            int[] iArr = this.f16315g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: c */
    public final void mo15087c() throws IOException {
        m15872y(3);
        m15870w(((bfb) m15868u()).mo14990b().iterator());
    }

    public final void close() throws IOException {
        this.f16312d = new Object[]{f16311c};
        this.f16313e = 1;
    }

    /* renamed from: d */
    public final void mo15089d() throws IOException {
        m15872y(4);
        m15869v();
        m15869v();
        int i = this.f16313e;
        if (i > 0) {
            int[] iArr = this.f16315g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public final boolean mo15090e() throws IOException {
        int p = mo15101p();
        return (p == 4 || p == 2) ? false : true;
    }

    /* renamed from: f */
    public final String mo15091f() throws IOException {
        m15872y(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m15868u()).next();
        String str = (String) entry.getKey();
        this.f16314f[this.f16313e - 1] = str;
        m15870w(entry.getValue());
        return str;
    }

    /* renamed from: g */
    public final String mo15092g() throws IOException {
        int p = mo15101p();
        if (p == 6 || p == 7) {
            String f = ((bfd) m15869v()).mo14999f();
            int i = this.f16313e;
            if (i > 0) {
                int[] iArr = this.f16315g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return f;
        }
        String a = bix.m15972a(p);
        String x = m15871x();
        StringBuilder sb = new StringBuilder("STRING".length() + 18 + String.valueOf(a).length() + String.valueOf(x).length());
        sb.append("Expected ");
        sb.append("STRING");
        sb.append(" but was ");
        sb.append(a);
        sb.append(x);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: h */
    public final boolean mo15093h() throws IOException {
        m15872y(8);
        boolean b = ((bfd) m15869v()).mo14994b();
        int i = this.f16313e;
        if (i > 0) {
            int[] iArr = this.f16315g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b;
    }

    /* renamed from: i */
    public final void mo15094i() throws IOException {
        m15872y(9);
        m15869v();
        int i = this.f16313e;
        if (i > 0) {
            int[] iArr = this.f16315g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: j */
    public final double mo15095j() throws IOException {
        double d;
        int p = mo15101p();
        if (p == 7 || p == 6) {
            bfd bfd = (bfd) m15868u();
            if (bfd.mo14995c()) {
                d = bfd.mo14996d().doubleValue();
            } else {
                d = Double.parseDouble(bfd.mo14999f());
            }
            if (mo15139r() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                m15869v();
                int i = this.f16313e;
                if (i > 0) {
                    int[] iArr = this.f16315g;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return d;
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(d);
            throw new NumberFormatException(sb.toString());
        }
        String a = bix.m15972a(p);
        String x = m15871x();
        StringBuilder sb2 = new StringBuilder("NUMBER".length() + 18 + String.valueOf(a).length() + String.valueOf(x).length());
        sb2.append("Expected ");
        sb2.append("NUMBER");
        sb2.append(" but was ");
        sb2.append(a);
        sb2.append(x);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: k */
    public final long mo15096k() throws IOException {
        long j;
        int p = mo15101p();
        if (p == 7 || p == 6) {
            bfd bfd = (bfd) m15868u();
            if (bfd.mo14995c()) {
                j = bfd.mo14996d().longValue();
            } else {
                j = Long.parseLong(bfd.mo14999f());
            }
            m15869v();
            int i = this.f16313e;
            if (i > 0) {
                int[] iArr = this.f16315g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return j;
        }
        String a = bix.m15972a(p);
        String x = m15871x();
        StringBuilder sb = new StringBuilder("NUMBER".length() + 18 + String.valueOf(a).length() + String.valueOf(x).length());
        sb.append("Expected ");
        sb.append("NUMBER");
        sb.append(" but was ");
        sb.append(a);
        sb.append(x);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public final int mo15097l() throws IOException {
        int i;
        int p = mo15101p();
        if (p == 7 || p == 6) {
            bfd bfd = (bfd) m15868u();
            if (bfd.mo14995c()) {
                i = bfd.mo14996d().intValue();
            } else {
                i = Integer.parseInt(bfd.mo14999f());
            }
            m15869v();
            int i2 = this.f16313e;
            if (i2 > 0) {
                int[] iArr = this.f16315g;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return i;
        }
        String a = bix.m15972a(p);
        String x = m15871x();
        StringBuilder sb = new StringBuilder("NUMBER".length() + 18 + String.valueOf(a).length() + String.valueOf(x).length());
        sb.append("Expected ");
        sb.append("NUMBER");
        sb.append(" but was ");
        sb.append(a);
        sb.append(x);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public final void mo15098m() throws IOException {
        if (mo15101p() == 5) {
            mo15091f();
            this.f16314f[this.f16313e - 2] = "null";
        } else {
            m15869v();
            int i = this.f16313e;
            if (i > 0) {
                this.f16314f[i - 1] = "null";
            }
        }
        int i2 = this.f16313e;
        if (i2 > 0) {
            int[] iArr = this.f16315g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: n */
    public final void mo15099n() throws IOException {
        m15872y(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m15868u()).next();
        m15870w(entry.getValue());
        m15870w(new bfd((String) entry.getKey()));
    }

    /* renamed from: o */
    public final String mo15100o() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f16313e) {
            Object[] objArr = this.f16312d;
            Object obj = objArr[i];
            if (obj instanceof bew) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f16315g[i]);
                    sb.append(']');
                }
            } else if (obj instanceof bfb) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f16314f[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: p */
    public final int mo15101p() throws IOException {
        if (this.f16313e == 0) {
            return 10;
        }
        Object u = m15868u();
        if (u instanceof Iterator) {
            boolean z = this.f16312d[this.f16313e - 2] instanceof bfb;
            Iterator it = (Iterator) u;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            m15870w(it.next());
            return mo15101p();
        } else if (u instanceof bfb) {
            return 3;
        } else {
            if (u instanceof bew) {
                return 1;
            }
            if (u instanceof bfd) {
                bfd bfd = (bfd) u;
                if (bfd.mo14997e()) {
                    return 6;
                }
                if (bfd.mo14993a()) {
                    return 8;
                }
                if (bfd.mo14995c()) {
                    return 7;
                }
                throw new AssertionError();
            } else if (u instanceof bfa) {
                return 9;
            } else {
                if (u == f16311c) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final String toString() {
        return bgv.class.getSimpleName();
    }
}
