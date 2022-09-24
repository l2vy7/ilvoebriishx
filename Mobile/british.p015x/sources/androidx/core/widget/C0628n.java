package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: androidx.core.widget.n */
/* compiled from: TintableImageSourceView */
public interface C0628n {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
