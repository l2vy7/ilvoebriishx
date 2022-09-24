package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p116n0.C5771c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f4945I = false;

    /* renamed from: J */
    int f4946J = -1;

    /* renamed from: K */
    int[] f4947K;

    /* renamed from: L */
    View[] f4948L;

    /* renamed from: M */
    final SparseIntArray f4949M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f4950N = new SparseIntArray();

    /* renamed from: O */
    C1076b f4951O = new C1075a();

    /* renamed from: P */
    final Rect f4952P = new Rect();

    /* renamed from: Q */
    private boolean f4953Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1075a extends C1076b {
        /* renamed from: e */
        public int mo5004e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo5005f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C1076b {

        /* renamed from: a */
        final SparseIntArray f4956a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4957b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4958c = false;

        /* renamed from: d */
        private boolean f4959d = false;

        /* renamed from: a */
        static int m5524a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5006b(int i, int i2) {
            if (!this.f4959d) {
                return mo5008d(i, i2);
            }
            int i3 = this.f4957b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo5008d(i, i2);
            this.f4957b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5007c(int i, int i2) {
            if (!this.f4958c) {
                return mo5004e(i, i2);
            }
            int i3 = this.f4956a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo5004e(i, i2);
            this.f4956a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo5008d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f4959d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f4957b
                int r0 = m5524a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f4957b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo5007c(r0, r8)
                int r0 = r6.mo5005f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo5005f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo5005f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1076b.mo5008d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo5004e(int i, int i2);

        /* renamed from: f */
        public abstract int mo5005f(int i);

        /* renamed from: g */
        public void mo5009g() {
            this.f4957b.clear();
        }

        /* renamed from: h */
        public void mo5010h() {
            this.f4956a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4990a3(RecyclerView.C1104p.m5845i0(context, attributeSet, i, i2).f5140b);
    }

    /* renamed from: J2 */
    private void m5473J2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f4948L[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int W2 = m5484W2(vVar, zVar, mo5459h0(view));
            layoutParams.f4955f = W2;
            layoutParams.f4954e = i4;
            i4 += W2;
            i3 += i2;
        }
    }

    /* renamed from: K2 */
    private void m5474K2() {
        int J = mo5419J();
        for (int i = 0; i < J; i++) {
            LayoutParams layoutParams = (LayoutParams) mo5418I(i).getLayoutParams();
            int a = layoutParams.mo5238a();
            this.f4949M.put(a, layoutParams.mo5003f());
            this.f4950N.put(a, layoutParams.mo5002e());
        }
    }

    /* renamed from: L2 */
    private void m5475L2(int i) {
        this.f4947K = m5476M2(this.f4947K, this.f4946J, i);
    }

    /* renamed from: M2 */
    static int[] m5476M2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: N2 */
    private void m5477N2() {
        this.f4949M.clear();
        this.f4950N.clear();
    }

    /* renamed from: O2 */
    private int m5478O2(RecyclerView.C1121z zVar) {
        int i;
        if (!(mo5419J() == 0 || zVar.mo5578b() == 0)) {
            mo5019T1();
            boolean n2 = mo5036n2();
            View X1 = mo5022X1(!n2, true);
            View W1 = mo5021W1(!n2, true);
            if (!(X1 == null || W1 == null)) {
                int b = this.f4951O.mo5006b(mo5459h0(X1), this.f4946J);
                int b2 = this.f4951O.mo5006b(mo5459h0(W1), this.f4946J);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f4951O.mo5006b(zVar.mo5578b() - 1, this.f4946J) + 1;
                if (this.f4973x) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!n2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f4970u.mo5772d(W1) - this.f4970u.mo5775g(X1))) / ((float) ((this.f4951O.mo5006b(mo5459h0(W1), this.f4946J) - this.f4951O.mo5006b(mo5459h0(X1), this.f4946J)) + 1)))) + ((float) (this.f4970u.mo5781m() - this.f4970u.mo5775g(X1))));
            }
        }
        return 0;
    }

    /* renamed from: P2 */
    private int m5479P2(RecyclerView.C1121z zVar) {
        if (!(mo5419J() == 0 || zVar.mo5578b() == 0)) {
            mo5019T1();
            View X1 = mo5022X1(!mo5036n2(), true);
            View W1 = mo5021W1(!mo5036n2(), true);
            if (!(X1 == null || W1 == null)) {
                if (!mo5036n2()) {
                    return this.f4951O.mo5006b(zVar.mo5578b() - 1, this.f4946J) + 1;
                }
                int d = this.f4970u.mo5772d(W1) - this.f4970u.mo5775g(X1);
                int b = this.f4951O.mo5006b(mo5459h0(X1), this.f4946J);
                return (int) ((((float) d) / ((float) ((this.f4951O.mo5006b(mo5459h0(W1), this.f4946J) - b) + 1))) * ((float) (this.f4951O.mo5006b(zVar.mo5578b() - 1, this.f4946J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: Q2 */
    private void m5480Q2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, LinearLayoutManager.C1078a aVar, int i) {
        boolean z = i == 1;
        int V2 = m5483V2(vVar, zVar, aVar.f4980b);
        if (z) {
            while (V2 > 0) {
                int i2 = aVar.f4980b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f4980b = i3;
                    V2 = m5483V2(vVar, zVar, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = zVar.mo5578b() - 1;
        int i4 = aVar.f4980b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int V22 = m5483V2(vVar, zVar, i5);
            if (V22 <= V2) {
                break;
            }
            i4 = i5;
            V2 = V22;
        }
        aVar.f4980b = i4;
    }

    /* renamed from: R2 */
    private void m5481R2() {
        View[] viewArr = this.f4948L;
        if (viewArr == null || viewArr.length != this.f4946J) {
            this.f4948L = new View[this.f4946J];
        }
    }

    /* renamed from: U2 */
    private int m5482U2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, int i) {
        if (!zVar.mo5581e()) {
            return this.f4951O.mo5006b(i, this.f4946J);
        }
        int f = vVar.mo5534f(i);
        if (f != -1) {
            return this.f4951O.mo5006b(f, this.f4946J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: V2 */
    private int m5483V2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, int i) {
        if (!zVar.mo5581e()) {
            return this.f4951O.mo5007c(i, this.f4946J);
        }
        int i2 = this.f4950N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo5534f(i);
        if (f != -1) {
            return this.f4951O.mo5007c(f, this.f4946J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: W2 */
    private int m5484W2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, int i) {
        if (!zVar.mo5581e()) {
            return this.f4951O.mo5005f(i);
        }
        int i2 = this.f4949M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo5534f(i);
        if (f != -1) {
            return this.f4951O.mo5005f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: X2 */
    private void m5485X2(float f, int i) {
        m5475L2(Math.max(Math.round(f * ((float) this.f4946J)), i));
    }

    /* renamed from: Y2 */
    private void m5486Y2(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f5087b;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int S2 = mo4983S2(layoutParams.f4954e, layoutParams.f4955f);
        if (this.f4968s == 1) {
            i2 = RecyclerView.C1104p.m5842K(S2, i, i5, layoutParams.width, false);
            i3 = RecyclerView.C1104p.m5842K(this.f4970u.mo5782n(), mo5438X(), i4, layoutParams.height, true);
        } else {
            int K = RecyclerView.C1104p.m5842K(S2, i, i4, layoutParams.height, false);
            int K2 = RecyclerView.C1104p.m5842K(this.f4970u.mo5782n(), mo5475p0(), i5, layoutParams.width, true);
            i3 = K;
            i2 = K2;
        }
        m5487Z2(view, i2, i3, z);
    }

    /* renamed from: Z2 */
    private void m5487Z2(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = mo5417H1(view, i, i2, layoutParams);
        } else {
            z2 = mo5412F1(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: b3 */
    private void m5488b3() {
        int i;
        int i2;
        if (mo5034l2() == 1) {
            i2 = mo5473o0() - mo5454f0();
            i = mo5452e0();
        } else {
            i2 = mo5437W() - mo5450d0();
            i = mo5456g0();
        }
        m5475L2(i2 - i);
    }

    /* renamed from: A2 */
    public void mo4971A2(boolean z) {
        if (!z) {
            super.mo4971A2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: C1 */
    public void mo4972C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f4947K == null) {
            super.mo4972C1(rect, i, i2);
        }
        int e0 = mo5452e0() + mo5454f0();
        int g0 = mo5456g0() + mo5450d0();
        if (this.f4968s == 1) {
            i4 = RecyclerView.C1104p.m5846n(i2, rect.height() + g0, mo5445b0());
            int[] iArr = this.f4947K;
            i3 = RecyclerView.C1104p.m5846n(i, iArr[iArr.length - 1] + e0, mo5448c0());
        } else {
            i3 = RecyclerView.C1104p.m5846n(i, rect.width() + e0, mo5448c0());
            int[] iArr2 = this.f4947K;
            i4 = RecyclerView.C1104p.m5846n(i2, iArr2[iArr2.length - 1] + g0, mo5445b0());
        }
        mo5405B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.LayoutParams mo4973D() {
        if (this.f4968s == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: E */
    public RecyclerView.LayoutParams mo4974E(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: F */
    public RecyclerView.LayoutParams mo4975F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4976J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1115v r26, androidx.recyclerview.widget.RecyclerView.C1121z r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo5403B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f4954e
            int r5 = r5.f4955f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4976J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo5017R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f4973x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo5419J()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo5419J()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f4968s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo5035m2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m5482U2(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m5482U2(r1, r2, r10)
            android.view.View r1 = r0.mo5418I(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f4954e
            r18 = r3
            int r3 = r9.f4955f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo5489y0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f4954e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f4954e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4976J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    /* renamed from: L1 */
    public boolean mo4977L1() {
        return this.f4963D == null && !this.f4945I;
    }

    /* renamed from: N */
    public int mo4978N(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (this.f4968s == 1) {
            return this.f4946J;
        }
        if (zVar.mo5578b() < 1) {
            return 0;
        }
        return m5482U2(vVar, zVar, zVar.mo5578b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4979N1(RecyclerView.C1121z zVar, LinearLayoutManager.C1080c cVar, RecyclerView.C1104p.C1107c cVar2) {
        int i = this.f4946J;
        for (int i2 = 0; i2 < this.f4946J && cVar.mo5064c(zVar) && i > 0; i2++) {
            int i3 = cVar.f4991d;
            cVar2.mo5498a(i3, Math.max(0, cVar.f4994g));
            i -= this.f4951O.mo5005f(i3);
            cVar.f4991d += cVar.f4992e;
        }
    }

    /* renamed from: P0 */
    public void mo4980P0(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, View view, C5771c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5427O0(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int U2 = m5482U2(vVar, zVar, layoutParams2.mo5238a());
        if (this.f4968s == 0) {
            cVar.mo22633f0(C5771c.C5774c.m25623a(layoutParams2.mo5002e(), layoutParams2.mo5003f(), U2, 1, false, false));
            return;
        }
        cVar.mo22633f0(C5771c.C5774c.m25623a(U2, 1, layoutParams2.mo5002e(), layoutParams2.mo5003f(), false, false));
    }

    /* renamed from: R0 */
    public void mo4981R0(RecyclerView recyclerView, int i, int i2) {
        this.f4951O.mo5010h();
        this.f4951O.mo5009g();
    }

    /* renamed from: S0 */
    public void mo4982S0(RecyclerView recyclerView) {
        this.f4951O.mo5010h();
        this.f4951O.mo5009g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S2 */
    public int mo4983S2(int i, int i2) {
        if (this.f4968s != 1 || !mo5035m2()) {
            int[] iArr = this.f4947K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4947K;
        int i3 = this.f4946J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: T0 */
    public void mo4984T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4951O.mo5010h();
        this.f4951O.mo5009g();
    }

    /* renamed from: T2 */
    public int mo4985T2() {
        return this.f4946J;
    }

    /* renamed from: U0 */
    public void mo4986U0(RecyclerView recyclerView, int i, int i2) {
        this.f4951O.mo5010h();
        this.f4951O.mo5009g();
    }

    /* renamed from: W0 */
    public void mo4987W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4951O.mo5010h();
        this.f4951O.mo5009g();
    }

    /* renamed from: X0 */
    public void mo4988X0(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (zVar.mo5581e()) {
            m5474K2();
        }
        super.mo4988X0(vVar, zVar);
        m5477N2();
    }

    /* renamed from: Y0 */
    public void mo4989Y0(RecyclerView.C1121z zVar) {
        super.mo4989Y0(zVar);
        this.f4945I = false;
    }

    /* renamed from: a3 */
    public void mo4990a3(int i) {
        if (i != this.f4946J) {
            this.f4945I = true;
            if (i >= 1) {
                this.f4946J = i;
                this.f4951O.mo5010h();
                mo5482t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public View mo4991f2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, boolean z, boolean z2) {
        int i;
        int J = mo5419J();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = mo5419J() - 1;
            i3 = -1;
        } else {
            i2 = J;
            i = 0;
        }
        int b = zVar.mo5578b();
        mo5019T1();
        int m = this.f4970u.mo5781m();
        int i4 = this.f4970u.mo5777i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = mo5418I(i);
            int h0 = mo5459h0(I);
            if (h0 >= 0 && h0 < b && m5483V2(vVar, zVar, h0) == 0) {
                if (((RecyclerView.LayoutParams) I.getLayoutParams()).mo5240c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f4970u.mo5775g(I) < i4 && this.f4970u.mo5772d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    /* renamed from: k0 */
    public int mo4992k0(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (this.f4968s == 0) {
            return this.f4946J;
        }
        if (zVar.mo5578b() < 1) {
            return 0;
        }
        return m5482U2(vVar, zVar, zVar.mo5578b() - 1) + 1;
    }

    /* renamed from: m */
    public boolean mo4993m(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o2 */
    public void mo4994o2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, LinearLayoutManager.C1080c cVar, LinearLayoutManager.C1079b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View d;
        RecyclerView.C1115v vVar2 = vVar;
        RecyclerView.C1121z zVar2 = zVar;
        LinearLayoutManager.C1080c cVar2 = cVar;
        LinearLayoutManager.C1079b bVar2 = bVar;
        int l = this.f4970u.mo5780l();
        boolean z = false;
        boolean z2 = l != 1073741824;
        int i11 = mo5419J() > 0 ? this.f4947K[this.f4946J] : 0;
        if (z2) {
            m5488b3();
        }
        boolean z3 = cVar2.f4992e == 1;
        int i12 = this.f4946J;
        if (!z3) {
            i12 = m5483V2(vVar2, zVar2, cVar2.f4991d) + m5484W2(vVar2, zVar2, cVar2.f4991d);
        }
        int i13 = 0;
        while (i13 < this.f4946J && cVar2.mo5064c(zVar2) && i12 > 0) {
            int i14 = cVar2.f4991d;
            int W2 = m5484W2(vVar2, zVar2, i14);
            if (W2 <= this.f4946J) {
                i12 -= W2;
                if (i12 < 0 || (d = cVar2.mo5065d(vVar2)) == null) {
                    break;
                }
                this.f4948L[i13] = d;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + W2 + " spans but GridLayoutManager has only " + this.f4946J + " spans.");
            }
        }
        if (i13 == 0) {
            bVar2.f4985b = true;
            return;
        }
        float f = 0.0f;
        m5473J2(vVar2, zVar2, i13, z3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f4948L[i15];
            if (cVar2.f4999l == null) {
                if (z3) {
                    mo5449d(view);
                } else {
                    mo5451e(view, z);
                }
            } else if (z3) {
                mo5444b(view);
            } else {
                mo5447c(view, z ? 1 : 0);
            }
            mo5463j(view, this.f4952P);
            m5486Y2(view, l, z);
            int e = this.f4970u.mo5773e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.f4970u.mo5774f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f4955f);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            z = false;
        }
        if (z2) {
            m5485X2(f, i11);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f4948L[i17];
                m5486Y2(view2, 1073741824, true);
                int e2 = this.f4970u.mo5773e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f4948L[i18];
            if (this.f4970u.mo5773e(view3) != i16) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f5087b;
                int i19 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i20 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int S2 = mo4983S2(layoutParams.f4954e, layoutParams.f4955f);
                if (this.f4968s == 1) {
                    i10 = RecyclerView.C1104p.m5842K(S2, 1073741824, i20, layoutParams.width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i9 = RecyclerView.C1104p.m5842K(S2, 1073741824, i19, layoutParams.height, false);
                    i10 = makeMeasureSpec;
                }
                m5487Z2(view3, i10, i9, true);
            }
        }
        int i21 = 0;
        bVar2.f4984a = i16;
        if (this.f4968s == 1) {
            if (cVar2.f4993f == -1) {
                i4 = cVar2.f4989b;
                i = i4 - i16;
            } else {
                int i22 = cVar2.f4989b;
                i = i22;
                i4 = i16 + i22;
            }
            i3 = 0;
            i2 = 0;
        } else if (cVar2.f4993f == -1) {
            int i23 = cVar2.f4989b;
            i2 = i23 - i16;
            i = 0;
            i3 = i23;
            i4 = 0;
        } else {
            int i24 = cVar2.f4989b;
            i3 = i16 + i24;
            i2 = i24;
            i4 = 0;
            i = 0;
        }
        while (i21 < i13) {
            View view4 = this.f4948L[i21];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f4968s == 1) {
                if (mo5035m2()) {
                    int e0 = mo5452e0() + this.f4947K[this.f4946J - layoutParams2.f4954e];
                    i8 = i4;
                    i7 = e0;
                    i6 = e0 - this.f4970u.mo5774f(view4);
                } else {
                    int e02 = mo5452e0() + this.f4947K[layoutParams2.f4954e];
                    i8 = i4;
                    i6 = e02;
                    i7 = this.f4970u.mo5774f(view4) + e02;
                }
                i5 = i;
            } else {
                int g0 = mo5456g0() + this.f4947K[layoutParams2.f4954e];
                i5 = g0;
                i7 = i3;
                i6 = i2;
                i8 = this.f4970u.mo5774f(view4) + g0;
            }
            mo5491z0(view4, i6, i5, i7, i8);
            if (layoutParams2.mo5240c() || layoutParams2.mo5239b()) {
                bVar2.f4986c = true;
            }
            bVar2.f4987d |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f4948L, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo4995q2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, LinearLayoutManager.C1078a aVar, int i) {
        super.mo4995q2(vVar, zVar, aVar, i);
        m5488b3();
        if (zVar.mo5578b() > 0 && !zVar.mo5581e()) {
            m5480Q2(vVar, zVar, aVar, i);
        }
        m5481R2();
    }

    /* renamed from: r */
    public int mo4996r(RecyclerView.C1121z zVar) {
        if (this.f4953Q) {
            return m5478O2(zVar);
        }
        return super.mo4996r(zVar);
    }

    /* renamed from: s */
    public int mo4997s(RecyclerView.C1121z zVar) {
        if (this.f4953Q) {
            return m5479P2(zVar);
        }
        return super.mo4997s(zVar);
    }

    /* renamed from: u */
    public int mo4998u(RecyclerView.C1121z zVar) {
        if (this.f4953Q) {
            return m5478O2(zVar);
        }
        return super.mo4998u(zVar);
    }

    /* renamed from: v */
    public int mo4999v(RecyclerView.C1121z zVar) {
        if (this.f4953Q) {
            return m5479P2(zVar);
        }
        return super.mo4999v(zVar);
    }

    /* renamed from: w1 */
    public int mo5000w1(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        m5488b3();
        m5481R2();
        return super.mo5000w1(i, vVar, zVar);
    }

    /* renamed from: y1 */
    public int mo5001y1(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        m5488b3();
        m5481R2();
        return super.mo5001y1(i, vVar, zVar);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        int f4954e = -1;

        /* renamed from: f */
        int f4955f = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public int mo5002e() {
            return this.f4954e;
        }

        /* renamed from: f */
        public int mo5003f() {
            return this.f4955f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo4990a3(i);
    }
}
