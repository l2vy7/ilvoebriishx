package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C4604n;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p186z4.C6469a;
import p214h5.C10574e;
import p214h5.C10575f;
import p252t4.C11011a;
import p252t4.C11013c;
import p252t4.C11014d;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class AdvertisingIdClient {
    @GuardedBy("this")

    /* renamed from: a */
    C11011a f19864a;
    @GuardedBy("this")

    /* renamed from: b */
    C10575f f19865b;
    @GuardedBy("this")

    /* renamed from: c */
    boolean f19866c;

    /* renamed from: d */
    final Object f19867d;
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    zzb f19868e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f19869f;

    /* renamed from: g */
    final long f19870g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class Info {

        /* renamed from: a */
        private final String f19871a;

        /* renamed from: b */
        private final boolean f19872b;

        @Deprecated
        public Info(String str, boolean z) {
            this.f19871a = str;
            this.f19872b = z;
        }

        public String getId() {
            return this.f19871a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f19872b;
        }

        public String toString() {
            String str = this.f19871a;
            boolean z = this.f19872b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    /* renamed from: c */
    private final Info m19810c(int i) throws IOException {
        Info info;
        C4604n.m20097j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f19866c) {
                synchronized (this.f19867d) {
                    zzb zzb = this.f19868e;
                    if (zzb == null || !zzb.f27779e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo17636a(false);
                    if (!this.f19866c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C4604n.m20098k(this.f19864a);
            C4604n.m20098k(this.f19865b);
            info = new Info(this.f19865b.zzc(), this.f19865b.mo42693C(true));
        }
        m19811d();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19811d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f19867d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r6.f19868e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f27778d     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.ads.identifier.zzb r1 = r6.f19868e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f19870g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f19868e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.m19811d():void");
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, C11013c, C11014d {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.mo17636a(false);
            Info c = advertisingIdClient.m19810c(-1);
            advertisingIdClient.mo17637b(c, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            advertisingIdClient.zza();
            return c;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, C11013c, C11014d {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, false, false);
        try {
            advertisingIdClient.mo17636a(false);
            C4604n.m20097j("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.f19866c) {
                    synchronized (advertisingIdClient.f19867d) {
                        zzb zzb = advertisingIdClient.f19868e;
                        if (zzb == null || !zzb.f27779e) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.mo17636a(false);
                        if (!advertisingIdClient.f19866c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                C4604n.m20098k(advertisingIdClient.f19864a);
                C4604n.m20098k(advertisingIdClient.f19865b);
                zzd = advertisingIdClient.f19865b.zzd();
            }
            advertisingIdClient.m19811d();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17636a(boolean z) throws IOException, IllegalStateException, C11013c, C11014d {
        C4604n.m20097j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f19866c) {
                zza();
            }
            Context context = this.f19869f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = C7353b.m29920h().mo29709j(context, C7355d.f29215a);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C11011a aVar = new C11011a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C6469a.m28199b().mo24298a(context, intent, aVar, 1)) {
                    this.f19864a = aVar;
                    this.f19865b = C10574e.m48319x(aVar.mo43303a(ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS, TimeUnit.MILLISECONDS));
                    this.f19866c = true;
                    if (z) {
                        m19811d();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C11013c(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo17637b(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = SessionDescription.SUPPORTED_SDP_VERSION;
            }
            hashMap.put("limit_ad_tracking", str2);
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new zza(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return m19810c(-1);
    }

    public void start() throws IOException, IllegalStateException, C11013c, C11014d {
        mo17636a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C4604n.m20097j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f19869f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            t4.a r0 = r3.f19864a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f19866c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            z4.a r0 = p186z4.C6469a.m28199b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f19869f     // Catch:{ all -> 0x001f }
            t4.a r2 = r3.f19864a     // Catch:{ all -> 0x001f }
            r0.mo24299c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f19866c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f19865b = r0     // Catch:{ all -> 0x0033 }
            r3.f19864a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f19867d = new Object();
        C4604n.m20098k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f19869f = context;
        this.f19866c = false;
        this.f19870g = j;
    }
}
