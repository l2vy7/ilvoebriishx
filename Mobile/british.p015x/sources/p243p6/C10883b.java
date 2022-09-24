package p243p6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: p6.b */
/* compiled from: AdjustedCornerSize */
public final class C10883b implements C10884c {

    /* renamed from: a */
    private final C10884c f49664a;

    /* renamed from: b */
    private final float f49665b;

    public C10883b(float f, C10884c cVar) {
        while (cVar instanceof C10883b) {
            cVar = ((C10883b) cVar).f49664a;
            f += ((C10883b) cVar).f49665b;
        }
        this.f49664a = cVar;
        this.f49665b = f;
    }

    /* renamed from: a */
    public float mo43065a(RectF rectF) {
        return Math.max(0.0f, this.f49664a.mo43065a(rectF) + this.f49665b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10883b)) {
            return false;
        }
        C10883b bVar = (C10883b) obj;
        if (!this.f49664a.equals(bVar.f49664a) || this.f49665b != bVar.f49665b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49664a, Float.valueOf(this.f49665b)});
    }
}
