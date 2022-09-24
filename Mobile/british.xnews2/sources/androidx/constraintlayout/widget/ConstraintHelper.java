package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p165w.C6246e;
import p165w.C6249f;
import p165w.C6254i;
import p165w.C6255j;

public abstract class ConstraintHelper extends View {

    /* renamed from: b */
    protected int[] f2311b = new int[32];

    /* renamed from: c */
    protected int f2312c;

    /* renamed from: d */
    protected Context f2313d;

    /* renamed from: e */
    protected C6254i f2314e;

    /* renamed from: f */
    protected boolean f2315f = false;

    /* renamed from: g */
    protected String f2316g;

    /* renamed from: h */
    private View[] f2317h = null;

    /* renamed from: i */
    private HashMap<Integer, String> f2318i = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f2313d = context;
        mo2484m((AttributeSet) null);
    }

    /* renamed from: e */
    private void m3001e(String str) {
        if (str != null && str.length() != 0 && this.f2313d != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int k = m3005k(trim);
            if (k != 0) {
                this.f2318i.put(Integer.valueOf(k), trim);
                m3002f(k);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: f */
    private void m3002f(int i) {
        if (i != getId()) {
            int i2 = this.f2312c + 1;
            int[] iArr = this.f2311b;
            if (i2 > iArr.length) {
                this.f2311b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2311b;
            int i3 = this.f2312c;
            iArr2[i3] = i;
            this.f2312c = i3 + 1;
        }
    }

    /* renamed from: i */
    private int[] m3003i(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String trim : split) {
            int k = m3005k(trim.trim());
            if (k != 0) {
                iArr[i] = k;
                i++;
            }
        }
        return i != split.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    /* renamed from: j */
    private int m3004j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2313d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: k */
    private int m3005k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f = constraintLayout.mo2830f(0, str);
            if (f instanceof Integer) {
                i = ((Integer) f).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m3004j(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0571e.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f2313d.getResources().getIdentifier(str, TtmlNode.ATTR_ID, this.f2313d.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2814g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2816h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2311b, this.f2312c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2816h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f2312c; i++) {
            View h = constraintLayout.mo2840h(this.f2311b[i]);
            if (h != null) {
                h.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h.setTranslationZ(h.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public View[] mo2817l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2317h;
        if (viewArr == null || viewArr.length != this.f2312c) {
            this.f2317h = new View[this.f2312c];
        }
        for (int i = 0; i < this.f2312c; i++) {
            this.f2317h[i] = constraintLayout.mo2840h(this.f2311b[i]);
        }
        return this.f2317h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2808a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2991t1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2316g = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo2485n(C0564c.C0565a aVar, C6255j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C6246e> sparseArray) {
        C0564c.C0566b bVar = aVar.f2479d;
        int[] iArr = bVar.f2518e0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f2520f0;
            if (str != null && str.length() > 0) {
                C0564c.C0566b bVar2 = aVar.f2479d;
                bVar2.f2518e0 = m3003i(this, bVar2.f2520f0);
            }
        }
        jVar.mo23918a();
        if (aVar.f2479d.f2518e0 != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = aVar.f2479d.f2518e0;
                if (i < iArr2.length) {
                    C6246e eVar = sparseArray.get(iArr2[i]);
                    if (eVar != null) {
                        jVar.mo23920c(eVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public void mo2486o(C6246e eVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2316g;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2315f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo2510p(ConstraintLayout constraintLayout) {
    }

    /* renamed from: q */
    public void mo2819q(ConstraintLayout constraintLayout) {
    }

    /* renamed from: r */
    public void mo2511r(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f2318i.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2820s(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f2316g
            r5.setIds(r0)
        L_0x000b:
            w.i r0 = r5.f2314e
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo23918a()
            r0 = 0
        L_0x0014:
            int r1 = r5.f2312c
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f2311b
            r1 = r1[r0]
            android.view.View r2 = r6.mo2840h(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f2318i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m3004j(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f2311b
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f2318i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo2840h(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            w.i r1 = r5.f2314e
            w.e r2 = r6.mo2841i(r2)
            r1.mo23920c(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            w.i r0 = r5.f2314e
            w.f r6 = r6.f2321d
            r0.mo23919b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.mo2820s(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f2316g = str;
        if (str != null) {
            int i = 0;
            this.f2312c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m3001e(str.substring(i));
                    return;
                } else {
                    m3001e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2316g = null;
        this.f2312c = 0;
        for (int f : iArr) {
            m3002f(f);
        }
    }

    /* renamed from: t */
    public void mo2823t(C6249f fVar, C6254i iVar, SparseArray<C6246e> sparseArray) {
        iVar.mo23918a();
        for (int i = 0; i < this.f2312c; i++) {
            iVar.mo23920c(sparseArray.get(this.f2311b[i]));
        }
    }

    /* renamed from: u */
    public void mo2824u() {
        if (this.f2314e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2395n0 = (C6246e) this.f2314e;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2313d = context;
        mo2484m(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2313d = context;
        mo2484m(attributeSet);
    }
}
