package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ag0 extends NativeAd {

    /* renamed from: a */
    private final p50 f29627a;

    /* renamed from: b */
    private final List<NativeAd.Image> f29628b = new ArrayList();

    /* renamed from: c */
    private final zf0 f29629c;

    /* renamed from: d */
    private final NativeAd.AdChoicesInfo f29630d;

    /* renamed from: e */
    private final List<MuteThisAdReason> f29631e = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097 A[Catch:{ RemoteException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ag0(com.google.android.gms.internal.ads.p50 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f29628b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f29631e = r1
            r5.f29627a = r6
            r1 = 0
            java.util.List r6 = r6.mo33638n()     // Catch:{ RemoteException -> 0x0043 }
            if (r6 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0043 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0043 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0043 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0043 }
            if (r3 == 0) goto L_0x0035
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.q30 r2 = com.google.android.gms.internal.ads.p30.m35940n6(r2)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0036
        L_0x0035:
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.nativead.NativeAd$Image> r3 = r5.f29628b     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.zf0 r4 = new com.google.android.gms.internal.ads.zf0     // Catch:{ RemoteException -> 0x0043 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0043 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0020
        L_0x0043:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x0047:
            com.google.android.gms.internal.ads.p50 r6 = r5.f29627a     // Catch:{ RemoteException -> 0x0076 }
            java.util.List r6 = r6.zzv()     // Catch:{ RemoteException -> 0x0076 }
            if (r6 == 0) goto L_0x007a
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0076 }
        L_0x0053:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0076 }
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0068
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.internal.ads.rx r2 = com.google.android.gms.internal.ads.C8102qx.m36773n6(r2)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0069
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0053
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.f29631e     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.internal.ads.sx r4 = new com.google.android.gms.internal.ads.sx     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0076 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0053
        L_0x0076:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x007a:
            com.google.android.gms.internal.ads.p50 r6 = r5.f29627a     // Catch:{ RemoteException -> 0x0088 }
            com.google.android.gms.internal.ads.q30 r6 = r6.zzk()     // Catch:{ RemoteException -> 0x0088 }
            if (r6 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zf0 r2 = new com.google.android.gms.internal.ads.zf0     // Catch:{ RemoteException -> 0x0088 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x008c:
            r2 = r1
        L_0x008d:
            r5.f29629c = r2
            com.google.android.gms.internal.ads.p50 r6 = r5.f29627a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.i30 r6 = r6.zzi()     // Catch:{ RemoteException -> 0x00a4 }
            if (r6 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.xf0 r6 = new com.google.android.gms.internal.ads.xf0     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.p50 r2 = r5.f29627a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.i30 r2 = r2.zzi()     // Catch:{ RemoteException -> 0x00a4 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00a4 }
            r1 = r6
            goto L_0x00a8
        L_0x00a4:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x00a8:
            r5.f29630d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ag0.<init>(com.google.android.gms.internal.ads.p50):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28824a() {
        try {
            return this.f29627a.zzm();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f29627a.mo33641r();
        } catch (RemoteException e) {
            co0.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.f29627a.zzx();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.f29627a.zzC();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f29630d;
    }

    public final String getAdvertiser() {
        try {
            return this.f29627a.zzn();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.f29627a.zzo();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.f29627a.zzp();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle zzf = this.f29627a.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.f29627a.zzq();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f29629c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f29628b;
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.f29627a.zzj() != null) {
                return new C7556bz(this.f29627a.zzj());
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f29631e;
    }

    public final String getPrice() {
        try {
            return this.f29627a.zzs();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        C7663ey eyVar;
        try {
            eyVar = this.f29627a.zzg();
        } catch (RemoteException e) {
            co0.zzh("", e);
            eyVar = null;
        }
        return ResponseInfo.zza(eyVar);
    }

    public final Double getStarRating() {
        try {
            double zze = this.f29627a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.f29627a.zzt();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f29627a.mo33639q();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f29627a.mo33642t();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (this.f29627a.mo33642t()) {
                if (muteThisAdReason == null) {
                    try {
                        this.f29627a.mo33640q5((C8137rx) null);
                        return;
                    } catch (RemoteException e) {
                        co0.zzh("", e);
                        return;
                    }
                } else if (muteThisAdReason instanceof C8171sx) {
                    this.f29627a.mo33640q5(((C8171sx) muteThisAdReason).mo34826a());
                    return;
                } else {
                    co0.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                    return;
                }
            }
        } catch (RemoteException e2) {
            co0.zzh("", e2);
        }
        co0.zzg("Ad is not custom mute enabled");
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f29627a.mo33634V5(bundle);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.f29627a.zzA();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f29627a.mo33632K4(bundle);
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f29627a.mo33633S2(bundle);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f29627a.mo33635W2(new C8030ox(muteThisAdListener));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f29627a.mo33637k4(new C8139rz(onPaidEventListener));
        } catch (RemoteException e) {
            co0.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f29627a.mo33636b4(new jg0(unconfirmedClickListener));
        } catch (RemoteException e) {
            co0.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }
}
