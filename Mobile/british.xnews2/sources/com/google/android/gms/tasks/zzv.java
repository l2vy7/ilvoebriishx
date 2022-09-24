package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.C7254i;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class zzv extends LifecycleCallback {
    private final List<WeakReference<zzq<?>>> zza = new ArrayList();

    private zzv(C7254i iVar) {
        super(iVar);
        this.mLifecycleFragment.mo29868b("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        C7254i fragment = LifecycleCallback.getFragment(activity);
        zzv zzv = (zzv) fragment.mo29869f("TaskOnStopCallback", zzv.class);
        return zzv == null ? new zzv(fragment) : zzv;
    }

    public final void onStop() {
        synchronized (this.zza) {
            for (WeakReference<zzq<?>> weakReference : this.zza) {
                zzq zzq = (zzq) weakReference.get();
                if (zzq != null) {
                    zzq.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final <T> void zzb(zzq<T> zzq) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzq));
        }
    }
}
