package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C8591jb;
import com.google.android.gms.internal.cast.C8608kb;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.cast.kb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8608kb<MessageType extends C8608kb<MessageType, BuilderType>, BuilderType extends C8591jb<MessageType, BuilderType>> implements C8782vd {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo36567b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36568c(int i) {
        throw null;
    }

    public final C8796wb zzm() {
        try {
            int zzr = zzr();
            C8796wb wbVar = C8796wb.f44177c;
            byte[] bArr = new byte[zzr];
            C8509ec x = C8509ec.m40805x(bArr);
            mo36672a(x);
            x.mo36459c();
            return new C8765ub(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
