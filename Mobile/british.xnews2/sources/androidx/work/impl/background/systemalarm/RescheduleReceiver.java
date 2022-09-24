package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.C1483m;
import p128p1.C5892i;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f6370a = C1483m.m7773f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C1483m.m7771c().mo7013a(f6370a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C5892i.m25998s(context).mo22854B(goAsync());
            } catch (IllegalStateException e) {
                C1483m.m7771c().mo7014b(f6370a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            context.startService(C1448b.m7645e(context));
        }
    }
}
