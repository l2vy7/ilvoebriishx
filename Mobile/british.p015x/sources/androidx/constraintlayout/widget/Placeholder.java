package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p166w.C6246e;

public class Placeholder extends View {

    /* renamed from: b */
    private int f2433b = -1;

    /* renamed from: c */
    private View f2434c = null;

    /* renamed from: d */
    private int f2435d = 4;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3047a(attributeSet);
    }

    /* renamed from: a */
    private void m3047a(AttributeSet attributeSet) {
        super.setVisibility(this.f2435d);
        this.f2433b = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2683M2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2692N2) {
                    this.f2433b = obtainStyledAttributes.getResourceId(index, this.f2433b);
                } else if (index == C0572f.f2701O2) {
                    this.f2435d = obtainStyledAttributes.getInt(index, this.f2435d);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2879b(ConstraintLayout constraintLayout) {
        if (this.f2434c != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2434c.getLayoutParams();
            layoutParams2.f2395n0.mo23790E0(0);
            C6246e.C6248b z = layoutParams.f2395n0.mo23859z();
            C6246e.C6248b bVar = C6246e.C6248b.FIXED;
            if (z != bVar) {
                layoutParams.f2395n0.mo23792F0(layoutParams2.f2395n0.mo23808Q());
            }
            if (layoutParams.f2395n0.mo23805N() != bVar) {
                layoutParams.f2395n0.mo23827i0(layoutParams2.f2395n0.mo23853w());
            }
            layoutParams2.f2395n0.mo23790E0(8);
        }
    }

    /* renamed from: c */
    public void mo2880c(ConstraintLayout constraintLayout) {
        if (this.f2433b == -1 && !isInEditMode()) {
            setVisibility(this.f2435d);
        }
        View findViewById = constraintLayout.findViewById(this.f2433b);
        this.f2434c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f2371b0 = true;
            this.f2434c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2434c;
    }

    public int getEmptyVisibility() {
        return this.f2435d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2433b != i) {
            View view = this.f2434c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f2434c.getLayoutParams()).f2371b0 = false;
                this.f2434c = null;
            }
            this.f2433b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2435d = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3047a(attributeSet);
    }
}
