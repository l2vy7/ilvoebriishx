package p156u1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1483m;
import p177y1.C6400a;

/* renamed from: u1.c */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class C6177c<T> extends C6179d<T> {

    /* renamed from: h */
    private static final String f25517h = C1483m.m7773f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f25518g = new C6178a();

    /* renamed from: u1.c$a */
    /* compiled from: BroadcastReceiverConstraintTracker */
    class C6178a extends BroadcastReceiver {
        C6178a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C6177c.this.mo23584h(context, intent);
            }
        }
    }

    public C6177c(Context context, C6400a aVar) {
        super(context, aVar);
    }

    /* renamed from: e */
    public void mo23587e() {
        C1483m.m7771c().mo7013a(f25517h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f25522b.registerReceiver(this.f25518g, mo23583g());
    }

    /* renamed from: f */
    public void mo23588f() {
        C1483m.m7771c().mo7013a(f25517h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f25522b.unregisterReceiver(this.f25518g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo23583g();

    /* renamed from: h */
    public abstract void mo23584h(Context context, Intent intent);
}
