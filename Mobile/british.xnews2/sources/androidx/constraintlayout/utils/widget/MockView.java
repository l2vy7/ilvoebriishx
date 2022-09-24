package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0572f;

public class MockView extends View {

    /* renamed from: b */
    private Paint f2290b = new Paint();

    /* renamed from: c */
    private Paint f2291c = new Paint();

    /* renamed from: d */
    private Paint f2292d = new Paint();

    /* renamed from: e */
    private boolean f2293e = true;

    /* renamed from: f */
    private boolean f2294f = true;

    /* renamed from: g */
    protected String f2295g = null;

    /* renamed from: h */
    private Rect f2296h = new Rect();

    /* renamed from: i */
    private int f2297i = Color.argb(255, 0, 0, 0);

    /* renamed from: j */
    private int f2298j = Color.argb(255, 200, 200, 200);

    /* renamed from: k */
    private int f2299k = Color.argb(255, 50, 50, 50);

    /* renamed from: l */
    private int f2300l = 4;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2994a(context, attributeSet);
    }

    /* renamed from: a */
    private void m2994a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2969q6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2987s6) {
                    this.f2295g = obtainStyledAttributes.getString(index);
                } else if (index == C0572f.f3014v6) {
                    this.f2293e = obtainStyledAttributes.getBoolean(index, this.f2293e);
                } else if (index == C0572f.f2978r6) {
                    this.f2297i = obtainStyledAttributes.getColor(index, this.f2297i);
                } else if (index == C0572f.f2996t6) {
                    this.f2299k = obtainStyledAttributes.getColor(index, this.f2299k);
                } else if (index == C0572f.f3005u6) {
                    this.f2298j = obtainStyledAttributes.getColor(index, this.f2298j);
                } else if (index == C0572f.f3023w6) {
                    this.f2294f = obtainStyledAttributes.getBoolean(index, this.f2294f);
                }
            }
        }
        if (this.f2295g == null) {
            try {
                this.f2295g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2290b.setColor(this.f2297i);
        this.f2290b.setAntiAlias(true);
        this.f2291c.setColor(this.f2298j);
        this.f2291c.setAntiAlias(true);
        this.f2292d.setColor(this.f2299k);
        this.f2300l = Math.round(((float) this.f2300l) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2293e) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f2290b);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(0.0f, f2, f3, 0.0f, this.f2290b);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.f2290b);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, 0.0f, f3, f5, this.f2290b);
            float f6 = f2;
            canvas2.drawLine(f4, f6, 0.0f, f5, this.f2290b);
            canvas2.drawLine(0.0f, f6, 0.0f, 0.0f, this.f2290b);
        }
        String str = this.f2295g;
        if (str != null && this.f2294f) {
            this.f2291c.getTextBounds(str, 0, str.length(), this.f2296h);
            float width2 = ((float) (width - this.f2296h.width())) / 2.0f;
            float height2 = (((float) (height - this.f2296h.height())) / 2.0f) + ((float) this.f2296h.height());
            this.f2296h.offset((int) width2, (int) height2);
            Rect rect = this.f2296h;
            int i = rect.left;
            int i2 = this.f2300l;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f2296h, this.f2292d);
            canvas.drawText(this.f2295g, width2, height2, this.f2291c);
        }
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2994a(context, attributeSet);
    }
}
