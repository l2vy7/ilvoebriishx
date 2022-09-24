package p232m6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import p010b0.C1523f;
import p193c6.C6532l;

/* renamed from: m6.d */
/* compiled from: TextAppearance */
public class C10806d {

    /* renamed from: a */
    public final ColorStateList f49535a;

    /* renamed from: b */
    public final ColorStateList f49536b;

    /* renamed from: c */
    public final ColorStateList f49537c;

    /* renamed from: d */
    public final ColorStateList f49538d;

    /* renamed from: e */
    public final String f49539e;

    /* renamed from: f */
    public final int f49540f;

    /* renamed from: g */
    public final int f49541g;

    /* renamed from: h */
    public final boolean f49542h;

    /* renamed from: i */
    public final float f49543i;

    /* renamed from: j */
    public final float f49544j;

    /* renamed from: k */
    public final float f49545k;

    /* renamed from: l */
    public final boolean f49546l;

    /* renamed from: m */
    public final float f49547m;

    /* renamed from: n */
    public float f49548n;

    /* renamed from: o */
    private final int f49549o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f49550p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Typeface f49551q;

    /* renamed from: m6.d$a */
    /* compiled from: TextAppearance */
    class C10807a extends C1523f.C1526c {

        /* renamed from: a */
        final /* synthetic */ C10810f f49552a;

        C10807a(C10810f fVar) {
            this.f49552a = fVar;
        }

        /* renamed from: d */
        public void mo2206d(int i) {
            boolean unused = C10806d.this.f49550p = true;
            this.f49552a.mo40176a(i);
        }

        /* renamed from: e */
        public void mo2207e(Typeface typeface) {
            C10806d dVar = C10806d.this;
            Typeface unused = dVar.f49551q = Typeface.create(typeface, dVar.f49540f);
            boolean unused2 = C10806d.this.f49550p = true;
            this.f49552a.mo40177b(C10806d.this.f49551q, false);
        }
    }

    /* renamed from: m6.d$b */
    /* compiled from: TextAppearance */
    class C10808b extends C10810f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f49554a;

        /* renamed from: b */
        final /* synthetic */ C10810f f49555b;

        C10808b(TextPaint textPaint, C10810f fVar) {
            this.f49554a = textPaint;
            this.f49555b = fVar;
        }

        /* renamed from: a */
        public void mo40176a(int i) {
            this.f49555b.mo40176a(i);
        }

        /* renamed from: b */
        public void mo40177b(Typeface typeface, boolean z) {
            C10806d.this.mo42978l(this.f49554a, typeface);
            this.f49555b.mo40177b(typeface, z);
        }
    }

    public C10806d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C6532l.f26866X7);
        this.f49548n = obtainStyledAttributes.getDimension(C6532l.f26876Y7, 0.0f);
        this.f49535a = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26908b8);
        this.f49536b = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26919c8);
        this.f49537c = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26930d8);
        this.f49540f = obtainStyledAttributes.getInt(C6532l.f26897a8, 0);
        this.f49541g = obtainStyledAttributes.getInt(C6532l.f26886Z7, 1);
        int e = C10805c.m48757e(obtainStyledAttributes, C6532l.f26996j8, C6532l.f26985i8);
        this.f49549o = obtainStyledAttributes.getResourceId(e, 0);
        this.f49539e = obtainStyledAttributes.getString(e);
        this.f49542h = obtainStyledAttributes.getBoolean(C6532l.f27007k8, false);
        this.f49538d = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26941e8);
        this.f49543i = obtainStyledAttributes.getFloat(C6532l.f26952f8, 0.0f);
        this.f49544j = obtainStyledAttributes.getFloat(C6532l.f26963g8, 0.0f);
        this.f49545k = obtainStyledAttributes.getFloat(C6532l.f26974h8, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C6532l.f26735L4);
            int i2 = C6532l.f26746M4;
            this.f49546l = obtainStyledAttributes2.hasValue(i2);
            this.f49547m = obtainStyledAttributes2.getFloat(i2, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f49546l = false;
        this.f49547m = 0.0f;
    }

    /* renamed from: d */
    private void m48764d() {
        String str;
        if (this.f49551q == null && (str = this.f49539e) != null) {
            this.f49551q = Typeface.create(str, this.f49540f);
        }
        if (this.f49551q == null) {
            int i = this.f49541g;
            if (i == 1) {
                this.f49551q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f49551q = Typeface.SERIF;
            } else if (i != 3) {
                this.f49551q = Typeface.DEFAULT;
            } else {
                this.f49551q = Typeface.MONOSPACE;
            }
            this.f49551q = Typeface.create(this.f49551q, this.f49540f);
        }
    }

    /* renamed from: i */
    private boolean m48765i(Context context) {
        if (C10809e.m48777a()) {
            return true;
        }
        int i = this.f49549o;
        if ((i != 0 ? C1523f.m7884c(context, i) : null) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface mo42972e() {
        m48764d();
        return this.f49551q;
    }

    /* renamed from: f */
    public Typeface mo42973f(Context context) {
        if (this.f49550p) {
            return this.f49551q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface f = C1523f.m7887f(context, this.f49549o);
                this.f49551q = f;
                if (f != null) {
                    this.f49551q = Typeface.create(f, this.f49540f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f49539e, e);
            }
        }
        m48764d();
        this.f49550p = true;
        return this.f49551q;
    }

    /* renamed from: g */
    public void mo42974g(Context context, TextPaint textPaint, C10810f fVar) {
        mo42978l(textPaint, mo42972e());
        mo42975h(context, new C10808b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo42975h(Context context, C10810f fVar) {
        if (m48765i(context)) {
            mo42973f(context);
        } else {
            m48764d();
        }
        int i = this.f49549o;
        if (i == 0) {
            this.f49550p = true;
        }
        if (this.f49550p) {
            fVar.mo40177b(this.f49551q, true);
            return;
        }
        try {
            C1523f.m7889h(context, i, new C10807a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f49550p = true;
            fVar.mo40176a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f49539e, e);
            this.f49550p = true;
            fVar.mo40176a(-3);
        }
    }

    /* renamed from: j */
    public void mo42976j(Context context, TextPaint textPaint, C10810f fVar) {
        mo42977k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f49535a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f49545k;
        float f2 = this.f49543i;
        float f3 = this.f49544j;
        ColorStateList colorStateList2 = this.f49538d;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void mo42977k(Context context, TextPaint textPaint, C10810f fVar) {
        if (m48765i(context)) {
            mo42978l(textPaint, mo42973f(context));
        } else {
            mo42974g(context, textPaint, fVar);
        }
    }

    /* renamed from: l */
    public void mo42978l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f49540f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f49548n);
        if (Build.VERSION.SDK_INT >= 21 && this.f49546l) {
            textPaint.setLetterSpacing(this.f49547m);
        }
    }
}
