package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xx3 {

    /* renamed from: a */
    private final Context f41364a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f41365b;

    /* renamed from: c */
    private final sx3 f41366c;

    /* renamed from: d */
    private final AudioManager f41367d;

    /* renamed from: e */
    private vx3 f41368e;

    /* renamed from: f */
    private int f41369f = 3;

    /* renamed from: g */
    private int f41370g;

    /* renamed from: h */
    private boolean f41371h;

    public xx3(Context context, Handler handler, sx3 sx3) {
        Context applicationContext = context.getApplicationContext();
        this.f41364a = applicationContext;
        this.f41365b = handler;
        this.f41366c = sx3;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        nu1.m20743b(audioManager);
        this.f41367d = audioManager;
        this.f41370g = m39632g(audioManager, 3);
        this.f41371h = m39634i(audioManager, this.f41369f);
        vx3 vx3 = new vx3(this, (ux3) null);
        try {
            applicationContext.registerReceiver(vx3, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f41368e = vx3;
        } catch (RuntimeException e) {
            fc2.m20476b("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: g */
    private static int m39632g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            fc2.m20476b("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m39633h() {
        int g = m39632g(this.f41367d, this.f41369f);
        boolean i = m39634i(this.f41367d, this.f41369f);
        if (this.f41370g != g || this.f41371h != i) {
            this.f41370g = g;
            this.f41371h = i;
            Iterator it = ((nx3) this.f41366c).f36168b.f38334h.iterator();
            while (it.hasNext()) {
                ((m80) it.next()).mo18052i(g, i);
            }
        }
    }

    /* renamed from: i */
    private static boolean m39634i(AudioManager audioManager, int i) {
        if (d13.f20195a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m39632g(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final int mo35815a() {
        return this.f41367d.getStreamMaxVolume(this.f41369f);
    }

    /* renamed from: b */
    public final int mo35816b() {
        if (d13.f20195a >= 28) {
            return this.f41367d.getStreamMinVolume(this.f41369f);
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo35817e() {
        vx3 vx3 = this.f41368e;
        if (vx3 != null) {
            try {
                this.f41364a.unregisterReceiver(vx3);
            } catch (RuntimeException e) {
                fc2.m20476b("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f41368e = null;
        }
    }

    /* renamed from: f */
    public final void mo35818f(int i) {
        if (this.f41369f != 3) {
            this.f41369f = 3;
            m39633h();
            nx3 nx3 = (nx3) this.f41366c;
            b34 U = qx3.m36778H(nx3.f36168b.f38338l);
            if (!U.equals(nx3.f36168b.f38326F)) {
                nx3.f36168b.f38326F = U;
                Iterator it = nx3.f36168b.f38334h.iterator();
                while (it.hasNext()) {
                    ((m80) it.next()).mo18023I(U);
                }
            }
        }
    }
}
