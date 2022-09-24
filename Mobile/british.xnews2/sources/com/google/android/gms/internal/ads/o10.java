package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p133q.C5910b;
import p133q.C5911c;
import p133q.C5920e;
import p133q.C5922f;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o10 {

    /* renamed from: a */
    private C5922f f20596a;

    /* renamed from: b */
    private C5911c f20597b;

    /* renamed from: c */
    private C5920e f20598c;

    /* renamed from: d */
    private m10 f20599d;

    /* renamed from: g */
    public static boolean m20748g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(jv3.m33764a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C5922f mo18594a() {
        C5911c cVar = this.f20597b;
        if (cVar == null) {
            this.f20596a = null;
        } else if (this.f20596a == null) {
            this.f20596a = cVar.mo22901c((C5910b) null);
        }
        return this.f20596a;
    }

    /* renamed from: b */
    public final void mo18595b(Activity activity) {
        String a;
        if (this.f20597b == null && (a = jv3.m33764a(activity)) != null) {
            kv3 kv3 = new kv3(this, (byte[]) null);
            this.f20598c = kv3;
            C5911c.m26081a(activity, a, kv3);
        }
    }

    /* renamed from: c */
    public final void mo18596c(C5911c cVar) {
        this.f20597b = cVar;
        cVar.mo22902e(0);
        m10 m10 = this.f20599d;
        if (m10 != null) {
            m10.zza();
        }
    }

    /* renamed from: d */
    public final void mo18597d() {
        this.f20597b = null;
        this.f20596a = null;
    }

    /* renamed from: e */
    public final void mo18598e(m10 m10) {
        this.f20599d = m10;
    }

    /* renamed from: f */
    public final void mo18599f(Activity activity) {
        C5920e eVar = this.f20598c;
        if (eVar != null) {
            activity.unbindService(eVar);
            this.f20597b = null;
            this.f20596a = null;
            this.f20598c = null;
        }
    }
}
