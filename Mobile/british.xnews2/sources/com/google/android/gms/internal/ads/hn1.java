package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hn1 implements d30 {

    /* renamed from: a */
    final /* synthetic */ do1 f32772a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f32773b;

    hn1(do1 do1, ViewGroup viewGroup) {
        this.f32772a = do1;
        this.f32773b = viewGroup;
    }

    /* renamed from: a */
    public final void mo31092a(MotionEvent motionEvent) {
        this.f32772a.onTouch((View) null, motionEvent);
    }

    public final JSONObject zza() {
        return this.f32772a.zzo();
    }

    public final JSONObject zzb() {
        return this.f32772a.zzp();
    }

    public final void zzc() {
        do1 do1 = this.f32772a;
        p63<String> p63 = dn1.f30863o;
        Map<String, WeakReference<View>> zzm = do1.zzm();
        if (zzm != null) {
            int size = p63.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (zzm.get(p63.get(i)) == null) {
                    i = i2;
                } else {
                    this.f32772a.onClick(this.f32773b);
                    return;
                }
            }
        }
    }
}
