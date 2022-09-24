package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import java.util.ArrayList;
import java.util.List;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class q50 extends UnifiedNativeAd {

    /* renamed from: a */
    private final p50 f37867a;

    /* renamed from: b */
    private final List<NativeAd.Image> f37868b = new ArrayList();

    /* renamed from: c */
    private final r30 f37869c;

    /* renamed from: d */
    private final VideoController f37870d = new VideoController();

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f37871e;

    /* renamed from: f */
    private final List<MuteThisAdReason> f37872f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[Catch:{ RemoteException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q50(com.google.android.gms.internal.ads.p50 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f37868b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f37870d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f37872f = r1
            r5.f37867a = r6
            r1 = 0
            java.util.List r6 = r6.mo33638n()     // Catch:{ RemoteException -> 0x005b }
            if (r6 == 0) goto L_0x005f
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005b }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005b }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005b }
            if (r3 == 0) goto L_0x004d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005b }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.q30     // Catch:{ RemoteException -> 0x005b }
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.q30 r3 = (com.google.android.gms.internal.ads.q30) r3     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x0047:
            com.google.android.gms.internal.ads.o30 r3 = new com.google.android.gms.internal.ads.o30     // Catch:{ RemoteException -> 0x005b }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f37868b     // Catch:{ RemoteException -> 0x005b }
            com.google.android.gms.internal.ads.r30 r4 = new com.google.android.gms.internal.ads.r30     // Catch:{ RemoteException -> 0x005b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005b }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0027
        L_0x005b:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x005f:
            com.google.android.gms.internal.ads.p50 r6 = r5.f37867a     // Catch:{ RemoteException -> 0x008e }
            java.util.List r6 = r6.zzv()     // Catch:{ RemoteException -> 0x008e }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008e }
        L_0x006b:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008e }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008e }
            if (r3 == 0) goto L_0x0080
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.internal.ads.rx r2 = com.google.android.gms.internal.ads.C8102qx.m36773n6(r2)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x006b
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.f37872f     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.internal.ads.sx r4 = new com.google.android.gms.internal.ads.sx     // Catch:{ RemoteException -> 0x008e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x0092:
            com.google.android.gms.internal.ads.p50 r6 = r5.f37867a     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.gms.internal.ads.q30 r6 = r6.zzk()     // Catch:{ RemoteException -> 0x00a0 }
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.r30 r2 = new com.google.android.gms.internal.ads.r30     // Catch:{ RemoteException -> 0x00a0 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x00a4:
            r2 = r1
        L_0x00a5:
            r5.f37869c = r2
            com.google.android.gms.internal.ads.p50 r6 = r5.f37867a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.i30 r6 = r6.zzi()     // Catch:{ RemoteException -> 0x00bc }
            if (r6 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.j30 r6 = new com.google.android.gms.internal.ads.j30     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.p50 r2 = r5.f37867a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.i30 r2 = r2.zzi()     // Catch:{ RemoteException -> 0x00bc }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bc }
            r1 = r6
            goto L_0x00c0
        L_0x00bc:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzh(r0, r6)
        L_0x00c0:
            r5.f37871e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q50.<init>(com.google.android.gms.internal.ads.p50):void");
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f37867a.mo33641r();
        } catch (RemoteException e) {
            co0.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.f37867a.zzx();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.f37867a.zzC();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f37871e;
    }

    public final String getAdvertiser() {
        try {
            return this.f37867a.zzn();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.f37867a.zzo();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.f37867a.zzp();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle zzf = this.f37867a.zzf();
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
            return this.f37867a.zzq();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f37869c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f37868b;
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.f37867a.zzj() != null) {
                return new C7556bz(this.f37867a.zzj());
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.f37867a.zzr();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f37872f;
    }

    public final String getPrice() {
        try {
            return this.f37867a.zzs();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        C7663ey eyVar;
        try {
            eyVar = this.f37867a.zzg();
        } catch (RemoteException e) {
            co0.zzh("", e);
            eyVar = null;
        }
        return ResponseInfo.zza(eyVar);
    }

    public final Double getStarRating() {
        try {
            double zze = this.f37867a.zze();
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
            return this.f37867a.zzt();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f37867a.zzh() != null) {
                this.f37870d.zzb(this.f37867a.zzh());
            }
        } catch (RemoteException e) {
            co0.zzh("Exception occurred while getting video controller", e);
        }
        return this.f37870d;
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f37867a.mo33639q();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f37867a.mo33642t();
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (this.f37867a.mo33642t()) {
                if (muteThisAdReason == null) {
                    try {
                        this.f37867a.mo33640q5((C8137rx) null);
                        return;
                    } catch (RemoteException e) {
                        co0.zzh("", e);
                        return;
                    }
                } else if (muteThisAdReason instanceof C8171sx) {
                    this.f37867a.mo33640q5(((C8171sx) muteThisAdReason).mo34826a());
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
            this.f37867a.mo33634V5(bundle);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.f37867a.zzA();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f37867a.mo33632K4(bundle);
        } catch (RemoteException e) {
            co0.zzh("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f37867a.mo33633S2(bundle);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f37867a.mo33635W2(new C8030ox(muteThisAdListener));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f37867a.mo33637k4(new C8139rz(onPaidEventListener));
        } catch (RemoteException e) {
            co0.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f37867a.mo33636b4(new b60(unconfirmedClickListener));
        } catch (RemoteException e) {
            co0.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final Object zza() {
        try {
            C10487a zzl = this.f37867a.zzl();
            if (zzl != null) {
                return C10489b.m48194f3(zzl);
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("", e);
            return null;
        }
    }
}
