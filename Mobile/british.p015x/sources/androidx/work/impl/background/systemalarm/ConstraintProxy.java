package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1423c;
import androidx.work.C1483m;
import androidx.work.C1485n;
import java.util.List;
import p168w1.C6283p;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f6364a = C1483m.m7773f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m7634a(Context context, List<C6283p> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C6283p pVar : list) {
            C1423c cVar = pVar.f25950j;
            z |= cVar.mo6875f();
            z2 |= cVar.mo6876g();
            z3 |= cVar.mo6879i();
            z4 |= cVar.mo6870b() != C1485n.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m7635a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C1483m.m7771c().mo7013a(f6364a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1448b.m7642a(context));
    }
}
