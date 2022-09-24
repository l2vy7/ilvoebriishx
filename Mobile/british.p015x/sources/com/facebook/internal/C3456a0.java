package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.a0 */
/* compiled from: PlatformServiceClient */
public abstract class C3456a0 implements ServiceConnection {

    /* renamed from: b */
    private final Context f13009b;

    /* renamed from: c */
    private final Handler f13010c;

    /* renamed from: d */
    private C3458b f13011d;

    /* renamed from: e */
    private boolean f13012e;

    /* renamed from: f */
    private Messenger f13013f;

    /* renamed from: g */
    private int f13014g;

    /* renamed from: h */
    private int f13015h;

    /* renamed from: i */
    private final String f13016i;

    /* renamed from: j */
    private final int f13017j;

    /* renamed from: com.facebook.internal.a0$a */
    /* compiled from: PlatformServiceClient */
    class C3457a extends Handler {
        C3457a() {
        }

        public void handleMessage(Message message) {
            C3456a0.this.mo11909c(message);
        }
    }

    /* renamed from: com.facebook.internal.a0$b */
    /* compiled from: PlatformServiceClient */
    public interface C3458b {
        /* renamed from: a */
        void mo11916a(Bundle bundle);
    }

    public C3456a0(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f13009b = applicationContext != null ? applicationContext : context;
        this.f13014g = i;
        this.f13015h = i2;
        this.f13016i = str;
        this.f13017j = i3;
        this.f13010c = new C3457a();
    }

    /* renamed from: a */
    private void m11531a(Bundle bundle) {
        if (this.f13012e) {
            this.f13012e = false;
            C3458b bVar = this.f13011d;
            if (bVar != null) {
                bVar.mo11916a(bundle);
            }
        }
    }

    /* renamed from: e */
    private void m11532e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f13016i);
        mo11910d(bundle);
        Message obtain = Message.obtain((Handler) null, this.f13014g);
        obtain.arg1 = this.f13017j;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f13010c);
        try {
            this.f13013f.send(obtain);
        } catch (RemoteException unused) {
            m11531a((Bundle) null);
        }
    }

    /* renamed from: b */
    public void mo11908b() {
        this.f13012e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11909c(Message message) {
        if (message.what == this.f13015h) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m11531a((Bundle) null);
            } else {
                m11531a(data);
            }
            try {
                this.f13009b.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo11910d(Bundle bundle);

    /* renamed from: f */
    public void mo11911f(C3458b bVar) {
        this.f13011d = bVar;
    }

    /* renamed from: g */
    public boolean mo11912g() {
        Intent l;
        if (this.f13012e || C3563z.m11928t(this.f13017j) == -1 || (l = C3563z.m11920l(this.f13009b)) == null) {
            return false;
        }
        this.f13012e = true;
        this.f13009b.bindService(l, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13013f = new Messenger(iBinder);
        m11532e();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f13013f = null;
        try {
            this.f13009b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m11531a((Bundle) null);
    }
}
