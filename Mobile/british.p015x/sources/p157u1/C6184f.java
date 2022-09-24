package p157u1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1483m;
import p178y1.C6400a;

/* renamed from: u1.f */
/* compiled from: StorageNotLowTracker */
public class C6184f extends C6177c<Boolean> {

    /* renamed from: i */
    private static final String f25534i = C1483m.m7773f("StorageNotLowTracker");

    public C6184f(Context context, C6400a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo23583g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo23584h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1483m.m7771c().mo7013a(f25534i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo23592d(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo23592d(Boolean.TRUE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo23582b() {
        Intent registerReceiver = this.f25522b.registerReceiver((BroadcastReceiver) null, mo23583g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
