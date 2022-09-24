package p236n6;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p062d0.C5136b;
import p242p6.C10889h;
import p242p6.C10897m;
import p242p6.C10913p;

/* renamed from: n6.a */
/* compiled from: RippleDrawableCompat */
public class C10838a extends Drawable implements C10913p, C5136b {

    /* renamed from: b */
    private C10840b f49596b;

    /* renamed from: a */
    public C10838a mutate() {
        this.f49596b = new C10840b(this.f49596b);
        return this;
    }

    public void draw(Canvas canvas) {
        C10840b bVar = this.f49596b;
        if (bVar.f49598b) {
            bVar.f49597a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f49596b;
    }

    public int getOpacity() {
        return this.f49596b.f49597a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f49596b.f49597a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f49596b.f49597a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = C10841b.m48834e(iArr);
        C10840b bVar = this.f49596b;
        if (bVar.f49598b == e) {
            return onStateChange;
        }
        bVar.f49598b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f49596b.f49597a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f49596b.f49597a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        this.f49596b.f49597a.setShapeAppearanceModel(mVar);
    }

    public void setTint(int i) {
        this.f49596b.f49597a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f49596b.f49597a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f49596b.f49597a.setTintMode(mode);
    }

    public C10838a(C10897m mVar) {
        this(new C10840b(new C10889h(mVar)));
    }

    /* renamed from: n6.a$b */
    /* compiled from: RippleDrawableCompat */
    static final class C10840b extends Drawable.ConstantState {

        /* renamed from: a */
        C10889h f49597a;

        /* renamed from: b */
        boolean f49598b;

        public C10840b(C10889h hVar) {
            this.f49597a = hVar;
            this.f49598b = false;
        }

        /* renamed from: a */
        public C10838a newDrawable() {
            return new C10838a(new C10840b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C10840b(C10840b bVar) {
            this.f49597a = (C10889h) bVar.f49597a.getConstantState().newDrawable();
            this.f49598b = bVar.f49598b;
        }
    }

    private C10838a(C10840b bVar) {
        this.f49596b = bVar;
    }
}
