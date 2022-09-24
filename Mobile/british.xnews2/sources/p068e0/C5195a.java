package p068e0;

import android.content.Context;
import java.util.WeakHashMap;

/* renamed from: e0.a */
/* compiled from: DisplayManagerCompat */
public final class C5195a {

    /* renamed from: b */
    private static final WeakHashMap<Context, C5195a> f22665b = new WeakHashMap<>();

    /* renamed from: a */
    private final Context f22666a;

    private C5195a(Context context) {
        this.f22666a = context;
    }

    /* renamed from: a */
    public static C5195a m23567a(Context context) {
        C5195a aVar;
        WeakHashMap<Context, C5195a> weakHashMap = f22665b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new C5195a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }
}
