package p217i5;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7315u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: i5.o */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
final class C10600o extends C10590e {

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f49144b;

    C10600o(C10601p pVar, TaskCompletionSource taskCompletionSource) {
        this.f49144b = taskCompletionSource;
    }

    /* renamed from: L3 */
    public final void mo42707L3(Status status, zzc zzc) {
        C7315u.m29816b(status, zzc != null ? new AppSetIdInfo(zzc.zzb(), zzc.zza()) : null, this.f49144b);
    }
}
