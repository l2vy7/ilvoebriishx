package p129p2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p004a3.C0065j;
import p081g2.C5318r;
import p081g2.C5323v;
import p141r2.C5982c;

/* renamed from: p2.b */
/* compiled from: DrawableResource */
public abstract class C5898b<T extends Drawable> implements C5323v<T>, C5318r {

    /* renamed from: b */
    protected final T f24734b;

    public C5898b(T t) {
        this.f24734b = (Drawable) C0065j.m247d(t);
    }

    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.f24734b.getConstantState();
        if (constantState == null) {
            return this.f24734b;
        }
        return constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f24734b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C5982c) {
            ((C5982c) t).mo23045e().prepareToDraw();
        }
    }
}
