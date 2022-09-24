package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: LinearSmoothScroller */
public class C1154g extends RecyclerView.C1118y {

    /* renamed from: i */
    protected final LinearInterpolator f5374i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f5375j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f5376k;

    /* renamed from: l */
    private final DisplayMetrics f5377l;

    /* renamed from: m */
    private boolean f5378m = false;

    /* renamed from: n */
    private float f5379n;

    /* renamed from: o */
    protected int f5380o = 0;

    /* renamed from: p */
    protected int f5381p = 0;

    public C1154g(Context context) {
        this.f5377l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m6373A() {
        if (!this.f5378m) {
            this.f5379n = mo5765v(this.f5377l);
            this.f5378m = true;
        }
        return this.f5379n;
    }

    /* renamed from: y */
    private int m6374y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo5760B() {
        PointF pointF = this.f5376k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5761C(RecyclerView.C1118y.C1119a aVar) {
        PointF a = mo5555a(mo5560f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo5574b(mo5560f());
            mo5572r();
            return;
        }
        mo5563i(a);
        this.f5376k = a;
        this.f5380o = (int) (a.x * 10000.0f);
        this.f5381p = (int) (a.y * 10000.0f);
        aVar.mo5576d((int) (((float) this.f5380o) * 1.2f), (int) (((float) this.f5381p) * 1.2f), (int) (((float) mo5767x(10000)) * 1.2f), this.f5374i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5566l(int i, int i2, RecyclerView.C1121z zVar, RecyclerView.C1118y.C1119a aVar) {
        if (mo5557c() == 0) {
            mo5572r();
            return;
        }
        this.f5380o = m6374y(this.f5380o, i);
        int y = m6374y(this.f5381p, i2);
        this.f5381p = y;
        if (this.f5380o == 0 && y == 0) {
            mo5761C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo5567m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5568n() {
        this.f5381p = 0;
        this.f5380o = 0;
        this.f5376k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5569o(View view, RecyclerView.C1121z zVar, RecyclerView.C1118y.C1119a aVar) {
        int t = mo5763t(view, mo5768z());
        int u = mo5764u(view, mo5760B());
        int w = mo5766w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo5576d(-t, -u, w, this.f5375j);
        }
    }

    /* renamed from: s */
    public int mo5762s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo5763t(View view, int i) {
        RecyclerView.C1104p e = mo5559e();
        if (e == null || !e.mo5031k()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo5762s(e.mo5429Q(view) - layoutParams.leftMargin, e.mo5433T(view) + layoutParams.rightMargin, e.mo5452e0(), e.mo5473o0() - e.mo5454f0(), i);
    }

    /* renamed from: u */
    public int mo5764u(View view, int i) {
        RecyclerView.C1104p e = mo5559e();
        if (e == null || !e.mo5033l()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo5762s(e.mo5434U(view) - layoutParams.topMargin, e.mo5426O(view) + layoutParams.bottomMargin, e.mo5456g0(), e.mo5437W() - e.mo5450d0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo5765v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo5766w(int i) {
        double x = (double) mo5767x(i);
        Double.isNaN(x);
        return (int) Math.ceil(x / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo5767x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m6373A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo5768z() {
        PointF pointF = this.f5376k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
