package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.f7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C7673f7 implements C7710g7 {

    /* renamed from: b */
    private static final Logger f31656b = Logger.getLogger(C7673f7.class.getName());

    /* renamed from: a */
    final ThreadLocal<ByteBuffer> f31657a = new C7636e7(this);

    /* renamed from: a */
    public final C7821j7 mo31776a(gu3 gu3, C7857k7 k7Var) throws IOException {
        int v0;
        long j;
        long zzb = gu3.zzb();
        this.f31657a.get().rewind().limit(8);
        do {
            v0 = gu3.mo32295v0(this.f31657a.get());
            if (v0 == 8) {
                this.f31657a.get().rewind();
                long e = C7784i7.m33103e(this.f31657a.get());
                byte[] bArr = null;
                if (e >= 8 || e <= 1) {
                    byte[] bArr2 = new byte[4];
                    this.f31657a.get().get(bArr2);
                    try {
                        String str = new String(bArr2, C6540C.ISO88591_NAME);
                        if (e == 1) {
                            this.f31657a.get().limit(16);
                            gu3.mo32295v0(this.f31657a.get());
                            this.f31657a.get().position(8);
                            j = C7784i7.m33104f(this.f31657a.get()) - 16;
                        } else {
                            j = e == 0 ? gu3.zzc() - gu3.zzb() : e - 8;
                        }
                        if ("uuid".equals(str)) {
                            this.f31657a.get().limit(this.f31657a.get().limit() + 16);
                            gu3.mo32295v0(this.f31657a.get());
                            bArr = new byte[16];
                            for (int position = this.f31657a.get().position() - 16; position < this.f31657a.get().position(); position++) {
                                bArr[position - (this.f31657a.get().position() - 16)] = this.f31657a.get().get(position);
                            }
                            j -= 16;
                        }
                        long j2 = j;
                        C7821j7 b = mo31777b(str, bArr, k7Var instanceof C7821j7 ? ((C7821j7) k7Var).zza() : "");
                        b.mo30506c(k7Var);
                        this.f31657a.get().rewind();
                        b.mo30508e(gu3, this.f31657a.get(), j2, this);
                        return b;
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    Logger logger = f31656b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (v0 >= 0);
        gu3.mo32294a(zzb);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract C7821j7 mo31777b(String str, byte[] bArr, String str2);
}
