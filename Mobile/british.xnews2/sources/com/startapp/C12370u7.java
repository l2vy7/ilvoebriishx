package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C12320b;

/* renamed from: com.startapp.u7 */
/* compiled from: Sta */
public class C12370u7 extends C12320b {

    /* renamed from: com.startapp.u7$a */
    /* compiled from: Sta */
    public class C12371a implements C12128p7 {
        public C12371a() {
        }

        /* renamed from: a */
        public void mo45392a(Object obj) {
            C12370u7.this.callback.mo46481a(C12370u7.this, false);
        }
    }

    public C12370u7(Context context, C12320b.C12321a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        try {
            if (MetaData.f22407k.mo21177S()) {
                ComponentLocator.m23305a(this.context).mo21234u().mo45546b();
                StartAppSDKInternal.m23100a(true, (C12128p7) new C12371a());
                return;
            }
            this.callback.mo46481a(this, false);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
