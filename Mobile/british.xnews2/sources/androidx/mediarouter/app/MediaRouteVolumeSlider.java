package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;
import p072f.C5238a;

class MediaRouteVolumeSlider extends AppCompatSeekBar {

    /* renamed from: c */
    private final float f4035c;

    /* renamed from: d */
    private boolean f4036d;

    /* renamed from: e */
    private Drawable f4037e;

    /* renamed from: f */
    private int f4038f;

    /* renamed from: g */
    private int f4039g;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22798L);
    }

    /* renamed from: a */
    public void mo4206a(int i) {
        mo4207b(i, i);
    }

    /* renamed from: b */
    public void mo4207b(int i, int i2) {
        if (this.f4038f != i) {
            if (Color.alpha(i) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i));
            }
            this.f4038f = i;
        }
        if (this.f4039g != i2) {
            if (Color.alpha(i2) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i2));
            }
            this.f4039g = i2;
        }
    }

    /* renamed from: c */
    public void mo4208c(boolean z) {
        Drawable drawable;
        if (this.f4036d != z) {
            this.f4036d = z;
            if (z) {
                drawable = null;
            } else {
                drawable = this.f4037e;
            }
            super.setThumb(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.f4035c * 255.0f);
        this.f4037e.setColorFilter(this.f4038f, PorterDuff.Mode.SRC_IN);
        this.f4037e.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.f4039g, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f4038f, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public void setThumb(Drawable drawable) {
        this.f4037e = drawable;
        if (this.f4036d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4035c = C0912i.m4669h(context);
    }
}
