package com.google.android.gms.cast.framework.media.widget;

import android.view.View;
import com.google.android.gms.cast.framework.media.C4580e;

/* renamed from: com.google.android.gms.cast.framework.media.widget.e */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7155e implements View.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ ExpandedControllerActivity f28820b;

    C7155e(ExpandedControllerActivity expandedControllerActivity) {
        this.f28820b = expandedControllerActivity;
    }

    public final void onClick(View view) {
        C4580e Q;
        if (this.f28820b.f28800Y.isClickable() && (Q = this.f28820b.m29434Z()) != null) {
            Q.mo17828M();
        }
    }
}
