package p070e1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p017c0.C2617a;
import p150t.C6077a;

/* renamed from: e1.b */
/* compiled from: Palette */
public final class C5199b {

    /* renamed from: f */
    static final C5202c f22684f = new C5200a();

    /* renamed from: a */
    private final List<C5203d> f22685a;

    /* renamed from: b */
    private final List<C5204c> f22686b;

    /* renamed from: c */
    private final Map<C5204c, C5203d> f22687c = new C6077a();

    /* renamed from: d */
    private final SparseBooleanArray f22688d = new SparseBooleanArray();

    /* renamed from: e */
    private final C5203d f22689e = m23592a();

    /* renamed from: e1.b$a */
    /* compiled from: Palette */
    static class C5200a implements C5202c {
        C5200a() {
        }

        /* renamed from: b */
        private boolean m23602b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        private boolean m23603c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: d */
        private boolean m23604d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        /* renamed from: a */
        public boolean mo21400a(int i, float[] fArr) {
            return !m23604d(fArr) && !m23602b(fArr) && !m23603c(fArr);
        }
    }

    /* renamed from: e1.b$b */
    /* compiled from: Palette */
    public static final class C5201b {

        /* renamed from: a */
        private final List<C5203d> f22690a;

        /* renamed from: b */
        private final Bitmap f22691b;

        /* renamed from: c */
        private final List<C5204c> f22692c;

        /* renamed from: d */
        private int f22693d = 16;

        /* renamed from: e */
        private int f22694e = 12544;

        /* renamed from: f */
        private int f22695f = -1;

        /* renamed from: g */
        private final List<C5202c> f22696g;

        /* renamed from: h */
        private Rect f22697h;

        public C5201b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f22692c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f22696g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C5199b.f22684f);
            this.f22691b = bitmap;
            this.f22690a = null;
            arrayList.add(C5204c.f22707e);
            arrayList.add(C5204c.f22708f);
            arrayList.add(C5204c.f22709g);
            arrayList.add(C5204c.f22710h);
            arrayList.add(C5204c.f22711i);
            arrayList.add(C5204c.f22712j);
        }

        /* renamed from: b */
        private int[] m23606b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f22697h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f22697h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f22697h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        /* renamed from: d */
        private Bitmap m23607d(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f22694e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f22694e;
                if (width > i2) {
                    double d2 = (double) i2;
                    double d3 = (double) width;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    d = Math.sqrt(d2 / d3);
                }
            } else if (this.f22695f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f22695f)) {
                double d4 = (double) i;
                double d5 = (double) max;
                Double.isNaN(d4);
                Double.isNaN(d5);
                d = d4 / d5;
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d), false);
        }

        /* renamed from: a */
        public C5199b mo21401a() {
            List<C5203d> list;
            C5202c[] cVarArr;
            Bitmap bitmap = this.f22691b;
            if (bitmap != null) {
                Bitmap d = m23607d(bitmap);
                Rect rect = this.f22697h;
                if (!(d == this.f22691b || rect == null)) {
                    double width = (double) d.getWidth();
                    double width2 = (double) this.f22691b.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d2 = width / width2;
                    double d3 = (double) rect.left;
                    Double.isNaN(d3);
                    rect.left = (int) Math.floor(d3 * d2);
                    double d4 = (double) rect.top;
                    Double.isNaN(d4);
                    rect.top = (int) Math.floor(d4 * d2);
                    double d5 = (double) rect.right;
                    Double.isNaN(d5);
                    rect.right = Math.min((int) Math.ceil(d5 * d2), d.getWidth());
                    double d6 = (double) rect.bottom;
                    Double.isNaN(d6);
                    rect.bottom = Math.min((int) Math.ceil(d6 * d2), d.getHeight());
                }
                int[] b = m23606b(d);
                int i = this.f22693d;
                if (this.f22696g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<C5202c> list2 = this.f22696g;
                    cVarArr = (C5202c[]) list2.toArray(new C5202c[list2.size()]);
                }
                C5196a aVar = new C5196a(b, i, cVarArr);
                if (d != this.f22691b) {
                    d.recycle();
                }
                list = aVar.mo21385d();
            } else {
                list = this.f22690a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C5199b bVar = new C5199b(list, this.f22692c);
            bVar.mo21396c();
            return bVar;
        }

        /* renamed from: c */
        public C5201b mo21402c(int i) {
            this.f22693d = i;
            return this;
        }
    }

    /* renamed from: e1.b$c */
    /* compiled from: Palette */
    public interface C5202c {
        /* renamed from: a */
        boolean mo21400a(int i, float[] fArr);
    }

    /* renamed from: e1.b$d */
    /* compiled from: Palette */
    public static final class C5203d {

        /* renamed from: a */
        private final int f22698a;

        /* renamed from: b */
        private final int f22699b;

        /* renamed from: c */
        private final int f22700c;

        /* renamed from: d */
        private final int f22701d;

        /* renamed from: e */
        private final int f22702e;

        /* renamed from: f */
        private boolean f22703f;

        /* renamed from: g */
        private int f22704g;

        /* renamed from: h */
        private int f22705h;

        /* renamed from: i */
        private float[] f22706i;

        public C5203d(int i, int i2) {
            this.f22698a = Color.red(i);
            this.f22699b = Color.green(i);
            this.f22700c = Color.blue(i);
            this.f22701d = i;
            this.f22702e = i2;
        }

        /* renamed from: a */
        private void m23611a() {
            int i;
            int i2;
            if (!this.f22703f) {
                int e = C2617a.m9111e(-1, this.f22701d, 4.5f);
                int e2 = C2617a.m9111e(-1, this.f22701d, 3.0f);
                if (e == -1 || e2 == -1) {
                    int e3 = C2617a.m9111e(-16777216, this.f22701d, 4.5f);
                    int e4 = C2617a.m9111e(-16777216, this.f22701d, 3.0f);
                    if (e3 == -1 || e4 == -1) {
                        if (e != -1) {
                            i = C2617a.m9119m(-1, e);
                        } else {
                            i = C2617a.m9119m(-16777216, e3);
                        }
                        this.f22705h = i;
                        if (e2 != -1) {
                            i2 = C2617a.m9119m(-1, e2);
                        } else {
                            i2 = C2617a.m9119m(-16777216, e4);
                        }
                        this.f22704g = i2;
                        this.f22703f = true;
                        return;
                    }
                    this.f22705h = C2617a.m9119m(-16777216, e3);
                    this.f22704g = C2617a.m9119m(-16777216, e4);
                    this.f22703f = true;
                    return;
                }
                this.f22705h = C2617a.m9119m(-1, e);
                this.f22704g = C2617a.m9119m(-1, e2);
                this.f22703f = true;
            }
        }

        /* renamed from: b */
        public int mo21403b() {
            m23611a();
            return this.f22705h;
        }

        /* renamed from: c */
        public float[] mo21404c() {
            if (this.f22706i == null) {
                this.f22706i = new float[3];
            }
            C2617a.m9107a(this.f22698a, this.f22699b, this.f22700c, this.f22706i);
            return this.f22706i;
        }

        /* renamed from: d */
        public int mo21405d() {
            return this.f22702e;
        }

        /* renamed from: e */
        public int mo21406e() {
            return this.f22701d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5203d.class != obj.getClass()) {
                return false;
            }
            C5203d dVar = (C5203d) obj;
            if (this.f22702e == dVar.f22702e && this.f22701d == dVar.f22701d) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo21408f() {
            m23611a();
            return this.f22704g;
        }

        public int hashCode() {
            return (this.f22701d * 31) + this.f22702e;
        }

        public String toString() {
            return C5203d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(mo21406e()) + ']' + " [HSL: " + Arrays.toString(mo21404c()) + ']' + " [Population: " + this.f22702e + ']' + " [Title Text: #" + Integer.toHexString(mo21408f()) + ']' + " [Body Text: #" + Integer.toHexString(mo21403b()) + ']';
        }
    }

    C5199b(List<C5203d> list, List<C5204c> list2) {
        this.f22685a = list;
        this.f22686b = list2;
    }

    /* renamed from: a */
    private C5203d m23592a() {
        int size = this.f22685a.size();
        int i = Integer.MIN_VALUE;
        C5203d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C5203d dVar2 = this.f22685a.get(i2);
            if (dVar2.mo21405d() > i) {
                i = dVar2.mo21405d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    /* renamed from: b */
    public static C5201b m23593b(Bitmap bitmap) {
        return new C5201b(bitmap);
    }

    /* renamed from: d */
    private float m23594d(C5203d dVar, C5204c cVar) {
        float[] c = dVar.mo21404c();
        C5203d dVar2 = this.f22689e;
        int d = dVar2 != null ? dVar2.mo21405d() : 1;
        float f = 0.0f;
        float g = cVar.mo21417g() > 0.0f ? cVar.mo21417g() * (1.0f - Math.abs(c[1] - cVar.mo21419i())) : 0.0f;
        float a = cVar.mo21411a() > 0.0f ? cVar.mo21411a() * (1.0f - Math.abs(c[2] - cVar.mo21418h())) : 0.0f;
        if (cVar.mo21416f() > 0.0f) {
            f = cVar.mo21416f() * (((float) dVar.mo21405d()) / ((float) d));
        }
        return g + a + f;
    }

    /* renamed from: e */
    private C5203d m23595e(C5204c cVar) {
        C5203d f = m23596f(cVar);
        if (f != null && cVar.mo21420j()) {
            this.f22688d.append(f.mo21406e(), true);
        }
        return f;
    }

    /* renamed from: f */
    private C5203d m23596f(C5204c cVar) {
        int size = this.f22685a.size();
        float f = 0.0f;
        C5203d dVar = null;
        for (int i = 0; i < size; i++) {
            C5203d dVar2 = this.f22685a.get(i);
            if (m23597j(dVar2, cVar)) {
                float d = m23594d(dVar2, cVar);
                if (dVar == null || d > f) {
                    dVar = dVar2;
                    f = d;
                }
            }
        }
        return dVar;
    }

    /* renamed from: j */
    private boolean m23597j(C5203d dVar, C5204c cVar) {
        float[] c = dVar.mo21404c();
        if (c[1] < cVar.mo21415e() || c[1] > cVar.mo21413c() || c[2] < cVar.mo21414d() || c[2] > cVar.mo21412b() || this.f22688d.get(dVar.mo21406e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21396c() {
        int size = this.f22686b.size();
        for (int i = 0; i < size; i++) {
            C5204c cVar = this.f22686b.get(i);
            cVar.mo21421k();
            this.f22687c.put(cVar, m23595e(cVar));
        }
        this.f22688d.clear();
    }

    /* renamed from: g */
    public C5203d mo21397g(C5204c cVar) {
        return this.f22687c.get(cVar);
    }

    /* renamed from: h */
    public List<C5203d> mo21398h() {
        return Collections.unmodifiableList(this.f22685a);
    }

    /* renamed from: i */
    public C5203d mo21399i() {
        return mo21397g(C5204c.f22708f);
    }
}
