package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b0.C1532g;
import p062d0.C5135a;
import p149t.C6077a;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
/* compiled from: AnimatedVectorDrawableCompat */
public class C1345c extends C1354h implements Animatable {

    /* renamed from: c */
    private C1347b f5978c;

    /* renamed from: d */
    private Context f5979d;

    /* renamed from: e */
    private ArgbEvaluator f5980e;

    /* renamed from: f */
    private Animator.AnimatorListener f5981f;

    /* renamed from: g */
    ArrayList<C1344b> f5982g;

    /* renamed from: h */
    final Drawable.Callback f5983h;

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C1346a implements Drawable.Callback {
        C1346a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1345c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1345c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1345c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C1347b extends Drawable.ConstantState {

        /* renamed from: a */
        int f5985a;

        /* renamed from: b */
        C1355i f5986b;

        /* renamed from: c */
        AnimatorSet f5987c;

        /* renamed from: d */
        ArrayList<Animator> f5988d;

        /* renamed from: e */
        C6077a<Animator, String> f5989e;

        public C1347b(Context context, C1347b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5985a = bVar.f5985a;
                C1355i iVar = bVar.f5986b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f5986b = (C1355i) constantState.newDrawable(resources);
                    } else {
                        this.f5986b = (C1355i) constantState.newDrawable();
                    }
                    C1355i iVar2 = (C1355i) this.f5986b.mutate();
                    this.f5986b = iVar2;
                    iVar2.setCallback(callback);
                    this.f5986b.setBounds(bVar.f5986b.getBounds());
                    this.f5986b.mo6461h(false);
                }
                ArrayList<Animator> arrayList = bVar.f5988d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5988d = new ArrayList<>(size);
                    this.f5989e = new C6077a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f5988d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f5989e.get(animator);
                        clone.setTarget(this.f5986b.mo6452d(str));
                        this.f5988d.add(clone);
                        this.f5989e.put(clone, str);
                    }
                    mo6438a();
                }
            }
        }

        /* renamed from: a */
        public void mo6438a() {
            if (this.f5987c == null) {
                this.f5987c = new AnimatorSet();
            }
            this.f5987c.playTogether(this.f5988d);
        }

        public int getChangingConfigurations() {
            return this.f5985a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C1345c() {
        this((Context) null, (C1347b) null, (Resources) null);
    }

    /* renamed from: a */
    public static C1345c m7160a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1345c cVar = new C1345c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: b */
    private void m7161b(String str, Animator animator) {
        animator.setTarget(this.f5978c.f5986b.mo6452d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m7162c(animator);
        }
        C1347b bVar = this.f5978c;
        if (bVar.f5988d == null) {
            bVar.f5988d = new ArrayList<>();
            this.f5978c.f5989e = new C6077a<>();
        }
        this.f5978c.f5988d.add(animator);
        this.f5978c.f5989e.put(animator, str);
    }

    /* renamed from: c */
    private void m7162c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m7162c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f5980e == null) {
                    this.f5980e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f5980e);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23401a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23402b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5978c.f5986b.draw(canvas);
        if (this.f5978c.f5987c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23404d(drawable);
        }
        return this.f5978c.f5986b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5978c.f5985a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23405e(drawable);
        }
        return this.f5978c.f5986b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5995b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1348c(this.f5995b.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5978c.f5986b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5978c.f5986b.getIntrinsicWidth();
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
        return this.f5978c.f5986b.getOpacity();
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

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23407g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s = C1532g.m7921s(resources, theme, attributeSet, C1343a.f5970e);
                    int resourceId = s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1355i b = C1355i.m7192b(resources, resourceId, theme);
                        b.mo6461h(false);
                        b.setCallback(this.f5983h);
                        C1355i iVar = this.f5978c.f5986b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f5978c.f5986b = b;
                    }
                    s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1343a.f5971f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5979d;
                        if (context != null) {
                            m7161b(string, C1350e.m7174i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f5978c.mo6438a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return C5135a.m23408h(drawable);
        }
        return this.f5978c.f5986b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5978c.f5987c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5978c.f5986b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5978c.f5986b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5978c.f5986b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5978c.f5986b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5978c.f5986b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23410j(drawable, z);
        } else {
            this.f5978c.f5986b.setAutoMirrored(z);
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
            this.f5978c.f5986b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23415o(drawable, colorStateList);
        } else {
            this.f5978c.f5986b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            C5135a.m23416p(drawable, mode);
        } else {
            this.f5978c.f5986b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5978c.f5986b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5978c.f5987c.isStarted()) {
            this.f5978c.f5987c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5978c.f5987c.end();
        }
    }

    private C1345c(Context context) {
        this(context, (C1347b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5995b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5978c.f5986b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C1348c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5990a;

        public C1348c(Drawable.ConstantState constantState) {
            this.f5990a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5990a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5990a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1345c cVar = new C1345c();
            Drawable newDrawable = this.f5990a.newDrawable();
            cVar.f5995b = newDrawable;
            newDrawable.setCallback(cVar.f5983h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1345c cVar = new C1345c();
            Drawable newDrawable = this.f5990a.newDrawable(resources);
            cVar.f5995b = newDrawable;
            newDrawable.setCallback(cVar.f5983h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1345c cVar = new C1345c();
            Drawable newDrawable = this.f5990a.newDrawable(resources, theme);
            cVar.f5995b = newDrawable;
            newDrawable.setCallback(cVar.f5983h);
            return cVar;
        }
    }

    private C1345c(Context context, C1347b bVar, Resources resources) {
        this.f5980e = null;
        this.f5981f = null;
        this.f5982g = null;
        C1346a aVar = new C1346a();
        this.f5983h = aVar;
        this.f5979d = context;
        if (bVar != null) {
            this.f5978c = bVar;
        } else {
            this.f5978c = new C1347b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
