package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class sf2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ tf2 f38964a;

    public /* synthetic */ sf2(tf2 tf2) {
        this.f38964a = tf2;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        zzt.zzp();
        C4612go zzf = zzt.zzo().mo18583h().zzf();
        Bundle bundle = null;
        if (zzf != null && (!zzt.zzo().mo18583h().zzI() || !zzt.zzo().mo18583h().zzJ())) {
            if (zzf.mo18357h()) {
                zzf.mo18356g();
            }
            C4630wn a = zzf.mo18350a();
            if (a != null) {
                str2 = a.mo18932d();
                str = a.mo18933e();
                str3 = a.mo18935f();
                if (str2 != null) {
                    zzt.zzo().mo18583h().zzu(str2);
                }
                if (str3 != null) {
                    zzt.zzo().mo18583h().zzw(str3);
                }
            } else {
                str2 = zzt.zzo().mo18583h().zzi();
                str3 = zzt.zzo().mo18583h().zzj();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!zzt.zzo().mo18583h().zzJ()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !zzt.zzo().mo18583h().zzI()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new uf2(bundle);
    }
}
