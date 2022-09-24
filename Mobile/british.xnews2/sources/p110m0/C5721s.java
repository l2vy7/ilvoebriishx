package p110m0;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: m0.s */
/* compiled from: PointerIconCompat */
public final class C5721s {

    /* renamed from: a */
    private Object f24348a;

    private C5721s(Object obj) {
        this.f24348a = obj;
    }

    /* renamed from: b */
    public static C5721s m25261b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C5721s(PointerIcon.getSystemIcon(context, i));
        }
        return new C5721s((Object) null);
    }

    /* renamed from: a */
    public Object mo22478a() {
        return this.f24348a;
    }
}
