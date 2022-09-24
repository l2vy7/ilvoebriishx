package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.hl0;
import com.google.android.gms.internal.ads.zzcde;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzb {

    /* renamed from: a */
    private final Context f19875a;

    /* renamed from: b */
    private boolean f19876b;

    /* renamed from: c */
    private final hl0 f19877c;

    /* renamed from: d */
    private final zzcde f19878d = new zzcde(false, Collections.emptyList());

    public zzb(Context context, hl0 hl0, zzcde zzcde) {
        this.f19875a = context;
        this.f19877c = hl0;
    }

    /* renamed from: a */
    private final boolean m19816a() {
        hl0 hl0 = this.f19877c;
        return (hl0 != null && hl0.zza().f43033g) || this.f19878d.f21148b;
    }

    public final void zza() {
        this.f19876b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (m19816a()) {
            if (str == null) {
                str = "";
            }
            hl0 hl0 = this.f19877c;
            if (hl0 != null) {
                hl0.mo18141a(str, (Map<String, String>) null, 3);
                return;
            }
            zzcde zzcde = this.f19878d;
            if (zzcde.f21148b && (list = zzcde.f21149c) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzt.zzp();
                        zzt.zzO(this.f19875a, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !m19816a() || this.f19876b;
    }
}
