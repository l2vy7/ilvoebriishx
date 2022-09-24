package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xe2 implements zi2<ye2> {

    /* renamed from: a */
    private final nb3 f41150a;

    /* renamed from: b */
    private final Context f41151b;

    public xe2(nb3 nb3, Context context) {
        this.f41150a = nb3;
        this.f41151b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ye2 mo35753a() throws Exception {
        double d;
        Intent registerReceiver = this.f41151b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(IronSourceConstants.EVENTS_STATUS, -1);
            double intExtra2 = (double) registerReceiver.getIntExtra("level", -1);
            double intExtra3 = (double) registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new ye2(d, z);
    }

    public final mb3<ye2> zzb() {
        return this.f41150a.mo33675b(new we2(this));
    }
}
