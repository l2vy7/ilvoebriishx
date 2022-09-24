package com.google.android.gms.cast;

import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplayLocalService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.google.android.gms.cast.d */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C7095d implements OnCompleteListener<Void> {

    /* renamed from: a */
    final /* synthetic */ CastRemoteDisplayLocalService f28540a;

    C7095d(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.f28540a = castRemoteDisplayLocalService;
    }

    public final void onComplete(Task<Void> task) {
        if (!task.isSuccessful()) {
            this.f28540a.m29062l("Unable to stop the remote display, result unsuccessful");
            CastRemoteDisplayLocalService.C7079a aVar = (CastRemoteDisplayLocalService.C7079a) this.f28540a.f28357c.get();
            if (aVar != null) {
                aVar.mo29199b(new Status(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
            }
        } else {
            this.f28540a.m29062l("remote display stopped");
        }
        Display unused = this.f28540a.f28360f = null;
    }
}
