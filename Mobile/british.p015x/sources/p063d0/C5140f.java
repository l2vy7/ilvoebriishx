package p063d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: d0.f */
/* compiled from: WrappedDrawableState */
final class C5140f extends Drawable.ConstantState {

    /* renamed from: a */
    int f22558a;

    /* renamed from: b */
    Drawable.ConstantState f22559b;

    /* renamed from: c */
    ColorStateList f22560c = null;

    /* renamed from: d */
    PorterDuff.Mode f22561d = C5138d.f22550h;

    C5140f(C5140f fVar) {
        if (fVar != null) {
            this.f22558a = fVar.f22558a;
            this.f22559b = fVar.f22559b;
            this.f22560c = fVar.f22560c;
            this.f22561d = fVar.f22561d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21322a() {
        return this.f22559b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f22558a;
        Drawable.ConstantState constantState = this.f22559b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C5139e(this, resources);
        }
        return new C5138d(this, resources);
    }
}
