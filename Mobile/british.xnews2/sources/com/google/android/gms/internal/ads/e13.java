package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e13 {

    /* renamed from: a */
    private final Context f31150a;

    /* renamed from: b */
    private final Executor f31151b;

    /* renamed from: c */
    private final k03 f31152c;

    /* renamed from: d */
    private final m03 f31153d;

    /* renamed from: e */
    private final c13 f31154e;

    /* renamed from: f */
    private final c13 f31155f;

    /* renamed from: g */
    private Task<C8218u8> f31156g;

    /* renamed from: h */
    private Task<C8218u8> f31157h;

    e13(Context context, Executor executor, k03 k03, m03 m03, a13 a13, b13 b13) {
        this.f31150a = context;
        this.f31151b = executor;
        this.f31152c = k03;
        this.f31153d = m03;
        this.f31154e = a13;
        this.f31155f = b13;
    }

    /* renamed from: e */
    public static e13 m31666e(Context context, Executor executor, k03 k03, m03 m03) {
        e13 e13 = new e13(context, executor, k03, m03, new a13(), new b13());
        if (e13.f31153d.mo33456d()) {
            e13.f31156g = e13.m31668h(new y03(e13));
        } else {
            e13.f31156g = Tasks.forResult(e13.f31154e.zza());
        }
        e13.f31157h = e13.m31668h(new z03(e13));
        return e13;
    }

    /* renamed from: g */
    private static C8218u8 m31667g(Task<C8218u8> task, C8218u8 u8Var) {
        if (!task.isSuccessful()) {
            return u8Var;
        }
        return task.getResult();
    }

    /* renamed from: h */
    private final Task<C8218u8> m31668h(Callable<C8218u8> callable) {
        return Tasks.call(this.f31151b, callable).addOnFailureListener(this.f31151b, (OnFailureListener) new x03(this));
    }

    /* renamed from: a */
    public final C8218u8 mo31443a() {
        return m31667g(this.f31156g, this.f31154e.zza());
    }

    /* renamed from: b */
    public final C8218u8 mo31444b() {
        return m31667g(this.f31157h, this.f31155f.zza());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C8218u8 mo31445c() throws Exception {
        Context context = this.f31150a;
        C7600d8 f0 = C8218u8.m38216f0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            f0.mo31179v0(id);
            f0.mo31178u0(advertisingIdInfo.isLimitAdTrackingEnabled());
            f0.mo31158a0(6);
        }
        return (C8218u8) f0.mo32424p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C8218u8 mo31446d() throws Exception {
        Context context = this.f31150a;
        return s03.m37285a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo31447f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f31152c.mo33005c(2025, -1, exc);
    }
}
