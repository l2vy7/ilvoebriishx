package p325r8;

import java.net.InetAddress;
import p307g8.C12728l;
import p316k9.C12825f;
import p325r8.C12874e;

/* renamed from: r8.f */
/* compiled from: RouteTracker */
public final class C12877f implements C12874e, Cloneable {

    /* renamed from: b */
    private final C12728l f55544b;

    /* renamed from: c */
    private final InetAddress f55545c;

    /* renamed from: d */
    private boolean f55546d;

    /* renamed from: e */
    private C12728l[] f55547e;

    /* renamed from: f */
    private C12874e.C12876b f55548f;

    /* renamed from: g */
    private C12874e.C12875a f55549g;

    /* renamed from: h */
    private boolean f55550h;

    public C12877f(C12728l lVar, InetAddress inetAddress) {
        if (lVar != null) {
            this.f55544b = lVar;
            this.f55545c = inetAddress;
            this.f55548f = C12874e.C12876b.PLAIN;
            this.f55549g = C12874e.C12875a.PLAIN;
            return;
        }
        throw new IllegalArgumentException("Target host may not be null.");
    }

    /* renamed from: a */
    public final boolean mo48017a() {
        return this.f55550h;
    }

    /* renamed from: b */
    public final int mo48018b() {
        if (!this.f55546d) {
            return 0;
        }
        C12728l[] lVarArr = this.f55547e;
        if (lVarArr == null) {
            return 1;
        }
        return 1 + lVarArr.length;
    }

    /* renamed from: c */
    public final boolean mo48019c() {
        return this.f55548f == C12874e.C12876b.TUNNELLED;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final InetAddress mo48021d() {
        return this.f55545c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12877f)) {
            return false;
        }
        C12877f fVar = (C12877f) obj;
        if (this.f55546d == fVar.f55546d && this.f55550h == fVar.f55550h && this.f55548f == fVar.f55548f && this.f55549g == fVar.f55549g && C12825f.m54377a(this.f55544b, fVar.f55544b) && C12825f.m54377a(this.f55545c, fVar.f55545c) && C12825f.m54378b(this.f55547e, fVar.f55547e)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final C12728l mo48023g(int i) {
        if (i >= 0) {
            int b = mo48018b();
            if (i >= b) {
                throw new IllegalArgumentException("Hop index " + i + " exceeds tracked route length " + b + ".");
            } else if (i < b - 1) {
                return this.f55547e[i];
            } else {
                return this.f55544b;
            }
        } else {
            throw new IllegalArgumentException("Hop index must not be negative: " + i);
        }
    }

    /* renamed from: h */
    public final C12728l mo48024h() {
        return this.f55544b;
    }

    public final int hashCode() {
        int d = C12825f.m54380d(C12825f.m54380d(17, this.f55544b), this.f55545c);
        if (this.f55547e != null) {
            int i = 0;
            while (true) {
                C12728l[] lVarArr = this.f55547e;
                if (i >= lVarArr.length) {
                    break;
                }
                d = C12825f.m54380d(d, lVarArr[i]);
                i++;
            }
        }
        return C12825f.m54380d(C12825f.m54380d(C12825f.m54381e(C12825f.m54381e(d, this.f55546d), this.f55550h), this.f55548f), this.f55549g);
    }

    /* renamed from: i */
    public final boolean mo48026i() {
        return this.f55549g == C12874e.C12875a.LAYERED;
    }

    /* renamed from: k */
    public final void mo48032k(C12728l lVar, boolean z) {
        if (lVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (!this.f55546d) {
            this.f55546d = true;
            this.f55547e = new C12728l[]{lVar};
            this.f55550h = z;
        } else {
            throw new IllegalStateException("Already connected.");
        }
    }

    /* renamed from: l */
    public final void mo48033l(boolean z) {
        if (!this.f55546d) {
            this.f55546d = true;
            this.f55550h = z;
            return;
        }
        throw new IllegalStateException("Already connected.");
    }

    /* renamed from: m */
    public final boolean mo48034m() {
        return this.f55546d;
    }

    /* renamed from: n */
    public final void mo48035n(boolean z) {
        if (this.f55546d) {
            this.f55549g = C12874e.C12875a.LAYERED;
            this.f55550h = z;
            return;
        }
        throw new IllegalStateException("No layered protocol unless connected.");
    }

    /* renamed from: o */
    public final C12871b mo48036o() {
        if (!this.f55546d) {
            return null;
        }
        return new C12871b(this.f55544b, this.f55545c, this.f55547e, this.f55550h, this.f55548f, this.f55549g);
    }

    /* renamed from: p */
    public final void mo48037p(C12728l lVar, boolean z) {
        if (lVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (this.f55546d) {
            C12728l[] lVarArr = this.f55547e;
            if (lVarArr != null) {
                int length = lVarArr.length + 1;
                C12728l[] lVarArr2 = new C12728l[length];
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
                lVarArr2[length - 1] = lVar;
                this.f55547e = lVarArr2;
                this.f55550h = z;
                return;
            }
            throw new IllegalStateException("No proxy tunnel without proxy.");
        } else {
            throw new IllegalStateException("No tunnel unless connected.");
        }
    }

    /* renamed from: s */
    public final void mo48038s(boolean z) {
        if (!this.f55546d) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.f55547e != null) {
            this.f55548f = C12874e.C12876b.TUNNELLED;
            this.f55550h = z;
        } else {
            throw new IllegalStateException("No tunnel without proxy.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((mo48018b() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.f55545c;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.f55546d) {
            sb.append('c');
        }
        if (this.f55548f == C12874e.C12876b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f55549g == C12874e.C12875a.LAYERED) {
            sb.append('l');
        }
        if (this.f55550h) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.f55547e != null) {
            int i = 0;
            while (true) {
                C12728l[] lVarArr = this.f55547e;
                if (i >= lVarArr.length) {
                    break;
                }
                sb.append(lVarArr[i]);
                sb.append("->");
                i++;
            }
        }
        sb.append(this.f55544b);
        sb.append(']');
        return sb.toString();
    }

    public C12877f(C12871b bVar) {
        this(bVar.mo48024h(), bVar.mo48021d());
    }
}
