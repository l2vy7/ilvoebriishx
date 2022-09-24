package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
/* compiled from: ScrollEventAdapter */
final class C1410e extends RecyclerView.C1112t {

    /* renamed from: a */
    private ViewPager2.C1396i f6248a;

    /* renamed from: b */
    private final ViewPager2 f6249b;

    /* renamed from: c */
    private final RecyclerView f6250c;

    /* renamed from: d */
    private final LinearLayoutManager f6251d;

    /* renamed from: e */
    private int f6252e;

    /* renamed from: f */
    private int f6253f;

    /* renamed from: g */
    private C1411a f6254g = new C1411a();

    /* renamed from: h */
    private int f6255h;

    /* renamed from: i */
    private int f6256i;

    /* renamed from: j */
    private boolean f6257j;

    /* renamed from: k */
    private boolean f6258k;

    /* renamed from: l */
    private boolean f6259l;

    /* renamed from: m */
    private boolean f6260m;

    /* renamed from: androidx.viewpager2.widget.e$a */
    /* compiled from: ScrollEventAdapter */
    private static final class C1411a {

        /* renamed from: a */
        int f6261a;

        /* renamed from: b */
        float f6262b;

        /* renamed from: c */
        int f6263c;

        C1411a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6803a() {
            this.f6261a = -1;
            this.f6262b = 0.0f;
            this.f6263c = 0;
        }
    }

    C1410e(ViewPager2 viewPager2) {
        this.f6249b = viewPager2;
        RecyclerView recyclerView = viewPager2.f6207k;
        this.f6250c = recyclerView;
        this.f6251d = (LinearLayoutManager) recyclerView.getLayoutManager();
        m7493n();
    }

    /* renamed from: c */
    private void m7488c(int i, float f, int i2) {
        ViewPager2.C1396i iVar = this.f6248a;
        if (iVar != null) {
            iVar.mo6782b(i, f, i2);
        }
    }

    /* renamed from: d */
    private void m7489d(int i) {
        ViewPager2.C1396i iVar = this.f6248a;
        if (iVar != null) {
            iVar.mo6762c(i);
        }
    }

    /* renamed from: e */
    private void m7490e(int i) {
        if ((this.f6252e != 3 || this.f6253f != 0) && this.f6253f != i) {
            this.f6253f = i;
            ViewPager2.C1396i iVar = this.f6248a;
            if (iVar != null) {
                iVar.mo6761a(i);
            }
        }
    }

    /* renamed from: f */
    private int m7491f() {
        return this.f6251d.mo5023Y1();
    }

    /* renamed from: k */
    private boolean m7492k() {
        int i = this.f6252e;
        return i == 1 || i == 4;
    }

    /* renamed from: n */
    private void m7493n() {
        this.f6252e = 0;
        this.f6253f = 0;
        this.f6254g.mo6803a();
        this.f6255h = -1;
        this.f6256i = -1;
        this.f6257j = false;
        this.f6258k = false;
        this.f6260m = false;
        this.f6259l = false;
    }

    /* renamed from: p */
    private void m7494p(boolean z) {
        this.f6260m = z;
        this.f6252e = z ? 4 : 1;
        int i = this.f6256i;
        if (i != -1) {
            this.f6255h = i;
            this.f6256i = -1;
        } else if (this.f6255h == -1) {
            this.f6255h = m7491f();
        }
        m7490e(1);
    }

    /* renamed from: q */
    private void m7495q() {
        int i;
        C1411a aVar = this.f6254g;
        int Y1 = this.f6251d.mo5023Y1();
        aVar.f6261a = Y1;
        if (Y1 == -1) {
            aVar.mo6803a();
            return;
        }
        View C = this.f6251d.mo5011C(Y1);
        if (C == null) {
            aVar.mo6803a();
            return;
        }
        int a0 = this.f6251d.mo5442a0(C);
        int j0 = this.f6251d.mo5464j0(C);
        int m0 = this.f6251d.mo5469m0(C);
        int H = this.f6251d.mo5415H(C);
        ViewGroup.LayoutParams layoutParams = C.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            a0 += marginLayoutParams.leftMargin;
            j0 += marginLayoutParams.rightMargin;
            m0 += marginLayoutParams.topMargin;
            H += marginLayoutParams.bottomMargin;
        }
        int height = C.getHeight() + m0 + H;
        int width = C.getWidth() + a0 + j0;
        if (this.f6251d.mo5034l2() == 0) {
            i = (C.getLeft() - a0) - this.f6250c.getPaddingLeft();
            if (this.f6249b.mo6725d()) {
                i = -i;
            }
            height = width;
        } else {
            i = (C.getTop() - m0) - this.f6250c.getPaddingTop();
        }
        int i2 = -i;
        aVar.f6263c = i2;
        if (i2 >= 0) {
            aVar.f6262b = height == 0 ? 0.0f : ((float) i2) / ((float) height);
        } else if (new C1405a(this.f6251d).mo6789d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f6263c)}));
        }
    }

    /* renamed from: a */
    public void mo5505a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f6252e == 1 && this.f6253f == 1) && i == 1) {
            m7494p(false);
        } else if (!m7492k() || i != 2) {
            if (m7492k() && i == 0) {
                m7495q();
                if (!this.f6258k) {
                    int i2 = this.f6254g.f6261a;
                    if (i2 != -1) {
                        m7488c(i2, 0.0f, 0);
                    }
                } else {
                    C1411a aVar = this.f6254g;
                    if (aVar.f6263c == 0) {
                        int i3 = this.f6255h;
                        int i4 = aVar.f6261a;
                        if (i3 != i4) {
                            m7489d(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m7490e(0);
                    m7493n();
                }
            }
            if (this.f6252e == 2 && i == 0 && this.f6259l) {
                m7495q();
                C1411a aVar2 = this.f6254g;
                if (aVar2.f6263c == 0) {
                    int i5 = this.f6256i;
                    int i6 = aVar2.f6261a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m7489d(i6);
                    }
                    m7490e(0);
                    m7493n();
                }
            }
        } else if (this.f6258k) {
            m7490e(2);
            this.f6257j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f6249b.mo6725d()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5506b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f6258k = r4
            r3.m7495q()
            boolean r0 = r3.f6257j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.f6257j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f6249b
            boolean r6 = r6.mo6725d()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.f6254g
            int r6 = r5.f6263c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f6261a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.f6254g
            int r5 = r5.f6261a
        L_0x0033:
            r3.f6256i = r5
            int r6 = r3.f6255h
            if (r6 == r5) goto L_0x004b
            r3.m7489d(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f6252e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.e$a r5 = r3.f6254g
            int r5 = r5.f6261a
            if (r5 != r1) goto L_0x0048
            r5 = 0
        L_0x0048:
            r3.m7489d(r5)
        L_0x004b:
            androidx.viewpager2.widget.e$a r5 = r3.f6254g
            int r6 = r5.f6261a
            if (r6 != r1) goto L_0x0052
            r6 = 0
        L_0x0052:
            float r0 = r5.f6262b
            int r5 = r5.f6263c
            r3.m7488c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f6254g
            int r6 = r5.f6261a
            int r0 = r3.f6256i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f6263c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f6253f
            if (r5 == r4) goto L_0x0071
            r3.m7490e(r2)
            r3.m7493n()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1410e.mo5506b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public double mo6796g() {
        m7495q();
        C1411a aVar = this.f6254g;
        double d = (double) aVar.f6261a;
        double d2 = (double) aVar.f6262b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d + d2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo6797h() {
        return this.f6253f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6798i() {
        return this.f6260m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo6799j() {
        return this.f6253f == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6800l() {
        this.f6259l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6801m(int i, boolean z) {
        this.f6252e = z ? 2 : 3;
        boolean z2 = false;
        this.f6260m = false;
        if (this.f6256i != i) {
            z2 = true;
        }
        this.f6256i = i;
        m7490e(2);
        if (z2) {
            m7489d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6802o(ViewPager2.C1396i iVar) {
        this.f6248a = iVar;
    }
}
