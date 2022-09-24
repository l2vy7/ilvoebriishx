package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.is */
/* compiled from: IMASDK */
final class C4080is {

    /* renamed from: a */
    private final AudioManager f17441a;

    /* renamed from: b */
    private final C4078iq f17442b;

    /* renamed from: c */
    private C4079ir f17443c;

    /* renamed from: d */
    private C4210nn f17444d;

    /* renamed from: e */
    private int f17445e;

    /* renamed from: f */
    private int f17446f;

    /* renamed from: g */
    private float f17447g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f17448h;

    public C4080is(Context context, Handler handler, C4079ir irVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        aup.m14890u(audioManager);
        this.f17441a = audioManager;
        this.f17443c = irVar;
        this.f17442b = new C4078iq(this, handler);
        this.f17445e = 0;
    }

    /* renamed from: e */
    static /* synthetic */ void m17404e(C4080is isVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                isVar.m17406g(3);
                return;
            }
            isVar.m17407h(0);
            isVar.m17406g(2);
        } else if (i == -1) {
            isVar.m17407h(-1);
            isVar.m17405f();
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        } else {
            isVar.m17406g(1);
            isVar.m17407h(1);
        }
    }

    /* renamed from: f */
    private final void m17405f() {
        if (this.f17445e != 0) {
            if (amm.f15298a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f17448h;
                if (audioFocusRequest != null) {
                    this.f17441a.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                this.f17441a.abandonAudioFocus(this.f17442b);
            }
            m17406g(0);
        }
    }

    /* renamed from: g */
    private final void m17406g(int i) {
        if (this.f17445e != i) {
            this.f17445e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f17447g != f) {
                this.f17447g = f;
                C4079ir irVar = this.f17443c;
                if (irVar != null) {
                    ((C4161ls) irVar).f17873a.m18019Y(1, 2, Float.valueOf(((C4161ls) irVar).f17873a.f17900y * ((C4161ls) irVar).f17873a.f17886k.mo15931a()));
                }
            }
        }
    }

    /* renamed from: h */
    private final void m17407h(int i) {
        C4079ir irVar = this.f17443c;
        if (irVar != null) {
            C4161ls lsVar = (C4161ls) irVar;
            boolean l = lsVar.f17873a.mo16305l();
            lsVar.f17873a.m18017W(l, i, C4162lt.m18021aa(l, i));
        }
    }

    /* renamed from: a */
    public final float mo15931a() {
        return this.f17447g;
    }

    /* renamed from: b */
    public final void mo15932b(C4210nn nnVar) {
        if (!amm.m14233c((Object) null, (Object) null)) {
            this.f17444d = null;
            this.f17446f = 0;
            aup.m14886q(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: c */
    public final int mo15933c(boolean z, int i) {
        int i2;
        if (i == 1 || this.f17446f != 1) {
            m17405f();
            return z ? 1 : -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.f17445e != 1) {
                if (amm.f15298a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f17448h;
                    if (audioFocusRequest != null) {
                        i2 = this.f17441a.requestAudioFocus(audioFocusRequest);
                    } else {
                        new AudioFocusRequest.Builder(this.f17446f);
                        aup.m14890u(null);
                        throw null;
                    }
                } else {
                    AudioManager audioManager = this.f17441a;
                    C4078iq iqVar = this.f17442b;
                    aup.m14890u(null);
                    i2 = audioManager.requestAudioFocus(iqVar, 3, this.f17446f);
                }
                if (i2 == 1) {
                    m17406g(1);
                } else {
                    m17406g(0);
                    return -1;
                }
            }
            return 1;
        }
    }

    /* renamed from: d */
    public final void mo15934d() {
        this.f17443c = null;
        m17405f();
    }
}
