package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ee4 {

    /* renamed from: a */
    private final ByteArrayOutputStream f31340a;

    /* renamed from: b */
    private final DataOutputStream f31341b;

    public ee4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f31340a = byteArrayOutputStream;
        this.f31341b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m31798b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] mo31551a(zzyw zzyw) {
        this.f31340a.reset();
        try {
            m31798b(this.f31341b, zzyw.f43073b);
            String str = zzyw.f43074c;
            if (str == null) {
                str = "";
            }
            m31798b(this.f31341b, str);
            this.f31341b.writeLong(zzyw.f43075d);
            this.f31341b.writeLong(zzyw.f43076e);
            this.f31341b.write(zzyw.f43077f);
            this.f31341b.flush();
            return this.f31340a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
