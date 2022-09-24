package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: androidx.transition.n */
/* compiled from: PropertyValuesHolderUtils */
class C1324n {
    /* renamed from: a */
    static PropertyValuesHolder m7124a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C1322m(property, path), new float[]{0.0f, 1.0f});
    }
}
