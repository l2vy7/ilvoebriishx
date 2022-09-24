package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qq0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: b */
    private final AudioManager f38243b;

    /* renamed from: c */
    private final pq0 f38244c;

    /* renamed from: d */
    private boolean f38245d;

    /* renamed from: e */
    private boolean f38246e;

    /* renamed from: f */
    private boolean f38247f;

    /* renamed from: g */
    private float f38248g = 1.0f;

    public qq0(Context context, pq0 pq0) {
        this.f38243b = (AudioManager) context.getSystemService("audio");
        this.f38244c = pq0;
    }

    /* renamed from: f */
    private final void m36605f() {
        boolean z = false;
        if (!this.f38246e || this.f38247f || this.f38248g <= 0.0f) {
            if (this.f38245d) {
                AudioManager audioManager = this.f38243b;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f38245d = z;
                }
                this.f38244c.zzn();
            }
        } else if (!this.f38245d) {
            AudioManager audioManager2 = this.f38243b;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f38245d = z;
            }
            this.f38244c.zzn();
        }
    }

    /* renamed from: a */
    public final float mo34396a() {
        float f = this.f38247f ? 0.0f : this.f38248g;
        if (this.f38245d) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo34397b() {
        this.f38246e = true;
        m36605f();
    }

    /* renamed from: c */
    public final void mo34398c() {
        this.f38246e = false;
        m36605f();
    }

    /* renamed from: d */
    public final void mo34399d(boolean z) {
        this.f38247f = z;
        m36605f();
    }

    /* renamed from: e */
    public final void mo34400e(float f) {
        this.f38248g = f;
        m36605f();
    }

    public final void onAudioFocusChange(int i) {
        this.f38245d = i > 0;
        this.f38244c.zzn();
    }
}
