package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.content.C0600b;
import p011b1.C1533a;
import p011b1.C1535c;
import p011b1.C1537e;
import p011b1.C1543k;
import p017c0.C2617a;
import p063d0.C5135a;
import p073f.C5238a;

/* renamed from: androidx.mediarouter.app.i */
/* compiled from: MediaRouterThemeHelper */
final class C0912i {

    /* renamed from: a */
    private static final int f4313a = C1535c.mr_dynamic_dialog_icon_light;

    /* renamed from: a */
    static Context m4662a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m4673l(context));
        int p = m4677p(contextThemeWrapper, C1533a.mediaRouteTheme);
        return p != 0 ? new ContextThemeWrapper(contextThemeWrapper, p) : contextThemeWrapper;
    }

    /* renamed from: b */
    static Context m4663b(Context context, int i, boolean z) {
        int i2;
        if (i == 0) {
            if (!z) {
                i2 = C5238a.f22787A;
            } else {
                i2 = C5238a.f22819o;
            }
            i = m4677p(context, i2);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return m4677p(contextThemeWrapper, C1533a.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, m4673l(contextThemeWrapper)) : contextThemeWrapper;
    }

    /* renamed from: c */
    static int m4664c(Context context) {
        int p = m4677p(context, C1533a.mediaRouteTheme);
        return p == 0 ? m4673l(context) : p;
    }

    /* renamed from: d */
    static int m4665d(Context context) {
        int o = m4676o(context, 0, C5238a.f22828x);
        return C2617a.m9109c(o, m4676o(context, 0, 16842801)) < 3.0d ? m4676o(context, 0, C5238a.f22823s) : o;
    }

    /* renamed from: e */
    static Drawable m4666e(Context context) {
        return m4671j(context, C1537e.mr_cast_checkbox);
    }

    /* renamed from: f */
    static int m4667f(Context context, int i) {
        if (C2617a.m9109c(-1, m4676o(context, i, C5238a.f22828x)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    /* renamed from: g */
    static Drawable m4668g(Context context) {
        return m4670i(context, C1533a.mediaRouteDefaultIconDrawable);
    }

    /* renamed from: h */
    static float m4669h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    /* renamed from: i */
    private static Drawable m4670i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable r = C5135a.m23418r(obtainStyledAttributes.getDrawable(0));
        if (m4679r(context)) {
            C5135a.m23414n(r, C0600b.m3292d(context, f4313a));
        }
        obtainStyledAttributes.recycle();
        return r;
    }

    /* renamed from: j */
    private static Drawable m4671j(Context context, int i) {
        Drawable r = C5135a.m23418r(C0600b.m3294f(context, i));
        if (m4679r(context)) {
            C5135a.m23414n(r, C0600b.m3292d(context, f4313a));
        }
        return r;
    }

    /* renamed from: k */
    static Drawable m4672k(Context context) {
        return m4671j(context, C1537e.mr_cast_mute_button);
    }

    /* renamed from: l */
    private static int m4673l(Context context) {
        if (m4679r(context)) {
            if (m4667f(context, 0) == -570425344) {
                return C1543k.Theme_MediaRouter_Light;
            }
            return C1543k.Theme_MediaRouter_Light_DarkControlPanel;
        } else if (m4667f(context, 0) == -570425344) {
            return C1543k.Theme_MediaRouter_LightControlPanel;
        } else {
            return C1543k.Theme_MediaRouter;
        }
    }

    /* renamed from: m */
    static Drawable m4674m(Context context) {
        return m4670i(context, C1533a.mediaRouteSpeakerIconDrawable);
    }

    /* renamed from: n */
    static Drawable m4675n(Context context) {
        return m4670i(context, C1533a.mediaRouteSpeakerGroupIconDrawable);
    }

    /* renamed from: o */
    private static int m4676o(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    /* renamed from: p */
    static int m4677p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    /* renamed from: q */
    static Drawable m4678q(Context context) {
        return m4670i(context, C1533a.mediaRouteTvIconDrawable);
    }

    /* renamed from: r */
    private static boolean m4679r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C5238a.f22791E, typedValue, true) && typedValue.data != 0;
    }

    /* renamed from: s */
    static void m4680s(Context context, Dialog dialog) {
        int i;
        View decorView = dialog.getWindow().getDecorView();
        if (m4679r(context)) {
            i = C1535c.mr_dynamic_dialog_background_light;
        } else {
            i = C1535c.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(C0600b.m3292d(context, i));
    }

    /* renamed from: t */
    static void m4681t(Context context, ProgressBar progressBar) {
        int i;
        if (progressBar.isIndeterminate()) {
            if (m4679r(context)) {
                i = C1535c.mr_cast_progressbar_progress_and_thumb_light;
            } else {
                i = C1535c.mr_cast_progressbar_progress_and_thumb_dark;
            }
            progressBar.getIndeterminateDrawable().setColorFilter(C0600b.m3292d(context, i), PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: u */
    static void m4682u(Context context, View view, View view2, boolean z) {
        int o = m4676o(context, 0, C5238a.f22828x);
        int o2 = m4676o(context, 0, C5238a.f22829y);
        if (z && m4667f(context, 0) == -570425344) {
            o2 = o;
            o = -1;
        }
        view.setBackgroundColor(o);
        view2.setBackgroundColor(o2);
        view.setTag(Integer.valueOf(o));
        view2.setTag(Integer.valueOf(o2));
    }

    /* renamed from: v */
    static void m4683v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int i;
        int i2;
        if (m4679r(context)) {
            i2 = C0600b.m3292d(context, C1535c.mr_cast_progressbar_progress_and_thumb_light);
            i = C0600b.m3292d(context, C1535c.mr_cast_progressbar_background_light);
        } else {
            i2 = C0600b.m3292d(context, C1535c.mr_cast_progressbar_progress_and_thumb_dark);
            i = C0600b.m3292d(context, C1535c.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.mo4207b(i2, i);
    }

    /* renamed from: w */
    static void m4684w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int f = m4667f(context, 0);
        if (Color.alpha(f) != 255) {
            f = C2617a.m9115i(f, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.mo4206a(f);
    }
}
