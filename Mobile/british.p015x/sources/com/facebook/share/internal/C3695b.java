package com.facebook.share.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.C3437a;
import com.facebook.common.C3438b;

@Deprecated
/* renamed from: com.facebook.share.internal.b */
/* compiled from: LikeBoxCountView */
public class C3695b extends FrameLayout {

    /* renamed from: b */
    private TextView f13689b;

    /* renamed from: c */
    private C3697b f13690c = C3697b.LEFT;

    /* renamed from: d */
    private float f13691d;

    /* renamed from: e */
    private float f13692e;

    /* renamed from: f */
    private float f13693f;

    /* renamed from: g */
    private Paint f13694g;

    /* renamed from: h */
    private int f13695h;

    /* renamed from: i */
    private int f13696i;

    /* renamed from: com.facebook.share.internal.b$a */
    /* compiled from: LikeBoxCountView */
    static /* synthetic */ class C3696a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13697a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.share.internal.b$b[] r0 = com.facebook.share.internal.C3695b.C3697b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13697a = r0
                com.facebook.share.internal.b$b r1 = com.facebook.share.internal.C3695b.C3697b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13697a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.share.internal.b$b r1 = com.facebook.share.internal.C3695b.C3697b.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13697a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.share.internal.b$b r1 = com.facebook.share.internal.C3695b.C3697b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13697a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.share.internal.b$b r1 = com.facebook.share.internal.C3695b.C3697b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C3695b.C3696a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.share.internal.b$b */
    /* compiled from: LikeBoxCountView */
    public enum C3697b {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    @Deprecated
    public C3695b(Context context) {
        super(context);
        m12477b(context);
    }

    /* renamed from: a */
    private void m12476a(Canvas canvas, float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = this.f13693f * 2.0f;
        float f6 = f + f5;
        float f7 = f2 + f5;
        path.addArc(new RectF(f, f2, f6, f7), -180.0f, 90.0f);
        if (this.f13690c == C3697b.TOP) {
            float f8 = f3 - f;
            path.lineTo(((f8 - this.f13692e) / 2.0f) + f, f2);
            path.lineTo((f8 / 2.0f) + f, f2 - this.f13691d);
            path.lineTo(((f8 + this.f13692e) / 2.0f) + f, f2);
        }
        path.lineTo(f3 - this.f13693f, f2);
        float f9 = f3 - f5;
        path.addArc(new RectF(f9, f2, f3, f7), -90.0f, 90.0f);
        if (this.f13690c == C3697b.RIGHT) {
            float f10 = f4 - f2;
            path.lineTo(f3, ((f10 - this.f13692e) / 2.0f) + f2);
            path.lineTo(this.f13691d + f3, (f10 / 2.0f) + f2);
            path.lineTo(f3, ((f10 + this.f13692e) / 2.0f) + f2);
        }
        path.lineTo(f3, f4 - this.f13693f);
        float f11 = f4 - f5;
        path.addArc(new RectF(f9, f11, f3, f4), 0.0f, 90.0f);
        if (this.f13690c == C3697b.BOTTOM) {
            float f12 = f3 - f;
            path.lineTo(((this.f13692e + f12) / 2.0f) + f, f4);
            path.lineTo((f12 / 2.0f) + f, this.f13691d + f4);
            path.lineTo(((f12 - this.f13692e) / 2.0f) + f, f4);
        }
        path.lineTo(this.f13693f + f, f4);
        path.addArc(new RectF(f, f11, f6, f4), 90.0f, 90.0f);
        if (this.f13690c == C3697b.LEFT) {
            float f13 = f4 - f2;
            path.lineTo(f, ((this.f13692e + f13) / 2.0f) + f2);
            path.lineTo(f - this.f13691d, (f13 / 2.0f) + f2);
            path.lineTo(f, ((f13 - this.f13692e) / 2.0f) + f2);
        }
        path.lineTo(f, f2 + this.f13693f);
        canvas.drawPath(path, this.f13694g);
    }

    /* renamed from: b */
    private void m12477b(Context context) {
        setWillNotDraw(false);
        this.f13691d = getResources().getDimension(C3438b.com_facebook_likeboxcountview_caret_height);
        this.f13692e = getResources().getDimension(C3438b.com_facebook_likeboxcountview_caret_width);
        this.f13693f = getResources().getDimension(C3438b.com_facebook_likeboxcountview_border_radius);
        Paint paint = new Paint();
        this.f13694g = paint;
        paint.setColor(getResources().getColor(C3437a.com_facebook_likeboxcountview_border_color));
        this.f13694g.setStrokeWidth(getResources().getDimension(C3438b.com_facebook_likeboxcountview_border_width));
        this.f13694g.setStyle(Paint.Style.STROKE);
        m12478c(context);
        addView(this.f13689b);
        setCaretPosition(this.f13690c);
    }

    /* renamed from: c */
    private void m12478c(Context context) {
        this.f13689b = new TextView(context);
        this.f13689b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f13689b.setGravity(17);
        this.f13689b.setTextSize(0, getResources().getDimension(C3438b.com_facebook_likeboxcountview_text_size));
        this.f13689b.setTextColor(getResources().getColor(C3437a.com_facebook_likeboxcountview_text_color));
        this.f13695h = getResources().getDimensionPixelSize(C3438b.com_facebook_likeboxcountview_text_padding);
        this.f13696i = getResources().getDimensionPixelSize(C3438b.com_facebook_likeboxcountview_caret_height);
    }

    /* renamed from: d */
    private void m12479d(int i, int i2, int i3, int i4) {
        TextView textView = this.f13689b;
        int i5 = this.f13695h;
        textView.setPadding(i + i5, i2 + i5, i3 + i5, i5 + i4);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int i = C3696a.f13697a[this.f13690c.ordinal()];
        if (i == 1) {
            paddingLeft = (int) (((float) paddingLeft) + this.f13691d);
        } else if (i == 2) {
            paddingTop = (int) (((float) paddingTop) + this.f13691d);
        } else if (i == 3) {
            width = (int) (((float) width) - this.f13691d);
        } else if (i == 4) {
            height = (int) (((float) height) - this.f13691d);
        }
        m12476a(canvas, (float) paddingLeft, (float) paddingTop, (float) width, (float) height);
    }

    @Deprecated
    public void setCaretPosition(C3697b bVar) {
        this.f13690c = bVar;
        int i = C3696a.f13697a[bVar.ordinal()];
        if (i == 1) {
            m12479d(this.f13696i, 0, 0, 0);
        } else if (i == 2) {
            m12479d(0, this.f13696i, 0, 0);
        } else if (i == 3) {
            m12479d(0, 0, this.f13696i, 0);
        } else if (i == 4) {
            m12479d(0, 0, 0, this.f13696i);
        }
    }

    @Deprecated
    public void setText(String str) {
        this.f13689b.setText(str);
    }
}
