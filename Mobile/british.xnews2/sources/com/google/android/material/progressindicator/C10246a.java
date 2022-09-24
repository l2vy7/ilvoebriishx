package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.vectordrawable.graphics.drawable.C1344b;
import com.google.android.material.internal.C10220m;
import com.google.android.material.progressindicator.C10251b;
import java.util.Arrays;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6531k;
import p193c6.C6532l;
import p207f6.C10538a;
import p229l6.C10724a;
import p245q6.C10962a;

/* renamed from: com.google.android.material.progressindicator.a */
/* compiled from: BaseProgressIndicator */
public abstract class C10246a<S extends C10251b> extends ProgressBar {

    /* renamed from: p */
    static final int f48222p = C6531k.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: b */
    S f48223b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f48224c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f48225d;

    /* renamed from: e */
    private boolean f48226e;

    /* renamed from: f */
    private final int f48227f;

    /* renamed from: g */
    private final int f48228g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f48229h = -1;

    /* renamed from: i */
    C10724a f48230i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f48231j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f48232k = 4;

    /* renamed from: l */
    private final Runnable f48233l = new C10247a();

    /* renamed from: m */
    private final Runnable f48234m = new C10248b();

    /* renamed from: n */
    private final C1344b f48235n = new C10249c();

    /* renamed from: o */
    private final C1344b f48236o = new C10250d();

    /* renamed from: com.google.android.material.progressindicator.a$a */
    /* compiled from: BaseProgressIndicator */
    class C10247a implements Runnable {
        C10247a() {
        }

        public void run() {
            C10246a.this.m47233k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$b */
    /* compiled from: BaseProgressIndicator */
    class C10248b implements Runnable {
        C10248b() {
        }

        public void run() {
            C10246a.this.m47232j();
            long unused = C10246a.this.f48229h = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$c */
    /* compiled from: BaseProgressIndicator */
    class C10249c extends C1344b {
        C10249c() {
        }

        /* renamed from: a */
        public void mo6391a(Drawable drawable) {
            C10246a.this.setIndeterminate(false);
            C10246a.this.mo41143o(0, false);
            C10246a aVar = C10246a.this;
            aVar.mo41143o(aVar.f48224c, C10246a.this.f48225d);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$d */
    /* compiled from: BaseProgressIndicator */
    class C10250d extends C1344b {
        C10250d() {
        }

        /* renamed from: a */
        public void mo6391a(Drawable drawable) {
            super.mo6391a(drawable);
            if (!C10246a.this.f48231j) {
                C10246a aVar = C10246a.this;
                aVar.setVisibility(aVar.f48232k);
            }
        }
    }

    protected C10246a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C10962a.m49296c(context, attributeSet, i, f48222p), attributeSet, i);
        Context context2 = getContext();
        this.f48223b = mo41134i(context2, attributeSet);
        TypedArray h = C10220m.m47116h(context2, attributeSet, C6532l.f26719K, i, i2, new int[0]);
        this.f48227f = h.getInt(C6532l.f26774P, -1);
        this.f48228g = Math.min(h.getInt(C6532l.f26752N, -1), 1000);
        h.recycle();
        this.f48230i = new C10724a();
        this.f48226e = true;
    }

    private C10264g<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo41247v();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo41227w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m47232j() {
        ((C10260f) getCurrentDrawable()).mo41219p(false, false, true);
        if (m47234m()) {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m47233k() {
        if (this.f48228g > 0) {
            this.f48229h = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m47234m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* renamed from: n */
    private void m47235n() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo41246u().mo41190d(this.f48235n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo41217l(this.f48236o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo41217l(this.f48236o);
        }
    }

    /* renamed from: p */
    private void m47236p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo41221r(this.f48236o);
            getIndeterminateDrawable().mo41246u().mo41193h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo41221r(this.f48236o);
        }
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f48223b.f48246f;
    }

    public int[] getIndicatorColor() {
        return this.f48223b.f48243c;
    }

    public int getShowAnimationBehavior() {
        return this.f48223b.f48245e;
    }

    public int getTrackColor() {
        return this.f48223b.f48244d;
    }

    public int getTrackCornerRadius() {
        return this.f48223b.f48242b;
    }

    public int getTrackThickness() {
        return this.f48223b.f48241a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo41160h(boolean z) {
        if (this.f48226e) {
            ((C10260f) getCurrentDrawable()).mo41219p(mo41169q(), false, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract S mo41134i(Context context, AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo41162l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo41143o(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f48224c = i;
            this.f48225d = z;
            this.f48231j = true;
            if (!getIndeterminateDrawable().isVisible() || this.f48230i.mo42876a(getContext().getContentResolver()) == 0.0f) {
                this.f48235n.mo6391a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo41246u().mo41191f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m47235n();
        if (mo41169q()) {
            m47233k();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f48234m);
        removeCallbacks(this.f48233l);
        ((C10260f) getCurrentDrawable()).mo41212h();
        m47236p();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C10264g currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo41187e();
            int d = currentDrawingDelegate.mo41186d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo41160h(i == 0);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo41160h(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo41169q() {
        return C5723u.m25293S(this) && getWindowVisibility() == 0 && mo41162l();
    }

    public void setAnimatorDurationScaleProvider(C10724a aVar) {
        this.f48230i = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f48275d = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f48275d = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f48223b.f48246f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (mo41169q()) {
                if (z) {
                    throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
                }
            }
            C10260f fVar = (C10260f) getCurrentDrawable();
            if (fVar != null) {
                fVar.mo41212h();
            }
            super.setIndeterminate(z);
            C10260f fVar2 = (C10260f) getCurrentDrawable();
            if (fVar2 != null) {
                fVar2.mo41219p(mo41169q(), false, false);
            }
            this.f48231j = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof C10266i) {
            ((C10260f) drawable).mo41212h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C10538a.m48268b(getContext(), C6522b.f26603p, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f48223b.f48243c = iArr;
            getIndeterminateDrawable().mo41246u().mo41189c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            mo41143o(i, false);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof C10258e) {
            C10258e eVar = (C10258e) drawable;
            eVar.mo41212h();
            super.setProgressDrawable(eVar);
            eVar.mo41206A(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f48223b.f48245e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f48223b;
        if (s.f48244d != i) {
            s.f48244d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f48223b;
        if (s.f48242b != i) {
            s.f48242b = Math.min(i, s.f48241a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f48223b;
        if (s.f48241a != i) {
            s.f48241a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f48232k = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public C10266i<S> getIndeterminateDrawable() {
        return (C10266i) super.getIndeterminateDrawable();
    }

    public C10258e<S> getProgressDrawable() {
        return (C10258e) super.getProgressDrawable();
    }
}
