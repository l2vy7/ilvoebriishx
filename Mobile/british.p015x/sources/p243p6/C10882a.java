package p243p6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: p6.a */
/* compiled from: AbsoluteCornerSize */
public final class C10882a implements C10884c {

    /* renamed from: a */
    private final float f49663a;

    public C10882a(float f) {
        this.f49663a = f;
    }

    /* renamed from: a */
    public float mo43065a(RectF rectF) {
        return this.f49663a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10882a) && this.f49663a == ((C10882a) obj).f49663a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f49663a)});
    }
}
