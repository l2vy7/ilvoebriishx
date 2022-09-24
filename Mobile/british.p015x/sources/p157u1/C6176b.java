package p157u1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1483m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p178y1.C6400a;

/* renamed from: u1.b */
/* compiled from: BatteryNotLowTracker */
public class C6176b extends C6177c<Boolean> {

    /* renamed from: i */
    private static final String f25516i = C1483m.m7773f("BatteryNotLowTracker");

    public C6176b(Context context, C6400a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo23583g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo23584h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1483m.m7771c().mo7013a(f25516i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo23592d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo23592d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo23582b() {
        Intent registerReceiver = this.f25522b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C1483m.m7771c().mo7014b(f25516i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(IronSourceConstants.EVENTS_STATUS, -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
