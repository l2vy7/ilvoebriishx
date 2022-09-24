package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b0.C1514b;
import p010b0.C1532g;
import p016c0.C2619c;
import p062d0.C5135a;
import p149t.C6077a;

/* renamed from: androidx.vectordrawable.graphics.drawable.i */
/* compiled from: VectorDrawableCompat */
public class C1355i extends C1354h {

    /* renamed from: l */
    static final PorterDuff.Mode f5996l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C1363h f5997c;

    /* renamed from: d */
    private PorterDuffColorFilter f5998d;

    /* renamed from: e */
    private ColorFilter f5999e;

    /* renamed from: f */
    private boolean f6000f;

    /* renamed from: g */
    private boolean f6001g;

    /* renamed from: h */
    private Drawable.ConstantState f6002h;

    /* renamed from: i */
    private final float[] f6003i;

    /* renamed from: j */
    private final Matrix f6004j;

    /* renamed from: k */
    private final Rect f6005k;

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C1357b extends C1361f {
        C1357b() {
        }

        /* renamed from: f */
        private void m7201f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6032b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f6031a = C2619c.m9128d(string2);
            }
            this.f6033c = C1532g.m7913k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo6477c() {
            return true;
        }

        /* renamed from: e */
        public void mo6478e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C1532g.m7920r(xmlPullParser, "pathData")) {
                TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C1343a.f5969d);
                m7201f(s, xmlPullParser);
                s.recycle();
            }
        }

        C1357b(C1357b bVar) {
            super(bVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C1360e {
        private C1360e() {
        }

        /* renamed from: a */
        public boolean mo6479a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo6480b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C1363h extends Drawable.ConstantState {

        /* renamed from: a */
        int f6052a;

        /* renamed from: b */
        C1362g f6053b;

        /* renamed from: c */
        ColorStateList f6054c;

        /* renamed from: d */
        PorterDuff.Mode f6055d;

        /* renamed from: e */
        boolean f6056e;

        /* renamed from: f */
        Bitmap f6057f;

        /* renamed from: g */
        ColorStateList f6058g;

        /* renamed from: h */
        PorterDuff.Mode f6059h;

        /* renamed from: i */
        int f6060i;

        /* renamed from: j */
        boolean f6061j;

        /* renamed from: k */
        boolean f6062k;

        /* renamed from: l */
        Paint f6063l;

        public C1363h(C1363h hVar) {
            this.f6054c = null;
            this.f6055d = C1355i.f5996l;
            if (hVar != null) {
                this.f6052a = hVar.f6052a;
                C1362g gVar = new C1362g(hVar.f6053b);
                this.f6053b = gVar;
                if (hVar.f6053b.f6040e != null) {
                    gVar.f6040e = new Paint(hVar.f6053b.f6040e);
                }
                if (hVar.f6053b.f6039d != null) {
                    this.f6053b.f6039d = new Paint(hVar.f6053b.f6039d);
                }
                this.f6054c = hVar.f6054c;
                this.f6055d = hVar.f6055d;
                this.f6056e = hVar.f6056e;
            }
        }

        /* renamed from: a */
        public boolean mo6526a(int i, int i2) {
            return i == this.f6057f.getWidth() && i2 == this.f6057f.getHeight();
        }

        /* renamed from: b */
        public boolean mo6527b() {
            return !this.f6062k && this.f6058g == this.f6054c && this.f6059h == this.f6055d && this.f6061j == this.f6056e && this.f6060i == this.f6053b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo6528c(int i, int i2) {
            if (this.f6057f == null || !mo6526a(i, i2)) {
                this.f6057f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f6062k = true;
            }
        }

        /* renamed from: d */
        public void mo6529d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6057f, (Rect) null, rect, mo6530e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo6530e(ColorFilter colorFilter) {
            if (!mo6531f() && colorFilter == null) {
                return null;
            }
            if (this.f6063l == null) {
                Paint paint = new Paint();
                this.f6063l = paint;
                paint.setFilterBitmap(true);
            }
            this.f6063l.setAlpha(this.f6053b.getRootAlpha());
            this.f6063l.setColorFilter(colorFilter);
            return this.f6063l;
        }

        /* renamed from: f */
        public boolean mo6531f() {
            return this.f6053b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo6532g() {
            return this.f6053b.mo6520f();
        }

        public int getChangingConfigurations() {
            return this.f6052a;
        }

        /* renamed from: h */
        public boolean mo6534h(int[] iArr) {
            boolean g = this.f6053b.mo6521g(iArr);
            this.f6062k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo6535i() {
            this.f6058g = this.f6054c;
            this.f6059h = this.f6055d;
            this.f6060i = this.f6053b.getRootAlpha();
            this.f6061j = this.f6056e;
            this.f6062k = false;
        }

        /* renamed from: j */
        public void mo6536j(int i, int i2) {
            this.f6057f.eraseColor(0);
            this.f6053b.mo6519b(new Canvas(this.f6057f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C1355i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1355i(this);
        }

        public C1363h() {
            this.f6054c = null;
            this.f6055d = C1355i.f5996l;
            this.f6053b = new C1362g();
        }
    }

    C1355i() {
        this.f6001g = true;
        this.f6003i = new float[9];
        this.f6004j = new Matrix();
        this.f6005k = new Rect();
        this.f5997c = new C1363h();
    }

    /* renamed from: a */
    static int m7191a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1355i m7192b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.i r0 = new androidx.vectordrawable.graphics.drawable.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p010b0.C1523f.m7886e(r6, r7, r8)
            r0.f5995b = r6
            androidx.vectordrawable.graphics.drawable.i$i r6 = new androidx.vectordrawable.graphics.drawable.i$i
            android.graphics.drawable.Drawable r7 = r0.f5995b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f6002h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.i r6 = m7193c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1355i.m7192b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.i");
    }

    /* renamed from: c */
    public static C1355i m7193c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1355i iVar = new C1355i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: e */
    private void m7194e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1363h hVar = this.f5997c;
        C1362g gVar = hVar.f6053b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f6043h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1359d dVar = (C1359d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1358c cVar = new C1358c();
                    cVar.mo6481g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6019b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f6051p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f6052a = cVar.f6034d | hVar.f6052a;
                } else if ("clip-path".equals(name)) {
                    C1357b bVar = new C1357b();
                    bVar.mo6478e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6019b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f6051p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f6052a = bVar.f6034d | hVar.f6052a;
                } else if ("group".equals(name)) {
                    C1359d dVar2 = new C1359d();
                    dVar2.mo6498c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6019b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f6051p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f6052a = dVar2.f6028k | hVar.f6052a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m7195f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C5135a.m23406f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m7196g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m7197i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C1363h hVar = this.f5997c;
        C1362g gVar = hVar.f6053b;
        hVar.f6055d = m7196g(C1532g.m7913k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g = C1532g.m7909g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g != null) {
            hVar.f6054c = g;
        }
        hVar.f6056e = C1532g.m7907e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f6056e);
        gVar.f6046k = C1532g.m7912j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f6046k);
        float j = C1532g.m7912j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f6047l);
        gVar.f6047l = j;
        if (gVar.f6046k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > 0.0f) {
            gVar.f6044i = typedArray.getDimension(3, gVar.f6044i);
            float dimension = typedArray.getDimension(2, gVar.f6045j);
            gVar.f6045j = dimension;
            if (gVar.f6044i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C1532g.m7912j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f6049n = string;
                    gVar.f6051p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5995b;
        if (drawable == null) {
            return false;
        }
        C5135a.m23402b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo6452d(String str) {
        return this.f5997c.f6053b.f6051p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6005k);
        if (this.f6005k.width() > 0 && this.f6005k.height() > 0) {
            ColorFilter colorFilter = this.f5999e;
            if (colorFilter == null) {
                colorFilter = this.f5998d;
            }
            canvas.getMatrix(this.f6004j);
            this.f6004j.getValues(this.f6003i);
            float abs = Math.abs(this.f6003i[0]);
            float abs2 = Math.abs(this.f6003i[4]);
            float abs3 = Math.abs(this.f6003i[1]);
            float abs4 = Math.abs(this.f6003i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f6005k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f6005k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f6005k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m7195f()) {
                    canvas.translate((float) this.f6005k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f6005k.offsetTo(0, 0);
                this.f5997c.mo6528c(min, min2);
                if (!this.f6001g) {
                    this.f5997c.mo6536j(min, min2);
                } else if (!this.f5997c.mo6527b()) {
                    this.f5997c.mo6536j(min, min2);
                    this.f5997c.mo6535i();
                }
                this.f5997c.mo6529d(canvas, colorFilter, this.f6005k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23404d(drawable);
        }
        return this.f5997c.f6053b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5997c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23405e(drawable);
        }
        return this.f5999e;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5995b != null && Build.VERSION.SDK_INT >= 24) {
            return new C1364i(this.f5995b.getConstantState());
        }
        this.f5997c.f6052a = getChangingConfigurations();
        return this.f5997c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f5997c.f6053b.f6045j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5997c.f6053b.f6044i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6461h(boolean z) {
        this.f6001g = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23408h(drawable);
        }
        return this.f5997c.f6056e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f5997c.f6054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f5997c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5995b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.i$h r0 = r1.f5997c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo6532g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.i$h r0 = r1.f5997c
            android.content.res.ColorStateList r0 = r0.f6054c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1355i.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo6467j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6000f && super.mutate() == this) {
            this.f5997c = new C1363h(this.f5997c);
            this.f6000f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1363h hVar = this.f5997c;
        ColorStateList colorStateList = hVar.f6054c;
        if (!(colorStateList == null || (mode = hVar.f6055d) == null)) {
            this.f5998d = mo6467j(this.f5998d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo6532g() || !hVar.mo6534h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5997c.f6053b.getRootAlpha() != i) {
            this.f5997c.f6053b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23410j(drawable, z);
        } else {
            this.f5997c.f6056e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23414n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23415o(drawable, colorStateList);
            return;
        }
        C1363h hVar = this.f5997c;
        if (hVar.f6054c != colorStateList) {
            hVar.f6054c = colorStateList;
            this.f5998d = mo6467j(this.f5998d, colorStateList, hVar.f6055d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23416p(drawable, mode);
            return;
        }
        C1363h hVar = this.f5997c;
        if (hVar.f6055d != mode) {
            hVar.f6055d = mode;
            this.f5998d = mo6467j(this.f5998d, hVar.f6054c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i */
    /* compiled from: VectorDrawableCompat */
    private static class C1364i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f6064a;

        public C1364i(Drawable.ConstantState constantState) {
            this.f6064a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f6064a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f6064a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1355i iVar = new C1355i();
            iVar.f5995b = (VectorDrawable) this.f6064a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1355i iVar = new C1355i();
            iVar.f5995b = (VectorDrawable) this.f6064a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1355i iVar = new C1355i();
            iVar.f5995b = (VectorDrawable) this.f6064a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5999e = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C1361f extends C1360e {

        /* renamed from: a */
        protected C2619c.C2621b[] f6031a = null;

        /* renamed from: b */
        String f6032b;

        /* renamed from: c */
        int f6033c = 0;

        /* renamed from: d */
        int f6034d;

        public C1361f() {
            super();
        }

        /* renamed from: c */
        public boolean mo6477c() {
            return false;
        }

        /* renamed from: d */
        public void mo6515d(Path path) {
            path.reset();
            C2619c.C2621b[] bVarArr = this.f6031a;
            if (bVarArr != null) {
                C2619c.C2621b.m9138e(bVarArr, path);
            }
        }

        public C2619c.C2621b[] getPathData() {
            return this.f6031a;
        }

        public String getPathName() {
            return this.f6032b;
        }

        public void setPathData(C2619c.C2621b[] bVarArr) {
            if (!C2619c.m9126b(this.f6031a, bVarArr)) {
                this.f6031a = C2619c.m9130f(bVarArr);
            } else {
                C2619c.m9134j(this.f6031a, bVarArr);
            }
        }

        public C1361f(C1361f fVar) {
            super();
            this.f6032b = fVar.f6032b;
            this.f6034d = fVar.f6034d;
            this.f6031a = C2619c.m9130f(fVar.f6031a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23407g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1363h hVar = this.f5997c;
        hVar.f6053b = new C1362g();
        TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C1343a.f5966a);
        m7197i(s, xmlPullParser, theme);
        s.recycle();
        hVar.f6052a = getChangingConfigurations();
        hVar.f6062k = true;
        m7194e(resources, xmlPullParser, attributeSet, theme);
        this.f5998d = mo6467j(this.f5998d, hVar.f6054c, hVar.f6055d);
    }

    C1355i(C1363h hVar) {
        this.f6001g = true;
        this.f6003i = new float[9];
        this.f6004j = new Matrix();
        this.f6005k = new Rect();
        this.f5997c = hVar;
        this.f5998d = mo6467j(this.f5998d, hVar.f6054c, hVar.f6055d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C1358c extends C1361f {

        /* renamed from: e */
        private int[] f6006e;

        /* renamed from: f */
        C1514b f6007f;

        /* renamed from: g */
        float f6008g = 0.0f;

        /* renamed from: h */
        C1514b f6009h;

        /* renamed from: i */
        float f6010i = 1.0f;

        /* renamed from: j */
        float f6011j = 1.0f;

        /* renamed from: k */
        float f6012k = 0.0f;

        /* renamed from: l */
        float f6013l = 1.0f;

        /* renamed from: m */
        float f6014m = 0.0f;

        /* renamed from: n */
        Paint.Cap f6015n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f6016o = Paint.Join.MITER;

        /* renamed from: p */
        float f6017p = 4.0f;

        C1358c() {
        }

        /* renamed from: e */
        private Paint.Cap m7204e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* renamed from: f */
        private Paint.Join m7205f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* renamed from: h */
        private void m7206h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6006e = null;
            if (C1532g.m7920r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f6032b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f6031a = C2619c.m9128d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f6009h = C1532g.m7911i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f6011j = C1532g.m7912j(typedArray, xmlPullParser, "fillAlpha", 12, this.f6011j);
                this.f6015n = m7204e(C1532g.m7913k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f6015n);
                this.f6016o = m7205f(C1532g.m7913k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6016o);
                this.f6017p = C1532g.m7912j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f6017p);
                this.f6007f = C1532g.m7911i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f6010i = C1532g.m7912j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6010i);
                this.f6008g = C1532g.m7912j(typedArray, xmlPullParser, "strokeWidth", 4, this.f6008g);
                this.f6013l = C1532g.m7912j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f6013l);
                this.f6014m = C1532g.m7912j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6014m);
                this.f6012k = C1532g.m7912j(typedArray, xmlPullParser, "trimPathStart", 5, this.f6012k);
                this.f6033c = C1532g.m7913k(typedArray, xmlPullParser, "fillType", 13, this.f6033c);
            }
        }

        /* renamed from: a */
        public boolean mo6479a() {
            return this.f6009h.mo7065i() || this.f6007f.mo7065i();
        }

        /* renamed from: b */
        public boolean mo6480b(int[] iArr) {
            return this.f6007f.mo7066j(iArr) | this.f6009h.mo7066j(iArr);
        }

        /* renamed from: g */
        public void mo6481g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C1343a.f5968c);
            m7206h(s, xmlPullParser, theme);
            s.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f6011j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f6009h.mo7062e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f6010i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f6007f.mo7062e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f6008g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f6013l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f6014m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f6012k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f6011j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f6009h.mo7067k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f6010i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f6007f.mo7067k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f6008g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f6013l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f6014m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f6012k = f;
        }

        C1358c(C1358c cVar) {
            super(cVar);
            this.f6006e = cVar.f6006e;
            this.f6007f = cVar.f6007f;
            this.f6008g = cVar.f6008g;
            this.f6010i = cVar.f6010i;
            this.f6009h = cVar.f6009h;
            this.f6033c = cVar.f6033c;
            this.f6011j = cVar.f6011j;
            this.f6012k = cVar.f6012k;
            this.f6013l = cVar.f6013l;
            this.f6014m = cVar.f6014m;
            this.f6015n = cVar.f6015n;
            this.f6016o = cVar.f6016o;
            this.f6017p = cVar.f6017p;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C1362g {

        /* renamed from: q */
        private static final Matrix f6035q = new Matrix();

        /* renamed from: a */
        private final Path f6036a;

        /* renamed from: b */
        private final Path f6037b;

        /* renamed from: c */
        private final Matrix f6038c;

        /* renamed from: d */
        Paint f6039d;

        /* renamed from: e */
        Paint f6040e;

        /* renamed from: f */
        private PathMeasure f6041f;

        /* renamed from: g */
        private int f6042g;

        /* renamed from: h */
        final C1359d f6043h;

        /* renamed from: i */
        float f6044i;

        /* renamed from: j */
        float f6045j;

        /* renamed from: k */
        float f6046k;

        /* renamed from: l */
        float f6047l;

        /* renamed from: m */
        int f6048m;

        /* renamed from: n */
        String f6049n;

        /* renamed from: o */
        Boolean f6050o;

        /* renamed from: p */
        final C6077a<String, Object> f6051p;

        public C1362g() {
            this.f6038c = new Matrix();
            this.f6044i = 0.0f;
            this.f6045j = 0.0f;
            this.f6046k = 0.0f;
            this.f6047l = 0.0f;
            this.f6048m = 255;
            this.f6049n = null;
            this.f6050o = null;
            this.f6051p = new C6077a<>();
            this.f6043h = new C1359d();
            this.f6036a = new Path();
            this.f6037b = new Path();
        }

        /* renamed from: a */
        private static float m7219a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m7220c(C1359d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f6018a.set(matrix);
            dVar.f6018a.preConcat(dVar.f6027j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f6019b.size(); i3++) {
                C1360e eVar = dVar.f6019b.get(i3);
                if (eVar instanceof C1359d) {
                    m7220c((C1359d) eVar, dVar.f6018a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1361f) {
                    m7221d(dVar, (C1361f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m7221d(C1359d dVar, C1361f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f6046k;
            float f2 = ((float) i2) / this.f6047l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f6018a;
            this.f6038c.set(matrix);
            this.f6038c.postScale(f, f2);
            float e = m7222e(matrix);
            if (e != 0.0f) {
                fVar.mo6515d(this.f6036a);
                Path path = this.f6036a;
                this.f6037b.reset();
                if (fVar.mo6477c()) {
                    this.f6037b.setFillType(fVar.f6033c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f6037b.addPath(path, this.f6038c);
                    canvas.clipPath(this.f6037b);
                    return;
                }
                C1358c cVar = (C1358c) fVar;
                float f3 = cVar.f6012k;
                if (!(f3 == 0.0f && cVar.f6013l == 1.0f)) {
                    float f4 = cVar.f6014m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f6013l + f4) % 1.0f;
                    if (this.f6041f == null) {
                        this.f6041f = new PathMeasure();
                    }
                    this.f6041f.setPath(this.f6036a, false);
                    float length = this.f6041f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f6041f.getSegment(f7, length, path, true);
                        this.f6041f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f6041f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f6037b.addPath(path, this.f6038c);
                if (cVar.f6009h.mo7068l()) {
                    C1514b bVar = cVar.f6009h;
                    if (this.f6040e == null) {
                        Paint paint = new Paint(1);
                        this.f6040e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f6040e;
                    if (bVar.mo7064h()) {
                        Shader f9 = bVar.mo7063f();
                        f9.setLocalMatrix(this.f6038c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f6011j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1355i.m7191a(bVar.mo7062e(), cVar.f6011j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f6037b.setFillType(cVar.f6033c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f6037b, paint2);
                }
                if (cVar.f6007f.mo7068l()) {
                    C1514b bVar2 = cVar.f6007f;
                    if (this.f6039d == null) {
                        Paint paint3 = new Paint(1);
                        this.f6039d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f6039d;
                    Paint.Join join = cVar.f6016o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f6015n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f6017p);
                    if (bVar2.mo7064h()) {
                        Shader f10 = bVar2.mo7063f();
                        f10.setLocalMatrix(this.f6038c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f6010i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1355i.m7191a(bVar2.mo7062e(), cVar.f6010i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f6008g * min * e);
                    canvas.drawPath(this.f6037b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m7222e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m7219a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo6519b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m7220c(this.f6043h, f6035q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo6520f() {
            if (this.f6050o == null) {
                this.f6050o = Boolean.valueOf(this.f6043h.mo6479a());
            }
            return this.f6050o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo6521g(int[] iArr) {
            return this.f6043h.mo6480b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6048m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f6048m = i;
        }

        public C1362g(C1362g gVar) {
            this.f6038c = new Matrix();
            this.f6044i = 0.0f;
            this.f6045j = 0.0f;
            this.f6046k = 0.0f;
            this.f6047l = 0.0f;
            this.f6048m = 255;
            this.f6049n = null;
            this.f6050o = null;
            C6077a<String, Object> aVar = new C6077a<>();
            this.f6051p = aVar;
            this.f6043h = new C1359d(gVar.f6043h, aVar);
            this.f6036a = new Path(gVar.f6036a);
            this.f6037b = new Path(gVar.f6037b);
            this.f6044i = gVar.f6044i;
            this.f6045j = gVar.f6045j;
            this.f6046k = gVar.f6046k;
            this.f6047l = gVar.f6047l;
            this.f6042g = gVar.f6042g;
            this.f6048m = gVar.f6048m;
            this.f6049n = gVar.f6049n;
            String str = gVar.f6049n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f6050o = gVar.f6050o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$d */
    /* compiled from: VectorDrawableCompat */
    private static class C1359d extends C1360e {

        /* renamed from: a */
        final Matrix f6018a;

        /* renamed from: b */
        final ArrayList<C1360e> f6019b;

        /* renamed from: c */
        float f6020c;

        /* renamed from: d */
        private float f6021d;

        /* renamed from: e */
        private float f6022e;

        /* renamed from: f */
        private float f6023f;

        /* renamed from: g */
        private float f6024g;

        /* renamed from: h */
        private float f6025h;

        /* renamed from: i */
        private float f6026i;

        /* renamed from: j */
        final Matrix f6027j;

        /* renamed from: k */
        int f6028k;

        /* renamed from: l */
        private int[] f6029l;

        /* renamed from: m */
        private String f6030m;

        public C1359d(C1359d dVar, C6077a<String, Object> aVar) {
            super();
            C1361f fVar;
            this.f6018a = new Matrix();
            this.f6019b = new ArrayList<>();
            this.f6020c = 0.0f;
            this.f6021d = 0.0f;
            this.f6022e = 0.0f;
            this.f6023f = 1.0f;
            this.f6024g = 1.0f;
            this.f6025h = 0.0f;
            this.f6026i = 0.0f;
            Matrix matrix = new Matrix();
            this.f6027j = matrix;
            this.f6030m = null;
            this.f6020c = dVar.f6020c;
            this.f6021d = dVar.f6021d;
            this.f6022e = dVar.f6022e;
            this.f6023f = dVar.f6023f;
            this.f6024g = dVar.f6024g;
            this.f6025h = dVar.f6025h;
            this.f6026i = dVar.f6026i;
            this.f6029l = dVar.f6029l;
            String str = dVar.f6030m;
            this.f6030m = str;
            this.f6028k = dVar.f6028k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f6027j);
            ArrayList<C1360e> arrayList = dVar.f6019b;
            for (int i = 0; i < arrayList.size(); i++) {
                C1360e eVar = arrayList.get(i);
                if (eVar instanceof C1359d) {
                    this.f6019b.add(new C1359d((C1359d) eVar, aVar));
                } else {
                    if (eVar instanceof C1358c) {
                        fVar = new C1358c((C1358c) eVar);
                    } else if (eVar instanceof C1357b) {
                        fVar = new C1357b((C1357b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f6019b.add(fVar);
                    String str2 = fVar.f6032b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m7210d() {
            this.f6027j.reset();
            this.f6027j.postTranslate(-this.f6021d, -this.f6022e);
            this.f6027j.postScale(this.f6023f, this.f6024g);
            this.f6027j.postRotate(this.f6020c, 0.0f, 0.0f);
            this.f6027j.postTranslate(this.f6025h + this.f6021d, this.f6026i + this.f6022e);
        }

        /* renamed from: e */
        private void m7211e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f6029l = null;
            this.f6020c = C1532g.m7912j(typedArray, xmlPullParser, "rotation", 5, this.f6020c);
            this.f6021d = typedArray.getFloat(1, this.f6021d);
            this.f6022e = typedArray.getFloat(2, this.f6022e);
            this.f6023f = C1532g.m7912j(typedArray, xmlPullParser, "scaleX", 3, this.f6023f);
            this.f6024g = C1532g.m7912j(typedArray, xmlPullParser, "scaleY", 4, this.f6024g);
            this.f6025h = C1532g.m7912j(typedArray, xmlPullParser, "translateX", 6, this.f6025h);
            this.f6026i = C1532g.m7912j(typedArray, xmlPullParser, "translateY", 7, this.f6026i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6030m = string;
            }
            m7210d();
        }

        /* renamed from: a */
        public boolean mo6479a() {
            for (int i = 0; i < this.f6019b.size(); i++) {
                if (this.f6019b.get(i).mo6479a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo6480b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f6019b.size(); i++) {
                z |= this.f6019b.get(i).mo6480b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo6498c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C1343a.f5967b);
            m7211e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.f6030m;
        }

        public Matrix getLocalMatrix() {
            return this.f6027j;
        }

        public float getPivotX() {
            return this.f6021d;
        }

        public float getPivotY() {
            return this.f6022e;
        }

        public float getRotation() {
            return this.f6020c;
        }

        public float getScaleX() {
            return this.f6023f;
        }

        public float getScaleY() {
            return this.f6024g;
        }

        public float getTranslateX() {
            return this.f6025h;
        }

        public float getTranslateY() {
            return this.f6026i;
        }

        public void setPivotX(float f) {
            if (f != this.f6021d) {
                this.f6021d = f;
                m7210d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f6022e) {
                this.f6022e = f;
                m7210d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f6020c) {
                this.f6020c = f;
                m7210d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f6023f) {
                this.f6023f = f;
                m7210d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f6024g) {
                this.f6024g = f;
                m7210d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f6025h) {
                this.f6025h = f;
                m7210d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f6026i) {
                this.f6026i = f;
                m7210d();
            }
        }

        public C1359d() {
            super();
            this.f6018a = new Matrix();
            this.f6019b = new ArrayList<>();
            this.f6020c = 0.0f;
            this.f6021d = 0.0f;
            this.f6022e = 0.0f;
            this.f6023f = 1.0f;
            this.f6024g = 1.0f;
            this.f6025h = 0.0f;
            this.f6026i = 0.0f;
            this.f6027j = new Matrix();
            this.f6030m = null;
        }
    }
}
