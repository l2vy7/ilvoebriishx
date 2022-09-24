package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ka3 {

    /* renamed from: a */
    private final AudioManager f34217a;

    /* renamed from: b */
    private final x73 f34218b;

    /* renamed from: c */
    private y83 f34219c;

    /* renamed from: d */
    private int f34220d;

    /* renamed from: e */
    private float f34221e = 1.0f;

    public ka3(Context context, Handler handler, y83 y83) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f34217a = audioManager;
        this.f34219c = y83;
        this.f34218b = new x73(this, handler);
        this.f34220d = 0;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m33881c(ka3 ka3, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                ka3.m33884g(3);
                return;
            }
            ka3.m33883f(0);
            ka3.m33884g(2);
        } else if (i == -1) {
            ka3.m33883f(-1);
            ka3.m33882e();
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        } else {
            ka3.m33884g(1);
            ka3.m33883f(1);
        }
    }

    /* renamed from: e */
    private final void m33882e() {
        if (this.f34220d != 0) {
            if (d13.f20195a < 26) {
                this.f34217a.abandonAudioFocus(this.f34218b);
            }
            m33884g(0);
        }
    }

    /* renamed from: f */
    private final void m33883f(int i) {
        y83 y83 = this.f34219c;
        if (y83 != null) {
            nx3 nx3 = (nx3) y83;
            boolean F = nx3.f36168b.mo34429F();
            nx3.f36168b.m36783M(F, i, qx3.m36777G(F, i));
        }
    }

    /* renamed from: g */
    private final void m33884g(int i) {
        if (this.f34220d != i) {
            this.f34220d = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f34221e != f) {
                this.f34221e = f;
                y83 y83 = this.f34219c;
                if (y83 != null) {
                    ((nx3) y83).f36168b.m36781K();
                }
            }
        }
    }

    /* renamed from: a */
    public final float mo33052a() {
        return this.f34221e;
    }

    /* renamed from: b */
    public final int mo33053b(boolean z, int i) {
        m33882e();
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public final void mo33054d() {
        this.f34219c = null;
        m33882e();
    }
}
