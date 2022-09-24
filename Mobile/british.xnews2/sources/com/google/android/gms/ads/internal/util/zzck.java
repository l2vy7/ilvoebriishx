package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.p00;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzck {
    @GuardedBy("this")

    /* renamed from: a */
    private final BroadcastReceiver f27889a = new zzcj(this);
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f27890b = new WeakHashMap();

    /* renamed from: c */
    private boolean f27891c = false;

    /* renamed from: d */
    private boolean f27892d;

    /* renamed from: e */
    private Context f27893e;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void m28833b(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f27890b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) next.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    public final synchronized void zzb(Context context) {
        if (!this.f27891c) {
            Context applicationContext = context.getApplicationContext();
            this.f27893e = applicationContext;
            if (applicationContext == null) {
                this.f27893e = context;
            }
            p00.m35913c(this.f27893e);
            this.f27892d = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37220u2)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f27893e.registerReceiver(this.f27889a, intentFilter);
            this.f27891c = true;
        }
    }

    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f27892d) {
            this.f27890b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f27892d) {
            this.f27890b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
