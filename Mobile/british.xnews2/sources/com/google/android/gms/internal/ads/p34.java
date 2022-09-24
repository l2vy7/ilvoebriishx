package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class p34 implements z34 {

    /* renamed from: a */
    public static final /* synthetic */ p34 f37323a = new p34();

    private /* synthetic */ p34() {
    }

    public final int zza(Object obj) {
        int i = a44.f29530d;
        String str = ((j34) obj).f33740a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (d13.f20195a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
