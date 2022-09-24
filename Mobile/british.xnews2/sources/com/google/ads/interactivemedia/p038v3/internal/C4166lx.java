package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lx */
/* compiled from: IMASDK */
final class C4166lx {

    /* renamed from: a */
    private final Context f17904a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f17905b;

    /* renamed from: c */
    private final C4163lu f17906c;

    /* renamed from: d */
    private final AudioManager f17907d;

    /* renamed from: e */
    private C4165lw f17908e;

    /* renamed from: f */
    private int f17909f = 3;

    /* renamed from: g */
    private int f17910g;

    /* renamed from: h */
    private boolean f17911h;

    public C4166lx(Context context, Handler handler, C4163lu luVar) {
        Context applicationContext = context.getApplicationContext();
        this.f17904a = applicationContext;
        this.f17905b = handler;
        this.f17906c = luVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        aup.m14889t(audioManager);
        this.f17907d = audioManager;
        this.f17910g = m18055h(audioManager, 3);
        this.f17911h = m18056i(audioManager, this.f17909f);
        C4165lw lwVar = new C4165lw(this);
        try {
            applicationContext.registerReceiver(lwVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f17908e = lwVar;
        } catch (RuntimeException e) {
            ali.m14022a("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m18054g() {
        int h = m18055h(this.f17907d, this.f17909f);
        boolean i = m18056i(this.f17907d, this.f17909f);
        if (this.f17910g != h || this.f17911h != i) {
            this.f17910g = h;
            this.f17911h = i;
            Iterator it = ((C4161ls) this.f17906c).f17873a.f17883h.iterator();
            while (it.hasNext()) {
                ((C4272pv) it.next()).mo16528b();
            }
        }
    }

    /* renamed from: h */
    private static int m18055h(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            ali.m14022a("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: i */
    private static boolean m18056i(AudioManager audioManager, int i) {
        if (amm.f15298a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m18055h(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final void mo16310a(int i) {
        if (this.f17909f != 3) {
            this.f17909f = 3;
            m18054g();
            C4161ls lsVar = (C4161ls) this.f17906c;
            C4271pu M = C4162lt.m18020Z(lsVar.f17873a.f17887l);
            if (!M.equals(lsVar.f17873a.f17876C)) {
                lsVar.f17873a.f17876C = M;
                Iterator it = lsVar.f17873a.f17883h.iterator();
                while (it.hasNext()) {
                    ((C4272pv) it.next()).mo16527a();
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo16311b() {
        if (amm.f15298a >= 28) {
            return this.f17907d.getStreamMinVolume(this.f17909f);
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo16312c() {
        return this.f17907d.getStreamMaxVolume(this.f17909f);
    }

    /* renamed from: d */
    public final void mo16313d() {
        C4165lw lwVar = this.f17908e;
        if (lwVar != null) {
            try {
                this.f17904a.unregisterReceiver(lwVar);
            } catch (RuntimeException e) {
                ali.m14022a("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f17908e = null;
        }
    }
}
