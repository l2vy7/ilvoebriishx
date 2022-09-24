package p005a4;

import android.content.Context;
import p164v3.C6237b;
import p271b8.C11180a;

/* renamed from: a4.i0 */
/* compiled from: SchemaManager_Factory */
public final class C0096i0 implements C6237b<C0093h0> {

    /* renamed from: a */
    private final C11180a<Context> f236a;

    /* renamed from: b */
    private final C11180a<String> f237b;

    /* renamed from: c */
    private final C11180a<Integer> f238c;

    public C0096i0(C11180a<Context> aVar, C11180a<String> aVar2, C11180a<Integer> aVar3) {
        this.f236a = aVar;
        this.f237b = aVar2;
        this.f238c = aVar3;
    }

    /* renamed from: a */
    public static C0096i0 m387a(C11180a<Context> aVar, C11180a<String> aVar2, C11180a<Integer> aVar3) {
        return new C0096i0(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C0093h0 m388c(Context context, String str, int i) {
        return new C0093h0(context, str, i);
    }

    /* renamed from: b */
    public C0093h0 get() {
        return m388c(this.f236a.get(), this.f237b.get(), this.f238c.get().intValue());
    }
}
