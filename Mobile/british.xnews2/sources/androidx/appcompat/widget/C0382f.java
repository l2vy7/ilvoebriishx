package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0421v;
import p016c0.C2617a;
import p072f.C5238a;
import p072f.C5240c;
import p072f.C5241d;
import p072f.C5242e;
import p078g.C5264a;

/* renamed from: androidx.appcompat.widget.f */
/* compiled from: AppCompatDrawableManager */
public final class C0382f {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1551b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0382f f1552c;

    /* renamed from: a */
    private C0421v f1553a;

    /* renamed from: androidx.appcompat.widget.f$a */
    /* compiled from: AppCompatDrawableManager */
    class C0383a implements C0421v.C0427f {

        /* renamed from: a */
        private final int[] f1554a = {C5242e.f22864R, C5242e.f22862P, C5242e.f22866a};

        /* renamed from: b */
        private final int[] f1555b = {C5242e.f22880o, C5242e.f22853B, C5242e.f22885t, C5242e.f22881p, C5242e.f22882q, C5242e.f22884s, C5242e.f22883r};

        /* renamed from: c */
        private final int[] f1556c = {C5242e.f22861O, C5242e.f22863Q, C5242e.f22876k, C5242e.f22860K, C5242e.abc_text_select_handle_left_mtrl, C5242e.abc_text_select_handle_middle_mtrl, C5242e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        private final int[] f1557d = {C5242e.f22888w, C5242e.f22874i, C5242e.f22887v};

        /* renamed from: e */
        private final int[] f1558e = {C5242e.f22859J, C5242e.f22865S};

        /* renamed from: f */
        private final int[] f1559f = {C5242e.f22868c, C5242e.f22872g, C5242e.f22869d, C5242e.f22873h};

        C0383a() {
        }

        /* renamed from: f */
        private boolean m1979f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1980g(Context context) {
            return m1981h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1981h(Context context, int i) {
            int c = C0373a0.m1944c(context, C5238a.f22826v);
            int b = C0373a0.m1943b(context, C5238a.f22824t);
            return new ColorStateList(new int[][]{C0373a0.f1520b, C0373a0.f1523e, C0373a0.f1521c, C0373a0.f1527i}, new int[]{b, C2617a.m9115i(c, i), C2617a.m9115i(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1982i(Context context) {
            return m1981h(context, C0373a0.m1944c(context, C5238a.f22823s));
        }

        /* renamed from: j */
        private ColorStateList m1983j(Context context) {
            return m1981h(context, C0373a0.m1944c(context, C5238a.f22824t));
        }

        /* renamed from: k */
        private ColorStateList m1984k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C5238a.f22830z;
            ColorStateList e = C0373a0.m1946e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0373a0.f1520b;
                iArr2[0] = C0373a0.m1943b(context, i);
                iArr[1] = C0373a0.f1524f;
                iArr2[1] = C0373a0.m1944c(context, C5238a.f22825u);
                iArr[2] = C0373a0.f1527i;
                iArr2[2] = C0373a0.m1944c(context, i);
            } else {
                iArr[0] = C0373a0.f1520b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0373a0.f1524f;
                iArr2[1] = C0373a0.m1944c(context, C5238a.f22825u);
                iArr[2] = C0373a0.f1527i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1985l(C0421v vVar, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = vVar.mo2259j(context, C5242e.abc_star_black_48dp);
            Drawable j2 = vVar.mo2259j(context, C5242e.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1986m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0409p.m2197a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0382f.f1551b;
            }
            drawable.setColorFilter(C0382f.m1972e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2090a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0382f.f1551b
                int[] r1 = r6.f1554a
                boolean r1 = r6.m1979f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p072f.C5238a.f22827w
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1556c
                boolean r1 = r6.m1979f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p072f.C5238a.f22825u
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1557d
                boolean r1 = r6.m1979f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p072f.C5242e.f22886u
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p072f.C5242e.f22877l
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0409p.m2197a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0373a0.m1944c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0382f.m1972e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0382f.C0383a.mo2090a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo2091b(int i) {
            if (i == C5242e.f22857H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo2092c(C0421v vVar, Context context, int i) {
            if (i == C5242e.f22875j) {
                return new LayerDrawable(new Drawable[]{vVar.mo2259j(context, C5242e.f22874i), vVar.mo2259j(context, C5242e.f22876k)});
            } else if (i == C5242e.f22890y) {
                return m1985l(vVar, context, C5241d.abc_star_big);
            } else {
                if (i == C5242e.f22889x) {
                    return m1985l(vVar, context, C5241d.abc_star_medium);
                }
                if (i == C5242e.f22891z) {
                    return m1985l(vVar, context, C5241d.abc_star_small);
                }
                return null;
            }
        }

        /* renamed from: d */
        public ColorStateList mo2093d(Context context, int i) {
            if (i == C5242e.f22878m) {
                return C5264a.m23788c(context, C5240c.f22836e);
            }
            if (i == C5242e.f22858I) {
                return C5264a.m23788c(context, C5240c.f22839h);
            }
            if (i == C5242e.f22857H) {
                return m1984k(context);
            }
            if (i == C5242e.f22871f) {
                return m1983j(context);
            }
            if (i == C5242e.f22867b) {
                return m1980g(context);
            }
            if (i == C5242e.f22870e) {
                return m1982i(context);
            }
            if (i == C5242e.f22855D || i == C5242e.f22856E) {
                return C5264a.m23788c(context, C5240c.f22838g);
            }
            if (m1979f(this.f1555b, i)) {
                return C0373a0.m1946e(context, C5238a.f22827w);
            }
            if (m1979f(this.f1558e, i)) {
                return C5264a.m23788c(context, C5240c.f22835d);
            }
            if (m1979f(this.f1559f, i)) {
                return C5264a.m23788c(context, C5240c.f22834c);
            }
            if (i == C5242e.f22852A) {
                return C5264a.m23788c(context, C5240c.f22837f);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2094e(Context context, int i, Drawable drawable) {
            if (i == C5242e.f22854C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C5238a.f22827w;
                m1986m(findDrawableByLayerId, C0373a0.m1944c(context, i2), C0382f.f1551b);
                m1986m(layerDrawable.findDrawableByLayerId(16908303), C0373a0.m1944c(context, i2), C0382f.f1551b);
                m1986m(layerDrawable.findDrawableByLayerId(16908301), C0373a0.m1944c(context, C5238a.f22825u), C0382f.f1551b);
                return true;
            } else if (i != C5242e.f22890y && i != C5242e.f22889x && i != C5242e.f22891z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1986m(layerDrawable2.findDrawableByLayerId(16908288), C0373a0.m1943b(context, C5238a.f22827w), C0382f.f1551b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C5238a.f22825u;
                m1986m(findDrawableByLayerId2, C0373a0.m1944c(context, i3), C0382f.f1551b);
                m1986m(layerDrawable2.findDrawableByLayerId(16908301), C0373a0.m1944c(context, i3), C0382f.f1551b);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0382f m1971b() {
        C0382f fVar;
        synchronized (C0382f.class) {
            if (f1552c == null) {
                m1973h();
            }
            fVar = f1552c;
        }
        return fVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1972e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0382f.class) {
            l = C0421v.m2247l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1973h() {
        synchronized (C0382f.class) {
            if (f1552c == null) {
                C0382f fVar = new C0382f();
                f1552c = fVar;
                fVar.f1553a = C0421v.m2245h();
                f1552c.f1553a.mo2265u(new C0383a());
            }
        }
    }

    /* renamed from: i */
    static void m1974i(Drawable drawable, C0379d0 d0Var, int[] iArr) {
        C0421v.m2253w(drawable, d0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo2086c(Context context, int i) {
        return this.f1553a.mo2259j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo2087d(Context context, int i, boolean z) {
        return this.f1553a.mo2260k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo2088f(Context context, int i) {
        return this.f1553a.mo2261m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo2089g(Context context) {
        this.f1553a.mo2263s(context);
    }
}
