package p111m0;

import android.os.Build;
import android.view.ViewGroup;
import p181z.C6420d;

/* renamed from: m0.w */
/* compiled from: ViewGroupCompat */
public final class C5738w {
    /* renamed from: a */
    public static boolean m25406a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C6420d.f26383W);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C5723u.m25283K(viewGroup) == null) ? false : true;
    }
}
