package p243p6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: p6.k */
/* compiled from: RelativeCornerSize */
public final class C10895k implements C10884c {

    /* renamed from: a */
    private final float f49719a;

    public C10895k(float f) {
        this.f49719a = f;
    }

    /* renamed from: a */
    public float mo43065a(RectF rectF) {
        return this.f49719a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10895k) && this.f49719a == ((C10895k) obj).f49719a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f49719a)});
    }
}
