package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1155h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p104l0.C5645e;
import p104l0.C5646f;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
final class C1127a implements C1155h.C1156a {

    /* renamed from: a */
    private C5645e<C1129b> f5246a;

    /* renamed from: b */
    final ArrayList<C1129b> f5247b;

    /* renamed from: c */
    final ArrayList<C1129b> f5248c;

    /* renamed from: d */
    final C1128a f5249d;

    /* renamed from: e */
    Runnable f5250e;

    /* renamed from: f */
    final boolean f5251f;

    /* renamed from: g */
    final C1155h f5252g;

    /* renamed from: h */
    private int f5253h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C1128a {
        /* renamed from: a */
        void mo5315a(int i, int i2);

        /* renamed from: b */
        void mo5316b(C1129b bVar);

        /* renamed from: c */
        void mo5317c(int i, int i2, Object obj);

        /* renamed from: d */
        void mo5318d(C1129b bVar);

        /* renamed from: e */
        RecyclerView.C1087c0 mo5319e(int i);

        /* renamed from: f */
        void mo5320f(int i, int i2);

        /* renamed from: g */
        void mo5321g(int i, int i2);

        /* renamed from: h */
        void mo5322h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static final class C1129b {

        /* renamed from: a */
        int f5254a;

        /* renamed from: b */
        int f5255b;

        /* renamed from: c */
        Object f5256c;

        /* renamed from: d */
        int f5257d;

        C1129b(int i, int i2, int i3, Object obj) {
            this.f5254a = i;
            this.f5255b = i2;
            this.f5257d = i3;
            this.f5256c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo5678a() {
            int i = this.f5254a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1129b)) {
                return false;
            }
            C1129b bVar = (C1129b) obj;
            int i = this.f5254a;
            if (i != bVar.f5254a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f5257d - this.f5255b) == 1 && this.f5257d == bVar.f5255b && this.f5255b == bVar.f5257d) {
                return true;
            }
            if (this.f5257d != bVar.f5257d || this.f5255b != bVar.f5255b) {
                return false;
            }
            Object obj2 = this.f5256c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f5256c)) {
                    return false;
                }
            } else if (bVar.f5256c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5254a * 31) + this.f5255b) * 31) + this.f5257d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo5678a() + ",s:" + this.f5255b + "c:" + this.f5257d + ",p:" + this.f5256c + "]";
        }
    }

    C1127a(C1128a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m6237c(C1129b bVar) {
        m6243v(bVar);
    }

    /* renamed from: d */
    private void m6238d(C1129b bVar) {
        m6243v(bVar);
    }

    /* renamed from: f */
    private void m6239f(C1129b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f5255b;
        int i2 = bVar.f5257d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f5249d.mo5319e(i3) != null || m6241h(i3)) {
                if (c2 == 0) {
                    m6242k(mo5661b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6243v(mo5661b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f5257d) {
            mo5660a(bVar);
            bVar = mo5661b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m6242k(bVar);
        } else {
            m6243v(bVar);
        }
    }

    /* renamed from: g */
    private void m6240g(C1129b bVar) {
        int i = bVar.f5255b;
        int i2 = bVar.f5257d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f5249d.mo5319e(i) != null || m6241h(i)) {
                if (c == 0) {
                    m6242k(mo5661b(4, i3, i4, bVar.f5256c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m6243v(mo5661b(4, i3, i4, bVar.f5256c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f5257d) {
            Object obj = bVar.f5256c;
            mo5660a(bVar);
            bVar = mo5661b(4, i3, i4, obj);
        }
        if (c == 0) {
            m6242k(bVar);
        } else {
            m6243v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m6241h(int i) {
        int size = this.f5248c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1129b bVar = this.f5248c.get(i2);
            int i3 = bVar.f5254a;
            if (i3 == 8) {
                if (mo5667n(bVar.f5257d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f5255b;
                int i5 = bVar.f5257d + i4;
                while (i4 < i5) {
                    if (mo5667n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m6242k(C1129b bVar) {
        int i;
        int i2 = bVar.f5254a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z = m6244z(bVar.f5255b, i2);
        int i3 = bVar.f5255b;
        int i4 = bVar.f5254a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f5257d; i6++) {
            int z2 = m6244z(bVar.f5255b + (i * i6), bVar.f5254a);
            int i7 = bVar.f5254a;
            if (i7 == 2 ? z2 == z : i7 == 4 && z2 == z + 1) {
                i5++;
            } else {
                C1129b b = mo5661b(i7, z, i5, bVar.f5256c);
                mo5665l(b, i3);
                mo5660a(b);
                if (bVar.f5254a == 4) {
                    i3 += i5;
                }
                z = z2;
                i5 = 1;
            }
        }
        Object obj = bVar.f5256c;
        mo5660a(bVar);
        if (i5 > 0) {
            C1129b b2 = mo5661b(bVar.f5254a, z, i5, obj);
            mo5665l(b2, i3);
            mo5660a(b2);
        }
    }

    /* renamed from: v */
    private void m6243v(C1129b bVar) {
        this.f5248c.add(bVar);
        int i = bVar.f5254a;
        if (i == 1) {
            this.f5249d.mo5321g(bVar.f5255b, bVar.f5257d);
        } else if (i == 2) {
            this.f5249d.mo5320f(bVar.f5255b, bVar.f5257d);
        } else if (i == 4) {
            this.f5249d.mo5317c(bVar.f5255b, bVar.f5257d, bVar.f5256c);
        } else if (i == 8) {
            this.f5249d.mo5315a(bVar.f5255b, bVar.f5257d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m6244z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f5248c.size() - 1; size >= 0; size--) {
            C1129b bVar = this.f5248c.get(size);
            int i5 = bVar.f5254a;
            if (i5 == 8) {
                int i6 = bVar.f5255b;
                int i7 = bVar.f5257d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f5255b = i6 + 1;
                            bVar.f5257d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f5255b = i6 - 1;
                            bVar.f5257d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f5257d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f5257d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f5255b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f5255b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f5255b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f5257d;
                    } else if (i5 == 2) {
                        i += bVar.f5257d;
                    }
                } else if (i2 == 1) {
                    bVar.f5255b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f5255b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f5248c.size() - 1; size2 >= 0; size2--) {
            C1129b bVar2 = this.f5248c.get(size2);
            if (bVar2.f5254a == 8) {
                int i9 = bVar2.f5257d;
                if (i9 == bVar2.f5255b || i9 < 0) {
                    this.f5248c.remove(size2);
                    mo5660a(bVar2);
                }
            } else if (bVar2.f5257d <= 0) {
                this.f5248c.remove(size2);
                mo5660a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo5660a(C1129b bVar) {
        if (!this.f5251f) {
            bVar.f5256c = null;
            this.f5246a.mo7110a(bVar);
        }
    }

    /* renamed from: b */
    public C1129b mo5661b(int i, int i2, int i3, Object obj) {
        C1129b acquire = this.f5246a.acquire();
        if (acquire == null) {
            return new C1129b(i, i2, i3, obj);
        }
        acquire.f5254a = i;
        acquire.f5255b = i2;
        acquire.f5257d = i3;
        acquire.f5256c = obj;
        return acquire;
    }

    /* renamed from: e */
    public int mo5662e(int i) {
        int size = this.f5247b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1129b bVar = this.f5247b.get(i2);
            int i3 = bVar.f5254a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f5255b;
                    if (i4 <= i) {
                        int i5 = bVar.f5257d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f5255b;
                    if (i6 == i) {
                        i = bVar.f5257d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f5257d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f5255b <= i) {
                i += bVar.f5257d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5663i() {
        int size = this.f5248c.size();
        for (int i = 0; i < size; i++) {
            this.f5249d.mo5318d(this.f5248c.get(i));
        }
        mo5676x(this.f5248c);
        this.f5253h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5664j() {
        mo5663i();
        int size = this.f5247b.size();
        for (int i = 0; i < size; i++) {
            C1129b bVar = this.f5247b.get(i);
            int i2 = bVar.f5254a;
            if (i2 == 1) {
                this.f5249d.mo5318d(bVar);
                this.f5249d.mo5321g(bVar.f5255b, bVar.f5257d);
            } else if (i2 == 2) {
                this.f5249d.mo5318d(bVar);
                this.f5249d.mo5322h(bVar.f5255b, bVar.f5257d);
            } else if (i2 == 4) {
                this.f5249d.mo5318d(bVar);
                this.f5249d.mo5317c(bVar.f5255b, bVar.f5257d, bVar.f5256c);
            } else if (i2 == 8) {
                this.f5249d.mo5318d(bVar);
                this.f5249d.mo5315a(bVar.f5255b, bVar.f5257d);
            }
            Runnable runnable = this.f5250e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo5676x(this.f5247b);
        this.f5253h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5665l(C1129b bVar, int i) {
        this.f5249d.mo5316b(bVar);
        int i2 = bVar.f5254a;
        if (i2 == 2) {
            this.f5249d.mo5322h(i, bVar.f5257d);
        } else if (i2 == 4) {
            this.f5249d.mo5317c(i, bVar.f5257d, bVar.f5256c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5666m(int i) {
        return mo5667n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo5667n(int i, int i2) {
        int size = this.f5248c.size();
        while (i2 < size) {
            C1129b bVar = this.f5248c.get(i2);
            int i3 = bVar.f5254a;
            if (i3 == 8) {
                int i4 = bVar.f5255b;
                if (i4 == i) {
                    i = bVar.f5257d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f5257d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f5255b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f5257d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f5257d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5668o(int i) {
        return (i & this.f5253h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5669p() {
        return this.f5247b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5670q() {
        return !this.f5248c.isEmpty() && !this.f5247b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5671r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f5247b.add(mo5661b(4, i, i2, obj));
        this.f5253h |= 4;
        if (this.f5247b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5672s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f5247b.add(mo5661b(1, i, i2, (Object) null));
        this.f5253h |= 1;
        if (this.f5247b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5673t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f5247b.add(mo5661b(8, i, i2, (Object) null));
            this.f5253h |= 8;
            if (this.f5247b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5674u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f5247b.add(mo5661b(2, i, i2, (Object) null));
        this.f5253h |= 2;
        if (this.f5247b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5675w() {
        this.f5252g.mo5769b(this.f5247b);
        int size = this.f5247b.size();
        for (int i = 0; i < size; i++) {
            C1129b bVar = this.f5247b.get(i);
            int i2 = bVar.f5254a;
            if (i2 == 1) {
                m6237c(bVar);
            } else if (i2 == 2) {
                m6239f(bVar);
            } else if (i2 == 4) {
                m6240g(bVar);
            } else if (i2 == 8) {
                m6238d(bVar);
            }
            Runnable runnable = this.f5250e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5247b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5676x(List<C1129b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5660a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5677y() {
        mo5676x(this.f5247b);
        mo5676x(this.f5248c);
        this.f5253h = 0;
    }

    C1127a(C1128a aVar, boolean z) {
        this.f5246a = new C5646f(30);
        this.f5247b = new ArrayList<>();
        this.f5248c = new ArrayList<>();
        this.f5253h = 0;
        this.f5249d = aVar;
        this.f5251f = z;
        this.f5252g = new C1155h(this);
    }
}
