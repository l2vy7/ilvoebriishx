package p091i2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p004a3.C0065j;

/* renamed from: i2.c */
/* compiled from: DiskCacheWriteLocker */
final class C5449c {

    /* renamed from: a */
    private final Map<String, C5450a> f23801a = new HashMap();

    /* renamed from: b */
    private final C5451b f23802b = new C5451b();

    /* renamed from: i2.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C5450a {

        /* renamed from: a */
        final Lock f23803a = new ReentrantLock();

        /* renamed from: b */
        int f23804b;

        C5450a() {
        }
    }

    /* renamed from: i2.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C5451b {

        /* renamed from: a */
        private final Queue<C5450a> f23805a = new ArrayDeque();

        C5451b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5450a mo21914a() {
            C5450a poll;
            synchronized (this.f23805a) {
                poll = this.f23805a.poll();
            }
            return poll == null ? new C5450a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo21915b(C5450a aVar) {
            synchronized (this.f23805a) {
                if (this.f23805a.size() < 10) {
                    this.f23805a.offer(aVar);
                }
            }
        }
    }

    C5449c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21912a(String str) {
        C5450a aVar;
        synchronized (this) {
            aVar = this.f23801a.get(str);
            if (aVar == null) {
                aVar = this.f23802b.mo21914a();
                this.f23801a.put(str, aVar);
            }
            aVar.f23804b++;
        }
        aVar.f23803a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21913b(String str) {
        C5450a aVar;
        synchronized (this) {
            aVar = (C5450a) C0065j.m247d(this.f23801a.get(str));
            int i = aVar.f23804b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f23804b = i2;
                if (i2 == 0) {
                    C5450a remove = this.f23801a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f23802b.mo21915b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f23804b);
            }
        }
        aVar.f23803a.unlock();
    }
}
