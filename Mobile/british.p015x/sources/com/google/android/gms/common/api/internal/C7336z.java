package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7336z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f29202a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<TaskCompletionSource<?>, Boolean> f29203b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m29898h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f29202a) {
            hashMap = new HashMap(this.f29202a);
        }
        synchronized (this.f29203b) {
            hashMap2 = new HashMap(this.f29203b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo29788f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new C7203b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29953c(BasePendingResult<? extends C7341k> basePendingResult, boolean z) {
        this.f29202a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo29784b(new C7328x(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void mo29954d(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f29203b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new C7332y(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo29955e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m29898h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo29956f() {
        m29898h(false, C4595g.f19990s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo29957g() {
        return !this.f29202a.isEmpty() || !this.f29203b.isEmpty();
    }
}
