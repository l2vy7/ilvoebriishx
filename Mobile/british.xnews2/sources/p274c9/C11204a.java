package p274c9;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p307g8.C12726j;
import p307g8.C12727k;
import p307g8.C12731o;
import p307g8.C12733q;
import p314j9.C12811e;
import p321p8.C12850b;
import p321p8.C12862n;
import p321p8.C12863o;

/* renamed from: c9.a */
/* compiled from: AbstractClientConnAdapter */
public abstract class C11204a implements C12862n, C12811e {

    /* renamed from: b */
    private volatile C12850b f50305b;

    /* renamed from: c */
    private volatile C12863o f50306c;

    /* renamed from: d */
    private volatile boolean f50307d = false;

    /* renamed from: e */
    private volatile boolean f50308e = false;

    /* renamed from: f */
    private volatile long f50309f = Long.MAX_VALUE;

    protected C11204a(C12850b bVar, C12863o oVar) {
        this.f50305b = bVar;
        this.f50306c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo43598A(C12863o oVar) throws C11207d {
        if (mo43603H() || oVar == null) {
            throw new C11207d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo43599D() {
        this.f50306c = null;
        this.f50305b = null;
        this.f50309f = Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C12850b mo43600E() {
        return this.f50305b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C12863o mo43601F() {
        return this.f50306c;
    }

    /* renamed from: G */
    public boolean mo43602G() {
        return this.f50307d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo43603H() {
        return this.f50308e;
    }

    /* renamed from: I */
    public void mo43604I() {
        this.f50307d = false;
    }

    /* renamed from: a */
    public boolean mo43605a() {
        C12863o F = mo43601F();
        mo43598A(F);
        return F.mo43643a();
    }

    /* renamed from: b */
    public synchronized Object mo43606b(String str) {
        C12863o F = mo43601F();
        mo43598A(F);
        if (!(F instanceof C12811e)) {
            return null;
        }
        return ((C12811e) F).mo43606b(str);
    }

    /* renamed from: e */
    public void mo43607e(C12731o oVar) throws C12727k, IOException {
        C12863o F = mo43601F();
        mo43598A(F);
        mo43604I();
        F.mo43607e(oVar);
    }

    public void flush() throws IOException {
        C12863o F = mo43601F();
        mo43598A(F);
        F.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo43609g() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f50308e     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.f50308e = r0     // Catch:{ all -> 0x0019 }
            p8.b r0 = r4.f50305b     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            p8.b r0 = r4.f50305b     // Catch:{ all -> 0x0019 }
            long r1 = r4.f50309f     // Catch:{ all -> 0x0019 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0019 }
            r0.mo43669c(r4, r1, r3)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p274c9.C11204a.mo43609g():void");
    }

    /* renamed from: h */
    public void mo43610h(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f50309f = timeUnit.toMillis(j);
        } else {
            this.f50309f = -1;
        }
    }

    /* renamed from: i */
    public void mo43611i(C12726j jVar) throws C12727k, IOException {
        C12863o F = mo43601F();
        mo43598A(F);
        mo43604I();
        F.mo43611i(jVar);
    }

    /* renamed from: k */
    public boolean mo43612k(int i) throws IOException {
        C12863o F = mo43601F();
        mo43598A(F);
        return F.mo43612k(i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|11|12|(1:14)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0014  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo43613n() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f50308e     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.f50308e = r0     // Catch:{ all -> 0x001f }
            r4.mo43604I()     // Catch:{ all -> 0x001f }
            r4.shutdown()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            p8.b r0 = r4.f50305b     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            p8.b r0 = r4.f50305b     // Catch:{ all -> 0x001f }
            long r1 = r4.f50309f     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001f }
            r0.mo43669c(r4, r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p274c9.C11204a.mo43613n():void");
    }

    /* renamed from: o */
    public int mo43614o() {
        C12863o F = mo43601F();
        mo43598A(F);
        return F.mo43614o();
    }

    /* renamed from: p */
    public synchronized void mo43615p(String str, Object obj) {
        C12863o F = mo43601F();
        mo43598A(F);
        if (F instanceof C12811e) {
            ((C12811e) F).mo43615p(str, obj);
        }
    }

    /* renamed from: q */
    public boolean mo43616q() {
        C12863o F = mo43601F();
        if (F == null) {
            return false;
        }
        return F.mo43616q();
    }

    /* renamed from: r */
    public void mo43617r(int i) {
        C12863o F = mo43601F();
        mo43598A(F);
        F.mo43617r(i);
    }

    /* renamed from: t */
    public C12733q mo43618t() throws C12727k, IOException {
        C12863o F = mo43601F();
        mo43598A(F);
        mo43604I();
        return F.mo43618t();
    }

    /* renamed from: u */
    public void mo43619u() {
        this.f50307d = true;
    }

    /* renamed from: v */
    public void mo43620v(C12733q qVar) throws C12727k, IOException {
        C12863o F = mo43601F();
        mo43598A(F);
        mo43604I();
        F.mo43620v(qVar);
    }

    /* renamed from: w */
    public InetAddress mo43621w() {
        C12863o F = mo43601F();
        mo43598A(F);
        return F.mo43621w();
    }

    /* renamed from: y */
    public SSLSession mo43622y() {
        C12863o F = mo43601F();
        mo43598A(F);
        if (!mo43616q()) {
            return null;
        }
        Socket l = F.mo43645l();
        if (l instanceof SSLSocket) {
            return ((SSLSocket) l).getSession();
        }
        return null;
    }

    /* renamed from: z */
    public boolean mo43623z() {
        C12863o F;
        if (!mo43603H() && (F = mo43601F()) != null) {
            return F.mo43623z();
        }
        return true;
    }
}
