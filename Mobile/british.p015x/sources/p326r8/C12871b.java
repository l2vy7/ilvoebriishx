package p326r8;

import java.net.InetAddress;
import p308g8.C12728l;
import p317k9.C12825f;
import p326r8.C12874e;

/* renamed from: r8.b */
/* compiled from: HttpRoute */
public final class C12871b implements C12874e, Cloneable {

    /* renamed from: h */
    private static final C12728l[] f55531h = new C12728l[0];

    /* renamed from: b */
    private final C12728l f55532b;

    /* renamed from: c */
    private final InetAddress f55533c;

    /* renamed from: d */
    private final C12728l[] f55534d;

    /* renamed from: e */
    private final C12874e.C12876b f55535e;

    /* renamed from: f */
    private final C12874e.C12875a f55536f;

    /* renamed from: g */
    private final boolean f55537g;

    private C12871b(InetAddress inetAddress, C12728l lVar, C12728l[] lVarArr, boolean z, C12874e.C12876b bVar, C12874e.C12875a aVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (lVarArr == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        } else if (bVar == C12874e.C12876b.TUNNELLED && lVarArr.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        } else {
            bVar = bVar == null ? C12874e.C12876b.PLAIN : bVar;
            aVar = aVar == null ? C12874e.C12875a.PLAIN : aVar;
            this.f55532b = lVar;
            this.f55533c = inetAddress;
            this.f55534d = lVarArr;
            this.f55537g = z;
            this.f55535e = bVar;
            this.f55536f = aVar;
        }
    }

    /* renamed from: l */
    private static C12728l[] m54490l(C12728l lVar) {
        if (lVar == null) {
            return f55531h;
        }
        return new C12728l[]{lVar};
    }

    /* renamed from: m */
    private static C12728l[] m54491m(C12728l[] lVarArr) {
        if (lVarArr == null || lVarArr.length < 1) {
            return f55531h;
        }
        int length = lVarArr.length;
        int i = 0;
        while (i < length) {
            if (lVarArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        C12728l[] lVarArr2 = new C12728l[lVarArr.length];
        System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
        return lVarArr2;
    }

    /* renamed from: a */
    public final boolean mo48017a() {
        return this.f55537g;
    }

    /* renamed from: b */
    public final int mo48018b() {
        return this.f55534d.length + 1;
    }

    /* renamed from: c */
    public final boolean mo48019c() {
        return this.f55535e == C12874e.C12876b.TUNNELLED;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final InetAddress mo48021d() {
        return this.f55533c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12871b)) {
            return false;
        }
        C12871b bVar = (C12871b) obj;
        if (this.f55537g != bVar.f55537g || this.f55535e != bVar.f55535e || this.f55536f != bVar.f55536f || !C12825f.m54377a(this.f55532b, bVar.f55532b) || !C12825f.m54377a(this.f55533c, bVar.f55533c) || !C12825f.m54378b(this.f55534d, bVar.f55534d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final C12728l mo48023g(int i) {
        if (i >= 0) {
            int b = mo48018b();
            if (i >= b) {
                throw new IllegalArgumentException("Hop index " + i + " exceeds route length " + b);
            } else if (i < b - 1) {
                return this.f55534d[i];
            } else {
                return this.f55532b;
            }
        } else {
            throw new IllegalArgumentException("Hop index must not be negative: " + i);
        }
    }

    /* renamed from: h */
    public final C12728l mo48024h() {
        return this.f55532b;
    }

    public final int hashCode() {
        int d = C12825f.m54380d(C12825f.m54380d(17, this.f55532b), this.f55533c);
        int i = 0;
        while (true) {
            C12728l[] lVarArr = this.f55534d;
            if (i >= lVarArr.length) {
                return C12825f.m54380d(C12825f.m54380d(C12825f.m54381e(d, this.f55537g), this.f55535e), this.f55536f);
            }
            d = C12825f.m54380d(d, lVarArr[i]);
            i++;
        }
    }

    /* renamed from: i */
    public final boolean mo48026i() {
        return this.f55536f == C12874e.C12875a.LAYERED;
    }

    /* renamed from: k */
    public final C12728l mo48027k() {
        C12728l[] lVarArr = this.f55534d;
        if (lVarArr.length == 0) {
            return null;
        }
        return lVarArr[0];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((mo48018b() * 30) + 50);
        sb.append("HttpRoute[");
        InetAddress inetAddress = this.f55533c;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.f55535e == C12874e.C12876b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f55536f == C12874e.C12875a.LAYERED) {
            sb.append('l');
        }
        if (this.f55537g) {
            sb.append('s');
        }
        sb.append("}->");
        for (C12728l append : this.f55534d) {
            sb.append(append);
            sb.append("->");
        }
        sb.append(this.f55532b);
        sb.append(']');
        return sb.toString();
    }

    public C12871b(C12728l lVar, InetAddress inetAddress, C12728l[] lVarArr, boolean z, C12874e.C12876b bVar, C12874e.C12875a aVar) {
        this(inetAddress, lVar, m54491m(lVarArr), z, bVar, aVar);
    }

    public C12871b(C12728l lVar, InetAddress inetAddress, boolean z) {
        this(inetAddress, lVar, f55531h, z, C12874e.C12876b.PLAIN, C12874e.C12875a.PLAIN);
    }

    public C12871b(C12728l lVar) {
        this((InetAddress) null, lVar, f55531h, false, C12874e.C12876b.PLAIN, C12874e.C12875a.PLAIN);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12871b(p308g8.C12728l r8, java.net.InetAddress r9, p308g8.C12728l r10, boolean r11) {
        /*
            r7 = this;
            g8.l[] r3 = m54490l(r10)
            if (r11 == 0) goto L_0x0009
            r8.e$b r0 = p326r8.C12874e.C12876b.TUNNELLED
            goto L_0x000b
        L_0x0009:
            r8.e$b r0 = p326r8.C12874e.C12876b.PLAIN
        L_0x000b:
            r5 = r0
            if (r11 == 0) goto L_0x0011
            r8.e$a r0 = p326r8.C12874e.C12875a.LAYERED
            goto L_0x0013
        L_0x0011:
            r8.e$a r0 = p326r8.C12874e.C12875a.PLAIN
        L_0x0013:
            r6 = r0
            r0 = r7
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>((java.net.InetAddress) r1, (p308g8.C12728l) r2, (p308g8.C12728l[]) r3, (boolean) r4, (p326r8.C12874e.C12876b) r5, (p326r8.C12874e.C12875a) r6)
            if (r10 == 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Proxy host may not be null."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p326r8.C12871b.<init>(g8.l, java.net.InetAddress, g8.l, boolean):void");
    }
}
