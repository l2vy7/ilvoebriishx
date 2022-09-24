package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.c0 */
/* compiled from: TintContextWrapper */
public class C0377c0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1530c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0377c0>> f1531d;

    /* renamed from: a */
    private final Resources f1532a;

    /* renamed from: b */
    private final Resources.Theme f1533b;

    private C0377c0(Context context) {
        super(context);
        if (C0398k0.m2092b()) {
            C0398k0 k0Var = new C0398k0(this, context.getResources());
            this.f1532a = k0Var;
            Resources.Theme newTheme = k0Var.newTheme();
            this.f1533b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1532a = new C0381e0(this, context.getResources());
        this.f1533b = null;
    }

    /* renamed from: a */
    private static boolean m1948a(Context context) {
        if ((context instanceof C0377c0) || (context.getResources() instanceof C0381e0) || (context.getResources() instanceof C0398k0)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C0398k0.m2092b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m1949b(Context context) {
        if (!m1948a(context)) {
            return context;
        }
        synchronized (f1530c) {
            ArrayList<WeakReference<C0377c0>> arrayList = f1531d;
            if (arrayList == null) {
                f1531d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1531d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1531d.remove(size);
                    }
                }
                for (int size2 = f1531d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1531d.get(size2);
                    C0377c0 c0Var = weakReference2 != null ? (C0377c0) weakReference2.get() : null;
                    if (c0Var != null && c0Var.getBaseContext() == context) {
                        return c0Var;
                    }
                }
            }
            C0377c0 c0Var2 = new C0377c0(context);
            f1531d.add(new WeakReference(c0Var2));
            return c0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1532a.getAssets();
    }

    public Resources getResources() {
        return this.f1532a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1533b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1533b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
