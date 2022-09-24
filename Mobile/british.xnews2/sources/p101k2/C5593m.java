package p101k2;

import java.util.Queue;
import p004a3.C0062g;
import p004a3.C0066k;

/* renamed from: k2.m */
/* compiled from: ModelCache */
public class C5593m<A, B> {

    /* renamed from: a */
    private final C0062g<C5595b<A>, B> f24121a;

    /* renamed from: k2.m$a */
    /* compiled from: ModelCache */
    class C5594a extends C0062g<C5595b<A>, B> {
        C5594a(long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo184j(C5595b<A> bVar, B b) {
            bVar.mo22161c();
        }
    }

    /* renamed from: k2.m$b */
    /* compiled from: ModelCache */
    static final class C5595b<A> {

        /* renamed from: d */
        private static final Queue<C5595b<?>> f24123d = C0066k.m253e(0);

        /* renamed from: a */
        private int f24124a;

        /* renamed from: b */
        private int f24125b;

        /* renamed from: c */
        private A f24126c;

        private C5595b() {
        }

        /* renamed from: a */
        static <A> C5595b<A> m24849a(A a, int i, int i2) {
            C5595b<A> poll;
            Queue<C5595b<?>> queue = f24123d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C5595b<>();
            }
            poll.m24850b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m24850b(A a, int i, int i2) {
            this.f24126c = a;
            this.f24125b = i;
            this.f24124a = i2;
        }

        /* renamed from: c */
        public void mo22161c() {
            Queue<C5595b<?>> queue = f24123d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5595b)) {
                return false;
            }
            C5595b bVar = (C5595b) obj;
            if (this.f24125b == bVar.f24125b && this.f24124a == bVar.f24124a && this.f24126c.equals(bVar.f24126c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f24124a * 31) + this.f24125b) * 31) + this.f24126c.hashCode();
        }
    }

    public C5593m(long j) {
        this.f24121a = new C5594a(j);
    }

    /* renamed from: a */
    public B mo22158a(A a, int i, int i2) {
        C5595b a2 = C5595b.m24849a(a, i, i2);
        B g = this.f24121a.mo181g(a2);
        a2.mo22161c();
        return g;
    }

    /* renamed from: b */
    public void mo22159b(A a, int i, int i2, B b) {
        this.f24121a.mo185k(C5595b.m24849a(a, i, i2), b);
    }
}
