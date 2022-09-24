package p153t3;

import java.util.Set;
import p142r3.C5996b;
import p142r3.C5999e;
import p142r3.C6000f;
import p142r3.C6001g;

/* renamed from: t3.n */
/* compiled from: TransportFactoryImpl */
final class C6152n implements C6001g {

    /* renamed from: a */
    private final Set<C5996b> f25427a;

    /* renamed from: b */
    private final C6150m f25428b;

    /* renamed from: c */
    private final C6155q f25429c;

    C6152n(Set<C5996b> set, C6150m mVar, C6155q qVar) {
        this.f25427a = set;
        this.f25428b = mVar;
        this.f25429c = qVar;
    }

    /* renamed from: a */
    public <T> C6000f<T> mo23101a(String str, Class<T> cls, C5999e<T, byte[]> eVar) {
        return mo23536b(str, cls, C5996b.m26427b("proto"), eVar);
    }

    /* renamed from: b */
    public <T> C6000f<T> mo23536b(String str, Class<T> cls, C5996b bVar, C5999e<T, byte[]> eVar) {
        if (this.f25427a.contains(bVar)) {
            return new C6154p(this.f25428b, str, bVar, eVar, this.f25429c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f25427a}));
    }
}
