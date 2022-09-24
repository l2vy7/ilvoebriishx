package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.k0 */
/* compiled from: VectorEnabledTintResources */
public class C0398k0 extends Resources {

    /* renamed from: b */
    private static boolean f1620b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1621a;

    public C0398k0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1621a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m2091a() {
        return f1620b;
    }

    /* renamed from: b */
    public static boolean m2092b() {
        return m2091a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Drawable mo2182c(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = (Context) this.f1621a.get();
        if (context != null) {
            return C0421v.m2245h().mo2264t(context, this, i);
        }
        return super.getDrawable(i);
    }
}
