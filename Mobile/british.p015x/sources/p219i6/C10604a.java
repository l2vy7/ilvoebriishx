package p219i6;

import android.content.Context;
import android.graphics.Color;
import p017c0.C2617a;
import p194c6.C6522b;
import p208f6.C10538a;
import p233m6.C10804b;

/* renamed from: i6.a */
/* compiled from: ElevationOverlayProvider */
public class C10604a {

    /* renamed from: a */
    private final boolean f49153a;

    /* renamed from: b */
    private final int f49154b;

    /* renamed from: c */
    private final int f49155c;

    /* renamed from: d */
    private final float f49156d;

    public C10604a(Context context) {
        this.f49153a = C10804b.m48750b(context, C6522b.elevationOverlayEnabled, false);
        this.f49154b = C10538a.m48268b(context, C6522b.elevationOverlayColor, 0);
        this.f49155c = C10538a.m48268b(context, C6522b.colorSurface, 0);
        this.f49156d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: f */
    private boolean m48347f(int i) {
        return C2617a.m9119m(i, 255) == this.f49155c;
    }

    /* renamed from: a */
    public float mo42713a(float f) {
        float f2 = this.f49156d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo42714b(int i, float f) {
        float a = mo42713a(f);
        return C2617a.m9119m(C10538a.m48273g(C2617a.m9119m(i, 255), this.f49154b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo42715c(int i, float f) {
        return (!this.f49153a || !m48347f(i)) ? i : mo42714b(i, f);
    }

    /* renamed from: d */
    public int mo42716d(float f) {
        return mo42715c(this.f49155c, f);
    }

    /* renamed from: e */
    public boolean mo42717e() {
        return this.f49153a;
    }
}
