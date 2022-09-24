package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.C3420m;
import p177y0.C6396a;

public class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: b */
    private static BoltsMeasurementEventListener f13005b;

    /* renamed from: a */
    private Context f13006a;

    private BoltsMeasurementEventListener(Context context) {
        this.f13006a = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m11526a() {
        C6396a.m28074b(this.f13006a).mo24229e(this);
    }

    /* renamed from: b */
    public static BoltsMeasurementEventListener m11527b(Context context) {
        BoltsMeasurementEventListener boltsMeasurementEventListener = f13005b;
        if (boltsMeasurementEventListener != null) {
            return boltsMeasurementEventListener;
        }
        BoltsMeasurementEventListener boltsMeasurementEventListener2 = new BoltsMeasurementEventListener(context);
        f13005b = boltsMeasurementEventListener2;
        boltsMeasurementEventListener2.m11528c();
        return f13005b;
    }

    /* renamed from: c */
    private void m11528c() {
        C6396a.m28074b(this.f13006a).mo24227c(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m11526a();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C3420m mVar = new C3420m(context);
        String str = "bf_" + intent.getStringExtra("event_name");
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str2 : bundleExtra.keySet()) {
            bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str2));
        }
        mVar.mo11845f(str, bundle);
    }
}
