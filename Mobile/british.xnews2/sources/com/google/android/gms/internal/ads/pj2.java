package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pj2 implements zi2<qj2> {

    /* renamed from: a */
    private final Context f37681a;

    /* renamed from: b */
    private final ScheduledExecutorService f37682b;

    /* renamed from: c */
    private final Executor f37683c;

    /* renamed from: d */
    private final int f37684d;

    /* renamed from: e */
    private final fn0 f37685e;

    public pj2(fn0 fn0, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.f37685e = fn0;
        this.f37681a = context;
        this.f37682b = scheduledExecutorService;
        this.f37683c = executor;
        this.f37684d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ qj2 mo34138a(Throwable th) {
        String str;
        C8241uv.m38463b();
        ContentResolver contentResolver = this.f37681a.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new qj2((AdvertisingIdClient.Info) null, str);
    }

    public final mb3<qj2> zzb() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36896I0)).booleanValue()) {
            return bb3.m30648h(new Exception("Did not ad Ad ID into query param."));
        }
        return bb3.m30646f((sa3) bb3.m30655o(bb3.m30653m(sa3.m37369D(this.f37685e.mo31889a(this.f37681a, this.f37684d)), oj2.f36509a, this.f37683c), ((Long) C8311wv.m39277c().mo18570b(p00.f36904J0)).longValue(), TimeUnit.MILLISECONDS, this.f37682b), Throwable.class, new nj2(this), this.f37683c);
    }
}
