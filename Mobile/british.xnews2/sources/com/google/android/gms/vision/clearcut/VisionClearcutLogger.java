package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.clearcut.C4586a;
import com.google.android.gms.internal.vision.C9508f0;
import com.google.android.gms.internal.vision.C9511f2;
import com.google.android.gms.internal.vision.C9549k;
import p186z5.C11148d;

@Keep
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class VisionClearcutLogger {
    private final C4586a zzcd;
    private boolean zzce = true;

    public VisionClearcutLogger(Context context) {
        this.zzcd = new C4586a(context, "VISION", (String) null);
    }

    public final void zzb(int i, C9508f0 f0Var) {
        byte[] e = f0Var.mo38664e();
        if (i < 0 || i > 3) {
            C11148d.m49748d("Illegal event code: %d", Integer.valueOf(i));
            return;
        }
        try {
            if (this.zzce) {
                this.zzcd.mo17877a(e).mo17879b(i).mo17878a();
                return;
            }
            C9508f0.C9509a s = C9508f0.m44232s();
            try {
                s.mo38263k(e, 0, e.length, C9511f2.m44253c());
                C11148d.m49746b("Would have logged:\n%s", s.toString());
            } catch (Exception e2) {
                C11148d.m49747c(e2, "Parsing error", new Object[0]);
            }
        } catch (Exception e3) {
            C9549k.m44398a(e3);
            C11148d.m49747c(e3, "Failed to log", new Object[0]);
        }
    }
}
