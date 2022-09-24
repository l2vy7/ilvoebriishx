package p158u3;

import android.content.Context;
import p164v3.C6237b;
import p271b8.C11180a;

/* renamed from: u3.l */
/* compiled from: MetadataBackendRegistry_Factory */
public final class C6206l implements C6237b<C6204k> {

    /* renamed from: a */
    private final C11180a<Context> f25566a;

    /* renamed from: b */
    private final C11180a<C6202i> f25567b;

    public C6206l(C11180a<Context> aVar, C11180a<C6202i> aVar2) {
        this.f25566a = aVar;
        this.f25567b = aVar2;
    }

    /* renamed from: a */
    public static C6206l m27172a(C11180a<Context> aVar, C11180a<C6202i> aVar2) {
        return new C6206l(aVar, aVar2);
    }

    /* renamed from: c */
    public static C6204k m27173c(Context context, Object obj) {
        return new C6204k(context, (C6202i) obj);
    }

    /* renamed from: b */
    public C6204k get() {
        return m27173c(this.f25566a.get(), this.f25567b.get());
    }
}
