package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a */
    Context f29207a;

    /* renamed from: b */
    private final C7307s1 f29208b;

    public zabx(C7307s1 s1Var) {
        this.f29208b = s1Var;
    }

    /* renamed from: a */
    public final void mo29959a(Context context) {
        this.f29207a = context;
    }

    /* renamed from: b */
    public final synchronized void mo29960b() {
        Context context = this.f29207a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f29207a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f29208b.mo29854a();
            mo29960b();
        }
    }
}
