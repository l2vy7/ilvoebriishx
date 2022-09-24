package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.u */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7315u {
    /* renamed from: a */
    public static void m29815a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        m29816b(status, (Object) null, taskCompletionSource);
    }

    /* renamed from: b */
    public static <TResult> void m29816b(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.mo29735G0()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new C7203b(status));
        }
    }
}
