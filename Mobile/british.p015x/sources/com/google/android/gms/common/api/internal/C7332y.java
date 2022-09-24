package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7332y implements OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f29194a;

    /* renamed from: b */
    final /* synthetic */ C7336z f29195b;

    C7332y(C7336z zVar, TaskCompletionSource taskCompletionSource) {
        this.f29195b = zVar;
        this.f29194a = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f29195b.f29203b.remove(this.f29194a);
    }
}
