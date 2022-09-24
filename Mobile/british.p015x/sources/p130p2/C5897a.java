package p130p2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0600b;
import p010b0.C1523f;
import p079g.C5264a;
import p099k.C5525d;

/* renamed from: p2.a */
/* compiled from: DrawableDecoderCompat */
public final class C5897a {

    /* renamed from: a */
    private static volatile boolean f24733a = true;

    /* renamed from: a */
    public static Drawable m26042a(Context context, int i, Resources.Theme theme) {
        return m26044c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m26043b(Context context, Context context2, int i) {
        return m26044c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    private static Drawable m26044c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f24733a) {
                return m26046e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f24733a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0600b.m3294f(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m26045d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m26045d(Context context, int i, Resources.Theme theme) {
        return C1523f.m7886e(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m26046e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C5525d(context, theme);
        }
        return C5264a.m23789d(context, i);
    }
}
