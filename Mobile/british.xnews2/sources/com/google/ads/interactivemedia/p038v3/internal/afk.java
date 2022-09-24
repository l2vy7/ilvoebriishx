package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afk */
/* compiled from: IMASDK */
final class afk implements ajg {

    /* renamed from: a */
    private final ajg f14522a;

    /* renamed from: b */
    private final byte[] f14523b;

    /* renamed from: c */
    private final byte[] f14524c;

    /* renamed from: d */
    private CipherInputStream f14525d;

    public afk(ajg ajg, byte[] bArr, byte[] bArr2) {
        this.f14522a = ajg;
        this.f14523b = bArr;
        this.f14524c = bArr2;
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws IOException {
        aup.m14890u(this.f14525d);
        int read = this.f14525d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    /* renamed from: b */
    public final void mo13295b(akp akp) {
        aup.m14890u(akp);
        this.f14522a.mo13295b(akp);
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f14523b, "AES"), new IvParameterSpec(this.f14524c));
                aji aji = new aji(this.f14522a, ajk);
                this.f14525d = new CipherInputStream(aji, instance);
                aji.mo13801a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f14522a.mo13297d();
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo13298e() {
        return this.f14522a.mo13298e();
    }

    /* renamed from: f */
    public final void mo13299f() throws IOException {
        if (this.f14525d != null) {
            this.f14525d = null;
            this.f14522a.mo13299f();
        }
    }
}
