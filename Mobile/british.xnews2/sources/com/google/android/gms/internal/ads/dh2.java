package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dh2 implements zi2<eh2> {

    /* renamed from: a */
    private final nb3 f30770a;

    /* renamed from: b */
    private final Context f30771b;

    /* renamed from: c */
    private final Set<String> f30772c;

    public dh2(nb3 nb3, Context context, Set<String> set) {
        this.f30770a = nb3;
        this.f30771b = context;
        this.f30772c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ eh2 mo31255a() throws Exception {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
            Set<String> set = this.f30772c;
            if (set.contains("rewarded") || set.contains(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE) || set.contains("native") || set.contains("banner")) {
                return new eh2(zzt.zzh().mo34045b(this.f30771b));
            }
        }
        return new eh2((String) null);
    }

    public final mb3<eh2> zzb() {
        return this.f30770a.mo33675b(new ch2(this));
    }
}
