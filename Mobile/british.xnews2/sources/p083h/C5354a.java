package p083h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0421v;
import androidx.vectordrawable.graphics.drawable.C1345c;
import androidx.vectordrawable.graphics.drawable.C1355i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b0.C1532g;
import p062d0.C5136b;
import p083h.C5362b;
import p083h.C5367d;
import p088i.C5419b;
import p149t.C6082d;
import p149t.C6091h;

@SuppressLint({"RestrictedAPI"})
/* renamed from: h.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C5354a extends C5367d implements C5136b {

    /* renamed from: u */
    private static final String f23571u = C5354a.class.getSimpleName();

    /* renamed from: p */
    private C5357c f23572p;

    /* renamed from: q */
    private C5361g f23573q;

    /* renamed from: r */
    private int f23574r;

    /* renamed from: s */
    private int f23575s;

    /* renamed from: t */
    private boolean f23576t;

    /* renamed from: h.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C5356b extends C5361g {

        /* renamed from: a */
        private final Animatable f23577a;

        C5356b(Animatable animatable) {
            super();
            this.f23577a = animatable;
        }

        /* renamed from: c */
        public void mo21696c() {
            this.f23577a.start();
        }

        /* renamed from: d */
        public void mo21697d() {
            this.f23577a.stop();
        }
    }

    /* renamed from: h.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C5357c extends C5367d.C5368a {

        /* renamed from: K */
        C6082d<Long> f23578K;

        /* renamed from: L */
        C6091h<Integer> f23579L;

        C5357c(C5357c cVar, C5354a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f23578K = cVar.f23578K;
                this.f23579L = cVar.f23579L;
                return;
            }
            this.f23578K = new C6082d<>();
            this.f23579L = new C6091h<>();
        }

        /* renamed from: D */
        private static long m24116D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo21698B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo21781z(iArr, drawable);
            this.f23579L.mo23407l(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo21699C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo21726a(drawable);
            long D = m24116D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f23578K.mo23294a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f23578K.mo23294a(m24116D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo21700E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f23579L.mo23404h(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo21701F(int[] iArr) {
            int A = super.mo21780A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.mo21780A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo21702G(int i, int i2) {
            return (int) this.f23578K.mo23299h(m24116D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo21703H(int i, int i2) {
            return (this.f23578K.mo23299h(m24116D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo21704I(int i, int i2) {
            return (this.f23578K.mo23299h(m24116D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C5354a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo21707r() {
            this.f23578K = this.f23578K.clone();
            this.f23579L = this.f23579L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C5354a(this, resources);
        }
    }

    /* renamed from: h.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C5358d extends C5361g {

        /* renamed from: a */
        private final C1345c f23580a;

        C5358d(C1345c cVar) {
            super();
            this.f23580a = cVar;
        }

        /* renamed from: c */
        public void mo21696c() {
            this.f23580a.start();
        }

        /* renamed from: d */
        public void mo21697d() {
            this.f23580a.stop();
        }
    }

    /* renamed from: h.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C5359e extends C5361g {

        /* renamed from: a */
        private final ObjectAnimator f23581a;

        /* renamed from: b */
        private final boolean f23582b;

        C5359e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C5360f fVar = new C5360f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo21710a());
            ofInt.setInterpolator(fVar);
            this.f23582b = z2;
            this.f23581a = ofInt;
        }

        /* renamed from: a */
        public boolean mo21708a() {
            return this.f23582b;
        }

        /* renamed from: b */
        public void mo21709b() {
            this.f23581a.reverse();
        }

        /* renamed from: c */
        public void mo21696c() {
            this.f23581a.start();
        }

        /* renamed from: d */
        public void mo21697d() {
            this.f23581a.cancel();
        }
    }

    /* renamed from: h.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C5360f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f23583a;

        /* renamed from: b */
        private int f23584b;

        /* renamed from: c */
        private int f23585c;

        C5360f(AnimationDrawable animationDrawable, boolean z) {
            mo21711b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo21710a() {
            return this.f23585c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo21711b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f23584b = numberOfFrames;
            int[] iArr = this.f23583a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f23583a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f23583a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f23585c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f23585c)) + 0.5f);
            int i2 = this.f23584b;
            int[] iArr = this.f23583a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f23585c) : 0.0f);
        }
    }

    /* renamed from: h.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C5361g {
        private C5361g() {
        }

        /* renamed from: a */
        public boolean mo21708a() {
            return false;
        }

        /* renamed from: b */
        public void mo21709b() {
        }

        /* renamed from: c */
        public abstract void mo21696c();

        /* renamed from: d */
        public abstract void mo21697d();
    }

    public C5354a() {
        this((C5357c) null, (Resources) null);
    }

    /* renamed from: m */
    public static C5354a m24102m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C5354a aVar = new C5354a();
            aVar.mo21684n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m24103o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m24105q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m24106r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m24104p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m24105q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C5419b.f23756h);
        int resourceId = s.getResourceId(C5419b.f23757i, 0);
        int resourceId2 = s.getResourceId(C5419b.f23758j, -1);
        Drawable j = resourceId2 > 0 ? C0421v.m2245h().mo2259j(context, resourceId2) : null;
        s.recycle();
        int[] k = mo21779k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j = C1355i.m7193c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j != null) {
            return this.f23572p.mo21698B(k, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m24106r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C5419b.f23759k);
        int resourceId = s.getResourceId(C5419b.f23762n, -1);
        int resourceId2 = s.getResourceId(C5419b.f23761m, -1);
        int resourceId3 = s.getResourceId(C5419b.f23760l, -1);
        Drawable j = resourceId3 > 0 ? C0421v.m2245h().mo2259j(context, resourceId3) : null;
        boolean z = s.getBoolean(C5419b.f23763o, false);
        s.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j = C1345c.m7160a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f23572p.mo21699C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m24107s(int i) {
        int i2;
        int G;
        C5361g gVar;
        C5361g gVar2 = this.f23573q;
        if (gVar2 == null) {
            i2 = mo21714c();
        } else if (i == this.f23574r) {
            return true;
        } else {
            if (i != this.f23575s || !gVar2.mo21708a()) {
                i2 = this.f23574r;
                gVar2.mo21697d();
            } else {
                gVar2.mo21709b();
                this.f23574r = this.f23575s;
                this.f23575s = i;
                return true;
            }
        }
        this.f23573q = null;
        this.f23575s = -1;
        this.f23574r = -1;
        C5357c cVar = this.f23572p;
        int E = cVar.mo21700E(i2);
        int E2 = cVar.mo21700E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo21702G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo21704I(E, E2);
        mo21715g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C5359e((AnimationDrawable) current, cVar.mo21703H(E, E2), I);
        } else if (current instanceof C1345c) {
            gVar = new C5358d((C1345c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C5356b((Animatable) current);
            }
            return false;
        }
        gVar.mo21696c();
        this.f23573q = gVar;
        this.f23575s = i2;
        this.f23574r = i;
        return true;
    }

    /* renamed from: t */
    private void m24108t(TypedArray typedArray) {
        C5357c cVar = this.f23572p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f23612d |= typedArray.getChangingConfigurations();
        }
        cVar.mo21748x(typedArray.getBoolean(C5419b.f23752d, cVar.f23617i));
        cVar.mo21744t(typedArray.getBoolean(C5419b.f23753e, cVar.f23620l));
        cVar.mo21745u(typedArray.getInt(C5419b.f23754f, cVar.f23600A));
        cVar.mo21746v(typedArray.getInt(C5419b.f23755g, cVar.f23601B));
        setDither(typedArray.getBoolean(C5419b.f23750b, cVar.f23632x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo21676h(C5362b.C5365c cVar) {
        super.mo21676h(cVar);
        if (cVar instanceof C5357c) {
            this.f23572p = (C5357c) cVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C5361g gVar = this.f23573q;
        if (gVar != null) {
            gVar.mo21697d();
            this.f23573q = null;
            mo21715g(this.f23574r);
            this.f23574r = -1;
            this.f23575s = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C5357c mo21680j() {
        return new C5357c(this.f23572p, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f23576t && super.mutate() == this) {
            this.f23572p.mo21707r();
            this.f23576t = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo21684n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C5419b.f23749a);
        setVisible(s.getBoolean(C5419b.f23751c, true), true);
        m24108t(s);
        mo21717i(resources);
        s.recycle();
        m24103o(context, resources, xmlPullParser, attributeSet, theme);
        m24104p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f23572p.mo21701F(iArr);
        boolean z = F != mo21714c() && (m24107s(F) || mo21715g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C5361g gVar = this.f23573q;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo21696c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C5354a(C5357c cVar, Resources resources) {
        super((C5367d.C5368a) null);
        this.f23574r = -1;
        this.f23575s = -1;
        mo21676h(new C5357c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
