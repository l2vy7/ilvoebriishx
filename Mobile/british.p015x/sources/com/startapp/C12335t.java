package com.startapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.startapp.t */
/* compiled from: Sta */
public class C12335t implements ServiceConnection {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f54755a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    public boolean f54756b = false;

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f54755a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
