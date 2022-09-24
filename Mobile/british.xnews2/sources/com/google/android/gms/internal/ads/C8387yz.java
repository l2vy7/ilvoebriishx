package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcf;
import com.google.android.gms.common.internal.C4604n;
import p192c5.C6520c;

/* renamed from: com.google.android.gms.internal.ads.yz */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8387yz {

    /* renamed from: a */
    private final Context f42244a;

    public C8387yz(Context context) {
        C4604n.m20099l(context, "Context can not be null");
        this.f42244a = context;
    }

    /* renamed from: a */
    public final boolean mo35981a(Intent intent) {
        C4604n.m20099l(intent, "Intent can not be null");
        if (!this.f42244a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    @TargetApi(14)
    /* renamed from: b */
    public final boolean mo35982b() {
        return mo35981a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean mo35983c() {
        return ((Boolean) zzcf.zza(this.f42244a, new C8351xz())).booleanValue() && C6520c.m28321a(this.f42244a).mo24350a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
