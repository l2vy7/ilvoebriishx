package p275c9;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p322p8.C12850b;
import p322p8.C12852d;
import p322p8.C12853e;
import p322p8.C12862n;
import p326r8.C12871b;
import p326r8.C12877f;
import p328s8.C12887e;

/* renamed from: c9.l */
/* compiled from: SingleClientConnManager */
public class C11215l implements C12850b {

    /* renamed from: a */
    private final Log f50338a = LogFactory.getLog(getClass());

    /* renamed from: b */
    protected final C12887e f50339b;

    /* renamed from: c */
    protected final C12852d f50340c;

    /* renamed from: d */
    protected final boolean f50341d;

    /* renamed from: e */
    protected C11218c f50342e;

    /* renamed from: f */
    protected C11217b f50343f;

    /* renamed from: g */
    protected long f50344g;

    /* renamed from: h */
    protected long f50345h;

    /* renamed from: i */
    protected volatile boolean f50346i;

    /* renamed from: c9.l$a */
    /* compiled from: SingleClientConnManager */
    class C11216a implements C12853e {

        /* renamed from: a */
        final /* synthetic */ C12871b f50347a;

        /* renamed from: b */
        final /* synthetic */ Object f50348b;

        C11216a(C12871b bVar, Object obj) {
            this.f50347a = bVar;
            this.f50348b = obj;
        }

        /* renamed from: a */
        public C12862n mo43677a(long j, TimeUnit timeUnit) {
            return C11215l.this.mo43675h(this.f50347a, this.f50348b);
        }
    }

    /* renamed from: c9.l$b */
    /* compiled from: SingleClientConnManager */
    protected class C11217b extends C11206c {
        protected C11217b(C11218c cVar, C12871b bVar) {
            super(C11215l.this, cVar);
            mo43619u();
            cVar.f50312c = bVar;
        }
    }

    /* renamed from: c9.l$c */
    /* compiled from: SingleClientConnManager */
    protected class C11218c extends C11205b {
        protected C11218c() {
            super(C11215l.this.f50340c, (C12871b) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo43678g() throws IOException {
            mo43627d();
            if (this.f50311b.mo43616q()) {
                this.f50311b.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo43679h() throws IOException {
            mo43627d();
            if (this.f50311b.mo43616q()) {
                this.f50311b.shutdown();
            }
        }
    }

    public C11215l(C12887e eVar) {
        if (eVar != null) {
            this.f50339b = eVar;
            this.f50340c = mo43674g(eVar);
            this.f50342e = new C11218c();
            this.f50343f = null;
            this.f50344g = -1;
            this.f50341d = false;
            this.f50346i = false;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    /* renamed from: a */
    public C12887e mo43667a() {
        return this.f50339b;
    }

    /* renamed from: b */
    public final C12853e mo43668b(C12871b bVar, Object obj) {
        return new C11216a(bVar, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0097=Splitter:B:42:0x0097, B:30:0x0069=Splitter:B:30:0x0069} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo43669c(p322p8.C12862n r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo43670d()     // Catch:{ all -> 0x00d3 }
            boolean r0 = r9 instanceof p275c9.C11215l.C11217b     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cb
            org.apache.commons.logging.Log r0 = r8.f50338a     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0026
            org.apache.commons.logging.Log r0 = r8.f50338a     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Releasing connection "
            r1.append(r2)     // Catch:{ all -> 0x00d3 }
            r1.append(r9)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d3 }
            r0.debug(r1)     // Catch:{ all -> 0x00d3 }
        L_0x0026:
            c9.l$b r9 = (p275c9.C11215l.C11217b) r9     // Catch:{ all -> 0x00d3 }
            c9.b r0 = r9.f50315g     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r8)
            return
        L_0x002e:
            p8.b r0 = r9.mo43600E()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x003f
            if (r0 != r8) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "Connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r9     // Catch:{ all -> 0x00d3 }
        L_0x003f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r4 = 0
            boolean r5 = r9.mo43616q()     // Catch:{ IOException -> 0x0087 }
            if (r5 == 0) goto L_0x0069
            boolean r5 = r8.f50341d     // Catch:{ IOException -> 0x0087 }
            if (r5 != 0) goto L_0x0057
            boolean r5 = r9.mo43602G()     // Catch:{ IOException -> 0x0087 }
            if (r5 != 0) goto L_0x0069
        L_0x0057:
            org.apache.commons.logging.Log r5 = r8.f50338a     // Catch:{ IOException -> 0x0087 }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ IOException -> 0x0087 }
            if (r5 == 0) goto L_0x0066
            org.apache.commons.logging.Log r5 = r8.f50338a     // Catch:{ IOException -> 0x0087 }
            java.lang.String r6 = "Released connection open but not reusable."
            r5.debug(r6)     // Catch:{ IOException -> 0x0087 }
        L_0x0066:
            r9.shutdown()     // Catch:{ IOException -> 0x0087 }
        L_0x0069:
            r9.mo43599D()     // Catch:{ all -> 0x00d3 }
            r8.f50343f = r4     // Catch:{ all -> 0x00d3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.f50344g = r4     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.f50344g     // Catch:{ all -> 0x00d3 }
        L_0x007e:
            long r9 = r9 + r11
            r8.f50345h = r9     // Catch:{ all -> 0x00d3 }
            goto L_0x00ad
        L_0x0082:
            r8.f50345h = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00ad
        L_0x0085:
            r5 = move-exception
            goto L_0x00af
        L_0x0087:
            r5 = move-exception
            org.apache.commons.logging.Log r6 = r8.f50338a     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0097
            org.apache.commons.logging.Log r6 = r8.f50338a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "Exception shutting down released connection."
            r6.debug(r7, r5)     // Catch:{ all -> 0x0085 }
        L_0x0097:
            r9.mo43599D()     // Catch:{ all -> 0x00d3 }
            r8.f50343f = r4     // Catch:{ all -> 0x00d3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.f50344g = r4     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.f50344g     // Catch:{ all -> 0x00d3 }
            goto L_0x007e
        L_0x00ad:
            monitor-exit(r8)
            return
        L_0x00af:
            r9.mo43599D()     // Catch:{ all -> 0x00d3 }
            r8.f50343f = r4     // Catch:{ all -> 0x00d3 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.f50344g = r6     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.f50344g     // Catch:{ all -> 0x00d3 }
            long r9 = r9 + r11
            r8.f50345h = r9     // Catch:{ all -> 0x00d3 }
            goto L_0x00ca
        L_0x00c8:
            r8.f50345h = r0     // Catch:{ all -> 0x00d3 }
        L_0x00ca:
            throw r5     // Catch:{ all -> 0x00d3 }
        L_0x00cb:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "Connection class mismatch, connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r9     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x00d7
        L_0x00d6:
            throw r9
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: p275c9.C11215l.mo43669c(p8.n, long, java.util.concurrent.TimeUnit):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo43670d() throws IllegalStateException {
        if (this.f50346i) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    /* renamed from: e */
    public synchronized void mo43671e() {
        if (System.currentTimeMillis() >= this.f50345h) {
            mo43672f(0, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: f */
    public synchronized void mo43672f(long j, TimeUnit timeUnit) {
        mo43670d();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        } else if (this.f50343f == null && this.f50342e.f50311b.mo43616q()) {
            if (this.f50344g <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.f50342e.mo43678g();
                } catch (IOException e) {
                    this.f50338a.debug("Problem closing idle connection.", e);
                }
            }
        }
        return;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C12852d mo43674g(C12887e eVar) {
        return new C11209f(eVar);
    }

    /* renamed from: h */
    public synchronized C12862n mo43675h(C12871b bVar, Object obj) {
        boolean z;
        C11217b bVar2;
        if (bVar != null) {
            try {
                mo43670d();
                if (this.f50338a.isDebugEnabled()) {
                    Log log = this.f50338a;
                    log.debug("Get connection for route " + bVar);
                }
                if (this.f50343f == null) {
                    mo43671e();
                    boolean z2 = true;
                    boolean z3 = false;
                    if (this.f50342e.f50311b.mo43616q()) {
                        C12877f fVar = this.f50342e.f50314e;
                        z3 = fVar == null || !fVar.mo48036o().equals(bVar);
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z3) {
                        this.f50342e.mo43679h();
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        this.f50342e = new C11218c();
                    }
                    bVar2 = new C11217b(this.f50342e, bVar);
                    this.f50343f = bVar2;
                } else {
                    throw new IllegalStateException("Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
                }
            } catch (IOException e) {
                this.f50338a.debug("Problem shutting down connection.", e);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Route may not be null.");
        }
        return bVar2;
    }

    public synchronized void shutdown() {
        this.f50346i = true;
        C11217b bVar = this.f50343f;
        if (bVar != null) {
            bVar.mo43599D();
        }
        try {
            C11218c cVar = this.f50342e;
            if (cVar != null) {
                cVar.mo43679h();
            }
        } catch (IOException e) {
            try {
                this.f50338a.debug("Problem while shutting down manager.", e);
            } catch (Throwable th) {
                this.f50342e = null;
                throw th;
            }
        }
        this.f50342e = null;
    }
}
