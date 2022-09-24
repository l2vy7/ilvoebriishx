package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.material.internal.C10212i;
import p080g0.C5266a;
import p100k0.C5543e;
import p105l0.C5648h;
import p111m0.C5705d;
import p111m0.C5723u;
import p200d6.C10493a;
import p233m6.C10802a;
import p233m6.C10806d;

/* renamed from: com.google.android.material.internal.a */
/* compiled from: CollapsingTextHelper */
public final class C10188a {

    /* renamed from: j0 */
    private static final boolean f47997j0 = (Build.VERSION.SDK_INT < 18);

    /* renamed from: k0 */
    private static final Paint f47998k0 = null;

    /* renamed from: A */
    private C10802a f47999A;

    /* renamed from: B */
    private CharSequence f48000B;

    /* renamed from: C */
    private CharSequence f48001C;

    /* renamed from: D */
    private boolean f48002D;

    /* renamed from: E */
    private boolean f48003E = true;

    /* renamed from: F */
    private boolean f48004F;

    /* renamed from: G */
    private Bitmap f48005G;

    /* renamed from: H */
    private Paint f48006H;

    /* renamed from: I */
    private float f48007I;

    /* renamed from: J */
    private float f48008J;

    /* renamed from: K */
    private int[] f48009K;

    /* renamed from: L */
    private boolean f48010L;

    /* renamed from: M */
    private final TextPaint f48011M;

    /* renamed from: N */
    private final TextPaint f48012N;

    /* renamed from: O */
    private TimeInterpolator f48013O;

    /* renamed from: P */
    private TimeInterpolator f48014P;

    /* renamed from: Q */
    private float f48015Q;

    /* renamed from: R */
    private float f48016R;

    /* renamed from: S */
    private float f48017S;

    /* renamed from: T */
    private ColorStateList f48018T;

    /* renamed from: U */
    private float f48019U;

    /* renamed from: V */
    private float f48020V;

    /* renamed from: W */
    private float f48021W;

    /* renamed from: X */
    private ColorStateList f48022X;

    /* renamed from: Y */
    private float f48023Y;

    /* renamed from: Z */
    private float f48024Z;

    /* renamed from: a */
    private final View f48025a;

    /* renamed from: a0 */
    private StaticLayout f48026a0;

    /* renamed from: b */
    private boolean f48027b;

    /* renamed from: b0 */
    private float f48028b0;

    /* renamed from: c */
    private float f48029c;

    /* renamed from: c0 */
    private float f48030c0;

    /* renamed from: d */
    private boolean f48031d;

    /* renamed from: d0 */
    private float f48032d0;

    /* renamed from: e */
    private float f48033e;

    /* renamed from: e0 */
    private CharSequence f48034e0;

    /* renamed from: f */
    private float f48035f;

    /* renamed from: f0 */
    private int f48036f0 = 1;

    /* renamed from: g */
    private int f48037g;

    /* renamed from: g0 */
    private float f48038g0 = 0.0f;

    /* renamed from: h */
    private final Rect f48039h;

    /* renamed from: h0 */
    private float f48040h0 = 1.0f;

    /* renamed from: i */
    private final Rect f48041i;

    /* renamed from: i0 */
    private int f48042i0 = C10212i.f48103n;

    /* renamed from: j */
    private final RectF f48043j;

    /* renamed from: k */
    private int f48044k = 16;

    /* renamed from: l */
    private int f48045l = 16;

    /* renamed from: m */
    private float f48046m = 15.0f;

    /* renamed from: n */
    private float f48047n = 15.0f;

    /* renamed from: o */
    private ColorStateList f48048o;

    /* renamed from: p */
    private ColorStateList f48049p;

    /* renamed from: q */
    private float f48050q;

    /* renamed from: r */
    private float f48051r;

    /* renamed from: s */
    private float f48052s;

    /* renamed from: t */
    private float f48053t;

    /* renamed from: u */
    private float f48054u;

    /* renamed from: v */
    private float f48055v;

    /* renamed from: w */
    private Typeface f48056w;

    /* renamed from: x */
    private Typeface f48057x;

    /* renamed from: y */
    private Typeface f48058y;

    /* renamed from: z */
    private C10802a f48059z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    class C10189a implements C10802a.C10803a {
        C10189a() {
        }

        /* renamed from: a */
        public void mo40937a(Typeface typeface) {
            C10188a.this.mo40910d0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* compiled from: CollapsingTextHelper */
    class C10190b implements C10802a.C10803a {
        C10190b() {
        }

        /* renamed from: a */
        public void mo40937a(Typeface typeface) {
            C10188a.this.mo40919n0(typeface);
        }
    }

    public C10188a(View view) {
        this.f48025a = view;
        TextPaint textPaint = new TextPaint(TsExtractor.TS_STREAM_TYPE_AC3);
        this.f48011M = textPaint;
        this.f48012N = new TextPaint(textPaint);
        this.f48041i = new Rect();
        this.f48039h = new Rect();
        this.f48043j = new RectF();
        this.f48035f = m46947f();
    }

    /* renamed from: D0 */
    private boolean m46932D0() {
        return this.f48036f0 > 1 && (!this.f48002D || this.f48031d) && !this.f48004F;
    }

    /* renamed from: L */
    private void m46933L(TextPaint textPaint) {
        textPaint.setTextSize(this.f48047n);
        textPaint.setTypeface(this.f48056w);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f48023Y);
        }
    }

    /* renamed from: M */
    private void m46934M(TextPaint textPaint) {
        textPaint.setTextSize(this.f48046m);
        textPaint.setTypeface(this.f48057x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f48024Z);
        }
    }

    /* renamed from: N */
    private void m46935N(float f) {
        if (this.f48031d) {
            this.f48043j.set(f < this.f48035f ? this.f48039h : this.f48041i);
            return;
        }
        this.f48043j.left = m46939S((float) this.f48039h.left, (float) this.f48041i.left, f, this.f48013O);
        this.f48043j.top = m46939S(this.f48050q, this.f48051r, f, this.f48013O);
        this.f48043j.right = m46939S((float) this.f48039h.right, (float) this.f48041i.right, f, this.f48013O);
        this.f48043j.bottom = m46939S((float) this.f48039h.bottom, (float) this.f48041i.bottom, f, this.f48013O);
    }

    /* renamed from: O */
    private static boolean m46936O(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: P */
    private boolean m46937P() {
        return C5723u.m25265B(this.f48025a) == 1;
    }

    /* renamed from: R */
    private boolean m46938R(CharSequence charSequence, boolean z) {
        return (z ? C5543e.f24067d : C5543e.f24066c).mo22110a(charSequence, 0, charSequence.length());
    }

    /* renamed from: S */
    private static float m46939S(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C10493a.m48198a(f, f2, f3);
    }

    /* renamed from: W */
    private static boolean m46940W(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    private static int m46941a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a0 */
    private void m46942a0(float f) {
        this.f48028b0 = f;
        C5723u.m25310e0(this.f48025a);
    }

    /* renamed from: b */
    private void m46943b(boolean z) {
        StaticLayout staticLayout;
        float f = this.f48008J;
        m46951j(this.f48047n, z);
        CharSequence charSequence = this.f48001C;
        if (!(charSequence == null || (staticLayout = this.f48026a0) == null)) {
            this.f48034e0 = TextUtils.ellipsize(charSequence, this.f48011M, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f48034e0;
        float f2 = 0.0f;
        float measureText = charSequence2 != null ? this.f48011M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b = C5705d.m25206b(this.f48045l, this.f48002D ? 1 : 0);
        int i = b & 112;
        if (i == 48) {
            this.f48051r = (float) this.f48041i.top;
        } else if (i != 80) {
            this.f48051r = ((float) this.f48041i.centerY()) - ((this.f48011M.descent() - this.f48011M.ascent()) / 2.0f);
        } else {
            this.f48051r = ((float) this.f48041i.bottom) + this.f48011M.ascent();
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.f48053t = ((float) this.f48041i.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f48053t = (float) this.f48041i.left;
        } else {
            this.f48053t = ((float) this.f48041i.right) - measureText;
        }
        m46951j(this.f48046m, z);
        StaticLayout staticLayout2 = this.f48026a0;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f48001C;
        float measureText2 = charSequence3 != null ? this.f48011M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f48026a0;
        if (staticLayout3 != null && this.f48036f0 > 1) {
            measureText2 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f48026a0;
        if (staticLayout4 != null) {
            f2 = this.f48036f0 > 1 ? (float) staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
        }
        this.f48032d0 = f2;
        int b2 = C5705d.m25206b(this.f48044k, this.f48002D ? 1 : 0);
        int i3 = b2 & 112;
        if (i3 == 48) {
            this.f48050q = (float) this.f48039h.top;
        } else if (i3 != 80) {
            this.f48050q = ((float) this.f48039h.centerY()) - (height / 2.0f);
        } else {
            this.f48050q = (((float) this.f48039h.bottom) - height) + this.f48011M.descent();
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.f48052s = ((float) this.f48039h.centerX()) - (measureText2 / 2.0f);
        } else if (i4 != 5) {
            this.f48052s = (float) this.f48039h.left;
        } else {
            this.f48052s = ((float) this.f48039h.right) - measureText2;
        }
        m46953k();
        m46959t0(f);
    }

    /* renamed from: d */
    private void m46944d() {
        m46949h(this.f48029c);
    }

    /* renamed from: e */
    private float m46945e(float f) {
        float f2 = this.f48035f;
        if (f <= f2) {
            return C10493a.m48199b(1.0f, 0.0f, this.f48033e, f2, f);
        }
        return C10493a.m48199b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e0 */
    private boolean m46946e0(Typeface typeface) {
        C10802a aVar = this.f47999A;
        if (aVar != null) {
            aVar.mo42971c();
        }
        if (this.f48056w == typeface) {
            return false;
        }
        this.f48056w = typeface;
        return true;
    }

    /* renamed from: f */
    private float m46947f() {
        float f = this.f48033e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: g */
    private boolean m46948g(CharSequence charSequence) {
        boolean P = m46937P();
        return this.f48003E ? m46938R(charSequence, P) : P;
    }

    /* renamed from: h */
    private void m46949h(float f) {
        float f2;
        m46935N(f);
        if (!this.f48031d) {
            this.f48054u = m46939S(this.f48052s, this.f48053t, f, this.f48013O);
            this.f48055v = m46939S(this.f48050q, this.f48051r, f, this.f48013O);
            m46959t0(m46939S(this.f48046m, this.f48047n, f, this.f48014P));
            f2 = f;
        } else if (f < this.f48035f) {
            this.f48054u = this.f48052s;
            this.f48055v = this.f48050q;
            m46959t0(this.f48046m);
            f2 = 0.0f;
        } else {
            this.f48054u = this.f48053t;
            this.f48055v = this.f48051r - ((float) Math.max(0, this.f48037g));
            m46959t0(this.f48047n);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C10493a.f49009b;
        m46942a0(1.0f - m46939S(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m46952j0(m46939S(1.0f, 0.0f, f, timeInterpolator));
        if (this.f48049p != this.f48048o) {
            this.f48011M.setColor(m46941a(m46962y(), mo40931w(), f2));
        } else {
            this.f48011M.setColor(mo40931w());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.f48023Y;
            float f4 = this.f48024Z;
            if (f3 != f4) {
                this.f48011M.setLetterSpacing(m46939S(f4, f3, f, timeInterpolator));
            } else {
                this.f48011M.setLetterSpacing(f3);
            }
        }
        this.f48011M.setShadowLayer(m46939S(this.f48019U, this.f48015Q, f, (TimeInterpolator) null), m46939S(this.f48020V, this.f48016R, f, (TimeInterpolator) null), m46939S(this.f48021W, this.f48017S, f, (TimeInterpolator) null), m46941a(m46961x(this.f48022X), m46961x(this.f48018T), f));
        if (this.f48031d) {
            this.f48011M.setAlpha((int) (m46945e(f) * 255.0f));
        }
        C5723u.m25310e0(this.f48025a);
    }

    /* renamed from: i */
    private void m46950i(float f) {
        m46951j(f, false);
    }

    /* renamed from: j */
    private void m46951j(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (this.f48000B != null) {
            float width = (float) this.f48041i.width();
            float width2 = (float) this.f48039h.width();
            boolean z4 = false;
            int i = 1;
            if (m46936O(f, this.f48047n)) {
                f2 = this.f48047n;
                this.f48007I = 1.0f;
                Typeface typeface = this.f48058y;
                Typeface typeface2 = this.f48056w;
                if (typeface != typeface2) {
                    this.f48058y = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.f48046m;
                Typeface typeface3 = this.f48058y;
                Typeface typeface4 = this.f48057x;
                if (typeface3 != typeface4) {
                    this.f48058y = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (m46936O(f, f3)) {
                    this.f48007I = 1.0f;
                } else {
                    this.f48007I = f / this.f48046m;
                }
                float f4 = this.f48047n / this.f48046m;
                float f5 = width2 * f4;
                if (!z && f5 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
                f2 = f3;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.f48008J != f2 || this.f48010L || z2;
                this.f48008J = f2;
                this.f48010L = false;
            }
            if (this.f48001C == null || z2) {
                this.f48011M.setTextSize(this.f48008J);
                this.f48011M.setTypeface(this.f48058y);
                TextPaint textPaint = this.f48011M;
                if (this.f48007I != 1.0f) {
                    z4 = true;
                }
                textPaint.setLinearText(z4);
                this.f48002D = m46948g(this.f48000B);
                if (m46932D0()) {
                    i = this.f48036f0;
                }
                StaticLayout l = m46954l(i, width, this.f48002D);
                this.f48026a0 = l;
                this.f48001C = l.getText();
            }
        }
    }

    /* renamed from: j0 */
    private void m46952j0(float f) {
        this.f48030c0 = f;
        C5723u.m25310e0(this.f48025a);
    }

    /* renamed from: k */
    private void m46953k() {
        Bitmap bitmap = this.f48005G;
        if (bitmap != null) {
            bitmap.recycle();
            this.f48005G = null;
        }
    }

    /* renamed from: l */
    private StaticLayout m46954l(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = C10212i.m47083c(this.f48000B, this.f48011M, (int) f).mo40983e(TextUtils.TruncateAt.END).mo40986h(z).mo40982d(Layout.Alignment.ALIGN_NORMAL).mo40985g(false).mo40988j(i).mo40987i(this.f48038g0, this.f48040h0).mo40984f(this.f48042i0).mo40981a();
        } catch (C10212i.C10213a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C5648h.m24964c(staticLayout);
    }

    /* renamed from: n */
    private void m46955n(Canvas canvas, float f, float f2) {
        int alpha = this.f48011M.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f48011M.setAlpha((int) (this.f48030c0 * f3));
        this.f48026a0.draw(canvas);
        this.f48011M.setAlpha((int) (this.f48028b0 * f3));
        int lineBaseline = this.f48026a0.getLineBaseline(0);
        CharSequence charSequence = this.f48034e0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f48011M);
        if (!this.f48031d) {
            String trim = this.f48034e0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f48011M.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f48026a0.getLineEnd(0), str.length()), 0.0f, f4, this.f48011M);
        }
    }

    /* renamed from: o */
    private void m46956o() {
        if (this.f48005G == null && !this.f48039h.isEmpty() && !TextUtils.isEmpty(this.f48001C)) {
            m46949h(0.0f);
            int width = this.f48026a0.getWidth();
            int height = this.f48026a0.getHeight();
            if (width > 0 && height > 0) {
                this.f48005G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f48026a0.draw(new Canvas(this.f48005G));
                if (this.f48006H == null) {
                    this.f48006H = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o0 */
    private boolean m46957o0(Typeface typeface) {
        C10802a aVar = this.f48059z;
        if (aVar != null) {
            aVar.mo42971c();
        }
        if (this.f48057x == typeface) {
            return false;
        }
        this.f48057x = typeface;
        return true;
    }

    /* renamed from: t */
    private float m46958t(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo40908c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f48002D ? (float) this.f48041i.left : ((float) this.f48041i.right) - mo40908c() : this.f48002D ? ((float) this.f48041i.right) - mo40908c() : (float) this.f48041i.left;
    }

    /* renamed from: t0 */
    private void m46959t0(float f) {
        m46950i(f);
        boolean z = f47997j0 && this.f48007I != 1.0f;
        this.f48004F = z;
        if (z) {
            m46956o();
        }
        C5723u.m25310e0(this.f48025a);
    }

    /* renamed from: u */
    private float m46960u(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo40908c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f48002D ? rectF.left + mo40908c() : (float) this.f48041i.right : this.f48002D ? (float) this.f48041i.right : rectF.left + mo40908c();
    }

    /* renamed from: x */
    private int m46961x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f48009K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: y */
    private int m46962y() {
        return m46961x(this.f48048o);
    }

    /* renamed from: A */
    public int mo40886A() {
        return this.f48044k;
    }

    /* renamed from: A0 */
    public void mo40887A0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f48000B, charSequence)) {
            this.f48000B = charSequence;
            this.f48001C = null;
            m46953k();
            mo40902U();
        }
    }

    /* renamed from: B */
    public float mo40888B() {
        m46934M(this.f48012N);
        return -this.f48012N.ascent();
    }

    /* renamed from: B0 */
    public void mo40889B0(TimeInterpolator timeInterpolator) {
        this.f48014P = timeInterpolator;
        mo40902U();
    }

    /* renamed from: C */
    public Typeface mo40890C() {
        Typeface typeface = this.f48057x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: C0 */
    public void mo40891C0(Typeface typeface) {
        boolean e0 = m46946e0(typeface);
        boolean o0 = m46957o0(typeface);
        if (e0 || o0) {
            mo40902U();
        }
    }

    /* renamed from: D */
    public float mo40892D() {
        return this.f48029c;
    }

    /* renamed from: E */
    public float mo40893E() {
        return this.f48035f;
    }

    /* renamed from: F */
    public int mo40894F() {
        return this.f48042i0;
    }

    /* renamed from: G */
    public int mo40895G() {
        StaticLayout staticLayout = this.f48026a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: H */
    public float mo40896H() {
        return this.f48026a0.getSpacingAdd();
    }

    /* renamed from: I */
    public float mo40897I() {
        return this.f48026a0.getSpacingMultiplier();
    }

    /* renamed from: J */
    public int mo40898J() {
        return this.f48036f0;
    }

    /* renamed from: K */
    public CharSequence mo40899K() {
        return this.f48000B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f48048o;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40900Q() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f48049p
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f48048o
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C10188a.mo40900Q():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo40901T() {
        this.f48027b = this.f48041i.width() > 0 && this.f48041i.height() > 0 && this.f48039h.width() > 0 && this.f48039h.height() > 0;
    }

    /* renamed from: U */
    public void mo40902U() {
        mo40903V(false);
    }

    /* renamed from: V */
    public void mo40903V(boolean z) {
        if ((this.f48025a.getHeight() > 0 && this.f48025a.getWidth() > 0) || z) {
            m46943b(z);
            m46944d();
        }
    }

    /* renamed from: X */
    public void mo40904X(int i, int i2, int i3, int i4) {
        if (!m46940W(this.f48041i, i, i2, i3, i4)) {
            this.f48041i.set(i, i2, i3, i4);
            this.f48010L = true;
            mo40901T();
        }
    }

    /* renamed from: Y */
    public void mo40905Y(Rect rect) {
        mo40904X(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: Z */
    public void mo40906Z(int i) {
        C10806d dVar = new C10806d(this.f48025a.getContext(), i);
        ColorStateList colorStateList = dVar.f49535a;
        if (colorStateList != null) {
            this.f48049p = colorStateList;
        }
        float f = dVar.f49548n;
        if (f != 0.0f) {
            this.f48047n = f;
        }
        ColorStateList colorStateList2 = dVar.f49538d;
        if (colorStateList2 != null) {
            this.f48018T = colorStateList2;
        }
        this.f48016R = dVar.f49543i;
        this.f48017S = dVar.f49544j;
        this.f48015Q = dVar.f49545k;
        this.f48023Y = dVar.f49547m;
        C10802a aVar = this.f47999A;
        if (aVar != null) {
            aVar.mo42971c();
        }
        this.f47999A = new C10802a(new C10189a(), dVar.mo42972e());
        dVar.mo42975h(this.f48025a.getContext(), this.f47999A);
        mo40902U();
    }

    /* renamed from: b0 */
    public void mo40907b0(ColorStateList colorStateList) {
        if (this.f48049p != colorStateList) {
            this.f48049p = colorStateList;
            mo40902U();
        }
    }

    /* renamed from: c */
    public float mo40908c() {
        if (this.f48000B == null) {
            return 0.0f;
        }
        m46933L(this.f48012N);
        TextPaint textPaint = this.f48012N;
        CharSequence charSequence = this.f48000B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public void mo40909c0(int i) {
        if (this.f48045l != i) {
            this.f48045l = i;
            mo40902U();
        }
    }

    /* renamed from: d0 */
    public void mo40910d0(Typeface typeface) {
        if (m46946e0(typeface)) {
            mo40902U();
        }
    }

    /* renamed from: f0 */
    public void mo40911f0(int i) {
        this.f48037g = i;
    }

    /* renamed from: g0 */
    public void mo40912g0(int i, int i2, int i3, int i4) {
        if (!m46940W(this.f48039h, i, i2, i3, i4)) {
            this.f48039h.set(i, i2, i3, i4);
            this.f48010L = true;
            mo40901T();
        }
    }

    /* renamed from: h0 */
    public void mo40913h0(Rect rect) {
        mo40912g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: i0 */
    public void mo40914i0(int i) {
        C10806d dVar = new C10806d(this.f48025a.getContext(), i);
        ColorStateList colorStateList = dVar.f49535a;
        if (colorStateList != null) {
            this.f48048o = colorStateList;
        }
        float f = dVar.f49548n;
        if (f != 0.0f) {
            this.f48046m = f;
        }
        ColorStateList colorStateList2 = dVar.f49538d;
        if (colorStateList2 != null) {
            this.f48022X = colorStateList2;
        }
        this.f48020V = dVar.f49543i;
        this.f48021W = dVar.f49544j;
        this.f48019U = dVar.f49545k;
        this.f48024Z = dVar.f49547m;
        C10802a aVar = this.f48059z;
        if (aVar != null) {
            aVar.mo42971c();
        }
        this.f48059z = new C10802a(new C10190b(), dVar.mo42972e());
        dVar.mo42975h(this.f48025a.getContext(), this.f48059z);
        mo40902U();
    }

    /* renamed from: k0 */
    public void mo40915k0(ColorStateList colorStateList) {
        if (this.f48048o != colorStateList) {
            this.f48048o = colorStateList;
            mo40902U();
        }
    }

    /* renamed from: l0 */
    public void mo40916l0(int i) {
        if (this.f48044k != i) {
            this.f48044k = i;
            mo40902U();
        }
    }

    /* renamed from: m */
    public void mo40917m(Canvas canvas) {
        int save = canvas.save();
        if (this.f48001C != null && this.f48027b) {
            boolean z = true;
            float lineStart = (this.f48054u + (this.f48036f0 > 1 ? (float) this.f48026a0.getLineStart(0) : this.f48026a0.getLineLeft(0))) - (this.f48032d0 * 2.0f);
            this.f48011M.setTextSize(this.f48008J);
            float f = this.f48054u;
            float f2 = this.f48055v;
            if (!this.f48004F || this.f48005G == null) {
                z = false;
            }
            float f3 = this.f48007I;
            if (f3 != 1.0f && !this.f48031d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f48005G, f, f2, this.f48006H);
                canvas.restoreToCount(save);
                return;
            }
            if (!m46932D0() || (this.f48031d && this.f48029c <= this.f48035f)) {
                canvas.translate(f, f2);
                this.f48026a0.draw(canvas);
            } else {
                m46955n(canvas, lineStart, f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m0 */
    public void mo40918m0(float f) {
        if (this.f48046m != f) {
            this.f48046m = f;
            mo40902U();
        }
    }

    /* renamed from: n0 */
    public void mo40919n0(Typeface typeface) {
        if (m46957o0(typeface)) {
            mo40902U();
        }
    }

    /* renamed from: p */
    public void mo40920p(RectF rectF, int i, int i2) {
        this.f48002D = m46948g(this.f48000B);
        rectF.left = m46958t(i, i2);
        rectF.top = (float) this.f48041i.top;
        rectF.right = m46960u(rectF, i, i2);
        rectF.bottom = ((float) this.f48041i.top) + mo40926s();
    }

    /* renamed from: p0 */
    public void mo40921p0(float f) {
        float a = C5266a.m23793a(f, 0.0f, 1.0f);
        if (a != this.f48029c) {
            this.f48029c = a;
            m46944d();
        }
    }

    /* renamed from: q */
    public ColorStateList mo40922q() {
        return this.f48049p;
    }

    /* renamed from: q0 */
    public void mo40923q0(boolean z) {
        this.f48031d = z;
    }

    /* renamed from: r */
    public int mo40924r() {
        return this.f48045l;
    }

    /* renamed from: r0 */
    public void mo40925r0(float f) {
        this.f48033e = f;
        this.f48035f = m46947f();
    }

    /* renamed from: s */
    public float mo40926s() {
        m46933L(this.f48012N);
        return -this.f48012N.ascent();
    }

    /* renamed from: s0 */
    public void mo40927s0(int i) {
        this.f48042i0 = i;
    }

    /* renamed from: u0 */
    public void mo40928u0(float f) {
        this.f48038g0 = f;
    }

    /* renamed from: v */
    public Typeface mo40929v() {
        Typeface typeface = this.f48056w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: v0 */
    public void mo40930v0(float f) {
        this.f48040h0 = f;
    }

    /* renamed from: w */
    public int mo40931w() {
        return m46961x(this.f48049p);
    }

    /* renamed from: w0 */
    public void mo40932w0(int i) {
        if (i != this.f48036f0) {
            this.f48036f0 = i;
            m46953k();
            mo40902U();
        }
    }

    /* renamed from: x0 */
    public void mo40933x0(TimeInterpolator timeInterpolator) {
        this.f48013O = timeInterpolator;
        mo40902U();
    }

    /* renamed from: y0 */
    public void mo40934y0(boolean z) {
        this.f48003E = z;
    }

    /* renamed from: z */
    public float mo40935z() {
        m46934M(this.f48012N);
        return (-this.f48012N.ascent()) + this.f48012N.descent();
    }

    /* renamed from: z0 */
    public final boolean mo40936z0(int[] iArr) {
        this.f48009K = iArr;
        if (!mo40900Q()) {
            return false;
        }
        mo40902U();
        return true;
    }
}
