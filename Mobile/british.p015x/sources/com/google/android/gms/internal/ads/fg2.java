package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fg2 implements zi2<gg2> {

    /* renamed from: a */
    private final nb3 f31753a;

    /* renamed from: b */
    private final ViewGroup f31754b;

    /* renamed from: c */
    private final Context f31755c;

    /* renamed from: d */
    private final Set<String> f31756d;

    public fg2(nb3 nb3, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f31753a = nb3;
        this.f31756d = set;
        this.f31754b = viewGroup;
        this.f31755c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ gg2 mo31872a() throws Exception {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37179p4)).booleanValue() && this.f31754b != null && this.f31756d.contains("banner")) {
            return new gg2(Boolean.valueOf(this.f31754b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37188q4)).booleanValue() && this.f31756d.contains("native")) {
            Context context = this.f31755c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new gg2(bool);
            }
        }
        return new gg2((Boolean) null);
    }

    public final mb3<gg2> zzb() {
        return this.f31753a.mo33675b(new eg2(this));
    }
}
