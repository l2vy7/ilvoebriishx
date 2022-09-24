package p129p1;

import androidx.lifecycle.C0781l;
import androidx.work.C1488p;
import androidx.work.impl.utils.futures.C1476d;

/* renamed from: p1.c */
/* compiled from: OperationImpl */
public class C5885c implements C1488p {

    /* renamed from: c */
    private final C0781l<C1488p.C1490b> f24655c = new C0781l<>();

    /* renamed from: d */
    private final C1476d<C1488p.C1490b.C1493c> f24656d = C1476d.m7752t();

    public C5885c() {
        mo22830a(C1488p.f6502b);
    }

    /* renamed from: a */
    public void mo22830a(C1488p.C1490b bVar) {
        this.f24655c.mo3960l(bVar);
        if (bVar instanceof C1488p.C1490b.C1493c) {
            this.f24656d.mo6989p((C1488p.C1490b.C1493c) bVar);
        } else if (bVar instanceof C1488p.C1490b.C1491a) {
            this.f24656d.mo6990q(((C1488p.C1490b.C1491a) bVar).mo7022a());
        }
    }
}
