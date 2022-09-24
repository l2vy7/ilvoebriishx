package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8979q;
import com.google.android.gms.internal.clearcut.C8986r;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.q */
public abstract class C8979q<MessageType extends C8979q<MessageType, BuilderType>, BuilderType extends C8986r<MessageType, BuilderType>> implements C8942l2 {
    private static boolean zzey = false;
    protected int zzex = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36895e(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo36898h() {
        throw new UnsupportedOperationException();
    }

    public final C8847a0 zzr() {
        try {
            C8890f0 r = C8847a0.m41492r(mo36891a());
            mo36893c(r.mo36890b());
            return r.mo36889a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
