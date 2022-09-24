package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C9508f0;
import com.google.android.gms.internal.vision.C9533i;
import com.google.android.gms.internal.vision.C9610r2;
import java.util.concurrent.ExecutorService;
import p187z5.C11148d;

@Keep
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class DynamiteClearcutLogger {
    private static final ExecutorService zzbv = C9533i.m44296a().mo38432a(2, C9610r2.f45843a);
    private C10006b zzbw = new C10006b(0.03333333333333333d);
    /* access modifiers changed from: private */
    public VisionClearcutLogger zzbx;

    public DynamiteClearcutLogger(Context context) {
        this.zzbx = new VisionClearcutLogger(context);
    }

    public final void zza(int i, C9508f0 f0Var) {
        if (i != 3 || this.zzbw.mo39501a()) {
            zzbv.execute(new C10005a(this, i, f0Var));
        } else {
            C11148d.m49749e("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
