package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.widget.C0616c;
import p063d0.C5135a;

/* renamed from: androidx.appcompat.widget.e */
/* compiled from: AppCompatCompoundButtonHelper */
class C0380e {

    /* renamed from: a */
    private final CompoundButton f1544a;

    /* renamed from: b */
    private ColorStateList f1545b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1546c = null;

    /* renamed from: d */
    private boolean f1547d = false;

    /* renamed from: e */
    private boolean f1548e = false;

    /* renamed from: f */
    private boolean f1549f;

    C0380e(CompoundButton compoundButton) {
        this.f1544a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2077a() {
        Drawable a = C0616c.m3434a(this.f1544a);
        if (a == null) {
            return;
        }
        if (this.f1547d || this.f1548e) {
            Drawable mutate = C5135a.m23418r(a).mutate();
            if (this.f1547d) {
                C5135a.m23415o(mutate, this.f1545b);
            }
            if (this.f1548e) {
                C5135a.m23416p(mutate, this.f1546c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1544a.getDrawableState());
            }
            this.f1544a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0616c.m3434a(r2.f1544a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo2078b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1544a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0616c.m3434a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0380e.mo2078b(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2079c() {
        return this.f1545b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2080d() {
        return this.f1546c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2081e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1544a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p073f.C5247j.f23076T0
            r8 = 0
            androidx.appcompat.widget.f0 r0 = androidx.appcompat.widget.C0384f0.m1994v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1544a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo2112r()
            r7 = 0
            r4 = r10
            r6 = r11
            p111m0.C5723u.m25326m0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p073f.C5247j.f23086V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2113s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo2108n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1544a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p079g.C5264a.m23789d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p073f.C5247j.f23081U0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2113s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo2108n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1544a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p079g.C5264a.m23789d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p073f.C5247j.f23091W0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2113s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1544a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo2097c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0616c.m3436c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p073f.C5247j.f23096X0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2113s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1544a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo2105k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0409p.m2201e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0616c.m3437d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo2114w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo2114w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0380e.mo2081e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2082f() {
        if (this.f1549f) {
            this.f1549f = false;
            return;
        }
        this.f1549f = true;
        mo2077a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2083g(ColorStateList colorStateList) {
        this.f1545b = colorStateList;
        this.f1547d = true;
        mo2077a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2084h(PorterDuff.Mode mode) {
        this.f1546c = mode;
        this.f1548e = true;
        mo2077a();
    }
}
