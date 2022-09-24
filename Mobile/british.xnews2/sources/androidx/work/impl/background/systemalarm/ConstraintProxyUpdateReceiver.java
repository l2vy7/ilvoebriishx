package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1483m;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p128p1.C5892i;
import p172x1.C6358d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f6365a = C1483m.m7773f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class C1446a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Intent f6366b;

        /* renamed from: c */
        final /* synthetic */ Context f6367c;

        /* renamed from: d */
        final /* synthetic */ BroadcastReceiver.PendingResult f6368d;

        C1446a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f6366b = intent;
            this.f6367c = context;
            this.f6368d = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f6366b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f6366b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f6366b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f6366b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C1483m.m7771c().mo7013a(ConstraintProxyUpdateReceiver.f6365a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C6358d.m27998a(this.f6367c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C6358d.m27998a(this.f6367c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C6358d.m27998a(this.f6367c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C6358d.m27998a(this.f6367c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f6368d.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m7635a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1483m.m7771c().mo7013a(f6365a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            C5892i.m25998s(context).mo22868x().mo24233b(new C1446a(intent, context, goAsync()));
        }
    }
}
