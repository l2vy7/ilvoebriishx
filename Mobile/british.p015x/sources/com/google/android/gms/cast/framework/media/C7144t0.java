package com.google.android.gms.cast.framework.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8547h0;
import p001a0.C0048p;

/* renamed from: com.google.android.gms.cast.framework.media.t0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7144t0 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ MediaNotificationService f28738a;

    C7144t0(MediaNotificationService mediaNotificationService) {
        this.f28738a = mediaNotificationService;
    }

    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        ComponentName componentName = (ComponentName) C4604n.m20098k((ComponentName) intent.getParcelableExtra("targetActivity"));
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        if (this.f28738a.f28610p.mo22536g()) {
            intent2.setFlags(603979776);
            pendingIntent = C8547h0.m40979a(context, 1, intent2, C8547h0.f43513a | 134217728);
        } else {
            C0048p e = C0048p.m189e(this.f28738a);
            e.mo133c(componentName);
            e.mo131a(intent2);
            pendingIntent = e.mo134f(1, C8547h0.f43513a | 134217728);
        }
        try {
            ((PendingIntent) C4604n.m20098k(pendingIntent)).send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e2) {
            MediaNotificationService.f28594r.mo43191b(e2, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
