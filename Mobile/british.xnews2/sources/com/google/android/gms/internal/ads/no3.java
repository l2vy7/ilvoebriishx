package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class no3 implements gr3 {

    /* renamed from: a */
    private final mo3 f36063a;

    /* renamed from: b */
    private int f36064b;

    /* renamed from: c */
    private int f36065c;

    /* renamed from: d */
    private int f36066d = 0;

    private no3(mo3 mo3) {
        up3.m38380f(mo3, "input");
        this.f36063a = mo3;
        mo3.f35594c = this;
    }

    /* renamed from: A */
    private final void m35227A(int i) throws IOException {
        if ((this.f36064b & 7) != i) {
            throw wp3.m39222a();
        }
    }

    /* renamed from: B */
    private static final void m35228B(int i) throws IOException {
        if ((i & 3) != 0) {
            throw wp3.m39228g();
        }
    }

    /* renamed from: C */
    private static final void m35229C(int i) throws IOException {
        if ((i & 7) != 0) {
            throw wp3.m39228g();
        }
    }

    /* renamed from: D */
    public static no3 m35230D(mo3 mo3) {
        no3 no3 = mo3.f35594c;
        return no3 != null ? no3 : new no3(mo3);
    }

    /* renamed from: x */
    private final <T> T m35231x(or3<T> or3, wo3 wo3) throws IOException {
        int i = this.f36065c;
        this.f36065c = ((this.f36064b >>> 3) << 3) | 4;
        try {
            T zze = or3.zze();
            or3.mo33999e(zze, this, wo3);
            or3.mo33996a(zze);
            if (this.f36064b == this.f36065c) {
                return zze;
            }
            throw wp3.m39228g();
        } finally {
            this.f36065c = i;
        }
    }

    /* renamed from: y */
    private final <T> T m35232y(or3<T> or3, wo3 wo3) throws IOException {
        int r = this.f36063a.mo32196r();
        mo3 mo3 = this.f36063a;
        if (mo3.f35592a < mo3.f35593b) {
            int k = mo3.mo32189k(r);
            T zze = or3.zze();
            this.f36063a.f35592a++;
            or3.mo33999e(zze, this, wo3);
            or3.mo33996a(zze);
            this.f36063a.mo32174A(0);
            mo3 mo32 = this.f36063a;
            mo32.f35592a--;
            mo32.mo32182a(k);
            return zze;
        }
        throw new wp3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: z */
    private final void m35233z(int i) throws IOException {
        if (this.f36063a.mo32188j() != i) {
            throw wp3.m39230j();
        }
    }

    /* renamed from: a */
    public final void mo32224a(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    lp3.mo33382p(this.f36063a.mo32190l());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    lp3.mo33382p(this.f36063a.mo32190l());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32190l()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32190l()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: b */
    public final void mo32225b(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    jq3.mo32933h(this.f36063a.mo32198t());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    jq3.mo32933h(this.f36063a.mo32198t());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36063a.mo32198t()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Long.valueOf(this.f36063a.mo32198t()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: c */
    public final void mo32226c(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    jq3.mo32933h(this.f36063a.mo32201w());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    jq3.mo32933h(this.f36063a.mo32201w());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36063a.mo32201w()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Long.valueOf(this.f36063a.mo32201w()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: d */
    public final void mo32227d(List<Double> list) throws IOException {
        int q;
        int q2;
        if (list instanceof to3) {
            to3 to3 = (to3) list;
            int i = this.f36064b & 7;
            if (i == 1) {
                do {
                    to3.mo34998e(this.f36063a.mo32186h());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int r = this.f36063a.mo32196r();
                m35229C(r);
                int j = this.f36063a.mo32188j() + r;
                do {
                    to3.mo34998e(this.f36063a.mo32186h());
                } while (this.f36063a.mo32188j() < j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f36063a.mo32186h()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int r2 = this.f36063a.mo32196r();
                m35229C(r2);
                int j2 = this.f36063a.mo32188j() + r2;
                do {
                    list.add(Double.valueOf(this.f36063a.mo32186h()));
                } while (this.f36063a.mo32188j() < j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: e */
    public final void mo32228e(List<eo3> list) throws IOException {
        int q;
        if ((this.f36064b & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.f36063a.mo32183b()) {
                    q = this.f36063a.mo32195q();
                } else {
                    return;
                }
            } while (q == this.f36064b);
            this.f36066d = q;
            return;
        }
        throw wp3.m39222a();
    }

    /* renamed from: f */
    public final void mo32229f(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    lp3.mo33382p(this.f36063a.mo32192n());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    lp3.mo33382p(this.f36063a.mo32192n());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32192n()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32192n()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: g */
    public final <T> void mo32230g(List<T> list, or3<T> or3, wo3 wo3) throws IOException {
        int q;
        int i = this.f36064b;
        if ((i & 7) == 3) {
            do {
                list.add(m35231x(or3, wo3));
                if (!this.f36063a.mo32183b() && this.f36066d == 0) {
                    q = this.f36063a.mo32195q();
                } else {
                    return;
                }
            } while (q == i);
            this.f36066d = q;
            return;
        }
        throw wp3.m39222a();
    }

    /* renamed from: h */
    public final boolean mo32231h() throws IOException {
        m35227A(0);
        return this.f36063a.mo32184c();
    }

    /* renamed from: i */
    public final boolean mo32232i() throws IOException {
        int i;
        if (this.f36063a.mo32183b() || (i = this.f36064b) == this.f36065c) {
            return false;
        }
        return this.f36063a.mo32185d(i);
    }

    /* renamed from: j */
    public final <T> T mo32233j(or3<T> or3, wo3 wo3) throws IOException {
        m35227A(2);
        return m35232y(or3, wo3);
    }

    /* renamed from: k */
    public final void mo32234k(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            int i = this.f36064b & 7;
            if (i == 1) {
                do {
                    jq3.mo32933h(this.f36063a.mo32199u());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int r = this.f36063a.mo32196r();
                m35229C(r);
                int j = this.f36063a.mo32188j() + r;
                do {
                    jq3.mo32933h(this.f36063a.mo32199u());
                } while (this.f36063a.mo32188j() < j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f36063a.mo32199u()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int r2 = this.f36063a.mo32196r();
                m35229C(r2);
                int j2 = this.f36063a.mo32188j() + r2;
                do {
                    list.add(Long.valueOf(this.f36063a.mo32199u()));
                } while (this.f36063a.mo32188j() < j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: l */
    public final void mo32235l(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            int i = this.f36064b & 7;
            if (i == 2) {
                int r = this.f36063a.mo32196r();
                m35228B(r);
                int j = this.f36063a.mo32188j() + r;
                do {
                    lp3.mo33382p(this.f36063a.mo32193o());
                } while (this.f36063a.mo32188j() < j);
            } else if (i == 5) {
                do {
                    lp3.mo33382p(this.f36063a.mo32193o());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 2) {
                int r2 = this.f36063a.mo32196r();
                m35228B(r2);
                int j2 = this.f36063a.mo32188j() + r2;
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32193o()));
                } while (this.f36063a.mo32188j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32193o()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: m */
    public final <T> T mo32236m(or3<T> or3, wo3 wo3) throws IOException {
        m35227A(3);
        return m35231x(or3, wo3);
    }

    /* renamed from: n */
    public final String mo32237n() throws IOException {
        m35227A(2);
        return this.f36063a.mo32204z();
    }

    /* renamed from: o */
    public final void mo32238o(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            int i = this.f36064b & 7;
            if (i == 2) {
                int r = this.f36063a.mo32196r();
                m35228B(r);
                int j = this.f36063a.mo32188j() + r;
                do {
                    lp3.mo33382p(this.f36063a.mo32191m());
                } while (this.f36063a.mo32188j() < j);
            } else if (i == 5) {
                do {
                    lp3.mo33382p(this.f36063a.mo32191m());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 2) {
                int r2 = this.f36063a.mo32196r();
                m35228B(r2);
                int j2 = this.f36063a.mo32188j() + r2;
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32191m()));
                } while (this.f36063a.mo32188j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32191m()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: p */
    public final void mo32239p(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    jq3.mo32933h(this.f36063a.mo32200v());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    jq3.mo32933h(this.f36063a.mo32200v());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36063a.mo32200v()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Long.valueOf(this.f36063a.mo32200v()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: q */
    public final <T> void mo32240q(List<T> list, or3<T> or3, wo3 wo3) throws IOException {
        int q;
        int i = this.f36064b;
        if ((i & 7) == 2) {
            do {
                list.add(m35232y(or3, wo3));
                if (!this.f36063a.mo32183b() && this.f36066d == 0) {
                    q = this.f36063a.mo32195q();
                } else {
                    return;
                }
            } while (q == i);
            this.f36066d = q;
            return;
        }
        throw wp3.m39222a();
    }

    /* renamed from: r */
    public final void mo32241r(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            int i = this.f36064b & 7;
            if (i == 1) {
                do {
                    jq3.mo32933h(this.f36063a.mo32197s());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int r = this.f36063a.mo32196r();
                m35229C(r);
                int j = this.f36063a.mo32188j() + r;
                do {
                    jq3.mo32933h(this.f36063a.mo32197s());
                } while (this.f36063a.mo32188j() < j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f36063a.mo32197s()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int r2 = this.f36063a.mo32196r();
                m35229C(r2);
                int j2 = this.f36063a.mo32188j() + r2;
                do {
                    list.add(Long.valueOf(this.f36063a.mo32197s()));
                } while (this.f36063a.mo32188j() < j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: s */
    public final void mo32242s(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    lp3.mo33382p(this.f36063a.mo32194p());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    lp3.mo33382p(this.f36063a.mo32194p());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32194p()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32194p()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: t */
    public final void mo32243t(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    lp3.mo33382p(this.f36063a.mo32196r());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    lp3.mo33382p(this.f36063a.mo32196r());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32196r()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Integer.valueOf(this.f36063a.mo32196r()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: u */
    public final void mo32244u(List<Boolean> list) throws IOException {
        int q;
        int q2;
        if (list instanceof qn3) {
            qn3 qn3 = (qn3) list;
            int i = this.f36064b & 7;
            if (i == 0) {
                do {
                    qn3.mo34365e(this.f36063a.mo32184c());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else if (i == 2) {
                int j = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    qn3.mo34365e(this.f36063a.mo32184c());
                } while (this.f36063a.mo32188j() < j);
                m35233z(j);
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f36063a.mo32184c()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else if (i2 == 2) {
                int j2 = this.f36063a.mo32188j() + this.f36063a.mo32196r();
                do {
                    list.add(Boolean.valueOf(this.f36063a.mo32184c()));
                } while (this.f36063a.mo32188j() < j2);
                m35233z(j2);
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: v */
    public final void mo32245v(List<Float> list) throws IOException {
        int q;
        int q2;
        if (list instanceof ep3) {
            ep3 ep3 = (ep3) list;
            int i = this.f36064b & 7;
            if (i == 2) {
                int r = this.f36063a.mo32196r();
                m35228B(r);
                int j = this.f36063a.mo32188j() + r;
                do {
                    ep3.mo31629e(this.f36063a.mo32187i());
                } while (this.f36063a.mo32188j() < j);
            } else if (i == 5) {
                do {
                    ep3.mo31629e(this.f36063a.mo32187i());
                    if (!this.f36063a.mo32183b()) {
                        q2 = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q2 == this.f36064b);
                this.f36066d = q2;
            } else {
                throw wp3.m39222a();
            }
        } else {
            int i2 = this.f36064b & 7;
            if (i2 == 2) {
                int r2 = this.f36063a.mo32196r();
                m35228B(r2);
                int j2 = this.f36063a.mo32188j() + r2;
                do {
                    list.add(Float.valueOf(this.f36063a.mo32187i()));
                } while (this.f36063a.mo32188j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f36063a.mo32187i()));
                    if (!this.f36063a.mo32183b()) {
                        q = this.f36063a.mo32195q();
                    } else {
                        return;
                    }
                } while (q == this.f36064b);
                this.f36066d = q;
            } else {
                throw wp3.m39222a();
            }
        }
    }

    /* renamed from: w */
    public final void mo33727w(List<String> list, boolean z) throws IOException {
        int q;
        int q2;
        if ((this.f36064b & 7) != 2) {
            throw wp3.m39222a();
        } else if ((list instanceof cq3) && !z) {
            cq3 cq3 = (cq3) list;
            do {
                cq3.mo30782q0(zzp());
                if (!this.f36063a.mo32183b()) {
                    q2 = this.f36063a.mo32195q();
                } else {
                    return;
                }
            } while (q2 == this.f36064b);
            this.f36066d = q2;
        } else {
            do {
                list.add(z ? mo32237n() : zzt());
                if (!this.f36063a.mo32183b()) {
                    q = this.f36063a.mo32195q();
                } else {
                    return;
                }
            } while (q == this.f36064b);
            this.f36066d = q;
        }
    }

    public final double zza() throws IOException {
        m35227A(1);
        return this.f36063a.mo32186h();
    }

    public final float zzb() throws IOException {
        m35227A(5);
        return this.f36063a.mo32187i();
    }

    public final int zzc() throws IOException {
        int i = this.f36066d;
        if (i != 0) {
            this.f36064b = i;
            this.f36066d = 0;
        } else {
            i = this.f36063a.mo32195q();
            this.f36064b = i;
        }
        if (i == 0 || i == this.f36065c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final int zzd() {
        return this.f36064b;
    }

    public final int zze() throws IOException {
        m35227A(0);
        return this.f36063a.mo32190l();
    }

    public final int zzf() throws IOException {
        m35227A(5);
        return this.f36063a.mo32191m();
    }

    public final int zzg() throws IOException {
        m35227A(0);
        return this.f36063a.mo32192n();
    }

    public final int zzh() throws IOException {
        m35227A(5);
        return this.f36063a.mo32193o();
    }

    public final int zzi() throws IOException {
        m35227A(0);
        return this.f36063a.mo32194p();
    }

    public final int zzj() throws IOException {
        m35227A(0);
        return this.f36063a.mo32196r();
    }

    public final long zzk() throws IOException {
        m35227A(1);
        return this.f36063a.mo32197s();
    }

    public final long zzl() throws IOException {
        m35227A(0);
        return this.f36063a.mo32198t();
    }

    public final long zzm() throws IOException {
        m35227A(1);
        return this.f36063a.mo32199u();
    }

    public final long zzn() throws IOException {
        m35227A(0);
        return this.f36063a.mo32200v();
    }

    public final long zzo() throws IOException {
        m35227A(0);
        return this.f36063a.mo32201w();
    }

    public final eo3 zzp() throws IOException {
        m35227A(2);
        return this.f36063a.mo32202x();
    }

    public final String zzt() throws IOException {
        m35227A(2);
        return this.f36063a.mo32203y();
    }
}
