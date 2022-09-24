package p132p7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: p7.d */
/* compiled from: GlobalLibraryVersionRegistrar */
public class C10915d {

    /* renamed from: b */
    private static volatile C10915d f49793b;

    /* renamed from: a */
    private final Set<C5907f> f49794a = new HashSet();

    C10915d() {
    }

    /* renamed from: a */
    public static C10915d m49129a() {
        C10915d dVar = f49793b;
        if (dVar == null) {
            synchronized (C10915d.class) {
                dVar = f49793b;
                if (dVar == null) {
                    dVar = new C10915d();
                    f49793b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C5907f> mo43185b() {
        Set<C5907f> unmodifiableSet;
        synchronized (this.f49794a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f49794a);
        }
        return unmodifiableSet;
    }
}
