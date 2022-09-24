package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class te2 implements zi2<ue2> {

    /* renamed from: a */
    private final nb3 f39407a;

    /* renamed from: b */
    private final Context f39408b;

    public te2(nb3 nb3, Context context) {
        this.f39407a = nb3;
        this.f39408b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ue2 mo34944a() throws Exception {
        AudioManager audioManager = (AudioManager) this.f39408b.getSystemService("audio");
        return new ue2(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }

    public final mb3<ue2> zzb() {
        return this.f39407a.mo33675b(new se2(this));
    }
}
