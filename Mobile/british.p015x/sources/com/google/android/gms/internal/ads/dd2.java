package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dd2 implements yi2<Bundle> {

    /* renamed from: a */
    public final Context f30719a;

    /* renamed from: b */
    public final zzbfi f30720b;

    /* renamed from: c */
    public final List<Parcelable> f30721c;

    public dd2(Context context, zzbfi zzbfi, List<Parcelable> list) {
        this.f30719a = context;
        this.f30720b = zzbfi;
        this.f30721c = list;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (i20.f33036a.mo34648e().booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzt.zzp();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f30719a.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f30720b.f42968f);
            bundle3.putInt("height", this.f30720b.f42965c);
            bundle2.putBundle("size", bundle3);
            if (this.f30721c.size() > 0) {
                List<Parcelable> list = this.f30721c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
