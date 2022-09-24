package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.internal.ads.gq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7728gq {

    /* renamed from: a */
    private final C7913lq f32391a;
    @GuardedBy("this")

    /* renamed from: b */
    private final C8274vr f32392b;

    /* renamed from: c */
    private final boolean f32393c;

    private C7728gq() {
        this.f32392b = C8307wr.m39240H();
        this.f32393c = false;
        this.f32391a = new C7913lq();
    }

    /* renamed from: a */
    public static C7728gq m32636a() {
        return new C7728gq();
    }

    /* renamed from: d */
    private final synchronized String m32637d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f32392b.mo35472O(), Long.valueOf(zzt.zzA().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((C8307wr) this.f32392b.mo32424p()).mo33365g(), 3)});
    }

    /* renamed from: e */
    private final synchronized void m32638e(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m32637d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    private final synchronized void m32639f(int i) {
        C8274vr vrVar = this.f32392b;
        vrVar.mo35465H();
        List<String> b = p00.m35912b();
        ArrayList arrayList = new ArrayList();
        for (String split : b) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        vrVar.mo35464C(arrayList);
        C7876kq kqVar = new C7876kq(this.f32391a, ((C8307wr) this.f32392b.mo32424p()).mo33365g(), (C7839jq) null);
        int i2 = i - 1;
        kqVar.mo33149a(i2);
        kqVar.mo33150b();
        String valueOf2 = String.valueOf(Integer.toString(i2, 10));
        zze.zza(valueOf2.length() != 0 ? "Logging Event with event code : ".concat(valueOf2) : new String("Logging Event with event code : "));
    }

    /* renamed from: b */
    public final synchronized void mo32216b(C7692fq fqVar) {
        if (this.f32393c) {
            try {
                fqVar.mo31667a(this.f32392b);
            } catch (NullPointerException e) {
                zzt.zzo().mo18592s(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo32217c(int i) {
        if (this.f32393c) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37237w3)).booleanValue()) {
                m32638e(i);
            } else {
                m32639f(i);
            }
        }
    }

    public C7728gq(C7913lq lqVar) {
        this.f32392b = C8307wr.m39240H();
        this.f32391a = lqVar;
        this.f32393c = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37229v3)).booleanValue();
    }
}
