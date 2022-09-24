package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: ChildHelper */
class C1130b {

    /* renamed from: a */
    final C1132b f5258a;

    /* renamed from: b */
    final C1131a f5259b = new C1131a();

    /* renamed from: c */
    final List<View> f5260c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* compiled from: ChildHelper */
    static class C1131a {

        /* renamed from: a */
        long f5261a = 0;

        /* renamed from: b */
        C1131a f5262b;

        C1131a() {
        }

        /* renamed from: c */
        private void m6292c() {
            if (this.f5262b == null) {
                this.f5262b = new C1131a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5700a(int i) {
            if (i >= 64) {
                C1131a aVar = this.f5262b;
                if (aVar != null) {
                    aVar.mo5700a(i - 64);
                    return;
                }
                return;
            }
            this.f5261a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5701b(int i) {
            C1131a aVar = this.f5262b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f5261a);
                }
                return Long.bitCount(this.f5261a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f5261a & ((1 << i) - 1));
            } else {
                return aVar.mo5701b(i - 64) + Long.bitCount(this.f5261a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5702d(int i) {
            if (i < 64) {
                return (this.f5261a & (1 << i)) != 0;
            }
            m6292c();
            return this.f5262b.mo5702d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5703e(int i, boolean z) {
            if (i >= 64) {
                m6292c();
                this.f5262b.mo5703e(i - 64, z);
                return;
            }
            long j = this.f5261a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f5261a = ((j & (j2 ^ -1)) << 1) | (j & j2);
            if (z) {
                mo5706h(i);
            } else {
                mo5700a(i);
            }
            if (z2 || this.f5262b != null) {
                m6292c();
                this.f5262b.mo5703e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo5704f(int i) {
            if (i >= 64) {
                m6292c();
                return this.f5262b.mo5704f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f5261a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.f5261a = j3;
            long j4 = j - 1;
            this.f5261a = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
            C1131a aVar = this.f5262b;
            if (aVar != null) {
                if (aVar.mo5702d(0)) {
                    mo5706h(63);
                }
                this.f5262b.mo5704f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5705g() {
            this.f5261a = 0;
            C1131a aVar = this.f5262b;
            if (aVar != null) {
                aVar.mo5705g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5706h(int i) {
            if (i >= 64) {
                m6292c();
                this.f5262b.mo5706h(i - 64);
                return;
            }
            this.f5261a |= 1 << i;
        }

        public String toString() {
            if (this.f5262b == null) {
                return Long.toBinaryString(this.f5261a);
            }
            return this.f5262b.toString() + "xx" + Long.toBinaryString(this.f5261a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* compiled from: ChildHelper */
    interface C1132b {
        /* renamed from: a */
        View mo5304a(int i);

        void addView(View view, int i);

        /* renamed from: b */
        void mo5306b(View view);

        /* renamed from: c */
        int mo5307c();

        /* renamed from: d */
        void mo5308d();

        /* renamed from: e */
        int mo5309e(View view);

        /* renamed from: f */
        RecyclerView.C1087c0 mo5310f(View view);

        /* renamed from: g */
        void mo5311g(int i);

        /* renamed from: h */
        void mo5312h(View view);

        /* renamed from: i */
        void mo5313i(int i);

        /* renamed from: j */
        void mo5314j(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    C1130b(C1132b bVar) {
        this.f5258a = bVar;
    }

    /* renamed from: h */
    private int m6272h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.f5258a.mo5307c();
        int i2 = i;
        while (i2 < c) {
            int b = i - (i2 - this.f5259b.mo5701b(i2));
            if (b == 0) {
                while (this.f5259b.mo5702d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m6273l(View view) {
        this.f5260c.add(view);
        this.f5258a.mo5306b(view);
    }

    /* renamed from: t */
    private boolean m6274t(View view) {
        if (!this.f5260c.remove(view)) {
            return false;
        }
        this.f5258a.mo5312h(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5682a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5258a.mo5307c();
        } else {
            i2 = m6272h(i);
        }
        this.f5259b.mo5703e(i2, z);
        if (z) {
            m6273l(view);
        }
        this.f5258a.addView(view, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5683b(View view, boolean z) {
        mo5682a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5684c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5258a.mo5307c();
        } else {
            i2 = m6272h(i);
        }
        this.f5259b.mo5703e(i2, z);
        if (z) {
            m6273l(view);
        }
        this.f5258a.mo5314j(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5685d(int i) {
        int h = m6272h(i);
        this.f5259b.mo5704f(h);
        this.f5258a.mo5311g(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo5686e(int i) {
        int size = this.f5260c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f5260c.get(i2);
            RecyclerView.C1087c0 f = this.f5258a.mo5310f(view);
            if (f.getLayoutPosition() == i && !f.isInvalid() && !f.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo5687f(int i) {
        return this.f5258a.mo5304a(m6272h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5688g() {
        return this.f5258a.mo5307c() - this.f5260c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo5689i(int i) {
        return this.f5258a.mo5304a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo5690j() {
        return this.f5258a.mo5307c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5691k(View view) {
        int e = this.f5258a.mo5309e(view);
        if (e >= 0) {
            this.f5259b.mo5706h(e);
            m6273l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5692m(View view) {
        int e = this.f5258a.mo5309e(view);
        if (e != -1 && !this.f5259b.mo5702d(e)) {
            return e - this.f5259b.mo5701b(e);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo5693n(View view) {
        return this.f5260c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5694o() {
        this.f5259b.mo5705g();
        for (int size = this.f5260c.size() - 1; size >= 0; size--) {
            this.f5258a.mo5312h(this.f5260c.get(size));
            this.f5260c.remove(size);
        }
        this.f5258a.mo5308d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5695p(View view) {
        int e = this.f5258a.mo5309e(view);
        if (e >= 0) {
            if (this.f5259b.mo5704f(e)) {
                m6274t(view);
            }
            this.f5258a.mo5313i(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5696q(int i) {
        int h = m6272h(i);
        View a = this.f5258a.mo5304a(h);
        if (a != null) {
            if (this.f5259b.mo5704f(h)) {
                m6274t(a);
            }
            this.f5258a.mo5313i(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5697r(View view) {
        int e = this.f5258a.mo5309e(view);
        if (e == -1) {
            m6274t(view);
            return true;
        } else if (!this.f5259b.mo5702d(e)) {
            return false;
        } else {
            this.f5259b.mo5704f(e);
            m6274t(view);
            this.f5258a.mo5313i(e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5698s(View view) {
        int e = this.f5258a.mo5309e(view);
        if (e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f5259b.mo5702d(e)) {
            this.f5259b.mo5700a(e);
            m6274t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f5259b.toString() + ", hidden list:" + this.f5260c.size();
    }
}
