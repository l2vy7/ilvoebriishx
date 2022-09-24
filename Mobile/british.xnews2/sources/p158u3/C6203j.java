package p158u3;

import android.content.Context;
import p020c4.C2657a;
import p164v3.C6237b;
import p271b8.C11180a;

/* renamed from: u3.j */
/* compiled from: CreationContextFactory_Factory */
public final class C6203j implements C6237b<C6202i> {

    /* renamed from: a */
    private final C11180a<Context> f25558a;

    /* renamed from: b */
    private final C11180a<C2657a> f25559b;

    /* renamed from: c */
    private final C11180a<C2657a> f25560c;

    public C6203j(C11180a<Context> aVar, C11180a<C2657a> aVar2, C11180a<C2657a> aVar3) {
        this.f25558a = aVar;
        this.f25559b = aVar2;
        this.f25560c = aVar3;
    }

    /* renamed from: a */
    public static C6203j m27165a(C11180a<Context> aVar, C11180a<C2657a> aVar2, C11180a<C2657a> aVar3) {
        return new C6203j(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C6202i m27166c(Context context, C2657a aVar, C2657a aVar2) {
        return new C6202i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C6202i get() {
        return m27166c(this.f25558a.get(), this.f25559b.get(), this.f25560c.get());
    }
}
