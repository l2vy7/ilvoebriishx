package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l74 extends gs0 {

    /* renamed from: O */
    public static final l74 f34928O;
    @Deprecated

    /* renamed from: P */
    public static final l74 f34929P;

    /* renamed from: Q */
    public static final wx3<l74> f34930Q = j74.f33796a;

    /* renamed from: B */
    public final int f34931B;

    /* renamed from: C */
    public final boolean f34932C;

    /* renamed from: D */
    public final boolean f34933D;

    /* renamed from: E */
    public final boolean f34934E;

    /* renamed from: F */
    public final boolean f34935F;

    /* renamed from: G */
    public final boolean f34936G;

    /* renamed from: H */
    public final boolean f34937H;

    /* renamed from: I */
    public final boolean f34938I;

    /* renamed from: J */
    public final boolean f34939J;

    /* renamed from: K */
    public final boolean f34940K;

    /* renamed from: L */
    public final boolean f34941L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final SparseArray<Map<cm0, p74>> f34942M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final SparseBooleanArray f34943N;

    static {
        l74 l74 = new l74(new n74());
        f34928O = l74;
        f34929P = l74;
    }

    private l74(n74 n74) {
        super(n74);
        this.f34932C = n74.f35933k;
        this.f34933D = false;
        this.f34934E = n74.f35934l;
        this.f34935F = n74.f35935m;
        this.f34936G = false;
        this.f34937H = false;
        this.f34938I = false;
        this.f34931B = 0;
        this.f34939J = n74.f35936n;
        this.f34940K = false;
        this.f34941L = n74.f35937o;
        this.f34942M = n74.f35938p;
        this.f34943N = n74.f35939q;
    }

    /* renamed from: c */
    public static l74 m34375c(Context context) {
        return new l74(new n74(context));
    }

    /* renamed from: d */
    public final n74 mo33286d() {
        return new n74(this, (m74) null);
    }

    /* renamed from: e */
    public final p74 mo33287e(int i, cm0 cm0) {
        Map map = this.f34942M.get(i);
        if (map != null) {
            return (p74) map.get(cm0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l74.class == obj.getClass()) {
            l74 l74 = (l74) obj;
            if (super.equals(l74) && this.f34932C == l74.f34932C && this.f34934E == l74.f34934E && this.f34935F == l74.f34935F && this.f34939J == l74.f34939J && this.f34941L == l74.f34941L) {
                SparseBooleanArray sparseBooleanArray = this.f34943N;
                SparseBooleanArray sparseBooleanArray2 = l74.f34943N;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray<Map<cm0, p74>> sparseArray = this.f34942M;
                            SparseArray<Map<cm0, p74>> sparseArray2 = l74.f34942M;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map valueAt = sparseArray.valueAt(i2);
                                        Map valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry entry : valueAt.entrySet()) {
                                                cm0 cm0 = (cm0) entry.getKey();
                                                if (valueAt2.containsKey(cm0)) {
                                                    if (!d13.m20317p(entry.getValue(), valueAt2.get(cm0))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33288f(int i) {
        return this.f34943N.get(i);
    }

    /* renamed from: g */
    public final boolean mo33289g(int i, cm0 cm0) {
        Map map = this.f34942M.get(i);
        return map != null && map.containsKey(cm0);
    }

    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.f34932C ? 1 : 0)) * 961) + (this.f34934E ? 1 : 0)) * 31) + (this.f34935F ? 1 : 0)) * 28629151) + (this.f34939J ? 1 : 0)) * 961) + (this.f34941L ? 1 : 0);
    }
}
