package p200d6;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: d6.e */
/* compiled from: DrawableAlphaProperty */
public class C10497e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f49015b = new C10497e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f49016a = new WeakHashMap<>();

    private C10497e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f49016a.containsKey(drawable)) {
            return this.f49016a.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f49016a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
