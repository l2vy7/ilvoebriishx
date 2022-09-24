package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: androidx.transition.l */
/* compiled from: ObjectAnimatorUtils */
class C1320l {
    /* renamed from: a */
    static <T> ObjectAnimator m7111a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C1322m(property, path), new float[]{0.0f, 1.0f});
    }
}
