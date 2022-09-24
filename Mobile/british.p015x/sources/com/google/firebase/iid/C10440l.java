package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import p078f7.C10553p;

/* renamed from: com.google.firebase.iid.l */
final class C10440l implements Runnable {

    /* renamed from: b */
    private final long f48893b;

    /* renamed from: c */
    private final PowerManager.WakeLock f48894c;

    /* renamed from: d */
    private final FirebaseInstanceId f48895d;

    /* renamed from: e */
    private final C10553p f48896e;

    /* renamed from: f */
    private final C10441n f48897f;

    C10440l(FirebaseInstanceId firebaseInstanceId, C10553p pVar, C10441n nVar, long j) {
        this.f48895d = firebaseInstanceId;
        this.f48896e = pVar;
        this.f48897f = nVar;
        this.f48893b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo41901a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f48894c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    private final boolean m48103b() {
        try {
            if (this.f48895d.mo41854A()) {
                return true;
            }
            this.f48895d.mo41855B();
            return true;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Build channel failed: ".concat(valueOf) : new String("Build channel failed: "));
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m48104c() {
        C10438k v = this.f48895d.mo41867v();
        if (v != null && !v.mo41897d(this.f48896e.mo42679d())) {
            return true;
        }
        try {
            String w = this.f48895d.mo41868w();
            if (w == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (v == null || !w.equals(v.f48888a)) {
                Context a = mo41901a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", w);
                C10434i.m48061g(a, intent);
                C10434i.m48060f(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo41901a() {
        return this.f48895d.mo41866t().mo43355h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo41902d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo41901a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        this.f48894c.acquire();
        try {
            this.f48895d.mo41863m(true);
            if (!this.f48895d.mo41870z()) {
                this.f48895d.mo41863m(false);
            } else if (!mo41902d()) {
                new C4819m(this).mo20033a();
                this.f48894c.release();
            } else {
                if (!m48103b() || !m48104c() || !this.f48897f.mo41905d(this.f48895d)) {
                    this.f48895d.mo41860i(this.f48893b);
                } else {
                    this.f48895d.mo41863m(false);
                }
                this.f48894c.release();
            }
        } finally {
            this.f48894c.release();
        }
    }
}
