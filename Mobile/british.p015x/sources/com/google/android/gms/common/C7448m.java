package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7429s1;
import com.google.android.gms.common.internal.C7432t1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p199d5.C10487a;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.common.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C7448m extends C7429s1 {

    /* renamed from: b */
    private final int f29398b;

    protected C7448m(byte[] bArr) {
        C4604n.m20088a(bArr.length == 25);
        this.f29398b = Arrays.hashCode(bArr);
    }

    /* renamed from: f3 */
    protected static byte[] m30102f3(String str) {
        try {
            return str.getBytes(C6540C.ISO88591_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        C10487a zzd;
        if (obj != null && (obj instanceof C7432t1)) {
            try {
                C7432t1 t1Var = (C7432t1) obj;
                if (t1Var.zzc() != this.f29398b || (zzd = t1Var.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(mo30190m6(), (byte[]) C10489b.m48194f3(zzd));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29398b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m6 */
    public abstract byte[] mo30190m6();

    public final int zzc() {
        return this.f29398b;
    }

    public final C10487a zzd() {
        return C10489b.m48195m6(mo30190m6());
    }
}
