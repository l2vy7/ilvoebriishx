package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.C12172s;
import com.startapp.C5004d4;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.common.advertisingid.a */
/* compiled from: Sta */
public class C12297a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdvertisingIdResolver f54694a;

    public C12297a(AdvertisingIdResolver advertisingIdResolver) {
        this.f54694a = advertisingIdResolver;
    }

    public void run() {
        AdvertisingIdResolver advertisingIdResolver;
        AdvertisingIdResolver advertisingIdResolver2;
        AtomicReference<C12172s> atomicReference;
        Context context;
        C12172s sVar;
        try {
            this.f54694a.f54688d.lock();
            try {
                advertisingIdResolver2 = this.f54694a;
                atomicReference = advertisingIdResolver2.f54690f;
                context = advertisingIdResolver2.f54685a;
                sVar = AdvertisingIdResolver.m53419a(context);
            } catch (AdvertisingIdResolver.InternalException e) {
                advertisingIdResolver2.mo46445b(e.infoEventFlags);
            } catch (Throwable th) {
                try {
                    if (this.f54694a.mo46443a(64)) {
                        C5004d4.m22887a(th);
                    }
                    advertisingIdResolver = this.f54694a;
                } catch (Throwable th2) {
                    this.f54694a.f54691g = 2;
                    this.f54694a.f54689e.signalAll();
                    this.f54694a.f54688d.unlock();
                    throw th2;
                }
            }
            atomicReference.set(sVar);
            advertisingIdResolver = this.f54694a;
            advertisingIdResolver.f54691g = 2;
            this.f54694a.f54689e.signalAll();
            this.f54694a.f54688d.unlock();
            try {
                sVar = AdvertisingIdResolver.m53420b(context);
            } catch (AdvertisingIdResolver.InternalException e2) {
                advertisingIdResolver2.mo46445b(e2.infoEventFlags);
                sVar = C12172s.f54120d;
                atomicReference.set(sVar);
                advertisingIdResolver = this.f54694a;
                advertisingIdResolver.f54691g = 2;
                this.f54694a.f54689e.signalAll();
                this.f54694a.f54688d.unlock();
            } catch (Throwable th3) {
                if (advertisingIdResolver2.mo46443a(256)) {
                    C5004d4.m22887a(th3);
                }
                sVar = C12172s.f54120d;
                atomicReference.set(sVar);
                advertisingIdResolver = this.f54694a;
                advertisingIdResolver.f54691g = 2;
                this.f54694a.f54689e.signalAll();
                this.f54694a.f54688d.unlock();
            }
            atomicReference.set(sVar);
            advertisingIdResolver = this.f54694a;
            advertisingIdResolver.f54691g = 2;
            this.f54694a.f54689e.signalAll();
            this.f54694a.f54688d.unlock();
        } catch (Throwable th4) {
            this.f54694a.f54691g = 2;
            if (this.f54694a.mo46443a(16384)) {
                C5004d4.m22887a(th4);
            }
        }
    }
}
