package p156u1;

import android.content.Context;
import androidx.work.C1483m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p145s1.C6013a;
import p177y1.C6400a;

/* renamed from: u1.d */
/* compiled from: ConstraintTracker */
public abstract class C6179d<T> {

    /* renamed from: f */
    private static final String f25520f = C1483m.m7773f("ConstraintTracker");

    /* renamed from: a */
    protected final C6400a f25521a;

    /* renamed from: b */
    protected final Context f25522b;

    /* renamed from: c */
    private final Object f25523c = new Object();

    /* renamed from: d */
    private final Set<C6013a<T>> f25524d = new LinkedHashSet();

    /* renamed from: e */
    T f25525e;

    /* renamed from: u1.d$a */
    /* compiled from: ConstraintTracker */
    class C6180a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ List f25526b;

        C6180a(List list) {
            this.f25526b = list;
        }

        public void run() {
            for (C6013a a : this.f25526b) {
                a.mo23135a(C6179d.this.f25525e);
            }
        }
    }

    C6179d(Context context, C6400a aVar) {
        this.f25522b = context.getApplicationContext();
        this.f25521a = aVar;
    }

    /* renamed from: a */
    public void mo23590a(C6013a<T> aVar) {
        synchronized (this.f25523c) {
            if (this.f25524d.add(aVar)) {
                if (this.f25524d.size() == 1) {
                    this.f25525e = mo23582b();
                    C1483m.m7771c().mo7013a(f25520f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f25525e}), new Throwable[0]);
                    mo23587e();
                }
                aVar.mo23135a(this.f25525e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo23582b();

    /* renamed from: c */
    public void mo23591c(C6013a<T> aVar) {
        synchronized (this.f25523c) {
            if (this.f25524d.remove(aVar) && this.f25524d.isEmpty()) {
                mo23588f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23592d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f25523c
            monitor-enter(r0)
            T r1 = r3.f25525e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f25525e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<s1.a<T>> r1 = r3.f25524d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            y1.a r1 = r3.f25521a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.mo24232a()     // Catch:{ all -> 0x002b }
            u1.d$a r2 = new u1.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p156u1.C6179d.mo23592d(java.lang.Object):void");
    }

    /* renamed from: e */
    public abstract void mo23587e();

    /* renamed from: f */
    public abstract void mo23588f();
}
