package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C1104p implements RecyclerView.C1118y.C1120b {

    /* renamed from: A */
    boolean f5190A = false;

    /* renamed from: B */
    private BitSet f5191B;

    /* renamed from: C */
    int f5192C = -1;

    /* renamed from: D */
    int f5193D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f5194E = new LazySpanLookup();

    /* renamed from: F */
    private int f5195F = 2;

    /* renamed from: G */
    private boolean f5196G;

    /* renamed from: H */
    private boolean f5197H;

    /* renamed from: I */
    private SavedState f5198I;

    /* renamed from: J */
    private int f5199J;

    /* renamed from: K */
    private final Rect f5200K = new Rect();

    /* renamed from: L */
    private final C1125b f5201L = new C1125b();

    /* renamed from: M */
    private boolean f5202M = false;

    /* renamed from: N */
    private boolean f5203N = true;

    /* renamed from: O */
    private int[] f5204O;

    /* renamed from: P */
    private final Runnable f5205P = new C1124a();

    /* renamed from: s */
    private int f5206s = -1;

    /* renamed from: t */
    C1126c[] f5207t;

    /* renamed from: u */
    C1157i f5208u;

    /* renamed from: v */
    C1157i f5209v;

    /* renamed from: w */
    private int f5210w;

    /* renamed from: x */
    private int f5211x;

    /* renamed from: y */
    private final C1153f f5212y;

    /* renamed from: z */
    boolean f5213z = false;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        C1126c f5214e;

        /* renamed from: f */
        boolean f5215f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean mo5604e() {
            return this.f5215f;
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

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1123a();

        /* renamed from: b */
        int f5222b;

        /* renamed from: c */
        int f5223c;

        /* renamed from: d */
        int f5224d;

        /* renamed from: e */
        int[] f5225e;

        /* renamed from: f */
        int f5226f;

        /* renamed from: g */
        int[] f5227g;

        /* renamed from: h */
        List<LazySpanLookup.FullSpanItem> f5228h;

        /* renamed from: i */
        boolean f5229i;

        /* renamed from: j */
        boolean f5230j;

        /* renamed from: k */
        boolean f5231k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        class C1123a implements Parcelable.Creator<SavedState> {
            C1123a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5625a() {
            this.f5225e = null;
            this.f5224d = 0;
            this.f5222b = -1;
            this.f5223c = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5626b() {
            this.f5225e = null;
            this.f5224d = 0;
            this.f5226f = 0;
            this.f5227g = null;
            this.f5228h = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5222b);
            parcel.writeInt(this.f5223c);
            parcel.writeInt(this.f5224d);
            if (this.f5224d > 0) {
                parcel.writeIntArray(this.f5225e);
            }
            parcel.writeInt(this.f5226f);
            if (this.f5226f > 0) {
                parcel.writeIntArray(this.f5227g);
            }
            parcel.writeInt(this.f5229i ? 1 : 0);
            parcel.writeInt(this.f5230j ? 1 : 0);
            parcel.writeInt(this.f5231k ? 1 : 0);
            parcel.writeList(this.f5228h);
        }

        SavedState(Parcel parcel) {
            this.f5222b = parcel.readInt();
            this.f5223c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5224d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5225e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5226f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5227g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f5229i = parcel.readInt() == 1;
            this.f5230j = parcel.readInt() == 1;
            this.f5231k = parcel.readInt() == 1 ? true : z;
            this.f5228h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f5224d = savedState.f5224d;
            this.f5222b = savedState.f5222b;
            this.f5223c = savedState.f5223c;
            this.f5225e = savedState.f5225e;
            this.f5226f = savedState.f5226f;
            this.f5227g = savedState.f5227g;
            this.f5229i = savedState.f5229i;
            this.f5230j = savedState.f5230j;
            this.f5231k = savedState.f5231k;
            this.f5228h = savedState.f5228h;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1124a implements Runnable {
        C1124a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5594S1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1125b {

        /* renamed from: a */
        int f5233a;

        /* renamed from: b */
        int f5234b;

        /* renamed from: c */
        boolean f5235c;

        /* renamed from: d */
        boolean f5236d;

        /* renamed from: e */
        boolean f5237e;

        /* renamed from: f */
        int[] f5238f;

        C1125b() {
            mo5636c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5634a() {
            int i;
            if (this.f5235c) {
                i = StaggeredGridLayoutManager.this.f5208u.mo5777i();
            } else {
                i = StaggeredGridLayoutManager.this.f5208u.mo5781m();
            }
            this.f5234b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5635b(int i) {
            if (this.f5235c) {
                this.f5234b = StaggeredGridLayoutManager.this.f5208u.mo5777i() - i;
            } else {
                this.f5234b = StaggeredGridLayoutManager.this.f5208u.mo5781m() + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5636c() {
            this.f5233a = -1;
            this.f5234b = Integer.MIN_VALUE;
            this.f5235c = false;
            this.f5236d = false;
            this.f5237e = false;
            int[] iArr = this.f5238f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5637d(C1126c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f5238f;
            if (iArr == null || iArr.length < length) {
                this.f5238f = new int[StaggeredGridLayoutManager.this.f5207t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f5238f[i] = cVarArr[i].mo5653p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    class C1126c {

        /* renamed from: a */
        ArrayList<View> f5240a = new ArrayList<>();

        /* renamed from: b */
        int f5241b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f5242c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f5243d = 0;

        /* renamed from: e */
        final int f5244e;

        C1126c(int i) {
            this.f5244e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5638a(View view) {
            LayoutParams n = mo5651n(view);
            n.f5214e = this;
            this.f5240a.add(view);
            this.f5242c = Integer.MIN_VALUE;
            if (this.f5240a.size() == 1) {
                this.f5241b = Integer.MIN_VALUE;
            }
            if (n.mo5240c() || n.mo5239b()) {
                this.f5243d += StaggeredGridLayoutManager.this.f5208u.mo5773e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5639b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo5649l(Integer.MIN_VALUE);
            } else {
                i2 = mo5653p(Integer.MIN_VALUE);
            }
            mo5642e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f5208u.mo5777i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f5208u.mo5781m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f5242c = i2;
                    this.f5241b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5640c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.f5240a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams n = mo5651n(view);
            this.f5242c = StaggeredGridLayoutManager.this.f5208u.mo5772d(view);
            if (n.f5215f && (f = StaggeredGridLayoutManager.this.f5194E.mo5610f(n.mo5238a())) != null && f.f5219c == 1) {
                this.f5242c += f.mo5617a(this.f5244e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5641d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.f5240a.get(0);
            LayoutParams n = mo5651n(view);
            this.f5241b = StaggeredGridLayoutManager.this.f5208u.mo5775g(view);
            if (n.f5215f && (f = StaggeredGridLayoutManager.this.f5194E.mo5610f(n.mo5238a())) != null && f.f5219c == -1) {
                this.f5241b -= f.mo5617a(this.f5244e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5642e() {
            this.f5240a.clear();
            mo5654q();
            this.f5243d = 0;
        }

        /* renamed from: f */
        public int mo5643f() {
            if (StaggeredGridLayoutManager.this.f5213z) {
                return mo5646i(this.f5240a.size() - 1, -1, true);
            }
            return mo5646i(0, this.f5240a.size(), true);
        }

        /* renamed from: g */
        public int mo5644g() {
            if (StaggeredGridLayoutManager.this.f5213z) {
                return mo5646i(0, this.f5240a.size(), true);
            }
            return mo5646i(this.f5240a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5645h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f5208u.mo5781m();
            int i3 = StaggeredGridLayoutManager.this.f5208u.mo5777i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f5240a.get(i);
                int g = StaggeredGridLayoutManager.this.f5208u.mo5775g(view);
                int d = StaggeredGridLayoutManager.this.f5208u.mo5772d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo5459h0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.mo5459h0(view);
                        }
                    } else if (g >= m && d <= i3) {
                        return StaggeredGridLayoutManager.this.mo5459h0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo5646i(int i, int i2, boolean z) {
            return mo5645h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo5647j() {
            return this.f5243d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo5648k() {
            int i = this.f5242c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5640c();
            return this.f5242c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo5649l(int i) {
            int i2 = this.f5242c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5240a.size() == 0) {
                return i;
            }
            mo5640c();
            return this.f5242c;
        }

        /* renamed from: m */
        public View mo5650m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f5240a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f5240a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5213z && staggeredGridLayoutManager.mo5459h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5213z && staggeredGridLayoutManager2.mo5459h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5240a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f5240a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5213z && staggeredGridLayoutManager3.mo5459h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5213z && staggeredGridLayoutManager4.mo5459h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public LayoutParams mo5651n(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5652o() {
            int i = this.f5241b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5641d();
            return this.f5241b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo5653p(int i) {
            int i2 = this.f5241b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5240a.size() == 0) {
                return i;
            }
            mo5641d();
            return this.f5241b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5654q() {
            this.f5241b = Integer.MIN_VALUE;
            this.f5242c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5655r(int i) {
            int i2 = this.f5241b;
            if (i2 != Integer.MIN_VALUE) {
                this.f5241b = i2 + i;
            }
            int i3 = this.f5242c;
            if (i3 != Integer.MIN_VALUE) {
                this.f5242c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5656s() {
            int size = this.f5240a.size();
            View remove = this.f5240a.remove(size - 1);
            LayoutParams n = mo5651n(remove);
            n.f5214e = null;
            if (n.mo5240c() || n.mo5239b()) {
                this.f5243d -= StaggeredGridLayoutManager.this.f5208u.mo5773e(remove);
            }
            if (size == 1) {
                this.f5241b = Integer.MIN_VALUE;
            }
            this.f5242c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5657t() {
            View remove = this.f5240a.remove(0);
            LayoutParams n = mo5651n(remove);
            n.f5214e = null;
            if (this.f5240a.size() == 0) {
                this.f5242c = Integer.MIN_VALUE;
            }
            if (n.mo5240c() || n.mo5239b()) {
                this.f5243d -= StaggeredGridLayoutManager.this.f5208u.mo5773e(remove);
            }
            this.f5241b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5658u(View view) {
            LayoutParams n = mo5651n(view);
            n.f5214e = this;
            this.f5240a.add(0, view);
            this.f5241b = Integer.MIN_VALUE;
            if (this.f5240a.size() == 1) {
                this.f5242c = Integer.MIN_VALUE;
            }
            if (n.mo5240c() || n.mo5239b()) {
                this.f5243d += StaggeredGridLayoutManager.this.f5208u.mo5773e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5659v(int i) {
            this.f5241b = i;
            this.f5242c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1104p.C1108d i0 = RecyclerView.C1104p.m5845i0(context, attributeSet, i, i2);
        mo5586H2(i0.f5139a);
        mo5588J2(i0.f5140b);
        mo5587I2(i0.f5141c);
        this.f5212y = new C1153f();
        m6114a2();
    }

    /* renamed from: A2 */
    private void m6092A2(RecyclerView.C1115v vVar, C1153f fVar) {
        int i;
        int i2;
        if (fVar.f5365a && !fVar.f5373i) {
            if (fVar.f5366b == 0) {
                if (fVar.f5369e == -1) {
                    m6093B2(vVar, fVar.f5371g);
                } else {
                    m6094C2(vVar, fVar.f5370f);
                }
            } else if (fVar.f5369e == -1) {
                int i3 = fVar.f5370f;
                int m2 = i3 - m6121m2(i3);
                if (m2 < 0) {
                    i2 = fVar.f5371g;
                } else {
                    i2 = fVar.f5371g - Math.min(m2, fVar.f5366b);
                }
                m6093B2(vVar, i2);
            } else {
                int n2 = m6122n2(fVar.f5371g) - fVar.f5371g;
                if (n2 < 0) {
                    i = fVar.f5370f;
                } else {
                    i = Math.min(n2, fVar.f5366b) + fVar.f5370f;
                }
                m6094C2(vVar, i);
            }
        }
    }

    /* renamed from: B2 */
    private void m6093B2(RecyclerView.C1115v vVar, int i) {
        int J = mo5419J() - 1;
        while (J >= 0) {
            View I = mo5418I(J);
            if (this.f5208u.mo5775g(I) >= i && this.f5208u.mo5785q(I) >= i) {
                LayoutParams layoutParams = (LayoutParams) I.getLayoutParams();
                if (layoutParams.f5215f) {
                    int i2 = 0;
                    while (i2 < this.f5206s) {
                        if (this.f5207t[i2].f5240a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5206s; i3++) {
                        this.f5207t[i3].mo5656s();
                    }
                } else if (layoutParams.f5214e.f5240a.size() != 1) {
                    layoutParams.f5214e.mo5656s();
                } else {
                    return;
                }
                mo5470m1(I, vVar);
                J--;
            } else {
                return;
            }
        }
    }

    /* renamed from: C2 */
    private void m6094C2(RecyclerView.C1115v vVar, int i) {
        while (mo5419J() > 0) {
            View I = mo5418I(0);
            if (this.f5208u.mo5772d(I) <= i && this.f5208u.mo5784p(I) <= i) {
                LayoutParams layoutParams = (LayoutParams) I.getLayoutParams();
                if (layoutParams.f5215f) {
                    int i2 = 0;
                    while (i2 < this.f5206s) {
                        if (this.f5207t[i2].f5240a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5206s; i3++) {
                        this.f5207t[i3].mo5657t();
                    }
                } else if (layoutParams.f5214e.f5240a.size() != 1) {
                    layoutParams.f5214e.mo5657t();
                } else {
                    return;
                }
                mo5470m1(I, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: D2 */
    private void m6095D2() {
        if (this.f5209v.mo5779k() != 1073741824) {
            float f = 0.0f;
            int J = mo5419J();
            for (int i = 0; i < J; i++) {
                View I = mo5418I(i);
                float e = (float) this.f5209v.mo5773e(I);
                if (e >= f) {
                    if (((LayoutParams) I.getLayoutParams()).mo5604e()) {
                        e = (e * 1.0f) / ((float) this.f5206s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f5211x;
            int round = Math.round(f * ((float) this.f5206s));
            if (this.f5209v.mo5779k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5209v.mo5782n());
            }
            mo5593P2(round);
            if (this.f5211x != i2) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I2 = mo5418I(i3);
                    LayoutParams layoutParams = (LayoutParams) I2.getLayoutParams();
                    if (!layoutParams.f5215f) {
                        if (!mo5602t2() || this.f5210w != 1) {
                            int i4 = layoutParams.f5214e.f5244e;
                            int i5 = this.f5211x * i4;
                            int i6 = i4 * i2;
                            if (this.f5210w == 1) {
                                I2.offsetLeftAndRight(i5 - i6);
                            } else {
                                I2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f5206s;
                            int i8 = layoutParams.f5214e.f5244e;
                            I2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f5211x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    private void m6096E2() {
        if (this.f5210w == 1 || !mo5602t2()) {
            this.f5190A = this.f5213z;
        } else {
            this.f5190A = !this.f5213z;
        }
    }

    /* renamed from: G2 */
    private void m6097G2(int i) {
        C1153f fVar = this.f5212y;
        fVar.f5369e = i;
        int i2 = 1;
        if (this.f5190A != (i == -1)) {
            i2 = -1;
        }
        fVar.f5368d = i2;
    }

    /* renamed from: K2 */
    private void m6098K2(int i, int i2) {
        for (int i3 = 0; i3 < this.f5206s; i3++) {
            if (!this.f5207t[i3].f5240a.isEmpty()) {
                m6104Q2(this.f5207t[i3], i, i2);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m6099L2(RecyclerView.C1121z zVar, C1125b bVar) {
        int i;
        if (this.f5196G) {
            i = m6117g2(zVar.mo5578b());
        } else {
            i = m6116c2(zVar.mo5578b());
        }
        bVar.f5233a = i;
        bVar.f5234b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: M1 */
    private void m6100M1(View view) {
        for (int i = this.f5206s - 1; i >= 0; i--) {
            this.f5207t[i].mo5638a(view);
        }
    }

    /* renamed from: N1 */
    private void m6101N1(C1125b bVar) {
        int i;
        SavedState savedState = this.f5198I;
        int i2 = savedState.f5224d;
        if (i2 > 0) {
            if (i2 == this.f5206s) {
                for (int i3 = 0; i3 < this.f5206s; i3++) {
                    this.f5207t[i3].mo5642e();
                    SavedState savedState2 = this.f5198I;
                    int i4 = savedState2.f5225e[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f5230j) {
                            i = this.f5208u.mo5777i();
                        } else {
                            i = this.f5208u.mo5781m();
                        }
                        i4 += i;
                    }
                    this.f5207t[i3].mo5659v(i4);
                }
            } else {
                savedState.mo5626b();
                SavedState savedState3 = this.f5198I;
                savedState3.f5222b = savedState3.f5223c;
            }
        }
        SavedState savedState4 = this.f5198I;
        this.f5197H = savedState4.f5231k;
        mo5587I2(savedState4.f5229i);
        m6096E2();
        SavedState savedState5 = this.f5198I;
        int i5 = savedState5.f5222b;
        if (i5 != -1) {
            this.f5192C = i5;
            bVar.f5235c = savedState5.f5230j;
        } else {
            bVar.f5235c = this.f5190A;
        }
        if (savedState5.f5226f > 1) {
            LazySpanLookup lazySpanLookup = this.f5194E;
            lazySpanLookup.f5216a = savedState5.f5227g;
            lazySpanLookup.f5217b = savedState5.f5228h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: O2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6102O2(int r5, androidx.recyclerview.widget.RecyclerView.C1121z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f5212y
            r1 = 0
            r0.f5366b = r1
            r0.f5367c = r5
            boolean r0 = r4.mo5488x0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo5579c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f5190A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.i r5 = r4.f5208u
            int r5 = r5.mo5782n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.i r5 = r4.f5208u
            int r5 = r5.mo5782n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo5423M()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.f r0 = r4.f5212y
            androidx.recyclerview.widget.i r3 = r4.f5208u
            int r3 = r3.mo5781m()
            int r3 = r3 - r6
            r0.f5370f = r3
            androidx.recyclerview.widget.f r6 = r4.f5212y
            androidx.recyclerview.widget.i r0 = r4.f5208u
            int r0 = r0.mo5777i()
            int r0 = r0 + r5
            r6.f5371g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.f r0 = r4.f5212y
            androidx.recyclerview.widget.i r3 = r4.f5208u
            int r3 = r3.mo5776h()
            int r3 = r3 + r5
            r0.f5371g = r3
            androidx.recyclerview.widget.f r5 = r4.f5212y
            int r6 = -r6
            r5.f5370f = r6
        L_0x005d:
            androidx.recyclerview.widget.f r5 = r4.f5212y
            r5.f5372h = r1
            r5.f5365a = r2
            androidx.recyclerview.widget.i r6 = r4.f5208u
            int r6 = r6.mo5779k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.i r6 = r4.f5208u
            int r6 = r6.mo5776h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f5373i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6102O2(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* renamed from: Q1 */
    private void m6103Q1(View view, LayoutParams layoutParams, C1153f fVar) {
        if (fVar.f5369e == 1) {
            if (layoutParams.f5215f) {
                m6100M1(view);
            } else {
                layoutParams.f5214e.mo5638a(view);
            }
        } else if (layoutParams.f5215f) {
            m6130z2(view);
        } else {
            layoutParams.f5214e.mo5658u(view);
        }
    }

    /* renamed from: Q2 */
    private void m6104Q2(C1126c cVar, int i, int i2) {
        int j = cVar.mo5647j();
        if (i == -1) {
            if (cVar.mo5652o() + j <= i2) {
                this.f5191B.set(cVar.f5244e, false);
            }
        } else if (cVar.mo5648k() - j >= i2) {
            this.f5191B.set(cVar.f5244e, false);
        }
    }

    /* renamed from: R1 */
    private int m6105R1(int i) {
        if (mo5419J() != 0) {
            if ((i < mo5598j2()) != this.f5190A) {
                return -1;
            }
            return 1;
        } else if (this.f5190A) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: R2 */
    private int m6106R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: T1 */
    private boolean m6107T1(C1126c cVar) {
        if (this.f5190A) {
            if (cVar.mo5648k() < this.f5208u.mo5777i()) {
                ArrayList<View> arrayList = cVar.f5240a;
                return !cVar.mo5651n(arrayList.get(arrayList.size() - 1)).f5215f;
            }
        } else if (cVar.mo5652o() > this.f5208u.mo5781m()) {
            return !cVar.mo5651n(cVar.f5240a.get(0)).f5215f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m6108U1(RecyclerView.C1121z zVar) {
        if (mo5419J() == 0) {
            return 0;
        }
        return C1164l.m6473a(zVar, this.f5208u, mo5596e2(!this.f5203N), mo5595d2(!this.f5203N), this, this.f5203N);
    }

    /* renamed from: V1 */
    private int m6109V1(RecyclerView.C1121z zVar) {
        if (mo5419J() == 0) {
            return 0;
        }
        return C1164l.m6474b(zVar, this.f5208u, mo5596e2(!this.f5203N), mo5595d2(!this.f5203N), this, this.f5203N, this.f5190A);
    }

    /* renamed from: W1 */
    private int m6110W1(RecyclerView.C1121z zVar) {
        if (mo5419J() == 0) {
            return 0;
        }
        return C1164l.m6475c(zVar, this.f5208u, mo5596e2(!this.f5203N), mo5595d2(!this.f5203N), this, this.f5203N);
    }

    /* renamed from: X1 */
    private int m6111X1(int i) {
        if (i == 1) {
            return (this.f5210w != 1 && mo5602t2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f5210w != 1 && mo5602t2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.f5210w == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f5210w == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f5210w == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f5210w == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: Y1 */
    private LazySpanLookup.FullSpanItem m6112Y1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5220d = new int[this.f5206s];
        for (int i2 = 0; i2 < this.f5206s; i2++) {
            fullSpanItem.f5220d[i2] = i - this.f5207t[i2].mo5649l(i);
        }
        return fullSpanItem;
    }

    /* renamed from: Z1 */
    private LazySpanLookup.FullSpanItem m6113Z1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5220d = new int[this.f5206s];
        for (int i2 = 0; i2 < this.f5206s; i2++) {
            fullSpanItem.f5220d[i2] = this.f5207t[i2].mo5653p(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: a2 */
    private void m6114a2() {
        this.f5208u = C1157i.m6397b(this, this.f5210w);
        this.f5209v = C1157i.m6397b(this, 1 - this.f5210w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: b2 */
    private int m6115b2(RecyclerView.C1115v vVar, C1153f fVar, RecyclerView.C1121z zVar) {
        int i;
        int i2;
        int i3;
        C1126c cVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        RecyclerView.C1115v vVar2 = vVar;
        C1153f fVar2 = fVar;
        ? r9 = 0;
        this.f5191B.set(0, this.f5206s, true);
        if (this.f5212y.f5373i) {
            i = fVar2.f5369e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (fVar2.f5369e == 1) {
                i12 = fVar2.f5371g + fVar2.f5366b;
            } else {
                i12 = fVar2.f5370f - fVar2.f5366b;
            }
            i = i12;
        }
        m6098K2(fVar2.f5369e, i);
        if (this.f5190A) {
            i2 = this.f5208u.mo5777i();
        } else {
            i2 = this.f5208u.mo5781m();
        }
        int i13 = i2;
        boolean z2 = false;
        while (fVar.mo5757a(zVar) && (this.f5212y.f5373i || !this.f5191B.isEmpty())) {
            View b = fVar2.mo5758b(vVar2);
            LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
            int a = layoutParams.mo5238a();
            int g = this.f5194E.mo5611g(a);
            boolean z3 = g == -1;
            if (z3) {
                cVar = layoutParams.f5215f ? this.f5207t[r9] : m6124p2(fVar2);
                this.f5194E.mo5615n(a, cVar);
            } else {
                cVar = this.f5207t[g];
            }
            C1126c cVar2 = cVar;
            layoutParams.f5214e = cVar2;
            if (fVar2.f5369e == 1) {
                mo5449d(b);
            } else {
                mo5451e(b, r9);
            }
            m6127v2(b, layoutParams, r9);
            if (fVar2.f5369e == 1) {
                if (layoutParams.f5215f) {
                    i11 = m6120l2(i13);
                } else {
                    i11 = cVar2.mo5649l(i13);
                }
                int e = this.f5208u.mo5773e(b) + i11;
                if (z3 && layoutParams.f5215f) {
                    LazySpanLookup.FullSpanItem Y1 = m6112Y1(i11);
                    Y1.f5219c = -1;
                    Y1.f5218b = a;
                    this.f5194E.mo5605a(Y1);
                }
                i4 = e;
                i5 = i11;
            } else {
                if (layoutParams.f5215f) {
                    i10 = m6123o2(i13);
                } else {
                    i10 = cVar2.mo5653p(i13);
                }
                i5 = i10 - this.f5208u.mo5773e(b);
                if (z3 && layoutParams.f5215f) {
                    LazySpanLookup.FullSpanItem Z1 = m6113Z1(i10);
                    Z1.f5219c = 1;
                    Z1.f5218b = a;
                    this.f5194E.mo5605a(Z1);
                }
                i4 = i10;
            }
            if (layoutParams.f5215f && fVar2.f5368d == -1) {
                if (z3) {
                    this.f5202M = true;
                } else {
                    if (fVar2.f5369e == 1) {
                        z = mo5591O1();
                    } else {
                        z = mo5592P1();
                    }
                    if (!z) {
                        LazySpanLookup.FullSpanItem f = this.f5194E.mo5610f(a);
                        if (f != null) {
                            f.f5221e = true;
                        }
                        this.f5202M = true;
                    }
                }
            }
            m6103Q1(b, layoutParams, fVar2);
            if (!mo5602t2() || this.f5210w != 1) {
                if (layoutParams.f5215f) {
                    i8 = this.f5209v.mo5781m();
                } else {
                    i8 = (cVar2.f5244e * this.f5211x) + this.f5209v.mo5781m();
                }
                i7 = i8;
                i6 = this.f5209v.mo5773e(b) + i8;
            } else {
                if (layoutParams.f5215f) {
                    i9 = this.f5209v.mo5777i();
                } else {
                    i9 = this.f5209v.mo5777i() - (((this.f5206s - 1) - cVar2.f5244e) * this.f5211x);
                }
                i6 = i9;
                i7 = i9 - this.f5209v.mo5773e(b);
            }
            if (this.f5210w == 1) {
                mo5491z0(b, i7, i5, i6, i4);
            } else {
                mo5491z0(b, i5, i7, i4, i6);
            }
            if (layoutParams.f5215f) {
                m6098K2(this.f5212y.f5369e, i);
            } else {
                m6104Q2(cVar2, this.f5212y.f5369e, i);
            }
            m6092A2(vVar2, this.f5212y);
            if (this.f5212y.f5372h && b.hasFocusable()) {
                if (layoutParams.f5215f) {
                    this.f5191B.clear();
                } else {
                    this.f5191B.set(cVar2.f5244e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            m6092A2(vVar2, this.f5212y);
        }
        if (this.f5212y.f5369e == -1) {
            i3 = this.f5208u.mo5781m() - m6123o2(this.f5208u.mo5781m());
        } else {
            i3 = m6120l2(this.f5208u.mo5777i()) - this.f5208u.mo5777i();
        }
        if (i3 > 0) {
            return Math.min(fVar2.f5366b, i3);
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m6116c2(int i) {
        int J = mo5419J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = mo5459h0(mo5418I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m6117g2(int i) {
        for (int J = mo5419J() - 1; J >= 0; J--) {
            int h0 = mo5459h0(mo5418I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private void m6118h2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, boolean z) {
        int i;
        int l2 = m6120l2(Integer.MIN_VALUE);
        if (l2 != Integer.MIN_VALUE && (i = this.f5208u.mo5777i() - l2) > 0) {
            int i2 = i - (-mo5585F2(-i, vVar, zVar));
            if (z && i2 > 0) {
                this.f5208u.mo5786r(i2);
            }
        }
    }

    /* renamed from: i2 */
    private void m6119i2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, boolean z) {
        int m;
        int o2 = m6123o2(Integer.MAX_VALUE);
        if (o2 != Integer.MAX_VALUE && (m = o2 - this.f5208u.mo5781m()) > 0) {
            int F2 = m - mo5585F2(m, vVar, zVar);
            if (z && F2 > 0) {
                this.f5208u.mo5786r(-F2);
            }
        }
    }

    /* renamed from: l2 */
    private int m6120l2(int i) {
        int l = this.f5207t[0].mo5649l(i);
        for (int i2 = 1; i2 < this.f5206s; i2++) {
            int l2 = this.f5207t[i2].mo5649l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: m2 */
    private int m6121m2(int i) {
        int p = this.f5207t[0].mo5653p(i);
        for (int i2 = 1; i2 < this.f5206s; i2++) {
            int p2 = this.f5207t[i2].mo5653p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: n2 */
    private int m6122n2(int i) {
        int l = this.f5207t[0].mo5649l(i);
        for (int i2 = 1; i2 < this.f5206s; i2++) {
            int l2 = this.f5207t[i2].mo5649l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: o2 */
    private int m6123o2(int i) {
        int p = this.f5207t[0].mo5653p(i);
        for (int i2 = 1; i2 < this.f5206s; i2++) {
            int p2 = this.f5207t[i2].mo5653p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: p2 */
    private C1126c m6124p2(C1153f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m6129x2(fVar.f5369e)) {
            i2 = this.f5206s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f5206s;
            i = 1;
        }
        C1126c cVar = null;
        if (fVar.f5369e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f5208u.mo5781m();
            while (i2 != i3) {
                C1126c cVar2 = this.f5207t[i2];
                int l = cVar2.mo5649l(m);
                if (l < i4) {
                    cVar = cVar2;
                    i4 = l;
                }
                i2 += i;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f5208u.mo5777i();
        while (i2 != i3) {
            C1126c cVar3 = this.f5207t[i2];
            int p = cVar3.mo5653p(i6);
            if (p > i5) {
                cVar = cVar3;
                i5 = p;
            }
            i2 += i;
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6125q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5190A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5599k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5598j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f5194E
            r4.mo5612h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5194E
            r9.mo5614k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f5194E
            r7.mo5613j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5194E
            r9.mo5614k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5194E
            r9.mo5613j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f5190A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo5598j2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo5599k2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo5482t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6125q2(int, int, int):void");
    }

    /* renamed from: u2 */
    private void m6126u2(View view, int i, int i2, boolean z) {
        boolean z2;
        mo5463j(view, this.f5200K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f5200K;
        int R2 = m6106R2(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f5200K;
        int R22 = m6106R2(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo5417H1(view, R2, R22, layoutParams);
        } else {
            z2 = mo5412F1(view, R2, R22, layoutParams);
        }
        if (z2) {
            view.measure(R2, R22);
        }
    }

    /* renamed from: v2 */
    private void m6127v2(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f5215f) {
            if (this.f5210w == 1) {
                m6126u2(view, this.f5199J, RecyclerView.C1104p.m5842K(mo5437W(), mo5438X(), mo5456g0() + mo5450d0(), layoutParams.height, true), z);
            } else {
                m6126u2(view, RecyclerView.C1104p.m5842K(mo5473o0(), mo5475p0(), mo5452e0() + mo5454f0(), layoutParams.width, true), this.f5199J, z);
            }
        } else if (this.f5210w == 1) {
            m6126u2(view, RecyclerView.C1104p.m5842K(this.f5211x, mo5475p0(), 0, layoutParams.width, false), RecyclerView.C1104p.m5842K(mo5437W(), mo5438X(), mo5456g0() + mo5450d0(), layoutParams.height, true), z);
        } else {
            m6126u2(view, RecyclerView.C1104p.m5842K(mo5473o0(), mo5475p0(), mo5452e0() + mo5454f0(), layoutParams.width, true), RecyclerView.C1104p.m5842K(this.f5211x, mo5438X(), 0, layoutParams.height, false), z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo5594S1() != false) goto L_0x015b;
     */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6128w2(androidx.recyclerview.widget.RecyclerView.C1115v r9, androidx.recyclerview.widget.RecyclerView.C1121z r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f5201L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f5198I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f5192C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo5578b()
            if (r1 != 0) goto L_0x0018
            r8.mo5466k1(r9)
            r0.mo5636c()
            return
        L_0x0018:
            boolean r1 = r0.f5237e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f5192C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f5198I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo5636c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5198I
            if (r5 == 0) goto L_0x0037
            r8.m6101N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m6096E2()
            boolean r5 = r8.f5190A
            r0.f5235c = r5
        L_0x003e:
            r8.mo5590N2(r10, r0)
            r0.f5237e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5198I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f5192C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f5235c
            boolean r6 = r8.f5196G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo5602t2()
            boolean r6 = r8.f5197H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f5194E
            r5.mo5606b()
            r0.f5236d = r4
        L_0x0060:
            int r5 = r8.mo5419J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5198I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f5224d
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f5236d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f5206s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f5207t
            r5 = r5[r1]
            r5.mo5642e()
            int r5 = r0.f5234b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r8.f5207t
            r6 = r6[r1]
            r6.mo5659v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f5201L
            int[] r1 = r1.f5238f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f5206s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f5207t
            r5 = r5[r1]
            r5.mo5642e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f5201L
            int[] r6 = r6.f5238f
            r6 = r6[r1]
            r5.mo5659v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f5206s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f5207t
            r5 = r5[r1]
            boolean r6 = r8.f5190A
            int r7 = r0.f5234b
            r5.mo5639b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f5201L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f5207t
            r1.mo5637d(r5)
        L_0x00c9:
            r8.mo5486w(r9)
            androidx.recyclerview.widget.f r1 = r8.f5212y
            r1.f5365a = r3
            r8.f5202M = r3
            androidx.recyclerview.widget.i r1 = r8.f5209v
            int r1 = r1.mo5782n()
            r8.mo5593P2(r1)
            int r1 = r0.f5233a
            r8.m6102O2(r1, r10)
            boolean r1 = r0.f5235c
            if (r1 == 0) goto L_0x00fc
            r8.m6097G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f5212y
            r8.m6115b2(r9, r1, r10)
            r8.m6097G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f5212y
            int r2 = r0.f5233a
            int r5 = r1.f5368d
            int r2 = r2 + r5
            r1.f5367c = r2
            r8.m6115b2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m6097G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f5212y
            r8.m6115b2(r9, r1, r10)
            r8.m6097G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f5212y
            int r2 = r0.f5233a
            int r5 = r1.f5368d
            int r2 = r2 + r5
            r1.f5367c = r2
            r8.m6115b2(r9, r1, r10)
        L_0x0113:
            r8.m6095D2()
            int r1 = r8.mo5419J()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f5190A
            if (r1 == 0) goto L_0x0127
            r8.m6118h2(r9, r10, r4)
            r8.m6119i2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m6119i2(r9, r10, r4)
            r8.m6118h2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo5581e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f5195F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo5419J()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f5202M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo5600r2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f5205P
            r8.mo5474o1(r11)
            boolean r11 = r8.mo5594S1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo5581e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f5201L
            r11.mo5636c()
        L_0x0166:
            boolean r11 = r0.f5235c
            r8.f5196G = r11
            boolean r11 = r8.mo5602t2()
            r8.f5197H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f5201L
            r11.mo5636c()
            r8.m6128w2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6128w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* renamed from: x2 */
    private boolean m6129x2(int i) {
        if (this.f5210w == 0) {
            if ((i == -1) != this.f5190A) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.f5190A) == mo5602t2()) {
            return true;
        }
        return false;
    }

    /* renamed from: z2 */
    private void m6130z2(View view) {
        for (int i = this.f5206s - 1; i >= 0; i--) {
            this.f5207t[i].mo5658u(view);
        }
    }

    /* renamed from: C0 */
    public void mo5406C0(int i) {
        super.mo5406C0(i);
        for (int i2 = 0; i2 < this.f5206s; i2++) {
            this.f5207t[i2].mo5655r(i);
        }
    }

    /* renamed from: C1 */
    public void mo4972C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int e0 = mo5452e0() + mo5454f0();
        int g0 = mo5456g0() + mo5450d0();
        if (this.f5210w == 1) {
            i4 = RecyclerView.C1104p.m5846n(i2, rect.height() + g0, mo5445b0());
            i3 = RecyclerView.C1104p.m5846n(i, (this.f5211x * this.f5206s) + e0, mo5448c0());
        } else {
            i3 = RecyclerView.C1104p.m5846n(i, rect.width() + e0, mo5448c0());
            i4 = RecyclerView.C1104p.m5846n(i2, (this.f5211x * this.f5206s) + g0, mo5445b0());
        }
        mo5405B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.LayoutParams mo4973D() {
        if (this.f5210w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: D0 */
    public void mo5407D0(int i) {
        super.mo5407D0(i);
        for (int i2 = 0; i2 < this.f5206s; i2++) {
            this.f5207t[i2].mo5655r(i);
        }
    }

    /* renamed from: E */
    public RecyclerView.LayoutParams mo4974E(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: E0 */
    public void mo5409E0(RecyclerView.C1092h hVar, RecyclerView.C1092h hVar2) {
        this.f5194E.mo5606b();
        for (int i = 0; i < this.f5206s; i++) {
            this.f5207t[i].mo5642e();
        }
    }

    /* renamed from: F */
    public RecyclerView.LayoutParams mo4975F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public int mo5585F2(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (mo5419J() == 0 || i == 0) {
            return 0;
        }
        mo5603y2(i, zVar);
        int b2 = m6115b2(vVar, this.f5212y, zVar);
        if (this.f5212y.f5366b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.f5208u.mo5786r(-i);
        this.f5196G = this.f5190A;
        C1153f fVar = this.f5212y;
        fVar.f5366b = 0;
        m6092A2(vVar, fVar);
        return i;
    }

    /* renamed from: H2 */
    public void mo5586H2(int i) {
        if (i == 0 || i == 1) {
            mo5030g((String) null);
            if (i != this.f5210w) {
                this.f5210w = i;
                C1157i iVar = this.f5208u;
                this.f5208u = this.f5209v;
                this.f5209v = iVar;
                mo5482t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: I0 */
    public void mo5013I0(RecyclerView recyclerView, RecyclerView.C1115v vVar) {
        super.mo5013I0(recyclerView, vVar);
        mo5474o1(this.f5205P);
        for (int i = 0; i < this.f5206s; i++) {
            this.f5207t[i].mo5642e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: I1 */
    public void mo5014I1(RecyclerView recyclerView, RecyclerView.C1121z zVar, int i) {
        C1154g gVar = new C1154g(recyclerView.getContext());
        gVar.mo5570p(i);
        mo5420J1(gVar);
    }

    /* renamed from: I2 */
    public void mo5587I2(boolean z) {
        mo5030g((String) null);
        SavedState savedState = this.f5198I;
        if (!(savedState == null || savedState.f5229i == z)) {
            savedState.f5229i = z;
        }
        this.f5213z = z;
        mo5482t1();
    }

    /* renamed from: J0 */
    public View mo4976J0(View view, int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        View B;
        int i2;
        int i3;
        int i4;
        int i5;
        View m;
        if (mo5419J() == 0 || (B = mo5403B(view)) == null) {
            return null;
        }
        m6096E2();
        int X1 = m6111X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) B.getLayoutParams();
        boolean z = layoutParams.f5215f;
        C1126c cVar = layoutParams.f5214e;
        if (X1 == 1) {
            i2 = mo5599k2();
        } else {
            i2 = mo5598j2();
        }
        m6102O2(i2, zVar);
        m6097G2(X1);
        C1153f fVar = this.f5212y;
        fVar.f5367c = fVar.f5368d + i2;
        fVar.f5366b = (int) (((float) this.f5208u.mo5782n()) * 0.33333334f);
        C1153f fVar2 = this.f5212y;
        fVar2.f5372h = true;
        fVar2.f5365a = false;
        m6115b2(vVar, fVar2, zVar);
        this.f5196G = this.f5190A;
        if (!z && (m = cVar.mo5650m(i2, X1)) != null && m != B) {
            return m;
        }
        if (m6129x2(X1)) {
            for (int i6 = this.f5206s - 1; i6 >= 0; i6--) {
                View m2 = this.f5207t[i6].mo5650m(i2, X1);
                if (m2 != null && m2 != B) {
                    return m2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f5206s; i7++) {
                View m3 = this.f5207t[i7].mo5650m(i2, X1);
                if (m3 != null && m3 != B) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f5213z ^ true) == (X1 == -1);
        if (!z) {
            if (z2) {
                i5 = cVar.mo5643f();
            } else {
                i5 = cVar.mo5644g();
            }
            View C = mo5011C(i5);
            if (!(C == null || C == B)) {
                return C;
            }
        }
        if (m6129x2(X1)) {
            for (int i8 = this.f5206s - 1; i8 >= 0; i8--) {
                if (i8 != cVar.f5244e) {
                    if (z2) {
                        i4 = this.f5207t[i8].mo5643f();
                    } else {
                        i4 = this.f5207t[i8].mo5644g();
                    }
                    View C2 = mo5011C(i4);
                    if (!(C2 == null || C2 == B)) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f5206s; i9++) {
                if (z2) {
                    i3 = this.f5207t[i9].mo5643f();
                } else {
                    i3 = this.f5207t[i9].mo5644g();
                }
                View C3 = mo5011C(i3);
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    /* renamed from: J2 */
    public void mo5588J2(int i) {
        mo5030g((String) null);
        if (i != this.f5206s) {
            mo5601s2();
            this.f5206s = i;
            this.f5191B = new BitSet(this.f5206s);
            this.f5207t = new C1126c[this.f5206s];
            for (int i2 = 0; i2 < this.f5206s; i2++) {
                this.f5207t[i2] = new C1126c(i2);
            }
            mo5482t1();
        }
    }

    /* renamed from: K0 */
    public void mo5015K0(AccessibilityEvent accessibilityEvent) {
        super.mo5015K0(accessibilityEvent);
        if (mo5419J() > 0) {
            View e2 = mo5596e2(false);
            View d2 = mo5595d2(false);
            if (e2 != null && d2 != null) {
                int h0 = mo5459h0(e2);
                int h02 = mo5459h0(d2);
                if (h0 < h02) {
                    accessibilityEvent.setFromIndex(h0);
                    accessibilityEvent.setToIndex(h02);
                    return;
                }
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h0);
            }
        }
    }

    /* renamed from: L1 */
    public boolean mo4977L1() {
        return this.f5198I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean mo5589M2(RecyclerView.C1121z zVar, C1125b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!zVar.mo5581e() && (i = this.f5192C) != -1) {
            if (i < 0 || i >= zVar.mo5578b()) {
                this.f5192C = -1;
                this.f5193D = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f5198I;
                if (savedState == null || savedState.f5222b == -1 || savedState.f5224d < 1) {
                    View C = mo5011C(this.f5192C);
                    if (C != null) {
                        if (this.f5190A) {
                            i2 = mo5599k2();
                        } else {
                            i2 = mo5598j2();
                        }
                        bVar.f5233a = i2;
                        if (this.f5193D != Integer.MIN_VALUE) {
                            if (bVar.f5235c) {
                                bVar.f5234b = (this.f5208u.mo5777i() - this.f5193D) - this.f5208u.mo5772d(C);
                            } else {
                                bVar.f5234b = (this.f5208u.mo5781m() + this.f5193D) - this.f5208u.mo5775g(C);
                            }
                            return true;
                        } else if (this.f5208u.mo5773e(C) > this.f5208u.mo5782n()) {
                            if (bVar.f5235c) {
                                i3 = this.f5208u.mo5777i();
                            } else {
                                i3 = this.f5208u.mo5781m();
                            }
                            bVar.f5234b = i3;
                            return true;
                        } else {
                            int g = this.f5208u.mo5775g(C) - this.f5208u.mo5781m();
                            if (g < 0) {
                                bVar.f5234b = -g;
                                return true;
                            }
                            int i4 = this.f5208u.mo5777i() - this.f5208u.mo5772d(C);
                            if (i4 < 0) {
                                bVar.f5234b = i4;
                                return true;
                            }
                            bVar.f5234b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f5192C;
                        bVar.f5233a = i5;
                        int i6 = this.f5193D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m6105R1(i5) == 1) {
                                z = true;
                            }
                            bVar.f5235c = z;
                            bVar.mo5634a();
                        } else {
                            bVar.mo5635b(i6);
                        }
                        bVar.f5236d = true;
                    }
                } else {
                    bVar.f5234b = Integer.MIN_VALUE;
                    bVar.f5233a = this.f5192C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N2 */
    public void mo5590N2(RecyclerView.C1121z zVar, C1125b bVar) {
        if (!mo5589M2(zVar, bVar) && !m6099L2(zVar, bVar)) {
            bVar.mo5634a();
            bVar.f5233a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo5591O1() {
        int l = this.f5207t[0].mo5649l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5206s; i++) {
            if (this.f5207t[i].mo5649l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public boolean mo5592P1() {
        int p = this.f5207t[0].mo5653p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5206s; i++) {
            if (this.f5207t[i].mo5653p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public void mo5593P2(int i) {
        this.f5211x = i / this.f5206s;
        this.f5199J = View.MeasureSpec.makeMeasureSpec(i, this.f5209v.mo5779k());
    }

    /* renamed from: R0 */
    public void mo4981R0(RecyclerView recyclerView, int i, int i2) {
        m6125q2(i, i2, 1);
    }

    /* renamed from: S0 */
    public void mo4982S0(RecyclerView recyclerView) {
        this.f5194E.mo5606b();
        mo5482t1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public boolean mo5594S1() {
        int i;
        int i2;
        if (mo5419J() == 0 || this.f5195F == 0 || !mo5479r0()) {
            return false;
        }
        if (this.f5190A) {
            i2 = mo5599k2();
            i = mo5598j2();
        } else {
            i2 = mo5598j2();
            i = mo5599k2();
        }
        if (i2 == 0 && mo5600r2() != null) {
            this.f5194E.mo5606b();
            mo5484u1();
            mo5482t1();
            return true;
        } else if (!this.f5202M) {
            return false;
        } else {
            int i3 = this.f5190A ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e = this.f5194E.mo5609e(i2, i4, i3, true);
            if (e == null) {
                this.f5202M = false;
                this.f5194E.mo5608d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.f5194E.mo5609e(i2, e.f5218b, i3 * -1, true);
            if (e2 == null) {
                this.f5194E.mo5608d(e.f5218b);
            } else {
                this.f5194E.mo5608d(e2.f5218b + 1);
            }
            mo5484u1();
            mo5482t1();
            return true;
        }
    }

    /* renamed from: T0 */
    public void mo4984T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m6125q2(i, i2, 8);
    }

    /* renamed from: U0 */
    public void mo4986U0(RecyclerView recyclerView, int i, int i2) {
        m6125q2(i, i2, 2);
    }

    /* renamed from: W0 */
    public void mo4987W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m6125q2(i, i2, 4);
    }

    /* renamed from: X0 */
    public void mo4988X0(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        m6128w2(vVar, zVar, true);
    }

    /* renamed from: Y0 */
    public void mo4989Y0(RecyclerView.C1121z zVar) {
        super.mo4989Y0(zVar);
        this.f5192C = -1;
        this.f5193D = Integer.MIN_VALUE;
        this.f5198I = null;
        this.f5201L.mo5636c();
    }

    /* renamed from: a */
    public PointF mo5024a(int i) {
        int R1 = m6105R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f5210w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    /* renamed from: c1 */
    public void mo5027c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f5198I = savedState;
            if (this.f5192C != -1) {
                savedState.mo5625a();
                this.f5198I.mo5626b();
            }
            mo5482t1();
        }
    }

    /* renamed from: d1 */
    public Parcelable mo5029d1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f5198I != null) {
            return new SavedState(this.f5198I);
        }
        SavedState savedState = new SavedState();
        savedState.f5229i = this.f5213z;
        savedState.f5230j = this.f5196G;
        savedState.f5231k = this.f5197H;
        LazySpanLookup lazySpanLookup = this.f5194E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f5216a) == null) {
            savedState.f5226f = 0;
        } else {
            savedState.f5227g = iArr;
            savedState.f5226f = iArr.length;
            savedState.f5228h = lazySpanLookup.f5217b;
        }
        if (mo5419J() > 0) {
            if (this.f5196G) {
                i = mo5599k2();
            } else {
                i = mo5598j2();
            }
            savedState.f5222b = i;
            savedState.f5223c = mo5597f2();
            int i4 = this.f5206s;
            savedState.f5224d = i4;
            savedState.f5225e = new int[i4];
            for (int i5 = 0; i5 < this.f5206s; i5++) {
                if (this.f5196G) {
                    i2 = this.f5207t[i5].mo5649l(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f5208u.mo5777i();
                    } else {
                        savedState.f5225e[i5] = i2;
                    }
                } else {
                    i2 = this.f5207t[i5].mo5653p(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f5208u.mo5781m();
                    } else {
                        savedState.f5225e[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f5225e[i5] = i2;
            }
        } else {
            savedState.f5222b = -1;
            savedState.f5223c = -1;
            savedState.f5224d = 0;
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo5595d2(boolean z) {
        int m = this.f5208u.mo5781m();
        int i = this.f5208u.mo5777i();
        View view = null;
        for (int J = mo5419J() - 1; J >= 0; J--) {
            View I = mo5418I(J);
            int g = this.f5208u.mo5775g(I);
            int d = this.f5208u.mo5772d(I);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: e1 */
    public void mo5453e1(int i) {
        if (i == 0) {
            mo5594S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo5596e2(boolean z) {
        int m = this.f5208u.mo5781m();
        int i = this.f5208u.mo5777i();
        int J = mo5419J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = mo5418I(i2);
            int g = this.f5208u.mo5775g(I);
            if (this.f5208u.mo5772d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public int mo5597f2() {
        View view;
        if (this.f5190A) {
            view = mo5595d2(true);
        } else {
            view = mo5596e2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo5459h0(view);
    }

    /* renamed from: g */
    public void mo5030g(String str) {
        if (this.f5198I == null) {
            super.mo5030g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public int mo5598j2() {
        if (mo5419J() == 0) {
            return 0;
        }
        return mo5459h0(mo5418I(0));
    }

    /* renamed from: k */
    public boolean mo5031k() {
        return this.f5210w == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public int mo5599k2() {
        int J = mo5419J();
        if (J == 0) {
            return 0;
        }
        return mo5459h0(mo5418I(J - 1));
    }

    /* renamed from: l */
    public boolean mo5033l() {
        return this.f5210w == 1;
    }

    /* renamed from: m */
    public boolean mo4993m(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: o */
    public void mo5037o(int i, int i2, RecyclerView.C1121z zVar, RecyclerView.C1104p.C1107c cVar) {
        int i3;
        int i4;
        if (this.f5210w != 0) {
            i = i2;
        }
        if (mo5419J() != 0 && i != 0) {
            mo5603y2(i, zVar);
            int[] iArr = this.f5204O;
            if (iArr == null || iArr.length < this.f5206s) {
                this.f5204O = new int[this.f5206s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f5206s; i6++) {
                C1153f fVar = this.f5212y;
                if (fVar.f5368d == -1) {
                    i4 = fVar.f5370f;
                    i3 = this.f5207t[i6].mo5653p(i4);
                } else {
                    i4 = this.f5207t[i6].mo5649l(fVar.f5371g);
                    i3 = this.f5212y.f5371g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f5204O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f5204O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f5212y.mo5757a(zVar); i8++) {
                cVar.mo5498a(this.f5212y.f5367c, this.f5204O[i8]);
                C1153f fVar2 = this.f5212y;
                fVar2.f5367c += fVar2.f5368d;
            }
        }
    }

    /* renamed from: q */
    public int mo5039q(RecyclerView.C1121z zVar) {
        return m6108U1(zVar);
    }

    /* renamed from: r */
    public int mo4996r(RecyclerView.C1121z zVar) {
        return m6109V1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5600r2() {
        /*
            r12 = this;
            int r0 = r12.mo5419J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5206s
            r2.<init>(r3)
            int r3 = r12.f5206s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5210w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo5602t2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f5190A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo5418I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f5214e
            int r9 = r9.f5244e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f5214e
            boolean r9 = r12.m6107T1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f5214e
            int r9 = r9.f5244e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f5215f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo5418I(r9)
            boolean r10 = r12.f5190A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.i r10 = r12.f5208u
            int r10 = r10.mo5772d(r7)
            androidx.recyclerview.widget.i r11 = r12.f5208u
            int r11 = r11.mo5772d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.i r10 = r12.f5208u
            int r10 = r10.mo5775g(r7)
            androidx.recyclerview.widget.i r11 = r12.f5208u
            int r11 = r11.mo5775g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f5214e
            int r8 = r8.f5244e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f5214e
            int r9 = r9.f5244e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo5600r2():android.view.View");
    }

    /* renamed from: s */
    public int mo4997s(RecyclerView.C1121z zVar) {
        return m6110W1(zVar);
    }

    /* renamed from: s0 */
    public boolean mo5040s0() {
        return this.f5195F != 0;
    }

    /* renamed from: s2 */
    public void mo5601s2() {
        this.f5194E.mo5606b();
        mo5482t1();
    }

    /* renamed from: t */
    public int mo5041t(RecyclerView.C1121z zVar) {
        return m6108U1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public boolean mo5602t2() {
        return mo5440Z() == 1;
    }

    /* renamed from: u */
    public int mo4998u(RecyclerView.C1121z zVar) {
        return m6109V1(zVar);
    }

    /* renamed from: v */
    public int mo4999v(RecyclerView.C1121z zVar) {
        return m6110W1(zVar);
    }

    /* renamed from: w1 */
    public int mo5000w1(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        return mo5585F2(i, vVar, zVar);
    }

    /* renamed from: x1 */
    public void mo5043x1(int i) {
        SavedState savedState = this.f5198I;
        if (!(savedState == null || savedState.f5222b == i)) {
            savedState.mo5625a();
        }
        this.f5192C = i;
        this.f5193D = Integer.MIN_VALUE;
        mo5482t1();
    }

    /* renamed from: y1 */
    public int mo5001y1(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        return mo5585F2(i, vVar, zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public void mo5603y2(int i, RecyclerView.C1121z zVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5599k2();
            i2 = 1;
        } else {
            i3 = mo5598j2();
            i2 = -1;
        }
        this.f5212y.f5365a = true;
        m6102O2(i3, zVar);
        m6097G2(i2);
        C1153f fVar = this.f5212y;
        fVar.f5367c = i3 + fVar.f5368d;
        fVar.f5366b = Math.abs(i);
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f5216a;

        /* renamed from: b */
        List<FullSpanItem> f5217b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m6189i(int i) {
            if (this.f5217b == null) {
                return -1;
            }
            FullSpanItem f = mo5610f(i);
            if (f != null) {
                this.f5217b.remove(f);
            }
            int size = this.f5217b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f5217b.get(i2).f5218b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f5217b.remove(i2);
            return this.f5217b.get(i2).f5218b;
        }

        /* renamed from: l */
        private void m6190l(int i, int i2) {
            List<FullSpanItem> list = this.f5217b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f5217b.get(size);
                    int i3 = fullSpanItem.f5218b;
                    if (i3 >= i) {
                        fullSpanItem.f5218b = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m6191m(int i, int i2) {
            List<FullSpanItem> list = this.f5217b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f5217b.get(size);
                    int i4 = fullSpanItem.f5218b;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f5217b.remove(size);
                        } else {
                            fullSpanItem.f5218b = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5605a(FullSpanItem fullSpanItem) {
            if (this.f5217b == null) {
                this.f5217b = new ArrayList();
            }
            int size = this.f5217b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f5217b.get(i);
                if (fullSpanItem2.f5218b == fullSpanItem.f5218b) {
                    this.f5217b.remove(i);
                }
                if (fullSpanItem2.f5218b >= fullSpanItem.f5218b) {
                    this.f5217b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f5217b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5606b() {
            int[] iArr = this.f5216a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5217b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5607c(int i) {
            int[] iArr = this.f5216a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f5216a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo5616o(i)];
                this.f5216a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5216a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5608d(int i) {
            List<FullSpanItem> list = this.f5217b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f5217b.get(size).f5218b >= i) {
                        this.f5217b.remove(size);
                    }
                }
            }
            return mo5612h(i);
        }

        /* renamed from: e */
        public FullSpanItem mo5609e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f5217b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f5217b.get(i4);
                int i5 = fullSpanItem.f5218b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f5219c == i3 || (z && fullSpanItem.f5221e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem mo5610f(int i) {
            List<FullSpanItem> list = this.f5217b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f5217b.get(size);
                if (fullSpanItem.f5218b == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo5611g(int i) {
            int[] iArr = this.f5216a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5612h(int i) {
            int[] iArr = this.f5216a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m6189i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f5216a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f5216a.length;
            }
            int min = Math.min(i2 + 1, this.f5216a.length);
            Arrays.fill(this.f5216a, i, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5613j(int i, int i2) {
            int[] iArr = this.f5216a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5607c(i3);
                int[] iArr2 = this.f5216a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f5216a, i, i3, -1);
                m6190l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5614k(int i, int i2) {
            int[] iArr = this.f5216a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5607c(i3);
                int[] iArr2 = this.f5216a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f5216a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m6191m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5615n(int i, C1126c cVar) {
            mo5607c(i);
            this.f5216a[i] = cVar.f5244e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5616o(int i) {
            int length = this.f5216a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1122a();

            /* renamed from: b */
            int f5218b;

            /* renamed from: c */
            int f5219c;

            /* renamed from: d */
            int[] f5220d;

            /* renamed from: e */
            boolean f5221e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            class C1122a implements Parcelable.Creator<FullSpanItem> {
                C1122a() {
                }

                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f5218b = parcel.readInt();
                this.f5219c = parcel.readInt();
                this.f5221e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5220d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo5617a(int i) {
                int[] iArr = this.f5220d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5218b + ", mGapDir=" + this.f5219c + ", mHasUnwantedGapAfter=" + this.f5221e + ", mGapPerSpan=" + Arrays.toString(this.f5220d) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5218b);
                parcel.writeInt(this.f5219c);
                parcel.writeInt(this.f5221e ? 1 : 0);
                int[] iArr = this.f5220d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f5220d);
            }

            FullSpanItem() {
            }
        }
    }
}
