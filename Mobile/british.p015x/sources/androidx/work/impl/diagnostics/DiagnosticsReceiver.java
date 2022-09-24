package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1483m;
import androidx.work.C1486o;
import androidx.work.C1503x;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f6415a = C1483m.m7773f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C1483m.m7771c().mo7013a(f6415a, "Requesting diagnostics", new Throwable[0]);
            try {
                C1503x.m7802j(context).mo7043e(C1486o.m7784d(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                C1483m.m7771c().mo7014b(f6415a, "WorkManager is not initialized", e);
            }
        }
    }
}
