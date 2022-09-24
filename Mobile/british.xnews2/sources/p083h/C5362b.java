package p083h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p062d0.C5135a;

/* renamed from: h.b */
/* compiled from: DrawableContainer */
class C5362b extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    private C5365c f23586b;

    /* renamed from: c */
    private Rect f23587c;

    /* renamed from: d */
    private Drawable f23588d;

    /* renamed from: e */
    private Drawable f23589e;

    /* renamed from: f */
    private int f23590f = 255;

    /* renamed from: g */
    private boolean f23591g;

    /* renamed from: h */
    private int f23592h = -1;

    /* renamed from: i */
    private boolean f23593i;

    /* renamed from: j */
    private Runnable f23594j;

    /* renamed from: k */
    private long f23595k;

    /* renamed from: l */
    private long f23596l;

    /* renamed from: m */
    private C5364b f23597m;

    /* renamed from: h.b$a */
    /* compiled from: DrawableContainer */
    class C5363a implements Runnable {
        C5363a() {
        }

        public void run() {
            C5362b.this.mo21713a(true);
            C5362b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b */
    /* compiled from: DrawableContainer */
    static class C5364b implements Drawable.Callback {

        /* renamed from: b */
        private Drawable.Callback f23599b;

        C5364b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo21721a() {
            Drawable.Callback callback = this.f23599b;
            this.f23599b = null;
            return callback;
        }

        /* renamed from: b */
        public C5364b mo21722b(Drawable.Callback callback) {
            this.f23599b = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f23599b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f23599b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: h.b$c */
    /* compiled from: DrawableContainer */
    static abstract class C5365c extends Drawable.ConstantState {

        /* renamed from: A */
        int f23600A;

        /* renamed from: B */
        int f23601B;

        /* renamed from: C */
        boolean f23602C;

        /* renamed from: D */
        ColorFilter f23603D;

        /* renamed from: E */
        boolean f23604E;

        /* renamed from: F */
        ColorStateList f23605F;

        /* renamed from: G */
        PorterDuff.Mode f23606G;

        /* renamed from: H */
        boolean f23607H;

        /* renamed from: I */
        boolean f23608I;

        /* renamed from: a */
        final C5362b f23609a;

        /* renamed from: b */
        Resources f23610b;

        /* renamed from: c */
        int f23611c = 160;

        /* renamed from: d */
        int f23612d;

        /* renamed from: e */
        int f23613e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f23614f;

        /* renamed from: g */
        Drawable[] f23615g;

        /* renamed from: h */
        int f23616h;

        /* renamed from: i */
        boolean f23617i;

        /* renamed from: j */
        boolean f23618j;

        /* renamed from: k */
        Rect f23619k;

        /* renamed from: l */
        boolean f23620l;

        /* renamed from: m */
        boolean f23621m;

        /* renamed from: n */
        int f23622n;

        /* renamed from: o */
        int f23623o;

        /* renamed from: p */
        int f23624p;

        /* renamed from: q */
        int f23625q;

        /* renamed from: r */
        boolean f23626r;

        /* renamed from: s */
        int f23627s;

        /* renamed from: t */
        boolean f23628t;

        /* renamed from: u */
        boolean f23629u;

        /* renamed from: v */
        boolean f23630v;

        /* renamed from: w */
        boolean f23631w;

        /* renamed from: x */
        boolean f23632x;

        /* renamed from: y */
        boolean f23633y;

        /* renamed from: z */
        int f23634z;

        C5365c(C5365c cVar, C5362b bVar, Resources resources) {
            Resources resources2;
            this.f23617i = false;
            this.f23620l = false;
            this.f23632x = true;
            this.f23600A = 0;
            this.f23601B = 0;
            this.f23609a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f23610b : null;
            }
            this.f23610b = resources2;
            int f = C5362b.m24139f(resources, cVar != null ? cVar.f23611c : 0);
            this.f23611c = f;
            if (cVar != null) {
                this.f23612d = cVar.f23612d;
                this.f23613e = cVar.f23613e;
                this.f23630v = true;
                this.f23631w = true;
                this.f23617i = cVar.f23617i;
                this.f23620l = cVar.f23620l;
                this.f23632x = cVar.f23632x;
                this.f23633y = cVar.f23633y;
                this.f23634z = cVar.f23634z;
                this.f23600A = cVar.f23600A;
                this.f23601B = cVar.f23601B;
                this.f23602C = cVar.f23602C;
                this.f23603D = cVar.f23603D;
                this.f23604E = cVar.f23604E;
                this.f23605F = cVar.f23605F;
                this.f23606G = cVar.f23606G;
                this.f23607H = cVar.f23607H;
                this.f23608I = cVar.f23608I;
                if (cVar.f23611c == f) {
                    if (cVar.f23618j) {
                        this.f23619k = new Rect(cVar.f23619k);
                        this.f23618j = true;
                    }
                    if (cVar.f23621m) {
                        this.f23622n = cVar.f23622n;
                        this.f23623o = cVar.f23623o;
                        this.f23624p = cVar.f23624p;
                        this.f23625q = cVar.f23625q;
                        this.f23621m = true;
                    }
                }
                if (cVar.f23626r) {
                    this.f23627s = cVar.f23627s;
                    this.f23626r = true;
                }
                if (cVar.f23628t) {
                    this.f23629u = cVar.f23629u;
                    this.f23628t = true;
                }
                Drawable[] drawableArr = cVar.f23615g;
                this.f23615g = new Drawable[drawableArr.length];
                this.f23616h = cVar.f23616h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f23614f;
                if (sparseArray != null) {
                    this.f23614f = sparseArray.clone();
                } else {
                    this.f23614f = new SparseArray<>(this.f23616h);
                }
                int i = this.f23616h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f23614f.put(i2, constantState);
                        } else {
                            this.f23615g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f23615g = new Drawable[10];
            this.f23616h = 0;
        }

        /* renamed from: e */
        private void m24148e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f23614f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f23615g[this.f23614f.keyAt(i)] = m24149s(this.f23614f.valueAt(i).newDrawable(this.f23610b));
                }
                this.f23614f = null;
            }
        }

        /* renamed from: s */
        private Drawable m24149s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f23634z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f23609a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo21726a(Drawable drawable) {
            int i = this.f23616h;
            if (i >= this.f23615g.length) {
                mo21741o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f23609a);
            this.f23615g[i] = drawable;
            this.f23616h++;
            this.f23613e = drawable.getChangingConfigurations() | this.f23613e;
            mo21742p();
            this.f23619k = null;
            this.f23618j = false;
            this.f23621m = false;
            this.f23630v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo21727b(Resources.Theme theme) {
            if (theme != null) {
                m24148e();
                int i = this.f23616h;
                Drawable[] drawableArr = this.f23615g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f23613e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo21749y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean mo21728c() {
            if (this.f23630v) {
                return this.f23631w;
            }
            m24148e();
            this.f23630v = true;
            int i = this.f23616h;
            Drawable[] drawableArr = this.f23615g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f23631w = false;
                    return false;
                }
            }
            this.f23631w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f23616h;
            Drawable[] drawableArr = this.f23615g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f23614f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo21730d() {
            this.f23621m = true;
            m24148e();
            int i = this.f23616h;
            Drawable[] drawableArr = this.f23615g;
            this.f23623o = -1;
            this.f23622n = -1;
            this.f23625q = 0;
            this.f23624p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f23622n) {
                    this.f23622n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f23623o) {
                    this.f23623o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f23624p) {
                    this.f23624p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f23625q) {
                    this.f23625q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo21731f() {
            return this.f23615g.length;
        }

        /* renamed from: g */
        public final Drawable mo21732g(int i) {
            int indexOfKey;
            Drawable drawable = this.f23615g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f23614f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m24149s(this.f23614f.valueAt(indexOfKey).newDrawable(this.f23610b));
            this.f23615g[i] = s;
            this.f23614f.removeAt(indexOfKey);
            if (this.f23614f.size() == 0) {
                this.f23614f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f23612d | this.f23613e;
        }

        /* renamed from: h */
        public final int mo21734h() {
            return this.f23616h;
        }

        /* renamed from: i */
        public final int mo21735i() {
            if (!this.f23621m) {
                mo21730d();
            }
            return this.f23623o;
        }

        /* renamed from: j */
        public final int mo21736j() {
            if (!this.f23621m) {
                mo21730d();
            }
            return this.f23625q;
        }

        /* renamed from: k */
        public final int mo21737k() {
            if (!this.f23621m) {
                mo21730d();
            }
            return this.f23624p;
        }

        /* renamed from: l */
        public final Rect mo21738l() {
            Rect rect = null;
            if (this.f23617i) {
                return null;
            }
            Rect rect2 = this.f23619k;
            if (rect2 != null || this.f23618j) {
                return rect2;
            }
            m24148e();
            Rect rect3 = new Rect();
            int i = this.f23616h;
            Drawable[] drawableArr = this.f23615g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f23618j = true;
            this.f23619k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo21739m() {
            if (!this.f23621m) {
                mo21730d();
            }
            return this.f23622n;
        }

        /* renamed from: n */
        public final int mo21740n() {
            if (this.f23626r) {
                return this.f23627s;
            }
            m24148e();
            int i = this.f23616h;
            Drawable[] drawableArr = this.f23615g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f23627s = opacity;
            this.f23626r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo21741o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f23615g, 0, drawableArr, 0, i);
            this.f23615g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo21742p() {
            this.f23626r = false;
            this.f23628t = false;
        }

        /* renamed from: q */
        public final boolean mo21743q() {
            return this.f23620l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo21707r();

        /* renamed from: t */
        public final void mo21744t(boolean z) {
            this.f23620l = z;
        }

        /* renamed from: u */
        public final void mo21745u(int i) {
            this.f23600A = i;
        }

        /* renamed from: v */
        public final void mo21746v(int i) {
            this.f23601B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo21747w(int i, int i2) {
            int i3 = this.f23616h;
            Drawable[] drawableArr = this.f23615g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f23634z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo21748x(boolean z) {
            this.f23617i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo21749y(Resources resources) {
            if (resources != null) {
                this.f23610b = resources;
                int f = C5362b.m24139f(resources, this.f23611c);
                int i = this.f23611c;
                this.f23611c = f;
                if (i != f) {
                    this.f23621m = false;
                    this.f23618j = false;
                }
            }
        }
    }

    C5362b() {
    }

    /* renamed from: d */
    private void m24137d(Drawable drawable) {
        if (this.f23597m == null) {
            this.f23597m = new C5364b();
        }
        drawable.setCallback(this.f23597m.mo21722b(drawable.getCallback()));
        try {
            if (this.f23586b.f23600A <= 0 && this.f23591g) {
                drawable.setAlpha(this.f23590f);
            }
            C5365c cVar = this.f23586b;
            if (cVar.f23604E) {
                drawable.setColorFilter(cVar.f23603D);
            } else {
                if (cVar.f23607H) {
                    C5135a.m23415o(drawable, cVar.f23605F);
                }
                C5365c cVar2 = this.f23586b;
                if (cVar2.f23608I) {
                    C5135a.m23416p(drawable, cVar2.f23606G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f23586b.f23632x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f23586b.f23602C);
            }
            Rect rect = this.f23587c;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f23597m.mo21721a());
        }
    }

    /* renamed from: e */
    private boolean m24138e() {
        if (!isAutoMirrored() || C5135a.m23406f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    static int m24139f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21713a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f23591g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f23588d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f23595k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f23590f
            r3.setAlpha(r9)
            r13.f23595k = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            h.b$c r9 = r13.f23586b
            int r9 = r9.f23600A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f23590f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f23595k = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f23589e
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f23596l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f23589e = r0
            r13.f23596l = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$c r4 = r13.f23586b
            int r4 = r4.f23601B
            int r3 = r3 / r4
            int r4 = r13.f23590f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f23596l = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f23594j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p083h.C5362b.mo21713a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f23586b.mo21727b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5365c mo21662b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo21714c() {
        return this.f23592h;
    }

    public boolean canApplyTheme() {
        return this.f23586b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f23589e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21715g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f23592h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$c r0 = r9.f23586b
            int r0 = r0.f23601B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f23589e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f23588d
            if (r0 == 0) goto L_0x0029
            r9.f23589e = r0
            h.b$c r0 = r9.f23586b
            int r0 = r0.f23601B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f23596l = r0
            goto L_0x0035
        L_0x0029:
            r9.f23589e = r4
            r9.f23596l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f23588d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            h.b$c r0 = r9.f23586b
            int r1 = r0.f23616h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo21732g(r10)
            r9.f23588d = r0
            r9.f23592h = r10
            if (r0 == 0) goto L_0x005a
            h.b$c r10 = r9.f23586b
            int r10 = r10.f23600A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f23595k = r2
        L_0x0051:
            r9.m24137d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f23588d = r4
            r10 = -1
            r9.f23592h = r10
        L_0x005a:
            long r0 = r9.f23595k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f23596l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f23594j
            if (r0 != 0) goto L_0x0073
            h.b$a r0 = new h.b$a
            r0.<init>()
            r9.f23594j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo21713a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p083h.C5362b.mo21715g(int):boolean");
    }

    public int getAlpha() {
        return this.f23590f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f23586b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f23586b.mo21728c()) {
            return null;
        }
        this.f23586b.f23612d = getChangingConfigurations();
        return this.f23586b;
    }

    public Drawable getCurrent() {
        return this.f23588d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f23587c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f23586b.mo21743q()) {
            return this.f23586b.mo21735i();
        }
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f23586b.mo21743q()) {
            return this.f23586b.mo21739m();
        }
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f23586b.mo21743q()) {
            return this.f23586b.mo21736j();
        }
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f23586b.mo21743q()) {
            return this.f23586b.mo21737k();
        }
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f23588d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f23586b.mo21740n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f23586b.mo21738l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f23588d;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m24138e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo21676h(C5365c cVar) {
        this.f23586b = cVar;
        int i = this.f23592h;
        if (i >= 0) {
            Drawable g = cVar.mo21732g(i);
            this.f23588d = g;
            if (g != null) {
                m24137d(g);
            }
        }
        this.f23589e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo21717i(Resources resources) {
        this.f23586b.mo21749y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C5365c cVar = this.f23586b;
        if (cVar != null) {
            cVar.mo21742p();
        }
        if (drawable == this.f23588d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f23586b.f23602C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f23589e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f23589e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f23588d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f23591g) {
                this.f23588d.setAlpha(this.f23590f);
            }
        }
        if (this.f23596l != 0) {
            this.f23596l = 0;
            z = true;
        }
        if (this.f23595k != 0) {
            this.f23595k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f23593i && super.mutate() == this) {
            C5365c b = mo21662b();
            b.mo21707r();
            mo21676h(b);
            this.f23593i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23589e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f23588d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f23586b.mo21747w(i, mo21714c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f23589e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f23588d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f23589e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f23588d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f23588d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f23591g || this.f23590f != i) {
            this.f23591g = true;
            this.f23590f = i;
            Drawable drawable = this.f23588d;
            if (drawable == null) {
                return;
            }
            if (this.f23595k == 0) {
                drawable.setAlpha(i);
            } else {
                mo21713a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C5365c cVar = this.f23586b;
        if (cVar.f23602C != z) {
            cVar.f23602C = z;
            Drawable drawable = this.f23588d;
            if (drawable != null) {
                C5135a.m23410j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C5365c cVar = this.f23586b;
        cVar.f23604E = true;
        if (cVar.f23603D != colorFilter) {
            cVar.f23603D = colorFilter;
            Drawable drawable = this.f23588d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C5365c cVar = this.f23586b;
        if (cVar.f23632x != z) {
            cVar.f23632x = z;
            Drawable drawable = this.f23588d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            C5135a.m23411k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f23587c;
        if (rect == null) {
            this.f23587c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f23588d;
        if (drawable != null) {
            C5135a.m23412l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C5365c cVar = this.f23586b;
        cVar.f23607H = true;
        if (cVar.f23605F != colorStateList) {
            cVar.f23605F = colorStateList;
            C5135a.m23415o(this.f23588d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C5365c cVar = this.f23586b;
        cVar.f23608I = true;
        if (cVar.f23606G != mode) {
            cVar.f23606G = mode;
            C5135a.m23416p(this.f23588d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f23589e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f23588d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f23588d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
