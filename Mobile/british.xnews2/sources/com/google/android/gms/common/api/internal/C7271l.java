package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7389g;
import com.google.android.gms.common.internal.C7395i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7271l implements C7191a.C7201f, ServiceConnection {

    /* renamed from: m */
    private static final String f29044m = C7271l.class.getSimpleName();

    /* renamed from: b */
    private final String f29045b;

    /* renamed from: c */
    private final String f29046c;

    /* renamed from: d */
    private final ComponentName f29047d;

    /* renamed from: e */
    private final Context f29048e;

    /* renamed from: f */
    private final C7240f f29049f;

    /* renamed from: g */
    private final Handler f29050g;

    /* renamed from: h */
    private final C7276m f29051h;

    /* renamed from: i */
    private IBinder f29052i;

    /* renamed from: j */
    private boolean f29053j;

    /* renamed from: k */
    private String f29054k;

    /* renamed from: l */
    private String f29055l;

    /* renamed from: g */
    private final void m29692g() {
        if (Thread.currentThread() != this.f29050g.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: h */
    private final void m29693h(String str) {
        String.valueOf(this.f29052i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo29889b() {
        this.f29053j = false;
        this.f29052i = null;
        m29693h("Disconnected.");
        this.f29049f.onConnectionSuspended(1);
    }

    public final void connect(C7377d.C7380c cVar) {
        m29692g();
        m29693h("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f29047d;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f29045b).setAction(this.f29046c);
            }
            boolean bindService = this.f29048e.bindService(intent, this, C7389g.m29998a());
            this.f29053j = bindService;
            if (!bindService) {
                this.f29052i = null;
                this.f29051h.onConnectionFailed(new ConnectionResult(16));
            }
            m29693h("Finished connect.");
        } catch (SecurityException e) {
            this.f29053j = false;
            this.f29052i = null;
            throw e;
        }
    }

    public final void disconnect() {
        m29692g();
        m29693h("Disconnect called.");
        try {
            this.f29048e.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f29053j = false;
        this.f29052i = null;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo29890e(IBinder iBinder) {
        this.f29053j = false;
        this.f29052i = iBinder;
        m29693h("Connected.");
        this.f29049f.onConnected(new Bundle());
    }

    /* renamed from: f */
    public final void mo29891f(String str) {
        this.f29055l = str;
    }

    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    public final String getEndpointPackageName() {
        String str = this.f29045b;
        if (str != null) {
            return str;
        }
        C4604n.m20098k(this.f29047d);
        return this.f29047d.getPackageName();
    }

    public final String getLastDisconnectMessage() {
        return this.f29054k;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(C7395i iVar, Set<Scope> set) {
    }

    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    public final Intent getSignInIntent() {
        return new Intent();
    }

    public final boolean isConnected() {
        m29692g();
        return this.f29052i != null;
    }

    public final boolean isConnecting() {
        m29692g();
        return this.f29053j;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f29050g.post(new C7218a2(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f29050g.post(new C7338z1(this));
    }

    public final void onUserSignOut(C7377d.C7382e eVar) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public final void disconnect(String str) {
        m29692g();
        this.f29054k = str;
        disconnect();
    }
}
