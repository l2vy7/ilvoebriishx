package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private ConnectivityManager f21991a;

    /* renamed from: b */
    private C4984k f21992b;

    /* renamed from: c */
    private boolean f21993c;

    public NetworkStateReceiver(Context context, C4984k kVar) {
        this.f21992b = kVar;
        this.f21991a = (ConnectivityManager) context.getSystemService("connectivity");
        m22712a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22712a() {
        /*
            r4 = this;
            boolean r0 = r4.f21993c
            android.net.ConnectivityManager r1 = r4.f21991a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r4.f21993c = r1     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r4.f21993c = r3
        L_0x001c:
            boolean r1 = r4.f21993c
            if (r0 == r1) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.m22712a():boolean");
    }

    public void onReceive(Context context, Intent intent) {
        C4984k kVar;
        if (intent != null && intent.getExtras() != null && m22712a() && (kVar = this.f21992b) != null) {
            if (this.f21993c) {
                kVar.mo20593a(true);
            } else {
                kVar.mo20593a(false);
            }
        }
    }
}
