package com.google.android.gms.tasks;

import p248r5.C10965a;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final /* synthetic */ class zzx implements OnCompleteListener {
    public final /* synthetic */ C10965a zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzx(C10965a aVar, TaskCompletionSource taskCompletionSource, zzb zzb2) {
        this.zza = aVar;
        this.zzb = taskCompletionSource;
        this.zzc = zzb2;
    }

    public final void onComplete(Task task) {
        C10965a aVar = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzb zzb2 = this.zzc;
        aVar.removeCallbacksAndMessages((Object) null);
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.isCanceled()) {
            zzb2.zza();
        } else {
            Exception exception = task.getException();
            exception.getClass();
            taskCompletionSource.trySetException(exception);
        }
    }
}
