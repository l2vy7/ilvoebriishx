package p142r2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.C1344b;
import com.bumptech.glide.C3319b;
import java.nio.ByteBuffer;
import java.util.List;
import p004a3.C0065j;
import p019c2.C2645a;
import p065d2.C5167l;
import p142r2.C5987g;

/* renamed from: r2.c */
/* compiled from: GifDrawable */
public class C5982c extends Drawable implements C5987g.C5989b, Animatable {

    /* renamed from: b */
    private final C5983a f24940b;

    /* renamed from: c */
    private boolean f24941c;

    /* renamed from: d */
    private boolean f24942d;

    /* renamed from: e */
    private boolean f24943e;

    /* renamed from: f */
    private boolean f24944f;

    /* renamed from: g */
    private int f24945g;

    /* renamed from: h */
    private int f24946h;

    /* renamed from: i */
    private boolean f24947i;

    /* renamed from: j */
    private Paint f24948j;

    /* renamed from: k */
    private Rect f24949k;

    /* renamed from: l */
    private List<C1344b> f24950l;

    /* renamed from: r2.c$a */
    /* compiled from: GifDrawable */
    static final class C5983a extends Drawable.ConstantState {

        /* renamed from: a */
        final C5987g f24951a;

        C5983a(C5987g gVar) {
            this.f24951a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C5982c(this);
        }
    }

    public C5982c(Context context, C2645a aVar, C5167l<Bitmap> lVar, int i, int i2, Bitmap bitmap) {
        this(new C5983a(new C5987g(C3319b.m11097c(context), aVar, i, i2, lVar, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m26367b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m26368d() {
        if (this.f24949k == null) {
            this.f24949k = new Rect();
        }
        return this.f24949k;
    }

    /* renamed from: h */
    private Paint m26369h() {
        if (this.f24948j == null) {
            this.f24948j = new Paint(2);
        }
        return this.f24948j;
    }

    /* renamed from: j */
    private void m26370j() {
        List<C1344b> list = this.f24950l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f24950l.get(i).mo6391a(this);
            }
        }
    }

    /* renamed from: l */
    private void m26371l() {
        this.f24945g = 0;
    }

    /* renamed from: n */
    private void m26372n() {
        C0065j.m244a(!this.f24943e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f24940b.f24951a.mo23071f() == 1) {
            invalidateSelf();
        } else if (!this.f24941c) {
            this.f24941c = true;
            this.f24940b.f24951a.mo23077r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m26373o() {
        this.f24941c = false;
        this.f24940b.f24951a.mo23078s(this);
    }

    /* renamed from: a */
    public void mo23042a() {
        if (m26367b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo23047g() == mo23046f() - 1) {
            this.f24945g++;
        }
        int i = this.f24946h;
        if (i != -1 && this.f24945g >= i) {
            m26370j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo23043c() {
        return this.f24940b.f24951a.mo23067b();
    }

    public void draw(Canvas canvas) {
        if (!this.f24943e) {
            if (this.f24947i) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m26368d());
                this.f24947i = false;
            }
            canvas.drawBitmap(this.f24940b.f24951a.mo23068c(), (Rect) null, m26368d(), m26369h());
        }
    }

    /* renamed from: e */
    public Bitmap mo23045e() {
        return this.f24940b.f24951a.mo23070e();
    }

    /* renamed from: f */
    public int mo23046f() {
        return this.f24940b.f24951a.mo23071f();
    }

    /* renamed from: g */
    public int mo23047g() {
        return this.f24940b.f24951a.mo23069d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f24940b;
    }

    public int getIntrinsicHeight() {
        return this.f24940b.f24951a.mo23072h();
    }

    public int getIntrinsicWidth() {
        return this.f24940b.f24951a.mo23074k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo23052i() {
        return this.f24940b.f24951a.mo23073j();
    }

    public boolean isRunning() {
        return this.f24941c;
    }

    /* renamed from: k */
    public void mo23054k() {
        this.f24943e = true;
        this.f24940b.f24951a.mo23066a();
    }

    /* renamed from: m */
    public void mo23055m(C5167l<Bitmap> lVar, Bitmap bitmap) {
        this.f24940b.f24951a.mo23076o(lVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24947i = true;
    }

    public void setAlpha(int i) {
        m26369h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m26369h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C0065j.m244a(!this.f24943e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f24944f = z;
        if (!z) {
            m26373o();
        } else if (this.f24942d) {
            m26372n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f24942d = true;
        m26371l();
        if (this.f24944f) {
            m26372n();
        }
    }

    public void stop() {
        this.f24942d = false;
        m26373o();
    }

    C5982c(C5983a aVar) {
        this.f24944f = true;
        this.f24946h = -1;
        this.f24940b = (C5983a) C0065j.m247d(aVar);
    }
}
