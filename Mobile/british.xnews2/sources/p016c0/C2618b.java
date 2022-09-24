package p016c0;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: c0.b */
/* compiled from: Insets */
public final class C2618b {

    /* renamed from: e */
    public static final C2618b f10358e = new C2618b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f10359a;

    /* renamed from: b */
    public final int f10360b;

    /* renamed from: c */
    public final int f10361c;

    /* renamed from: d */
    public final int f10362d;

    private C2618b(int i, int i2, int i3, int i4) {
        this.f10359a = i;
        this.f10360b = i2;
        this.f10361c = i3;
        this.f10362d = i4;
    }

    /* renamed from: a */
    public static C2618b m9120a(C2618b bVar, C2618b bVar2) {
        return m9121b(Math.max(bVar.f10359a, bVar2.f10359a), Math.max(bVar.f10360b, bVar2.f10360b), Math.max(bVar.f10361c, bVar2.f10361c), Math.max(bVar.f10362d, bVar2.f10362d));
    }

    /* renamed from: b */
    public static C2618b m9121b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f10358e;
        }
        return new C2618b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C2618b m9122c(Rect rect) {
        return m9121b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C2618b m9123d(Insets insets) {
        return m9121b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo9257e() {
        return Insets.of(this.f10359a, this.f10360b, this.f10361c, this.f10362d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2618b.class != obj.getClass()) {
            return false;
        }
        C2618b bVar = (C2618b) obj;
        return this.f10362d == bVar.f10362d && this.f10359a == bVar.f10359a && this.f10361c == bVar.f10361c && this.f10360b == bVar.f10360b;
    }

    public int hashCode() {
        return (((((this.f10359a * 31) + this.f10360b) * 31) + this.f10361c) * 31) + this.f10362d;
    }

    public String toString() {
        return "Insets{left=" + this.f10359a + ", top=" + this.f10360b + ", right=" + this.f10361c + ", bottom=" + this.f10362d + '}';
    }
}
