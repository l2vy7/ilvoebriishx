package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.h0 */
/* compiled from: TooltipCompat */
public class C0390h0 {
    /* renamed from: a */
    public static void m2064a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0392i0.m2074f(view, charSequence);
        }
    }
}
