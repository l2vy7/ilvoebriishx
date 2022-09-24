package p066d4;

import android.util.SparseArray;
import java.util.EnumMap;
import p142r3.C5998d;

/* renamed from: d4.a */
/* compiled from: PriorityMapping */
public final class C5190a {

    /* renamed from: a */
    private static SparseArray<C5998d> f22662a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<C5998d, Integer> f22663b;

    static {
        EnumMap<C5998d, Integer> enumMap = new EnumMap<>(C5998d.class);
        f22663b = enumMap;
        enumMap.put(C5998d.DEFAULT, 0);
        f22663b.put(C5998d.VERY_LOW, 1);
        f22663b.put(C5998d.HIGHEST, 2);
        for (C5998d next : f22663b.keySet()) {
            f22662a.append(f22663b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m23550a(C5998d dVar) {
        Integer num = f22663b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    /* renamed from: b */
    public static C5998d m23551b(int i) {
        C5998d dVar = f22662a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
