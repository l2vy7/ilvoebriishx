package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p073f.C5238a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: b */
    private final C0391i f1228b;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22796J);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1228b.mo2163b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0391i iVar = new C0391i(this);
        this.f1228b = iVar;
        iVar.mo2164c(attributeSet, i);
    }
}
