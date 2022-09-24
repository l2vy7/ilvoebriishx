package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p149t.C6077a;

/* renamed from: com.google.firebase.iid.d */
final class C10424d {

    /* renamed from: a */
    private final Executor f48858a;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<Pair<String, String>, Task<String>> f48859b = new C6077a();

    C10424d(Executor executor) {
        this.f48858a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Task mo41877a(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.f48859b.remove(pair);
        }
        return task;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        return r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.tasks.Task<java.lang.String> mo41878b(java.lang.String r4, java.lang.String r5, com.google.firebase.iid.C10428f r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0079 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0079 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.Task<java.lang.String>> r4 = r3.f48859b     // Catch:{ all -> 0x0079 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0079 }
            com.google.android.gms.tasks.Task r4 = (com.google.android.gms.tasks.Task) r4     // Catch:{ all -> 0x0079 }
            r5 = 3
            if (r4 == 0) goto L_0x003b
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x0039
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0079 }
            int r0 = r6.length()     // Catch:{ all -> 0x0079 }
            int r0 = r0 + 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x0079 }
            r1.append(r6)     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0079 }
        L_0x0039:
            monitor-exit(r3)
            return r4
        L_0x003b:
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0079 }
            int r1 = r5.length()     // Catch:{ all -> 0x0079 }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r2.<init>(r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x0079 }
            r2.append(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0079 }
        L_0x0063:
            com.google.android.gms.tasks.Task r4 = r6.zzs()     // Catch:{ all -> 0x0079 }
            java.util.concurrent.Executor r5 = r3.f48858a     // Catch:{ all -> 0x0079 }
            com.google.firebase.iid.e r6 = new com.google.firebase.iid.e     // Catch:{ all -> 0x0079 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0079 }
            com.google.android.gms.tasks.Task r4 = r4.continueWithTask(r5, r6)     // Catch:{ all -> 0x0079 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.Task<java.lang.String>> r5 = r3.f48859b     // Catch:{ all -> 0x0079 }
            r5.put(r0, r4)     // Catch:{ all -> 0x0079 }
            monitor-exit(r3)
            return r4
        L_0x0079:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10424d.mo41878b(java.lang.String, java.lang.String, com.google.firebase.iid.f):com.google.android.gms.tasks.Task");
    }
}
