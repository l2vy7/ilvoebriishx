package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p111m0.C5723u;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* compiled from: CircleImageView */
class C1238a extends ImageView {

    /* renamed from: b */
    private Animation.AnimationListener f5635b;

    /* renamed from: c */
    int f5636c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* compiled from: CircleImageView */
    private class C1239a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f5637b;

        /* renamed from: c */
        private Paint f5638c = new Paint();

        C1239a(int i) {
            C1238a.this.f5636c = i;
            m6721a((int) rect().width());
        }

        /* renamed from: a */
        private void m6721a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1238a.this.f5636c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f5637b = radialGradient;
            this.f5638c.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C1238a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1238a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f5638c);
            canvas.drawCircle(f, height, (float) (width - C1238a.this.f5636c), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m6721a((int) f);
        }
    }

    C1238a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f5636c = (int) (3.5f * f);
        if (m6719a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C5723u.m25344v0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1239a(this.f5636c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f5636c, (float) i3, (float) i2, 503316480);
            int i4 = this.f5636c;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C5723u.m25336r0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m6719a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo6091b(Animation.AnimationListener animationListener) {
        this.f5635b = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5635b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5635b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m6719a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f5636c * 2), getMeasuredHeight() + (this.f5636c * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
