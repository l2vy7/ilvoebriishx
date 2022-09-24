package p148s3;

import android.util.SparseArray;

/* renamed from: s3.p */
/* compiled from: QosTier */
public enum C6064p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private static final SparseArray<C6064p> f25247i = null;

    /* renamed from: b */
    private final int f25249b;

    static {
        C6064p pVar;
        C6064p pVar2;
        C6064p pVar3;
        C6064p pVar4;
        C6064p pVar5;
        C6064p pVar6;
        SparseArray<C6064p> sparseArray = new SparseArray<>();
        f25247i = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private C6064p(int i) {
        this.f25249b = i;
    }
}
