package p090i0;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: i0.b */
/* compiled from: CancellationSignal */
public final class C5421b {

    /* renamed from: a */
    private boolean f23771a;

    /* renamed from: b */
    private C5422a f23772b;

    /* renamed from: c */
    private Object f23773c;

    /* renamed from: d */
    private boolean f23774d;

    /* renamed from: i0.b$a */
    /* compiled from: CancellationSignal */
    public interface C5422a {
        void onCancel();
    }

    /* renamed from: f */
    private void m24370f() {
        while (this.f23774d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f23774d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f23774d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21871a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f23771a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f23771a = r0     // Catch:{ all -> 0x003e }
            r4.f23774d = r0     // Catch:{ all -> 0x003e }
            i0.b$a r0 = r4.f23772b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f23773c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f23774d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f23774d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p090i0.C5421b.mo21871a():void");
    }

    /* renamed from: b */
    public Object mo21872b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f23773c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f23773c = cancellationSignal;
                if (this.f23771a) {
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    cancellationSignal.cancel();
                }
            }
            obj = this.f23773c;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean mo21873c() {
        boolean z;
        synchronized (this) {
            z = this.f23771a;
        }
        return z;
    }

    /* renamed from: d */
    public void mo21874d(C5422a aVar) {
        synchronized (this) {
            m24370f();
            if (this.f23772b != aVar) {
                this.f23772b = aVar;
                if (this.f23771a) {
                    if (aVar != null) {
                        aVar.onCancel();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo21875e() {
        if (mo21873c()) {
            throw new C5432j();
        }
    }
}
