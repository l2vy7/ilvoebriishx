package p070e1;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import p017c0.C2617a;
import p070e1.C5199b;

/* renamed from: e1.a */
/* compiled from: ColorCutQuantizer */
final class C5196a {

    /* renamed from: g */
    private static final Comparator<C5198b> f22667g = new C5197a();

    /* renamed from: a */
    final int[] f22668a;

    /* renamed from: b */
    final int[] f22669b;

    /* renamed from: c */
    final List<C5199b.C5203d> f22670c;

    /* renamed from: d */
    final TimingLogger f22671d = null;

    /* renamed from: e */
    final C5199b.C5202c[] f22672e;

    /* renamed from: f */
    private final float[] f22673f = new float[3];

    /* renamed from: e1.a$a */
    /* compiled from: ColorCutQuantizer */
    static class C5197a implements Comparator<C5198b> {
        C5197a() {
        }

        /* renamed from: a */
        public int compare(C5198b bVar, C5198b bVar2) {
            return bVar2.mo21394g() - bVar.mo21394g();
        }
    }

    /* renamed from: e1.a$b */
    /* compiled from: ColorCutQuantizer */
    private class C5198b {

        /* renamed from: a */
        private int f22674a;

        /* renamed from: b */
        private int f22675b;

        /* renamed from: c */
        private int f22676c;

        /* renamed from: d */
        private int f22677d;

        /* renamed from: e */
        private int f22678e;

        /* renamed from: f */
        private int f22679f;

        /* renamed from: g */
        private int f22680g;

        /* renamed from: h */
        private int f22681h;

        /* renamed from: i */
        private int f22682i;

        C5198b(int i, int i2) {
            this.f22674a = i;
            this.f22675b = i2;
            mo21390c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo21388a() {
            return mo21392e() > 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo21389b() {
            int f = mo21393f();
            C5196a aVar = C5196a.this;
            int[] iArr = aVar.f22668a;
            int[] iArr2 = aVar.f22669b;
            C5196a.m23571e(iArr, f, this.f22674a, this.f22675b);
            Arrays.sort(iArr, this.f22674a, this.f22675b + 1);
            C5196a.m23571e(iArr, f, this.f22674a, this.f22675b);
            int i = this.f22676c / 2;
            int i2 = this.f22674a;
            int i3 = 0;
            while (true) {
                int i4 = this.f22675b;
                if (i2 > i4) {
                    return this.f22674a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo21390c() {
            C5196a aVar = C5196a.this;
            int[] iArr = aVar.f22668a;
            int[] iArr2 = aVar.f22669b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f22674a; i8 <= this.f22675b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int k = C5196a.m23577k(i9);
                int j = C5196a.m23576j(i9);
                int i10 = C5196a.m23575i(i9);
                if (k > i4) {
                    i4 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i5) {
                    i5 = j;
                }
                if (j < i2) {
                    i2 = j;
                }
                if (i10 > i6) {
                    i6 = i10;
                }
                if (i10 < i3) {
                    i3 = i10;
                }
            }
            this.f22677d = i;
            this.f22678e = i4;
            this.f22679f = i2;
            this.f22680g = i5;
            this.f22681h = i3;
            this.f22682i = i6;
            this.f22676c = i7;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final C5199b.C5203d mo21391d() {
            C5196a aVar = C5196a.this;
            int[] iArr = aVar.f22668a;
            int[] iArr2 = aVar.f22669b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f22674a; i5 <= this.f22675b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C5196a.m23577k(i6) * i7;
                i3 += C5196a.m23576j(i6) * i7;
                i4 += i7 * C5196a.m23575i(i6);
            }
            float f = (float) i2;
            return new C5199b.C5203d(C5196a.m23569b(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final int mo21392e() {
            return (this.f22675b + 1) - this.f22674a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo21393f() {
            int i = this.f22678e - this.f22677d;
            int i2 = this.f22680g - this.f22679f;
            int i3 = this.f22682i - this.f22681h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final int mo21394g() {
            return ((this.f22678e - this.f22677d) + 1) * ((this.f22680g - this.f22679f) + 1) * ((this.f22682i - this.f22681h) + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final C5198b mo21395h() {
            if (mo21388a()) {
                int b = mo21389b();
                C5198b bVar = new C5198b(b + 1, this.f22675b);
                this.f22675b = b;
                mo21390c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    C5196a(int[] iArr, int i, C5199b.C5202c[] cVarArr) {
        this.f22672e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f22669b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = m23573g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m23578l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f22668a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f22670c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f22670c.add(new C5199b.C5203d(m23568a(i8), iArr2[i8]));
            }
            return;
        }
        this.f22670c = m23574h(i);
    }

    /* renamed from: a */
    private static int m23568a(int i) {
        return m23569b(m23577k(i), m23576j(i), m23575i(i));
    }

    /* renamed from: b */
    static int m23569b(int i, int i2, int i3) {
        return Color.rgb(m23572f(i, 5, 8), m23572f(i2, 5, 8), m23572f(i3, 5, 8));
    }

    /* renamed from: c */
    private List<C5199b.C5203d> m23570c(Collection<C5198b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C5198b d : collection) {
            C5199b.C5203d d2 = d.mo21391d();
            if (!m23580n(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static void m23571e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m23575i(i4) | (m23576j(i4) << 10) | (m23577k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m23577k(i5) | (m23575i(i5) << 10) | (m23576j(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: f */
    private static int m23572f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    private static int m23573g(int i) {
        return m23572f(Color.blue(i), 8, 5) | (m23572f(Color.red(i), 8, 5) << 10) | (m23572f(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: h */
    private List<C5199b.C5203d> m23574h(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f22667g);
        priorityQueue.offer(new C5198b(0, this.f22668a.length - 1));
        m23581o(priorityQueue, i);
        return m23570c(priorityQueue);
    }

    /* renamed from: i */
    static int m23575i(int i) {
        return i & 31;
    }

    /* renamed from: j */
    static int m23576j(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: k */
    static int m23577k(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: l */
    private boolean m23578l(int i) {
        int a = m23568a(i);
        C2617a.m9112f(a, this.f22673f);
        return m23579m(a, this.f22673f);
    }

    /* renamed from: m */
    private boolean m23579m(int i, float[] fArr) {
        C5199b.C5202c[] cVarArr = this.f22672e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f22672e[i2].mo21400a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m23580n(C5199b.C5203d dVar) {
        return m23579m(dVar.mo21406e(), dVar.mo21404c());
    }

    /* renamed from: o */
    private void m23581o(PriorityQueue<C5198b> priorityQueue, int i) {
        C5198b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.mo21388a()) {
            priorityQueue.offer(poll.mo21395h());
            priorityQueue.offer(poll);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C5199b.C5203d> mo21385d() {
        return this.f22670c;
    }
}
