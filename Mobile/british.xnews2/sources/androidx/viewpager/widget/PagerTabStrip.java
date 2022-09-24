package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0600b;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: A */
    private boolean f6077A = false;

    /* renamed from: B */
    private boolean f6078B = false;

    /* renamed from: C */
    private int f6079C;

    /* renamed from: D */
    private boolean f6080D;

    /* renamed from: E */
    private float f6081E;

    /* renamed from: F */
    private float f6082F;

    /* renamed from: G */
    private int f6083G;

    /* renamed from: r */
    private int f6084r;

    /* renamed from: s */
    private int f6085s;

    /* renamed from: t */
    private int f6086t;

    /* renamed from: u */
    private int f6087u;

    /* renamed from: v */
    private int f6088v;

    /* renamed from: w */
    private int f6089w;

    /* renamed from: x */
    private final Paint f6090x;

    /* renamed from: y */
    private final Rect f6091y = new Rect();

    /* renamed from: z */
    private int f6092z = 255;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    class C1368a implements View.OnClickListener {
        C1368a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f6097b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    class C1369b implements View.OnClickListener {
        C1369b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f6097b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f6090x = paint;
        int i = this.f6110o;
        this.f6084r = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f6085s = (int) ((3.0f * f) + 0.5f);
        this.f6086t = (int) ((6.0f * f) + 0.5f);
        this.f6087u = (int) (64.0f * f);
        this.f6089w = (int) ((16.0f * f) + 0.5f);
        this.f6079C = (int) ((1.0f * f) + 0.5f);
        this.f6088v = (int) ((f * 32.0f) + 0.5f);
        this.f6083G = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f6098c.setFocusable(true);
        this.f6098c.setOnClickListener(new C1368a());
        this.f6100e.setFocusable(true);
        this.f6100e.setOnClickListener(new C1369b());
        if (getBackground() == null) {
            this.f6077A = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6587d(int i, float f, boolean z) {
        Rect rect = this.f6091y;
        int height = getHeight();
        int left = this.f6099d.getLeft() - this.f6089w;
        int right = this.f6099d.getRight() + this.f6089w;
        int i2 = height - this.f6085s;
        rect.set(left, i2, right, height);
        super.mo6587d(i, f, z);
        this.f6092z = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f6099d.getLeft() - this.f6089w, i2, this.f6099d.getRight() + this.f6089w, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f6077A;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f6088v);
    }

    public int getTabIndicatorColor() {
        return this.f6084r;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f6099d.getLeft() - this.f6089w;
        int right = this.f6099d.getRight() + this.f6089w;
        this.f6090x.setColor((this.f6092z << 24) | (this.f6084r & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f6085s), (float) right, f, this.f6090x);
        if (this.f6077A) {
            this.f6090x.setColor(-16777216 | (this.f6084r & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f6079C), (float) (getWidth() - getPaddingRight()), f, this.f6090x);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f6080D) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f6081E = x;
            this.f6082F = y;
            this.f6080D = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f6081E) > ((float) this.f6083G) || Math.abs(y - this.f6082F) > ((float) this.f6083G))) {
                this.f6080D = true;
            }
        } else if (x < ((float) (this.f6099d.getLeft() - this.f6089w))) {
            ViewPager viewPager = this.f6097b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.f6099d.getRight() + this.f6089w))) {
            ViewPager viewPager2 = this.f6097b;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f6078B) {
            this.f6077A = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f6078B) {
            this.f6077A = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f6078B) {
            this.f6077A = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f6077A = z;
        this.f6078B = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f6086t;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f6084r = i;
        this.f6090x.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0600b.m3292d(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f6087u;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }
}
