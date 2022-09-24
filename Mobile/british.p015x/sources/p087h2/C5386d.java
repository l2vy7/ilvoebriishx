package p087h2;

import java.util.Queue;
import p004a3.C0066k;
import p087h2.C5400m;

/* renamed from: h2.d */
/* compiled from: BaseKeyPool */
abstract class C5386d<T extends C5400m> {

    /* renamed from: a */
    private final Queue<T> f23674a = C0066k.m253e(20);

    C5386d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo21820a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo21823b() {
        T t = (C5400m) this.f23674a.poll();
        return t == null ? mo21820a() : t;
    }

    /* renamed from: c */
    public void mo21824c(T t) {
        if (this.f23674a.size() < 20) {
            this.f23674a.offer(t);
        }
    }
}
