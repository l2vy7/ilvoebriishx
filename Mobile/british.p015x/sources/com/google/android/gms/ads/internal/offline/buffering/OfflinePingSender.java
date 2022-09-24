package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.mg0;
import com.google.android.gms.internal.ads.qc0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class OfflinePingSender extends Worker {

    /* renamed from: a */
    private final mg0 f27789a;

    public OfflinePingSender(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f27789a = C8241uv.m38462a().mo34799l(context, new qc0());
    }

    @RecentlyNonNull
    public final ListenableWorker.C1412a doWork() {
        try {
            this.f27789a.zzf();
            return ListenableWorker.C1412a.m7513c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1412a.m7511a();
        }
    }
}
