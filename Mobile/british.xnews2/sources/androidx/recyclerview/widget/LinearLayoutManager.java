package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1104p implements RecyclerView.C1118y.C1120b {

    /* renamed from: A */
    int f4960A;

    /* renamed from: B */
    int f4961B;

    /* renamed from: C */
    private boolean f4962C;

    /* renamed from: D */
    SavedState f4963D;

    /* renamed from: E */
    final C1078a f4964E;

    /* renamed from: F */
    private final C1079b f4965F;

    /* renamed from: G */
    private int f4966G;

    /* renamed from: H */
    private int[] f4967H;

    /* renamed from: s */
    int f4968s;

    /* renamed from: t */
    private C1080c f4969t;

    /* renamed from: u */
    C1157i f4970u;

    /* renamed from: v */
    private boolean f4971v;

    /* renamed from: w */
    private boolean f4972w;

    /* renamed from: x */
    boolean f4973x;

    /* renamed from: y */
    private boolean f4974y;

    /* renamed from: z */
    private boolean f4975z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1077a();

        /* renamed from: b */
        int f4976b;

        /* renamed from: c */
        int f4977c;

        /* renamed from: d */
        boolean f4978d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        class C1077a implements Parcelable.Creator<SavedState> {
            C1077a() {
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
        public boolean mo5047a() {
            return this.f4976b >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5048b() {
            this.f4976b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4976b);
            parcel.writeInt(this.f4977c);
            parcel.writeInt(this.f4978d ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f4976b = parcel.readInt();
            this.f4977c = parcel.readInt();
            this.f4978d = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f4976b = savedState.f4976b;
            this.f4977c = savedState.f4977c;
            this.f4978d = savedState.f4978d;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1078a {

        /* renamed from: a */
        C1157i f4979a;

        /* renamed from: b */
        int f4980b;

        /* renamed from: c */
        int f4981c;

        /* renamed from: d */
        boolean f4982d;

        /* renamed from: e */
        boolean f4983e;

        C1078a() {
            mo5059e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5055a() {
            int i;
            if (this.f4982d) {
                i = this.f4979a.mo5777i();
            } else {
                i = this.f4979a.mo5781m();
            }
            this.f4981c = i;
        }

        /* renamed from: b */
        public void mo5056b(View view, int i) {
            if (this.f4982d) {
                this.f4981c = this.f4979a.mo5772d(view) + this.f4979a.mo5783o();
            } else {
                this.f4981c = this.f4979a.mo5775g(view);
            }
            this.f4980b = i;
        }

        /* renamed from: c */
        public void mo5057c(View view, int i) {
            int o = this.f4979a.mo5783o();
            if (o >= 0) {
                mo5056b(view, i);
                return;
            }
            this.f4980b = i;
            if (this.f4982d) {
                int i2 = (this.f4979a.mo5777i() - o) - this.f4979a.mo5772d(view);
                this.f4981c = this.f4979a.mo5777i() - i2;
                if (i2 > 0) {
                    int e = this.f4981c - this.f4979a.mo5773e(view);
                    int m = this.f4979a.mo5781m();
                    int min = e - (m + Math.min(this.f4979a.mo5775g(view) - m, 0));
                    if (min < 0) {
                        this.f4981c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f4979a.mo5775g(view);
            int m2 = g - this.f4979a.mo5781m();
            this.f4981c = g;
            if (m2 > 0) {
                int i3 = (this.f4979a.mo5777i() - Math.min(0, (this.f4979a.mo5777i() - o) - this.f4979a.mo5772d(view))) - (g + this.f4979a.mo5773e(view));
                if (i3 < 0) {
                    this.f4981c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5058d(View view, RecyclerView.C1121z zVar) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.mo5240c() && layoutParams.mo5238a() >= 0 && layoutParams.mo5238a() < zVar.mo5578b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5059e() {
            this.f4980b = -1;
            this.f4981c = Integer.MIN_VALUE;
            this.f4982d = false;
            this.f4983e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4980b + ", mCoordinate=" + this.f4981c + ", mLayoutFromEnd=" + this.f4982d + ", mValid=" + this.f4983e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1079b {

        /* renamed from: a */
        public int f4984a;

        /* renamed from: b */
        public boolean f4985b;

        /* renamed from: c */
        public boolean f4986c;

        /* renamed from: d */
        public boolean f4987d;

        protected C1079b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5061a() {
            this.f4984a = 0;
            this.f4985b = false;
            this.f4986c = false;
            this.f4987d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1080c {

        /* renamed from: a */
        boolean f4988a = true;

        /* renamed from: b */
        int f4989b;

        /* renamed from: c */
        int f4990c;

        /* renamed from: d */
        int f4991d;

        /* renamed from: e */
        int f4992e;

        /* renamed from: f */
        int f4993f;

        /* renamed from: g */
        int f4994g;

        /* renamed from: h */
        int f4995h = 0;

        /* renamed from: i */
        int f4996i = 0;

        /* renamed from: j */
        boolean f4997j = false;

        /* renamed from: k */
        int f4998k;

        /* renamed from: l */
        List<RecyclerView.C1087c0> f4999l = null;

        /* renamed from: m */
        boolean f5000m;

        C1080c() {
        }

        /* renamed from: e */
        private View m5619e() {
            int size = this.f4999l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4999l.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.mo5240c() && this.f4991d == layoutParams.mo5238a()) {
                    mo5063b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo5062a() {
            mo5063b((View) null);
        }

        /* renamed from: b */
        public void mo5063b(View view) {
            View f = mo5066f(view);
            if (f == null) {
                this.f4991d = -1;
            } else {
                this.f4991d = ((RecyclerView.LayoutParams) f.getLayoutParams()).mo5238a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5064c(RecyclerView.C1121z zVar) {
            int i = this.f4991d;
            return i >= 0 && i < zVar.mo5578b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo5065d(RecyclerView.C1115v vVar) {
            if (this.f4999l != null) {
                return m5619e();
            }
            View o = vVar.mo5543o(this.f4991d);
            this.f4991d += this.f4992e;
            return o;
        }

        /* renamed from: f */
        public View mo5066f(View view) {
            int a;
            int size = this.f4999l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4999l.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo5240c() && (a = (layoutParams.mo5238a() - this.f4991d) * this.f4992e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: B2 */
    private boolean m5532B2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, C1078a aVar) {
        View f2;
        boolean z = false;
        if (mo5419J() == 0) {
            return false;
        }
        View V = mo5435V();
        if (V == null || !aVar.mo5058d(V, zVar)) {
            boolean z2 = this.f4971v;
            boolean z3 = this.f4974y;
            if (z2 != z3 || (f2 = mo4991f2(vVar, zVar, aVar.f4982d, z3)) == null) {
                return false;
            }
            aVar.mo5056b(f2, mo5459h0(f2));
            if (!zVar.mo5581e() && mo4977L1()) {
                int g = this.f4970u.mo5775g(f2);
                int d = this.f4970u.mo5772d(f2);
                int m = this.f4970u.mo5781m();
                int i = this.f4970u.mo5777i();
                boolean z4 = d <= m && g < m;
                if (g >= i && d > i) {
                    z = true;
                }
                if (z4 || z) {
                    if (aVar.f4982d) {
                        m = i;
                    }
                    aVar.f4981c = m;
                }
            }
            return true;
        }
        aVar.mo5057c(V, mo5459h0(V));
        return true;
    }

    /* renamed from: C2 */
    private boolean m5533C2(RecyclerView.C1121z zVar, C1078a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (!zVar.mo5581e() && (i = this.f4960A) != -1) {
            if (i < 0 || i >= zVar.mo5578b()) {
                this.f4960A = -1;
                this.f4961B = Integer.MIN_VALUE;
            } else {
                aVar.f4980b = this.f4960A;
                SavedState savedState = this.f4963D;
                if (savedState != null && savedState.mo5047a()) {
                    boolean z2 = this.f4963D.f4978d;
                    aVar.f4982d = z2;
                    if (z2) {
                        aVar.f4981c = this.f4970u.mo5777i() - this.f4963D.f4977c;
                    } else {
                        aVar.f4981c = this.f4970u.mo5781m() + this.f4963D.f4977c;
                    }
                    return true;
                } else if (this.f4961B == Integer.MIN_VALUE) {
                    View C = mo5011C(this.f4960A);
                    if (C == null) {
                        if (mo5419J() > 0) {
                            if ((this.f4960A < mo5459h0(mo5418I(0))) == this.f4973x) {
                                z = true;
                            }
                            aVar.f4982d = z;
                        }
                        aVar.mo5055a();
                    } else if (this.f4970u.mo5773e(C) > this.f4970u.mo5782n()) {
                        aVar.mo5055a();
                        return true;
                    } else if (this.f4970u.mo5775g(C) - this.f4970u.mo5781m() < 0) {
                        aVar.f4981c = this.f4970u.mo5781m();
                        aVar.f4982d = false;
                        return true;
                    } else if (this.f4970u.mo5777i() - this.f4970u.mo5772d(C) < 0) {
                        aVar.f4981c = this.f4970u.mo5777i();
                        aVar.f4982d = true;
                        return true;
                    } else {
                        if (aVar.f4982d) {
                            i2 = this.f4970u.mo5772d(C) + this.f4970u.mo5783o();
                        } else {
                            i2 = this.f4970u.mo5775g(C);
                        }
                        aVar.f4981c = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.f4973x;
                    aVar.f4982d = z3;
                    if (z3) {
                        aVar.f4981c = this.f4970u.mo5777i() - this.f4961B;
                    } else {
                        aVar.f4981c = this.f4970u.mo5781m() + this.f4961B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D2 */
    private void m5534D2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, C1078a aVar) {
        if (!m5533C2(zVar, aVar) && !m5532B2(vVar, zVar, aVar)) {
            aVar.mo5055a();
            aVar.f4980b = this.f4974y ? zVar.mo5578b() - 1 : 0;
        }
    }

    /* renamed from: E2 */
    private void m5535E2(int i, int i2, boolean z, RecyclerView.C1121z zVar) {
        int i3;
        this.f4969t.f5000m = mo5042v2();
        this.f4969t.f4993f = i;
        int[] iArr = this.f4967H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo5016M1(zVar, iArr);
        int max = Math.max(0, this.f4967H[0]);
        int max2 = Math.max(0, this.f4967H[1]);
        if (i == 1) {
            z2 = true;
        }
        C1080c cVar = this.f4969t;
        int i5 = z2 ? max2 : max;
        cVar.f4995h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f4996i = max;
        if (z2) {
            cVar.f4995h = i5 + this.f4970u.mo5778j();
            View i22 = m5549i2();
            C1080c cVar2 = this.f4969t;
            if (this.f4973x) {
                i4 = -1;
            }
            cVar2.f4992e = i4;
            int h0 = mo5459h0(i22);
            C1080c cVar3 = this.f4969t;
            cVar2.f4991d = h0 + cVar3.f4992e;
            cVar3.f4989b = this.f4970u.mo5772d(i22);
            i3 = this.f4970u.mo5772d(i22) - this.f4970u.mo5777i();
        } else {
            View j2 = m5550j2();
            this.f4969t.f4995h += this.f4970u.mo5781m();
            C1080c cVar4 = this.f4969t;
            if (!this.f4973x) {
                i4 = -1;
            }
            cVar4.f4992e = i4;
            int h02 = mo5459h0(j2);
            C1080c cVar5 = this.f4969t;
            cVar4.f4991d = h02 + cVar5.f4992e;
            cVar5.f4989b = this.f4970u.mo5775g(j2);
            i3 = (-this.f4970u.mo5775g(j2)) + this.f4970u.mo5781m();
        }
        C1080c cVar6 = this.f4969t;
        cVar6.f4990c = i2;
        if (z) {
            cVar6.f4990c = i2 - i3;
        }
        cVar6.f4994g = i3;
    }

    /* renamed from: F2 */
    private void m5536F2(int i, int i2) {
        this.f4969t.f4990c = this.f4970u.mo5777i() - i2;
        C1080c cVar = this.f4969t;
        cVar.f4992e = this.f4973x ? -1 : 1;
        cVar.f4991d = i;
        cVar.f4993f = 1;
        cVar.f4989b = i2;
        cVar.f4994g = Integer.MIN_VALUE;
    }

    /* renamed from: G2 */
    private void m5537G2(C1078a aVar) {
        m5536F2(aVar.f4980b, aVar.f4981c);
    }

    /* renamed from: H2 */
    private void m5538H2(int i, int i2) {
        this.f4969t.f4990c = i2 - this.f4970u.mo5781m();
        C1080c cVar = this.f4969t;
        cVar.f4991d = i;
        cVar.f4992e = this.f4973x ? 1 : -1;
        cVar.f4993f = -1;
        cVar.f4989b = i2;
        cVar.f4994g = Integer.MIN_VALUE;
    }

    /* renamed from: I2 */
    private void m5539I2(C1078a aVar) {
        m5538H2(aVar.f4980b, aVar.f4981c);
    }

    /* renamed from: O1 */
    private int m5540O1(RecyclerView.C1121z zVar) {
        if (mo5419J() == 0) {
            return 0;
        }
        mo5019T1();
        C1157i iVar = this.f4970u;
        View X1 = mo5022X1(!this.f4975z, true);
        return C1164l.m6473a(zVar, iVar, X1, mo5021W1(!this.f4975z, true), this, this.f4975z);
    }

    /* renamed from: P1 */
    private int m5541P1(RecyclerView.C1121z zVar) {
        if (mo5419J() == 0) {
            return 0;
        }
        mo5019T1();
        C1157i iVar = this.f4970u;
        View X1 = mo5022X1(!this.f4975z, true);
        return C1164l.m6474b(zVar, iVar, X1, mo5021W1(!this.f4975z, true), this, this.f4975z, this.f4973x);
    }

    /* renamed from: Q1 */
    private int m5542Q1(RecyclerView.C1121z zVar) {
        if (mo5419J() == 0) {
            return 0;
        }
        mo5019T1();
        C1157i iVar = this.f4970u;
        View X1 = mo5022X1(!this.f4975z, true);
        return C1164l.m6475c(zVar, iVar, X1, mo5021W1(!this.f4975z, true), this, this.f4975z);
    }

    /* renamed from: V1 */
    private View m5543V1() {
        return mo5026b2(0, mo5419J());
    }

    /* renamed from: Z1 */
    private View m5544Z1() {
        return mo5026b2(mo5419J() - 1, -1);
    }

    /* renamed from: d2 */
    private View m5545d2() {
        if (this.f4973x) {
            return m5543V1();
        }
        return m5544Z1();
    }

    /* renamed from: e2 */
    private View m5546e2() {
        if (this.f4973x) {
            return m5544Z1();
        }
        return m5543V1();
    }

    /* renamed from: g2 */
    private int m5547g2(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, boolean z) {
        int i2;
        int i3 = this.f4970u.mo5777i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo5044x2(-i3, vVar, zVar);
        int i5 = i + i4;
        if (!z || (i2 = this.f4970u.mo5777i() - i5) <= 0) {
            return i4;
        }
        this.f4970u.mo5786r(i2);
        return i2 + i4;
    }

    /* renamed from: h2 */
    private int m5548h2(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, boolean z) {
        int m;
        int m2 = i - this.f4970u.mo5781m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo5044x2(m2, vVar, zVar);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f4970u.mo5781m()) <= 0) {
            return i2;
        }
        this.f4970u.mo5786r(-m);
        return i2 - m;
    }

    /* renamed from: i2 */
    private View m5549i2() {
        return mo5418I(this.f4973x ? 0 : mo5419J() - 1);
    }

    /* renamed from: j2 */
    private View m5550j2() {
        return mo5418I(this.f4973x ? mo5419J() - 1 : 0);
    }

    /* renamed from: p2 */
    private void m5551p2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, int i, int i2) {
        RecyclerView.C1115v vVar2 = vVar;
        RecyclerView.C1121z zVar2 = zVar;
        if (zVar.mo5583g() && mo5419J() != 0 && !zVar.mo5581e() && mo4977L1()) {
            List<RecyclerView.C1087c0> k = vVar.mo5539k();
            int size = k.size();
            int h0 = mo5459h0(mo5418I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1087c0 c0Var = k.get(i5);
                if (!c0Var.isRemoved()) {
                    char c = 1;
                    if ((c0Var.getLayoutPosition() < h0) != this.f4973x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f4970u.mo5773e(c0Var.itemView);
                    } else {
                        i4 += this.f4970u.mo5773e(c0Var.itemView);
                    }
                }
            }
            this.f4969t.f4999l = k;
            if (i3 > 0) {
                m5538H2(mo5459h0(m5550j2()), i);
                C1080c cVar = this.f4969t;
                cVar.f4995h = i3;
                cVar.f4990c = 0;
                cVar.mo5062a();
                mo5020U1(vVar2, this.f4969t, zVar2, false);
            }
            if (i4 > 0) {
                m5536F2(mo5459h0(m5549i2()), i2);
                C1080c cVar2 = this.f4969t;
                cVar2.f4995h = i4;
                cVar2.f4990c = 0;
                cVar2.mo5062a();
                mo5020U1(vVar2, this.f4969t, zVar2, false);
            }
            this.f4969t.f4999l = null;
        }
    }

    /* renamed from: r2 */
    private void m5552r2(RecyclerView.C1115v vVar, C1080c cVar) {
        if (cVar.f4988a && !cVar.f5000m) {
            int i = cVar.f4994g;
            int i2 = cVar.f4996i;
            if (cVar.f4993f == -1) {
                m5554t2(vVar, i, i2);
            } else {
                m5555u2(vVar, i, i2);
            }
        }
    }

    /* renamed from: s2 */
    private void m5553s2(RecyclerView.C1115v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5472n1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo5472n1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: t2 */
    private void m5554t2(RecyclerView.C1115v vVar, int i, int i2) {
        int J = mo5419J();
        if (i >= 0) {
            int h = (this.f4970u.mo5776h() - i) + i2;
            if (this.f4973x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = mo5418I(i3);
                    if (this.f4970u.mo5775g(I) < h || this.f4970u.mo5785q(I) < h) {
                        m5553s2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = J - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View I2 = mo5418I(i5);
                if (this.f4970u.mo5775g(I2) < h || this.f4970u.mo5785q(I2) < h) {
                    m5553s2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: u2 */
    private void m5555u2(RecyclerView.C1115v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = mo5419J();
            if (this.f4973x) {
                int i4 = J - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View I = mo5418I(i5);
                    if (this.f4970u.mo5772d(I) > i3 || this.f4970u.mo5784p(I) > i3) {
                        m5553s2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < J; i6++) {
                View I2 = mo5418I(i6);
                if (this.f4970u.mo5772d(I2) > i3 || this.f4970u.mo5784p(I2) > i3) {
                    m5553s2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: w2 */
    private void m5556w2() {
        if (this.f4968s == 1 || !mo5035m2()) {
            this.f4973x = this.f4972w;
        } else {
            this.f4973x = !this.f4972w;
        }
    }

    /* renamed from: A2 */
    public void mo4971A2(boolean z) {
        mo5030g((String) null);
        if (this.f4974y != z) {
            this.f4974y = z;
            mo5482t1();
        }
    }

    /* renamed from: C */
    public View mo5011C(int i) {
        int J = mo5419J();
        if (J == 0) {
            return null;
        }
        int h0 = i - mo5459h0(mo5418I(0));
        if (h0 >= 0 && h0 < J) {
            View I = mo5418I(h0);
            if (mo5459h0(I) == i) {
                return I;
            }
        }
        return super.mo5011C(i);
    }

    /* renamed from: D */
    public RecyclerView.LayoutParams mo4973D() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public boolean mo5012G1() {
        return (mo5438X() == 1073741824 || mo5475p0() == 1073741824 || !mo5477q0()) ? false : true;
    }

    /* renamed from: I0 */
    public void mo5013I0(RecyclerView recyclerView, RecyclerView.C1115v vVar) {
        super.mo5013I0(recyclerView, vVar);
        if (this.f4962C) {
            mo5466k1(vVar);
            vVar.mo5531c();
        }
    }

    /* renamed from: I1 */
    public void mo5014I1(RecyclerView recyclerView, RecyclerView.C1121z zVar, int i) {
        C1154g gVar = new C1154g(recyclerView.getContext());
        gVar.mo5570p(i);
        mo5420J1(gVar);
    }

    /* renamed from: J0 */
    public View mo4976J0(View view, int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        int R1;
        View view2;
        View view3;
        m5556w2();
        if (mo5419J() == 0 || (R1 = mo5017R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo5019T1();
        m5535E2(R1, (int) (((float) this.f4970u.mo5782n()) * 0.33333334f), false, zVar);
        C1080c cVar = this.f4969t;
        cVar.f4994g = Integer.MIN_VALUE;
        cVar.f4988a = false;
        mo5020U1(vVar, cVar, zVar, true);
        if (R1 == -1) {
            view2 = m5546e2();
        } else {
            view2 = m5545d2();
        }
        if (R1 == -1) {
            view3 = m5550j2();
        } else {
            view3 = m5549i2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: K0 */
    public void mo5015K0(AccessibilityEvent accessibilityEvent) {
        super.mo5015K0(accessibilityEvent);
        if (mo5419J() > 0) {
            accessibilityEvent.setFromIndex(mo5023Y1());
            accessibilityEvent.setToIndex(mo5025a2());
        }
    }

    /* renamed from: L1 */
    public boolean mo4977L1() {
        return this.f4963D == null && this.f4971v == this.f4974y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo5016M1(RecyclerView.C1121z zVar, int[] iArr) {
        int i;
        int k2 = mo5032k2(zVar);
        if (this.f4969t.f4993f == -1) {
            i = 0;
        } else {
            i = k2;
            k2 = 0;
        }
        iArr[0] = k2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4979N1(RecyclerView.C1121z zVar, C1080c cVar, RecyclerView.C1104p.C1107c cVar2) {
        int i = cVar.f4991d;
        if (i >= 0 && i < zVar.mo5578b()) {
            cVar2.mo5498a(i, Math.max(0, cVar.f4994g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public int mo5017R1(int i) {
        if (i == 1) {
            return (this.f4968s != 1 && mo5035m2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f4968s != 1 && mo5035m2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.f4968s == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f4968s == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f4968s == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f4968s == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public C1080c mo5018S1() {
        return new C1080c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo5019T1() {
        if (this.f4969t == null) {
            this.f4969t = mo5018S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public int mo5020U1(RecyclerView.C1115v vVar, C1080c cVar, RecyclerView.C1121z zVar, boolean z) {
        int i = cVar.f4990c;
        int i2 = cVar.f4994g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f4994g = i2 + i;
            }
            m5552r2(vVar, cVar);
        }
        int i3 = cVar.f4990c + cVar.f4995h;
        C1079b bVar = this.f4965F;
        while (true) {
            if ((!cVar.f5000m && i3 <= 0) || !cVar.mo5064c(zVar)) {
                break;
            }
            bVar.mo5061a();
            mo4994o2(vVar, zVar, cVar, bVar);
            if (!bVar.f4985b) {
                cVar.f4989b += bVar.f4984a * cVar.f4993f;
                if (!bVar.f4986c || cVar.f4999l != null || !zVar.mo5581e()) {
                    int i4 = cVar.f4990c;
                    int i5 = bVar.f4984a;
                    cVar.f4990c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f4994g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f4984a;
                    cVar.f4994g = i7;
                    int i8 = cVar.f4990c;
                    if (i8 < 0) {
                        cVar.f4994g = i7 + i8;
                    }
                    m5552r2(vVar, cVar);
                }
                if (z && bVar.f4987d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f4990c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public View mo5021W1(boolean z, boolean z2) {
        if (this.f4973x) {
            return mo5028c2(0, mo5419J(), z, z2);
        }
        return mo5028c2(mo5419J() - 1, -1, z, z2);
    }

    /* renamed from: X0 */
    public void mo4988X0(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View C;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f4963D == null && this.f4960A == -1) && zVar.mo5578b() == 0) {
            mo5466k1(vVar);
            return;
        }
        SavedState savedState = this.f4963D;
        if (savedState != null && savedState.mo5047a()) {
            this.f4960A = this.f4963D.f4976b;
        }
        mo5019T1();
        this.f4969t.f4988a = false;
        m5556w2();
        View V = mo5435V();
        C1078a aVar = this.f4964E;
        if (!aVar.f4983e || this.f4960A != -1 || this.f4963D != null) {
            aVar.mo5059e();
            C1078a aVar2 = this.f4964E;
            aVar2.f4982d = this.f4973x ^ this.f4974y;
            m5534D2(vVar, zVar, aVar2);
            this.f4964E.f4983e = true;
        } else if (V != null && (this.f4970u.mo5775g(V) >= this.f4970u.mo5777i() || this.f4970u.mo5772d(V) <= this.f4970u.mo5781m())) {
            this.f4964E.mo5057c(V, mo5459h0(V));
        }
        C1080c cVar = this.f4969t;
        cVar.f4993f = cVar.f4998k >= 0 ? 1 : -1;
        int[] iArr = this.f4967H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5016M1(zVar, iArr);
        int max = Math.max(0, this.f4967H[0]) + this.f4970u.mo5781m();
        int max2 = Math.max(0, this.f4967H[1]) + this.f4970u.mo5778j();
        if (!(!zVar.mo5581e() || (i6 = this.f4960A) == -1 || this.f4961B == Integer.MIN_VALUE || (C = mo5011C(i6)) == null)) {
            if (this.f4973x) {
                i7 = this.f4970u.mo5777i() - this.f4970u.mo5772d(C);
                i8 = this.f4961B;
            } else {
                i8 = this.f4970u.mo5775g(C) - this.f4970u.mo5781m();
                i7 = this.f4961B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C1078a aVar3 = this.f4964E;
        if (!aVar3.f4982d ? !this.f4973x : this.f4973x) {
            i9 = 1;
        }
        mo4995q2(vVar, zVar, aVar3, i9);
        mo5486w(vVar);
        this.f4969t.f5000m = mo5042v2();
        this.f4969t.f4997j = zVar.mo5581e();
        this.f4969t.f4996i = 0;
        C1078a aVar4 = this.f4964E;
        if (aVar4.f4982d) {
            m5539I2(aVar4);
            C1080c cVar2 = this.f4969t;
            cVar2.f4995h = max;
            mo5020U1(vVar, cVar2, zVar, false);
            C1080c cVar3 = this.f4969t;
            i2 = cVar3.f4989b;
            int i11 = cVar3.f4991d;
            int i12 = cVar3.f4990c;
            if (i12 > 0) {
                max2 += i12;
            }
            m5537G2(this.f4964E);
            C1080c cVar4 = this.f4969t;
            cVar4.f4995h = max2;
            cVar4.f4991d += cVar4.f4992e;
            mo5020U1(vVar, cVar4, zVar, false);
            C1080c cVar5 = this.f4969t;
            i = cVar5.f4989b;
            int i13 = cVar5.f4990c;
            if (i13 > 0) {
                m5538H2(i11, i2);
                C1080c cVar6 = this.f4969t;
                cVar6.f4995h = i13;
                mo5020U1(vVar, cVar6, zVar, false);
                i2 = this.f4969t.f4989b;
            }
        } else {
            m5537G2(aVar4);
            C1080c cVar7 = this.f4969t;
            cVar7.f4995h = max2;
            mo5020U1(vVar, cVar7, zVar, false);
            C1080c cVar8 = this.f4969t;
            i = cVar8.f4989b;
            int i14 = cVar8.f4991d;
            int i15 = cVar8.f4990c;
            if (i15 > 0) {
                max += i15;
            }
            m5539I2(this.f4964E);
            C1080c cVar9 = this.f4969t;
            cVar9.f4995h = max;
            cVar9.f4991d += cVar9.f4992e;
            mo5020U1(vVar, cVar9, zVar, false);
            C1080c cVar10 = this.f4969t;
            i2 = cVar10.f4989b;
            int i16 = cVar10.f4990c;
            if (i16 > 0) {
                m5536F2(i14, i);
                C1080c cVar11 = this.f4969t;
                cVar11.f4995h = i16;
                mo5020U1(vVar, cVar11, zVar, false);
                i = this.f4969t.f4989b;
            }
        }
        if (mo5419J() > 0) {
            if (this.f4973x ^ this.f4974y) {
                int g2 = m5547g2(i, vVar, zVar, true);
                i4 = i2 + g2;
                i3 = i + g2;
                i5 = m5548h2(i4, vVar, zVar, false);
            } else {
                int h2 = m5548h2(i2, vVar, zVar, true);
                i4 = i2 + h2;
                i3 = i + h2;
                i5 = m5547g2(i3, vVar, zVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m5551p2(vVar, zVar, i2, i);
        if (!zVar.mo5581e()) {
            this.f4970u.mo5787s();
        } else {
            this.f4964E.mo5059e();
        }
        this.f4971v = this.f4974y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View mo5022X1(boolean z, boolean z2) {
        if (this.f4973x) {
            return mo5028c2(mo5419J() - 1, -1, z, z2);
        }
        return mo5028c2(0, mo5419J(), z, z2);
    }

    /* renamed from: Y0 */
    public void mo4989Y0(RecyclerView.C1121z zVar) {
        super.mo4989Y0(zVar);
        this.f4963D = null;
        this.f4960A = -1;
        this.f4961B = Integer.MIN_VALUE;
        this.f4964E.mo5059e();
    }

    /* renamed from: Y1 */
    public int mo5023Y1() {
        View c2 = mo5028c2(0, mo5419J(), false, true);
        if (c2 == null) {
            return -1;
        }
        return mo5459h0(c2);
    }

    /* renamed from: a */
    public PointF mo5024a(int i) {
        if (mo5419J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo5459h0(mo5418I(0))) {
            z = true;
        }
        if (z != this.f4973x) {
            i2 = -1;
        }
        if (this.f4968s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: a2 */
    public int mo5025a2() {
        View c2 = mo5028c2(mo5419J() - 1, -1, false, true);
        if (c2 == null) {
            return -1;
        }
        return mo5459h0(c2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public View mo5026b2(int i, int i2) {
        int i3;
        int i4;
        mo5019T1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo5418I(i);
        }
        if (this.f4970u.mo5775g(mo5418I(i)) < this.f4970u.mo5781m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f4968s == 0) {
            return this.f5123e.mo5818a(i, i2, i4, i3);
        }
        return this.f5124f.mo5818a(i, i2, i4, i3);
    }

    /* renamed from: c1 */
    public void mo5027c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4963D = savedState;
            if (this.f4960A != -1) {
                savedState.mo5048b();
            }
            mo5482t1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c2 */
    public View mo5028c2(int i, int i2, boolean z, boolean z2) {
        mo5019T1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f4968s == 0) {
            return this.f5123e.mo5818a(i, i2, i4, i3);
        }
        return this.f5124f.mo5818a(i, i2, i4, i3);
    }

    /* renamed from: d1 */
    public Parcelable mo5029d1() {
        if (this.f4963D != null) {
            return new SavedState(this.f4963D);
        }
        SavedState savedState = new SavedState();
        if (mo5419J() > 0) {
            mo5019T1();
            boolean z = this.f4971v ^ this.f4973x;
            savedState.f4978d = z;
            if (z) {
                View i2 = m5549i2();
                savedState.f4977c = this.f4970u.mo5777i() - this.f4970u.mo5772d(i2);
                savedState.f4976b = mo5459h0(i2);
            } else {
                View j2 = m5550j2();
                savedState.f4976b = mo5459h0(j2);
                savedState.f4977c = this.f4970u.mo5775g(j2) - this.f4970u.mo5781m();
            }
        } else {
            savedState.mo5048b();
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public View mo4991f2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, boolean z, boolean z2) {
        int i;
        int i2;
        mo5019T1();
        int J = mo5419J();
        int i3 = -1;
        if (z2) {
            i2 = mo5419J() - 1;
            i = -1;
        } else {
            i3 = J;
            i2 = 0;
            i = 1;
        }
        int b = zVar.mo5578b();
        int m = this.f4970u.mo5781m();
        int i4 = this.f4970u.mo5777i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View I = mo5418I(i2);
            int h0 = mo5459h0(I);
            int g = this.f4970u.mo5775g(I);
            int d = this.f4970u.mo5772d(I);
            if (h0 >= 0 && h0 < b) {
                if (!((RecyclerView.LayoutParams) I.getLayoutParams()).mo5240c()) {
                    boolean z3 = d <= m && g < m;
                    boolean z4 = g >= i4 && d > i4;
                    if (!z3 && !z4) {
                        return I;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = I;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = I;
                    }
                    view2 = I;
                } else if (view3 == null) {
                    view3 = I;
                }
            }
            i2 += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* renamed from: g */
    public void mo5030g(String str) {
        if (this.f4963D == null) {
            super.mo5030g(str);
        }
    }

    /* renamed from: k */
    public boolean mo5031k() {
        return this.f4968s == 0;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: k2 */
    public int mo5032k2(RecyclerView.C1121z zVar) {
        if (zVar.mo5580d()) {
            return this.f4970u.mo5782n();
        }
        return 0;
    }

    /* renamed from: l */
    public boolean mo5033l() {
        return this.f4968s == 1;
    }

    /* renamed from: l2 */
    public int mo5034l2() {
        return this.f4968s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public boolean mo5035m2() {
        return mo5440Z() == 1;
    }

    /* renamed from: n2 */
    public boolean mo5036n2() {
        return this.f4975z;
    }

    /* renamed from: o */
    public void mo5037o(int i, int i2, RecyclerView.C1121z zVar, RecyclerView.C1104p.C1107c cVar) {
        if (this.f4968s != 0) {
            i = i2;
        }
        if (mo5419J() != 0 && i != 0) {
            mo5019T1();
            m5535E2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
            mo4979N1(zVar, this.f4969t, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o2 */
    public void mo4994o2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, C1080c cVar, C1079b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo5065d(vVar);
        if (d == null) {
            bVar.f4985b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) d.getLayoutParams();
        if (cVar.f4999l == null) {
            if (this.f4973x == (cVar.f4993f == -1)) {
                mo5449d(d);
            } else {
                mo5451e(d, 0);
            }
        } else {
            if (this.f4973x == (cVar.f4993f == -1)) {
                mo5444b(d);
            } else {
                mo5447c(d, 0);
            }
        }
        mo5401A0(d, 0, 0);
        bVar.f4984a = this.f4970u.mo5773e(d);
        if (this.f4968s == 1) {
            if (mo5035m2()) {
                i5 = mo5473o0() - mo5454f0();
                i4 = i5 - this.f4970u.mo5774f(d);
            } else {
                i4 = mo5452e0();
                i5 = this.f4970u.mo5774f(d) + i4;
            }
            if (cVar.f4993f == -1) {
                int i6 = cVar.f4989b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f4984a;
            } else {
                int i7 = cVar.f4989b;
                i3 = i7;
                i2 = i5;
                i = bVar.f4984a + i7;
            }
        } else {
            int g0 = mo5456g0();
            int f = this.f4970u.mo5774f(d) + g0;
            if (cVar.f4993f == -1) {
                int i8 = cVar.f4989b;
                i2 = i8;
                i3 = g0;
                i = f;
                i4 = i8 - bVar.f4984a;
            } else {
                int i9 = cVar.f4989b;
                i3 = g0;
                i2 = bVar.f4984a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo5491z0(d, i4, i3, i2, i);
        if (layoutParams.mo5240c() || layoutParams.mo5239b()) {
            bVar.f4986c = true;
        }
        bVar.f4987d = d.hasFocusable();
    }

    /* renamed from: p */
    public void mo5038p(int i, RecyclerView.C1104p.C1107c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f4963D;
        int i3 = -1;
        if (savedState == null || !savedState.mo5047a()) {
            m5556w2();
            z = this.f4973x;
            i2 = this.f4960A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f4963D;
            z = savedState2.f4978d;
            i2 = savedState2.f4976b;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f4966G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo5498a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: q */
    public int mo5039q(RecyclerView.C1121z zVar) {
        return m5540O1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo4995q2(RecyclerView.C1115v vVar, RecyclerView.C1121z zVar, C1078a aVar, int i) {
    }

    /* renamed from: r */
    public int mo4996r(RecyclerView.C1121z zVar) {
        return m5541P1(zVar);
    }

    /* renamed from: s */
    public int mo4997s(RecyclerView.C1121z zVar) {
        return m5542Q1(zVar);
    }

    /* renamed from: s0 */
    public boolean mo5040s0() {
        return true;
    }

    /* renamed from: t */
    public int mo5041t(RecyclerView.C1121z zVar) {
        return m5540O1(zVar);
    }

    /* renamed from: u */
    public int mo4998u(RecyclerView.C1121z zVar) {
        return m5541P1(zVar);
    }

    /* renamed from: v */
    public int mo4999v(RecyclerView.C1121z zVar) {
        return m5542Q1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v2 */
    public boolean mo5042v2() {
        return this.f4970u.mo5779k() == 0 && this.f4970u.mo5776h() == 0;
    }

    /* renamed from: w1 */
    public int mo5000w1(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (this.f4968s == 1) {
            return 0;
        }
        return mo5044x2(i, vVar, zVar);
    }

    /* renamed from: x1 */
    public void mo5043x1(int i) {
        this.f4960A = i;
        this.f4961B = Integer.MIN_VALUE;
        SavedState savedState = this.f4963D;
        if (savedState != null) {
            savedState.mo5048b();
        }
        mo5482t1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x2 */
    public int mo5044x2(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (mo5419J() == 0 || i == 0) {
            return 0;
        }
        mo5019T1();
        this.f4969t.f4988a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m5535E2(i2, abs, true, zVar);
        C1080c cVar = this.f4969t;
        int U1 = cVar.f4994g + mo5020U1(vVar, cVar, zVar, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.f4970u.mo5786r(-i);
        this.f4969t.f4998k = i;
        return i;
    }

    /* renamed from: y1 */
    public int mo5001y1(int i, RecyclerView.C1115v vVar, RecyclerView.C1121z zVar) {
        if (this.f4968s == 0) {
            return 0;
        }
        return mo5044x2(i, vVar, zVar);
    }

    /* renamed from: y2 */
    public void mo5045y2(int i) {
        if (i == 0 || i == 1) {
            mo5030g((String) null);
            if (i != this.f4968s || this.f4970u == null) {
                C1157i b = C1157i.m6397b(this, i);
                this.f4970u = b;
                this.f4964E.f4979a = b;
                this.f4968s = i;
                mo5482t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: z2 */
    public void mo5046z2(boolean z) {
        mo5030g((String) null);
        if (z != this.f4972w) {
            this.f4972w = z;
            mo5482t1();
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4968s = 1;
        this.f4972w = false;
        this.f4973x = false;
        this.f4974y = false;
        this.f4975z = true;
        this.f4960A = -1;
        this.f4961B = Integer.MIN_VALUE;
        this.f4963D = null;
        this.f4964E = new C1078a();
        this.f4965F = new C1079b();
        this.f4966G = 2;
        this.f4967H = new int[2];
        mo5045y2(i);
        mo5046z2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4968s = 1;
        this.f4972w = false;
        this.f4973x = false;
        this.f4974y = false;
        this.f4975z = true;
        this.f4960A = -1;
        this.f4961B = Integer.MIN_VALUE;
        this.f4963D = null;
        this.f4964E = new C1078a();
        this.f4965F = new C1079b();
        this.f4966G = 2;
        this.f4967H = new int[2];
        RecyclerView.C1104p.C1108d i0 = RecyclerView.C1104p.m5845i0(context, attributeSet, i, i2);
        mo5045y2(i0.f5139a);
        mo5046z2(i0.f5141c);
        mo4971A2(i0.f5142d);
    }
}
