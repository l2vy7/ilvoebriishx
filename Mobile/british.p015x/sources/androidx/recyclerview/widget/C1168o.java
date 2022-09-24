package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: ViewBoundsCheck */
class C1168o {

    /* renamed from: a */
    final C1170b f5399a;

    /* renamed from: b */
    C1169a f5400b = new C1169a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* compiled from: ViewBoundsCheck */
    static class C1169a {

        /* renamed from: a */
        int f5401a = 0;

        /* renamed from: b */
        int f5402b;

        /* renamed from: c */
        int f5403c;

        /* renamed from: d */
        int f5404d;

        /* renamed from: e */
        int f5405e;

        C1169a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5820a(int i) {
            this.f5401a = i | this.f5401a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5821b() {
            int i = this.f5401a;
            if ((i & 7) != 0 && (i & (mo5822c(this.f5404d, this.f5402b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f5401a;
            if ((i2 & 112) != 0 && (i2 & (mo5822c(this.f5404d, this.f5403c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f5401a;
            if ((i3 & 1792) != 0 && (i3 & (mo5822c(this.f5405e, this.f5402b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f5401a;
            if ((i4 & 28672) == 0 || (i4 & (mo5822c(this.f5405e, this.f5403c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5822c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5823d() {
            this.f5401a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5824e(int i, int i2, int i3, int i4) {
            this.f5402b = i;
            this.f5403c = i2;
            this.f5404d = i3;
            this.f5405e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* compiled from: ViewBoundsCheck */
    interface C1170b {
        /* renamed from: a */
        View mo5493a(int i);

        /* renamed from: b */
        int mo5494b(View view);

        /* renamed from: c */
        int mo5495c();

        /* renamed from: d */
        int mo5496d();

        /* renamed from: e */
        int mo5497e(View view);
    }

    C1168o(C1170b bVar) {
        this.f5399a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5818a(int i, int i2, int i3, int i4) {
        int c = this.f5399a.mo5495c();
        int d = this.f5399a.mo5496d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f5399a.mo5493a(i);
            this.f5400b.mo5824e(c, d, this.f5399a.mo5494b(a), this.f5399a.mo5497e(a));
            if (i3 != 0) {
                this.f5400b.mo5823d();
                this.f5400b.mo5820a(i3);
                if (this.f5400b.mo5821b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f5400b.mo5823d();
                this.f5400b.mo5820a(i4);
                if (this.f5400b.mo5821b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5819b(View view, int i) {
        this.f5400b.mo5824e(this.f5399a.mo5495c(), this.f5399a.mo5496d(), this.f5399a.mo5494b(view), this.f5399a.mo5497e(view));
        if (i == 0) {
            return false;
        }
        this.f5400b.mo5823d();
        this.f5400b.mo5820a(i);
        return this.f5400b.mo5821b();
    }
}
