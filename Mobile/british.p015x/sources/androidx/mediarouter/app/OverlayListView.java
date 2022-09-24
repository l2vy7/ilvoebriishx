package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class OverlayListView extends ListView {

    /* renamed from: b */
    private final List<C0850a> f4040b = new ArrayList();

    /* renamed from: androidx.mediarouter.app.OverlayListView$a */
    public static class C0850a {

        /* renamed from: a */
        private BitmapDrawable f4041a;

        /* renamed from: b */
        private float f4042b = 1.0f;

        /* renamed from: c */
        private Rect f4043c;

        /* renamed from: d */
        private Interpolator f4044d;

        /* renamed from: e */
        private long f4045e;

        /* renamed from: f */
        private Rect f4046f;

        /* renamed from: g */
        private int f4047g;

        /* renamed from: h */
        private float f4048h = 1.0f;

        /* renamed from: i */
        private float f4049i = 1.0f;

        /* renamed from: j */
        private long f4050j;

        /* renamed from: k */
        private boolean f4051k;

        /* renamed from: l */
        private boolean f4052l;

        /* renamed from: m */
        private C0851a f4053m;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a */
        public interface C0851a {
            /* renamed from: a */
            void mo4224a();
        }

        public C0850a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f4041a = bitmapDrawable;
            this.f4046f = rect;
            this.f4043c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.f4041a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.f4042b * 255.0f));
                this.f4041a.setBounds(this.f4043c);
            }
        }

        /* renamed from: a */
        public BitmapDrawable mo4214a() {
            return this.f4041a;
        }

        /* renamed from: b */
        public boolean mo4215b() {
            return this.f4051k;
        }

        /* renamed from: c */
        public C0850a mo4216c(float f, float f2) {
            this.f4048h = f;
            this.f4049i = f2;
            return this;
        }

        /* renamed from: d */
        public C0850a mo4217d(C0851a aVar) {
            this.f4053m = aVar;
            return this;
        }

        /* renamed from: e */
        public C0850a mo4218e(long j) {
            this.f4045e = j;
            return this;
        }

        /* renamed from: f */
        public C0850a mo4219f(Interpolator interpolator) {
            this.f4044d = interpolator;
            return this;
        }

        /* renamed from: g */
        public C0850a mo4220g(int i) {
            this.f4047g = i;
            return this;
        }

        /* renamed from: h */
        public void mo4221h(long j) {
            this.f4050j = j;
            this.f4051k = true;
        }

        /* renamed from: i */
        public void mo4222i() {
            this.f4051k = true;
            this.f4052l = true;
            C0851a aVar = this.f4053m;
            if (aVar != null) {
                aVar.mo4224a();
            }
        }

        /* renamed from: j */
        public boolean mo4223j(long j) {
            float f;
            if (this.f4052l) {
                return false;
            }
            float f2 = 0.0f;
            float max = Math.max(0.0f, Math.min(1.0f, ((float) (j - this.f4050j)) / ((float) this.f4045e)));
            if (this.f4051k) {
                f2 = max;
            }
            Interpolator interpolator = this.f4044d;
            if (interpolator == null) {
                f = f2;
            } else {
                f = interpolator.getInterpolation(f2);
            }
            int i = (int) (((float) this.f4047g) * f);
            Rect rect = this.f4043c;
            Rect rect2 = this.f4046f;
            rect.top = rect2.top + i;
            rect.bottom = rect2.bottom + i;
            float f3 = this.f4048h;
            float f4 = f3 + ((this.f4049i - f3) * f);
            this.f4042b = f4;
            BitmapDrawable bitmapDrawable = this.f4041a;
            if (!(bitmapDrawable == null || rect == null)) {
                bitmapDrawable.setAlpha((int) (f4 * 255.0f));
                this.f4041a.setBounds(this.f4043c);
            }
            if (this.f4051k && f2 >= 1.0f) {
                this.f4052l = true;
                C0851a aVar = this.f4053m;
                if (aVar != null) {
                    aVar.mo4224a();
                }
            }
            return !this.f4052l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo4210a(C0850a aVar) {
        this.f4040b.add(aVar);
    }

    /* renamed from: b */
    public void mo4211b() {
        for (C0850a next : this.f4040b) {
            if (!next.mo4215b()) {
                next.mo4221h(getDrawingTime());
            }
        }
    }

    /* renamed from: c */
    public void mo4212c() {
        for (C0850a i : this.f4040b) {
            i.mo4222i();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4040b.size() > 0) {
            Iterator<C0850a> it = this.f4040b.iterator();
            while (it.hasNext()) {
                C0850a next = it.next();
                BitmapDrawable a = next.mo4214a();
                if (a != null) {
                    a.draw(canvas);
                }
                if (!next.mo4223j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
