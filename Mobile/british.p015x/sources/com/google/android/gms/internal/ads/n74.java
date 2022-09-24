package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n74 extends dp0 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f35933k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f35934l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f35935m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f35936n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f35937o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final SparseArray<Map<cm0, p74>> f35938p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final SparseBooleanArray f35939q;

    @Deprecated
    public n74() {
        this.f35938p = new SparseArray<>();
        this.f35939q = new SparseBooleanArray();
        m35100u();
    }

    /* renamed from: u */
    private final void m35100u() {
        this.f35933k = true;
        this.f35934l = true;
        this.f35935m = true;
        this.f35936n = true;
        this.f35937o = true;
    }

    /* renamed from: e */
    public final /* synthetic */ dp0 mo31350e(int i, int i2, boolean z) {
        super.mo31350e(i, i2, true);
        return this;
    }

    /* renamed from: o */
    public final n74 mo33666o(int i, boolean z) {
        if (this.f35939q.get(i) == z) {
            return this;
        }
        if (z) {
            this.f35939q.put(i, true);
        } else {
            this.f35939q.delete(i);
        }
        return this;
    }

    public n74(Context context) {
        super.mo31349d(context);
        Point d0 = d13.m20303d0(context);
        mo31350e(d0.x, d0.y, true);
        this.f35938p = new SparseArray<>();
        this.f35939q = new SparseBooleanArray();
        m35100u();
    }

    /* synthetic */ n74(l74 l74, m74 m74) {
        super(l74);
        this.f35933k = l74.f34932C;
        this.f35934l = l74.f34934E;
        this.f35935m = l74.f34935F;
        this.f35936n = l74.f34939J;
        this.f35937o = l74.f34941L;
        SparseArray a = l74.f34942M;
        SparseArray<Map<cm0, p74>> sparseArray = new SparseArray<>();
        for (int i = 0; i < a.size(); i++) {
            sparseArray.put(a.keyAt(i), new HashMap((Map) a.valueAt(i)));
        }
        this.f35938p = sparseArray;
        this.f35939q = l74.f34943N.clone();
    }
}
