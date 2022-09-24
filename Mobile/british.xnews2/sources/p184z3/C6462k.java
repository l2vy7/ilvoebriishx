package p184z3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p005a4.C0078c;
import p005a4.C0095i;
import p014b4.C1567b;
import p020c4.C2657a;
import p153t3.C6150m;
import p158u3.C6196e;
import p158u3.C6197f;
import p158u3.C6199g;
import p158u3.C6207m;
import p169w3.C6315a;

/* renamed from: z3.k */
/* compiled from: Uploader */
public class C6462k {

    /* renamed from: a */
    private final Context f26527a;

    /* renamed from: b */
    private final C6196e f26528b;

    /* renamed from: c */
    private final C0078c f26529c;

    /* renamed from: d */
    private final C6468q f26530d;

    /* renamed from: e */
    private final Executor f26531e;

    /* renamed from: f */
    private final C1567b f26532f;

    /* renamed from: g */
    private final C2657a f26533g;

    public C6462k(Context context, C6196e eVar, C0078c cVar, C6468q qVar, Executor executor, C1567b bVar, C2657a aVar) {
        this.f26527a = context;
        this.f26528b = eVar;
        this.f26529c = cVar;
        this.f26530d = qVar;
        this.f26531e = executor;
        this.f26532f = bVar;
        this.f26533g = aVar;
    }

    /* renamed from: c */
    static /* synthetic */ Object m28180c(C6462k kVar, C6199g gVar, Iterable iterable, C6150m mVar, int i) {
        if (gVar.mo23620c() == C6199g.C6200a.TRANSIENT_ERROR) {
            kVar.f26529c.mo229w0(iterable);
            kVar.f26530d.mo24267a(mVar, i + 1);
            return null;
        }
        kVar.f26529c.mo221E(iterable);
        if (gVar.mo23620c() == C6199g.C6200a.OK) {
            kVar.f26529c.mo230y0(mVar, kVar.f26533g.mo9336a() + gVar.mo23619b());
        }
        if (!kVar.f26529c.mo228s0(mVar)) {
            return null;
        }
        kVar.f26530d.mo24267a(mVar, 1);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f26530d.mo24267a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m28182e(p184z3.C6462k r2, p153t3.C6150m r3, int r4, java.lang.Runnable r5) {
        /*
            b4.b r0 = r2.f26532f     // Catch:{ a -> 0x0024 }
            a4.c r1 = r2.f26529c     // Catch:{ a -> 0x0024 }
            r1.getClass()     // Catch:{ a -> 0x0024 }
            b4.b$a r1 = p184z3.C6460i.m28175b(r1)     // Catch:{ a -> 0x0024 }
            r0.mo225c(r1)     // Catch:{ a -> 0x0024 }
            boolean r0 = r2.mo24291a()     // Catch:{ a -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            b4.b r0 = r2.f26532f     // Catch:{ a -> 0x0024 }
            b4.b$a r1 = p184z3.C6461j.m28177b(r2, r3, r4)     // Catch:{ a -> 0x0024 }
            r0.mo225c(r1)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.mo24292f(r3, r4)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            z3.q r2 = r2.f26530d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.mo24267a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p184z3.C6462k.m28182e(z3.k, t3.m, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo24291a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f26527a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24292f(C6150m mVar, int i) {
        C6199g gVar;
        C6207m mVar2 = this.f26528b.get(mVar.mo23503b());
        Iterable<C0095i> iterable = (Iterable) this.f26532f.mo225c(C6458g.m28171b(this, mVar));
        if (iterable.iterator().hasNext()) {
            if (mVar2 == null) {
                C6315a.m27820a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                gVar = C6199g.m27154a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C0095i b : iterable) {
                    arrayList.add(b.mo213b());
                }
                gVar = mVar2.mo16998a(C6197f.m27148a().mo23617b(arrayList).mo23618c(mVar.mo23504c()).mo23616a());
            }
            this.f26532f.mo225c(C6459h.m28173b(this, gVar, iterable, mVar, i));
        }
    }

    /* renamed from: g */
    public void mo24293g(C6150m mVar, int i, Runnable runnable) {
        this.f26531e.execute(C6457f.m28170a(this, mVar, i, runnable));
    }
}
