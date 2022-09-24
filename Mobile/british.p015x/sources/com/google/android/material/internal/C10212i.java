package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p105l0.C5648h;

/* renamed from: com.google.android.material.internal.i */
/* compiled from: StaticLayoutBuilderCompat */
final class C10212i {

    /* renamed from: n */
    static final int f48103n = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: o */
    private static boolean f48104o;

    /* renamed from: p */
    private static Constructor<StaticLayout> f48105p;

    /* renamed from: q */
    private static Object f48106q;

    /* renamed from: a */
    private CharSequence f48107a;

    /* renamed from: b */
    private final TextPaint f48108b;

    /* renamed from: c */
    private final int f48109c;

    /* renamed from: d */
    private int f48110d = 0;

    /* renamed from: e */
    private int f48111e;

    /* renamed from: f */
    private Layout.Alignment f48112f;

    /* renamed from: g */
    private int f48113g;

    /* renamed from: h */
    private float f48114h;

    /* renamed from: i */
    private float f48115i;

    /* renamed from: j */
    private int f48116j;

    /* renamed from: k */
    private boolean f48117k;

    /* renamed from: l */
    private boolean f48118l;

    /* renamed from: m */
    private TextUtils.TruncateAt f48119m;

    /* renamed from: com.google.android.material.internal.i$a */
    /* compiled from: StaticLayoutBuilderCompat */
    static class C10213a extends Exception {
        C10213a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C10212i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f48107a = charSequence;
        this.f48108b = textPaint;
        this.f48109c = i;
        this.f48111e = charSequence.length();
        this.f48112f = Layout.Alignment.ALIGN_NORMAL;
        this.f48113g = Integer.MAX_VALUE;
        this.f48114h = 0.0f;
        this.f48115i = 1.0f;
        this.f48116j = f48103n;
        this.f48117k = true;
        this.f48119m = null;
    }

    /* renamed from: b */
    private void m47082b() throws C10213a {
        Class cls;
        if (!f48104o) {
            try {
                boolean z = this.f48118l && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f48106q = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C10212i.class.getClassLoader();
                    String str = this.f48118l ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f48106q = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f48105p = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f48104o = true;
            } catch (Exception e) {
                throw new C10213a(e);
            }
        }
    }

    /* renamed from: c */
    public static C10212i m47083c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C10212i(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo40981a() throws C10213a {
        if (this.f48107a == null) {
            this.f48107a = "";
        }
        int max = Math.max(0, this.f48109c);
        CharSequence charSequence = this.f48107a;
        if (this.f48113g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f48108b, (float) max, this.f48119m);
        }
        int min = Math.min(charSequence.length(), this.f48111e);
        this.f48111e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f48118l && this.f48113g == 1) {
                this.f48112f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f48110d, min, this.f48108b, max);
            obtain.setAlignment(this.f48112f);
            obtain.setIncludePad(this.f48117k);
            obtain.setTextDirection(this.f48118l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f48119m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f48113g);
            float f = this.f48114h;
            if (!(f == 0.0f && this.f48115i == 1.0f)) {
                obtain.setLineSpacing(f, this.f48115i);
            }
            if (this.f48113g > 1) {
                obtain.setHyphenationFrequency(this.f48116j);
            }
            return obtain.build();
        }
        m47082b();
        try {
            return (StaticLayout) ((Constructor) C5648h.m24964c(f48105p)).newInstance(new Object[]{charSequence, Integer.valueOf(this.f48110d), Integer.valueOf(this.f48111e), this.f48108b, Integer.valueOf(max), this.f48112f, C5648h.m24964c(f48106q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f48117k), null, Integer.valueOf(max), Integer.valueOf(this.f48113g)});
        } catch (Exception e) {
            throw new C10213a(e);
        }
    }

    /* renamed from: d */
    public C10212i mo40982d(Layout.Alignment alignment) {
        this.f48112f = alignment;
        return this;
    }

    /* renamed from: e */
    public C10212i mo40983e(TextUtils.TruncateAt truncateAt) {
        this.f48119m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C10212i mo40984f(int i) {
        this.f48116j = i;
        return this;
    }

    /* renamed from: g */
    public C10212i mo40985g(boolean z) {
        this.f48117k = z;
        return this;
    }

    /* renamed from: h */
    public C10212i mo40986h(boolean z) {
        this.f48118l = z;
        return this;
    }

    /* renamed from: i */
    public C10212i mo40987i(float f, float f2) {
        this.f48114h = f;
        this.f48115i = f2;
        return this;
    }

    /* renamed from: j */
    public C10212i mo40988j(int i) {
        this.f48113g = i;
        return this;
    }
}
