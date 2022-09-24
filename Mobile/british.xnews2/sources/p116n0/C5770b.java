package p116n0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: n0.b */
/* compiled from: AccessibilityEventCompat */
public final class C5770b {
    /* renamed from: a */
    public static int m25529a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m25530b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
