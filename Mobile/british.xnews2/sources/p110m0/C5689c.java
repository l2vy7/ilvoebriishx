package p110m0;

import android.os.Build;
import android.view.DisplayCutout;
import p104l0.C5643c;

/* renamed from: m0.c */
/* compiled from: DisplayCutoutCompat */
public final class C5689c {

    /* renamed from: a */
    private final Object f24297a;

    private C5689c(Object obj) {
        this.f24297a = obj;
    }

    /* renamed from: e */
    static C5689c m25106e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C5689c(obj);
    }

    /* renamed from: a */
    public int mo22393a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f24297a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo22394b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f24297a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo22395c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f24297a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo22396d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f24297a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5689c.class != obj.getClass()) {
            return false;
        }
        return C5643c.m24954a(this.f24297a, ((C5689c) obj).f24297a);
    }

    public int hashCode() {
        Object obj = this.f24297a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f24297a + "}";
    }
}
