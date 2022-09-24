package com.google.android.gms.cast.framework.media.widget;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.internal.cast.C8564i0;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.cast.framework.media.widget.g */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7157g extends TimerTask {

    /* renamed from: b */
    final /* synthetic */ C4580e f28822b;

    /* renamed from: c */
    final /* synthetic */ ExpandedControllerActivity f28823c;

    C7157g(ExpandedControllerActivity expandedControllerActivity, C4580e eVar) {
        this.f28823c = expandedControllerActivity;
        this.f28822b = eVar;
    }

    public final void run() {
        new C8564i0(Looper.getMainLooper()).post(new C7156f(this));
    }
}
