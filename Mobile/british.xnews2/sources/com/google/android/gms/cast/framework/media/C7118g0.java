package com.google.android.gms.cast.framework.media;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.cast.framework.media.g0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7118g0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ C7115f f28708b;

    C7118g0(C7115f fVar) {
        this.f28708b = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f28708b.f28699G0 != null) {
            this.f28708b.f28699G0.cancel();
            Dialog unused = this.f28708b.f28699G0 = null;
        }
    }
}
