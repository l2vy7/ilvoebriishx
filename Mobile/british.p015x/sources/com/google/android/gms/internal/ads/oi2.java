package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.zzae;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p193c5.C6520c;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oi2 implements zi2<pi2> {

    /* renamed from: a */
    private final nb3 f36470a;

    /* renamed from: b */
    private final Context f36471b;

    /* renamed from: c */
    private final zzcjf f36472c;

    public oi2(nb3 nb3, Context context, zzcjf zzcjf) {
        this.f36470a = nb3;
        this.f36471b = context;
        this.f36472c = zzcjf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ pi2 mo33904a() throws Exception {
        int i;
        boolean g = C6520c.m28321a(this.f36471b).mo24356g();
        zzt.zzp();
        boolean zzI = com.google.android.gms.ads.internal.util.zzt.zzI(this.f36471b);
        String str = this.f36472c.f43036b;
        zzt.zzq();
        boolean zzu = zzae.zzu();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.f36471b.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new pi2(g, zzI, str, zzu, i, DynamiteModule.m30156c(this.f36471b, ModuleDescriptor.MODULE_ID), DynamiteModule.m30155a(this.f36471b, ModuleDescriptor.MODULE_ID));
    }

    public final mb3<pi2> zzb() {
        return this.f36470a.mo33675b(new ni2(this));
    }
}
