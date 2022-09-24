package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x80 implements C7967n5 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile l80 f41070a;

    /* renamed from: b */
    private final Context f41071b;

    public x80(Context context) {
        this.f41071b = context;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m39399b(x80 x80) {
        if (x80.f41070a != null) {
            x80.f41070a.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final C8074q5 zza(C8215u5<?> u5Var) throws C7635e6 {
        Parcelable.Creator<zzbta> creator = zzbta.CREATOR;
        Map<String, String> zzl = u5Var.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry next : zzl.entrySet()) {
            strArr[i2] = (String) next.getKey();
            strArr2[i2] = (String) next.getValue();
            i2++;
        }
        zzbta zzbta = new zzbta(u5Var.zzk(), strArr, strArr2);
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        try {
            uo0 uo0 = new uo0();
            this.f41070a = new l80(this.f41071b, zzt.zzt().zzb(), new v80(this, uo0), new w80(this, uo0));
            this.f41070a.checkAvailabilityAndConnect();
            t80 t80 = new t80(this, zzbta);
            nb3 nb3 = po0.f37722a;
            mb3 o = bb3.m30655o(bb3.m30654n(uo0, t80, nb3), (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37034Z2)).intValue(), TimeUnit.MILLISECONDS, po0.f37725d);
            o.zzc(new u80(this), nb3);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            long elapsedRealtime2 = zzt.zzA().elapsedRealtime();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2 - elapsedRealtime);
            sb.append("ms");
            zze.zza(sb.toString());
            zzbtc zzbtc = (zzbtc) new zzcdo(parcelFileDescriptor).mo36264C0(zzbtc.CREATOR);
            if (zzbtc == null) {
                return null;
            }
            if (zzbtc.f43004b) {
                throw new C7635e6(zzbtc.f43005c);
            } else if (zzbtc.f43008f.length != zzbtc.f43009g.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbtc.f43008f;
                    if (i >= strArr3.length) {
                        return new C8074q5(zzbtc.f43006d, zzbtc.f43007e, (Map<String, String>) hashMap, zzbtc.f43010h, zzbtc.f43011i);
                    }
                    hashMap.put(strArr3[i], zzbtc.f43009g[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = zzt.zzA().elapsedRealtime();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3 - elapsedRealtime);
            sb2.append("ms");
            zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = zzt.zzA().elapsedRealtime();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4 - elapsedRealtime);
            sb3.append("ms");
            zze.zza(sb3.toString());
            throw th;
        }
    }
}
