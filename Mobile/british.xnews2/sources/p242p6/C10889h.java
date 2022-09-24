package p242p6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import p062d0.C5136b;
import p104l0.C5643c;
import p193c6.C6522b;
import p207f6.C10538a;
import p218i6.C10604a;
import p239o6.C10857a;
import p242p6.C10897m;
import p242p6.C10901n;
import p242p6.C10905o;

/* renamed from: p6.h */
/* compiled from: MaterialShapeDrawable */
public class C10889h extends Drawable implements C5136b, C10913p {

    /* renamed from: x */
    private static final String f49668x = C10889h.class.getSimpleName();

    /* renamed from: y */
    private static final Paint f49669y = new Paint(1);

    /* renamed from: b */
    private C10892c f49670b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10905o.C10912g[] f49671c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10905o.C10912g[] f49672d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final BitSet f49673e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f49674f;

    /* renamed from: g */
    private final Matrix f49675g;

    /* renamed from: h */
    private final Path f49676h;

    /* renamed from: i */
    private final Path f49677i;

    /* renamed from: j */
    private final RectF f49678j;

    /* renamed from: k */
    private final RectF f49679k;

    /* renamed from: l */
    private final Region f49680l;

    /* renamed from: m */
    private final Region f49681m;

    /* renamed from: n */
    private C10897m f49682n;

    /* renamed from: o */
    private final Paint f49683o;

    /* renamed from: p */
    private final Paint f49684p;

    /* renamed from: q */
    private final C10857a f49685q;

    /* renamed from: r */
    private final C10901n.C10903b f49686r;

    /* renamed from: s */
    private final C10901n f49687s;

    /* renamed from: t */
    private PorterDuffColorFilter f49688t;

    /* renamed from: u */
    private PorterDuffColorFilter f49689u;

    /* renamed from: v */
    private final RectF f49690v;

    /* renamed from: w */
    private boolean f49691w;

    /* renamed from: p6.h$a */
    /* compiled from: MaterialShapeDrawable */
    class C10890a implements C10901n.C10903b {
        C10890a() {
        }

        /* renamed from: a */
        public void mo43120a(C10905o oVar, Matrix matrix, int i) {
            C10889h.this.f49673e.set(i + 4, oVar.mo43171e());
            C10889h.this.f49672d[i] = oVar.mo43172f(matrix);
        }

        /* renamed from: b */
        public void mo43121b(C10905o oVar, Matrix matrix, int i) {
            C10889h.this.f49673e.set(i, oVar.mo43171e());
            C10889h.this.f49671c[i] = oVar.mo43172f(matrix);
        }
    }

    /* renamed from: p6.h$b */
    /* compiled from: MaterialShapeDrawable */
    class C10891b implements C10897m.C10900c {

        /* renamed from: a */
        final /* synthetic */ float f49693a;

        C10891b(float f) {
            this.f49693a = f;
        }

        /* renamed from: a */
        public C10884c mo43122a(C10884c cVar) {
            return cVar instanceof C10895k ? cVar : new C10883b(this.f49693a, cVar);
        }
    }

    /* synthetic */ C10889h(C10892c cVar, C10890a aVar) {
        this(cVar);
    }

    /* renamed from: F */
    private float m48912F() {
        if (m48915O()) {
            return this.f49684p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: M */
    private boolean m48913M() {
        C10892c cVar = this.f49670b;
        int i = cVar.f49711q;
        if (i == 1 || cVar.f49712r <= 0 || (i != 2 && !mo43087W())) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private boolean m48914N() {
        Paint.Style style = this.f49670b.f49716v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: O */
    private boolean m48915O() {
        Paint.Style style = this.f49670b.f49716v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f49684p.getStrokeWidth() > 0.0f;
    }

    /* renamed from: Q */
    private void m48916Q() {
        super.invalidateSelf();
    }

    /* renamed from: T */
    private void m48917T(Canvas canvas) {
        if (m48913M()) {
            canvas.save();
            m48919V(canvas);
            if (!this.f49691w) {
                m48930n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f49690v.width() - ((float) getBounds().width()));
            int height = (int) (this.f49690v.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f49690v.width()) + (this.f49670b.f49712r * 2) + width, ((int) this.f49690v.height()) + (this.f49670b.f49712r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f49670b.f49712r) - width);
            float f2 = (float) ((getBounds().top - this.f49670b.f49712r) - height);
            canvas2.translate(-f, -f2);
            m48930n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: U */
    private static int m48918U(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: V */
    private void m48919V(Canvas canvas) {
        int A = mo43073A();
        int B = mo43074B();
        if (Build.VERSION.SDK_INT < 21 && this.f49691w) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f49670b.f49712r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(A, B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) A, (float) B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m48924f(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.mo43107l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p242p6.C10889h.m48924f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: g */
    private void m48925g(RectF rectF, Path path) {
        mo43101h(rectF, path);
        if (this.f49670b.f49704j != 1.0f) {
            this.f49675g.reset();
            Matrix matrix = this.f49675g;
            float f = this.f49670b.f49704j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f49675g);
        }
        path.computeBounds(this.f49690v, true);
    }

    /* renamed from: i */
    private void m48926i() {
        C10897m y = mo43076D().mo43143y(new C10891b(-m48912F()));
        this.f49682n = y;
        this.f49687s.mo43167d(y, this.f49670b.f49705k, m48937v(), this.f49677i);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m48927j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo43107l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m48928k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m48924f(paint, z);
        }
        return m48927j(colorStateList, mode, z);
    }

    /* renamed from: m */
    public static C10889h m48929m(Context context, float f) {
        int c = C10538a.m48269c(context, C6522b.colorSurface, C10889h.class.getSimpleName());
        C10889h hVar = new C10889h();
        hVar.mo43084P(context);
        hVar.mo43091a0(ColorStateList.valueOf(c));
        hVar.mo43090Z(f);
        return hVar;
    }

    /* renamed from: n */
    private void m48930n(Canvas canvas) {
        if (this.f49673e.cardinality() > 0) {
            Log.w(f49668x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f49670b.f49713s != 0) {
            canvas.drawPath(this.f49676h, this.f49685q.mo43040c());
        }
        for (int i = 0; i < 4; i++) {
            this.f49671c[i].mo43183b(this.f49685q, this.f49670b.f49712r, canvas);
            this.f49672d[i].mo43183b(this.f49685q, this.f49670b.f49712r, canvas);
        }
        if (this.f49691w) {
            int A = mo43073A();
            int B = mo43074B();
            canvas.translate((float) (-A), (float) (-B));
            canvas.drawPath(this.f49676h, f49669y);
            canvas.translate((float) A, (float) B);
        }
    }

    /* renamed from: n0 */
    private boolean m48931n0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f49670b.f49698d == null || (color2 = this.f49683o.getColor()) == (colorForState2 = this.f49670b.f49698d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f49683o.setColor(colorForState2);
            z = true;
        }
        if (this.f49670b.f49699e == null || (color = this.f49684p.getColor()) == (colorForState = this.f49670b.f49699e.getColorForState(iArr, color))) {
            return z;
        }
        this.f49684p.setColor(colorForState);
        return true;
    }

    /* renamed from: o */
    private void m48932o(Canvas canvas) {
        m48935q(canvas, this.f49683o, this.f49676h, this.f49670b.f49695a, mo43115u());
    }

    /* renamed from: o0 */
    private boolean m48933o0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f49688t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f49689u;
        C10892c cVar = this.f49670b;
        this.f49688t = m48928k(cVar.f49701g, cVar.f49702h, this.f49683o, true);
        C10892c cVar2 = this.f49670b;
        this.f49689u = m48928k(cVar2.f49700f, cVar2.f49702h, this.f49684p, false);
        C10892c cVar3 = this.f49670b;
        if (cVar3.f49715u) {
            this.f49685q.mo43041d(cVar3.f49701g.getColorForState(getState(), 0));
        }
        if (!C5643c.m24954a(porterDuffColorFilter, this.f49688t) || !C5643c.m24954a(porterDuffColorFilter2, this.f49689u)) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    private void m48934p0() {
        float L = mo43083L();
        this.f49670b.f49712r = (int) Math.ceil((double) (0.75f * L));
        this.f49670b.f49713s = (int) Math.ceil((double) (L * 0.25f));
        m48933o0();
        m48916Q();
    }

    /* renamed from: q */
    private void m48935q(Canvas canvas, Paint paint, Path path, C10897m mVar, RectF rectF) {
        if (mVar.mo43139u(rectF)) {
            float a = mVar.mo43138t().mo43065a(rectF) * this.f49670b.f49705k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r */
    private void m48936r(Canvas canvas) {
        m48935q(canvas, this.f49684p, this.f49677i, this.f49682n, m48937v());
    }

    /* renamed from: v */
    private RectF m48937v() {
        this.f49679k.set(mo43115u());
        float F = m48912F();
        this.f49679k.inset(F, F);
        return this.f49679k;
    }

    /* renamed from: A */
    public int mo43073A() {
        C10892c cVar = this.f49670b;
        double d = (double) cVar.f49713s;
        double sin = Math.sin(Math.toRadians((double) cVar.f49714t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    /* renamed from: B */
    public int mo43074B() {
        C10892c cVar = this.f49670b;
        double d = (double) cVar.f49713s;
        double cos = Math.cos(Math.toRadians((double) cVar.f49714t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: C */
    public int mo43075C() {
        return this.f49670b.f49712r;
    }

    /* renamed from: D */
    public C10897m mo43076D() {
        return this.f49670b.f49695a;
    }

    /* renamed from: E */
    public ColorStateList mo43077E() {
        return this.f49670b.f49699e;
    }

    /* renamed from: G */
    public float mo43078G() {
        return this.f49670b.f49706l;
    }

    /* renamed from: H */
    public ColorStateList mo43079H() {
        return this.f49670b.f49701g;
    }

    /* renamed from: I */
    public float mo43080I() {
        return this.f49670b.f49695a.mo43136r().mo43065a(mo43115u());
    }

    /* renamed from: J */
    public float mo43081J() {
        return this.f49670b.f49695a.mo43138t().mo43065a(mo43115u());
    }

    /* renamed from: K */
    public float mo43082K() {
        return this.f49670b.f49710p;
    }

    /* renamed from: L */
    public float mo43083L() {
        return mo43116w() + mo43082K();
    }

    /* renamed from: P */
    public void mo43084P(Context context) {
        this.f49670b.f49696b = new C10604a(context);
        m48934p0();
    }

    /* renamed from: R */
    public boolean mo43085R() {
        C10604a aVar = this.f49670b.f49696b;
        return aVar != null && aVar.mo42717e();
    }

    /* renamed from: S */
    public boolean mo43086S() {
        return this.f49670b.f49695a.mo43139u(mo43115u());
    }

    /* renamed from: W */
    public boolean mo43087W() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || (!mo43086S() && !this.f49676h.isConvex() && i < 29);
    }

    /* renamed from: X */
    public void mo43088X(float f) {
        setShapeAppearanceModel(this.f49670b.f49695a.mo43141w(f));
    }

    /* renamed from: Y */
    public void mo43089Y(C10884c cVar) {
        setShapeAppearanceModel(this.f49670b.f49695a.mo43142x(cVar));
    }

    /* renamed from: Z */
    public void mo43090Z(float f) {
        C10892c cVar = this.f49670b;
        if (cVar.f49709o != f) {
            cVar.f49709o = f;
            m48934p0();
        }
    }

    /* renamed from: a0 */
    public void mo43091a0(ColorStateList colorStateList) {
        C10892c cVar = this.f49670b;
        if (cVar.f49698d != colorStateList) {
            cVar.f49698d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void mo43092b0(float f) {
        C10892c cVar = this.f49670b;
        if (cVar.f49705k != f) {
            cVar.f49705k = f;
            this.f49674f = true;
            invalidateSelf();
        }
    }

    /* renamed from: c0 */
    public void mo43093c0(int i, int i2, int i3, int i4) {
        C10892c cVar = this.f49670b;
        if (cVar.f49703i == null) {
            cVar.f49703i = new Rect();
        }
        this.f49670b.f49703i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: d0 */
    public void mo43094d0(Paint.Style style) {
        this.f49670b.f49716v = style;
        m48916Q();
    }

    public void draw(Canvas canvas) {
        this.f49683o.setColorFilter(this.f49688t);
        int alpha = this.f49683o.getAlpha();
        this.f49683o.setAlpha(m48918U(alpha, this.f49670b.f49707m));
        this.f49684p.setColorFilter(this.f49689u);
        this.f49684p.setStrokeWidth(this.f49670b.f49706l);
        int alpha2 = this.f49684p.getAlpha();
        this.f49684p.setAlpha(m48918U(alpha2, this.f49670b.f49707m));
        if (this.f49674f) {
            m48926i();
            m48925g(mo43115u(), this.f49676h);
            this.f49674f = false;
        }
        m48917T(canvas);
        if (m48914N()) {
            m48932o(canvas);
        }
        if (m48915O()) {
            m48936r(canvas);
        }
        this.f49683o.setAlpha(alpha);
        this.f49684p.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo43095e0(float f) {
        C10892c cVar = this.f49670b;
        if (cVar.f49708n != f) {
            cVar.f49708n = f;
            m48934p0();
        }
    }

    /* renamed from: f0 */
    public void mo43096f0(boolean z) {
        this.f49691w = z;
    }

    /* renamed from: g0 */
    public void mo43097g0(int i) {
        this.f49685q.mo43041d(i);
        this.f49670b.f49715u = false;
        m48916Q();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f49670b;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f49670b.f49711q != 2) {
            if (mo43086S()) {
                outline.setRoundRect(getBounds(), mo43080I() * this.f49670b.f49705k);
                return;
            }
            m48925g(mo43115u(), this.f49676h);
            if (this.f49676h.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f49676h);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f49670b.f49703i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f49680l.set(getBounds());
        m48925g(mo43115u(), this.f49676h);
        this.f49681m.setPath(this.f49676h, this.f49680l);
        this.f49680l.op(this.f49681m, Region.Op.DIFFERENCE);
        return this.f49680l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo43101h(RectF rectF, Path path) {
        C10901n nVar = this.f49687s;
        C10892c cVar = this.f49670b;
        C10897m mVar = cVar.f49695a;
        float f = cVar.f49705k;
        nVar.mo43168e(mVar, f, rectF, this.f49686r, path);
    }

    /* renamed from: h0 */
    public void mo43102h0(int i) {
        C10892c cVar = this.f49670b;
        if (cVar.f49714t != i) {
            cVar.f49714t = i;
            m48916Q();
        }
    }

    /* renamed from: i0 */
    public void mo43103i0(int i) {
        C10892c cVar = this.f49670b;
        if (cVar.f49711q != i) {
            cVar.f49711q = i;
            m48916Q();
        }
    }

    public void invalidateSelf() {
        this.f49674f = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f49670b.f49699e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f49670b.f49698d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f49670b.f49701g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f49670b.f49700f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            p6.h$c r0 = r1.f49670b
            android.content.res.ColorStateList r0 = r0.f49701g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            p6.h$c r0 = r1.f49670b
            android.content.res.ColorStateList r0 = r0.f49700f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            p6.h$c r0 = r1.f49670b
            android.content.res.ColorStateList r0 = r0.f49699e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            p6.h$c r0 = r1.f49670b
            android.content.res.ColorStateList r0 = r0.f49698d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p242p6.C10889h.isStateful():boolean");
    }

    /* renamed from: j0 */
    public void mo43105j0(float f, int i) {
        mo43109m0(f);
        mo43108l0(ColorStateList.valueOf(i));
    }

    /* renamed from: k0 */
    public void mo43106k0(float f, ColorStateList colorStateList) {
        mo43109m0(f);
        mo43108l0(colorStateList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo43107l(int i) {
        float L = mo43083L() + mo43119z();
        C10604a aVar = this.f49670b.f49696b;
        return aVar != null ? aVar.mo42715c(i, L) : i;
    }

    /* renamed from: l0 */
    public void mo43108l0(ColorStateList colorStateList) {
        C10892c cVar = this.f49670b;
        if (cVar.f49699e != colorStateList) {
            cVar.f49699e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: m0 */
    public void mo43109m0(float f) {
        this.f49670b.f49706l = f;
        invalidateSelf();
    }

    public Drawable mutate() {
        this.f49670b = new C10892c(this.f49670b);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f49674f = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m48931n0(iArr) || m48933o0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo43112p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m48935q(canvas, paint, path, this.f49670b.f49695a, rectF);
    }

    /* renamed from: s */
    public float mo43113s() {
        return this.f49670b.f49695a.mo43129j().mo43065a(mo43115u());
    }

    public void setAlpha(int i) {
        C10892c cVar = this.f49670b;
        if (cVar.f49707m != i) {
            cVar.f49707m = i;
            m48916Q();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f49670b.f49697c = colorFilter;
        m48916Q();
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        this.f49670b.f49695a = mVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f49670b.f49701g = colorStateList;
        m48933o0();
        m48916Q();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C10892c cVar = this.f49670b;
        if (cVar.f49702h != mode) {
            cVar.f49702h = mode;
            m48933o0();
            m48916Q();
        }
    }

    /* renamed from: t */
    public float mo43114t() {
        return this.f49670b.f49695a.mo43131l().mo43065a(mo43115u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public RectF mo43115u() {
        this.f49678j.set(getBounds());
        return this.f49678j;
    }

    /* renamed from: w */
    public float mo43116w() {
        return this.f49670b.f49709o;
    }

    /* renamed from: x */
    public ColorStateList mo43117x() {
        return this.f49670b.f49698d;
    }

    /* renamed from: y */
    public float mo43118y() {
        return this.f49670b.f49705k;
    }

    /* renamed from: z */
    public float mo43119z() {
        return this.f49670b.f49708n;
    }

    public C10889h() {
        this(new C10897m());
    }

    public C10889h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C10897m.m48996e(context, attributeSet, i, i2).mo43154m());
    }

    public C10889h(C10897m mVar) {
        this(new C10892c(mVar, (C10604a) null));
    }

    private C10889h(C10892c cVar) {
        this.f49671c = new C10905o.C10912g[4];
        this.f49672d = new C10905o.C10912g[4];
        this.f49673e = new BitSet(8);
        this.f49675g = new Matrix();
        this.f49676h = new Path();
        this.f49677i = new Path();
        this.f49678j = new RectF();
        this.f49679k = new RectF();
        this.f49680l = new Region();
        this.f49681m = new Region();
        Paint paint = new Paint(1);
        this.f49683o = paint;
        Paint paint2 = new Paint(1);
        this.f49684p = paint2;
        this.f49685q = new C10857a();
        this.f49687s = Looper.getMainLooper().getThread() == Thread.currentThread() ? C10901n.m49062k() : new C10901n();
        this.f49690v = new RectF();
        this.f49691w = true;
        this.f49670b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f49669y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m48933o0();
        m48931n0(getState());
        this.f49686r = new C10890a();
    }

    /* renamed from: p6.h$c */
    /* compiled from: MaterialShapeDrawable */
    static final class C10892c extends Drawable.ConstantState {

        /* renamed from: a */
        public C10897m f49695a;

        /* renamed from: b */
        public C10604a f49696b;

        /* renamed from: c */
        public ColorFilter f49697c;

        /* renamed from: d */
        public ColorStateList f49698d = null;

        /* renamed from: e */
        public ColorStateList f49699e = null;

        /* renamed from: f */
        public ColorStateList f49700f = null;

        /* renamed from: g */
        public ColorStateList f49701g = null;

        /* renamed from: h */
        public PorterDuff.Mode f49702h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f49703i = null;

        /* renamed from: j */
        public float f49704j = 1.0f;

        /* renamed from: k */
        public float f49705k = 1.0f;

        /* renamed from: l */
        public float f49706l;

        /* renamed from: m */
        public int f49707m = 255;

        /* renamed from: n */
        public float f49708n = 0.0f;

        /* renamed from: o */
        public float f49709o = 0.0f;

        /* renamed from: p */
        public float f49710p = 0.0f;

        /* renamed from: q */
        public int f49711q = 0;

        /* renamed from: r */
        public int f49712r = 0;

        /* renamed from: s */
        public int f49713s = 0;

        /* renamed from: t */
        public int f49714t = 0;

        /* renamed from: u */
        public boolean f49715u = false;

        /* renamed from: v */
        public Paint.Style f49716v = Paint.Style.FILL_AND_STROKE;

        public C10892c(C10897m mVar, C10604a aVar) {
            this.f49695a = mVar;
            this.f49696b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C10889h hVar = new C10889h(this, (C10890a) null);
            boolean unused = hVar.f49674f = true;
            return hVar;
        }

        public C10892c(C10892c cVar) {
            this.f49695a = cVar.f49695a;
            this.f49696b = cVar.f49696b;
            this.f49706l = cVar.f49706l;
            this.f49697c = cVar.f49697c;
            this.f49698d = cVar.f49698d;
            this.f49699e = cVar.f49699e;
            this.f49702h = cVar.f49702h;
            this.f49701g = cVar.f49701g;
            this.f49707m = cVar.f49707m;
            this.f49704j = cVar.f49704j;
            this.f49713s = cVar.f49713s;
            this.f49711q = cVar.f49711q;
            this.f49715u = cVar.f49715u;
            this.f49705k = cVar.f49705k;
            this.f49708n = cVar.f49708n;
            this.f49709o = cVar.f49709o;
            this.f49710p = cVar.f49710p;
            this.f49712r = cVar.f49712r;
            this.f49714t = cVar.f49714t;
            this.f49700f = cVar.f49700f;
            this.f49716v = cVar.f49716v;
            if (cVar.f49703i != null) {
                this.f49703i = new Rect(cVar.f49703i);
            }
        }
    }
}
