package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p090i0.C5433k;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: GapWorker */
final class C1149e implements Runnable {

    /* renamed from: f */
    static final ThreadLocal<C1149e> f5350f = new ThreadLocal<>();

    /* renamed from: g */
    static Comparator<C1152c> f5351g = new C1150a();

    /* renamed from: b */
    ArrayList<RecyclerView> f5352b = new ArrayList<>();

    /* renamed from: c */
    long f5353c;

    /* renamed from: d */
    long f5354d;

    /* renamed from: e */
    private ArrayList<C1152c> f5355e = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: GapWorker */
    class C1150a implements Comparator<C1152c> {
        C1150a() {
        }

        /* renamed from: a */
        public int compare(C1152c cVar, C1152c cVar2) {
            RecyclerView recyclerView = cVar.f5363d;
            if ((recyclerView == null) != (cVar2.f5363d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f5360a;
            if (z == cVar2.f5360a) {
                int i = cVar2.f5361b - cVar.f5361b;
                if (i != 0) {
                    return i;
                }
                int i2 = cVar.f5362c - cVar2.f5362c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: GapWorker */
    static class C1151b implements RecyclerView.C1104p.C1107c {

        /* renamed from: a */
        int f5356a;

        /* renamed from: b */
        int f5357b;

        /* renamed from: c */
        int[] f5358c;

        /* renamed from: d */
        int f5359d;

        C1151b() {
        }

        /* renamed from: a */
        public void mo5498a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f5359d * 2;
                int[] iArr = this.f5358c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5358c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f5358c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5358c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f5359d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5752b() {
            int[] iArr = this.f5358c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5359d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5753c(RecyclerView recyclerView, boolean z) {
            this.f5359d = 0;
            int[] iArr = this.f5358c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1104p pVar = recyclerView.f5060n;
            if (recyclerView.f5058m != null && pVar != null && pVar.mo5483u0()) {
                if (z) {
                    if (!recyclerView.f5049e.mo5669p()) {
                        pVar.mo5038p(recyclerView.f5058m.getItemCount(), this);
                    }
                } else if (!recyclerView.mo5170o0()) {
                    pVar.mo5037o(this.f5356a, this.f5357b, recyclerView.f5073t0, this);
                }
                int i = this.f5359d;
                if (i > pVar.f5131m) {
                    pVar.f5131m = i;
                    pVar.f5132n = z;
                    recyclerView.f5047c.mo5527K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5754d(int i) {
            if (this.f5358c != null) {
                int i2 = this.f5359d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5358c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5755e(int i, int i2) {
            this.f5356a = i;
            this.f5357b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* compiled from: GapWorker */
    static class C1152c {

        /* renamed from: a */
        public boolean f5360a;

        /* renamed from: b */
        public int f5361b;

        /* renamed from: c */
        public int f5362c;

        /* renamed from: d */
        public RecyclerView f5363d;

        /* renamed from: e */
        public int f5364e;

        C1152c() {
        }

        /* renamed from: a */
        public void mo5756a() {
            this.f5360a = false;
            this.f5361b = 0;
            this.f5362c = 0;
            this.f5363d = null;
            this.f5364e = 0;
        }
    }

    C1149e() {
    }

    /* renamed from: b */
    private void m6354b() {
        C1152c cVar;
        int size = this.f5352b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f5352b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5071s0.mo5753c(recyclerView, false);
                i += recyclerView.f5071s0.f5359d;
            }
        }
        this.f5355e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f5352b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1151b bVar = recyclerView2.f5071s0;
                int abs = Math.abs(bVar.f5356a) + Math.abs(bVar.f5357b);
                for (int i5 = 0; i5 < bVar.f5359d * 2; i5 += 2) {
                    if (i3 >= this.f5355e.size()) {
                        cVar = new C1152c();
                        this.f5355e.add(cVar);
                    } else {
                        cVar = this.f5355e.get(i3);
                    }
                    int[] iArr = bVar.f5358c;
                    int i6 = iArr[i5 + 1];
                    cVar.f5360a = i6 <= abs;
                    cVar.f5361b = abs;
                    cVar.f5362c = i6;
                    cVar.f5363d = recyclerView2;
                    cVar.f5364e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f5355e, f5351g);
    }

    /* renamed from: c */
    private void m6355c(C1152c cVar, long j) {
        RecyclerView.C1087c0 i = m6359i(cVar.f5363d, cVar.f5364e, cVar.f5360a ? Long.MAX_VALUE : j);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            m6358h((RecyclerView) i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    private void m6356d(long j) {
        int i = 0;
        while (i < this.f5355e.size()) {
            C1152c cVar = this.f5355e.get(i);
            if (cVar.f5363d != null) {
                m6355c(cVar, j);
                cVar.mo5756a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m6357e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f5050f.mo5690j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1087c0 i0 = RecyclerView.m5650i0(recyclerView.f5050f.mo5689i(i2));
            if (i0.mPosition == i && !i0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m6358h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f5018E && recyclerView.f5050f.mo5690j() != 0) {
                recyclerView.mo5098X0();
            }
            C1151b bVar = recyclerView.f5071s0;
            bVar.mo5753c(recyclerView, true);
            if (bVar.f5359d != 0) {
                try {
                    C5433k.m24388a("RV Nested Prefetch");
                    recyclerView.f5073t0.mo5582f(recyclerView.f5058m);
                    for (int i = 0; i < bVar.f5359d * 2; i += 2) {
                        m6359i(recyclerView, bVar.f5358c[i], j);
                    }
                } finally {
                    C5433k.m24389b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C1087c0 m6359i(RecyclerView recyclerView, int i, long j) {
        if (m6357e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1115v vVar = recyclerView.f5047c;
        try {
            recyclerView.mo5081J0();
            RecyclerView.C1087c0 I = vVar.mo5525I(i, false, j);
            if (I != null) {
                if (!I.isBound() || I.isInvalid()) {
                    vVar.mo5530a(I, false);
                } else {
                    vVar.mo5519B(I.itemView);
                }
            }
            return I;
        } finally {
            recyclerView.mo5084L0(false);
        }
    }

    /* renamed from: a */
    public void mo5745a(RecyclerView recyclerView) {
        this.f5352b.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5746f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5353c == 0) {
            this.f5353c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5071s0.mo5755e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5747g(long j) {
        m6354b();
        m6356d(j);
    }

    /* renamed from: j */
    public void mo5748j(RecyclerView recyclerView) {
        this.f5352b.remove(recyclerView);
    }

    public void run() {
        try {
            C5433k.m24388a("RV Prefetch");
            if (!this.f5352b.isEmpty()) {
                int size = this.f5352b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f5352b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5747g(TimeUnit.MILLISECONDS.toNanos(j) + this.f5354d);
                    this.f5353c = 0;
                    C5433k.m24389b();
                }
            }
        } finally {
            this.f5353c = 0;
            C5433k.m24389b();
        }
    }
}
