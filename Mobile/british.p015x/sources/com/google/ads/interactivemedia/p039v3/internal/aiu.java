package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiu */
/* compiled from: IMASDK */
public final class aiu extends aja {

    /* renamed from: a */
    private final AssetManager f15015a;

    /* renamed from: b */
    private Uri f15016b;

    /* renamed from: c */
    private InputStream f15017c;

    /* renamed from: d */
    private long f15018d;

    /* renamed from: e */
    private boolean f15019e;

    public aiu(Context context) {
        super(false);
        this.f15015a = context.getAssets();
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws ait {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f15018d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ait(e);
            }
        }
        InputStream inputStream = this.f15017c;
        int i3 = amm.f15298a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f15018d;
        if (j2 != -1) {
            this.f15018d = j2 - ((long) read);
        }
        mo13798i(read);
        return read;
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws ait {
        try {
            Uri uri = ajk.f15056a;
            this.f15016b = uri;
            String path = uri.getPath();
            aup.m14890u(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo13796g(ajk);
            InputStream open = this.f15015a.open(path, 1);
            this.f15017c = open;
            if (open.skip(ajk.f15060e) >= ajk.f15060e) {
                long j = ajk.f15061f;
                if (j != -1) {
                    this.f15018d = j;
                } else {
                    long available = (long) this.f15017c.available();
                    this.f15018d = available;
                    if (available == 2147483647L) {
                        this.f15018d = -1;
                    }
                }
                this.f15019e = true;
                mo13797h(ajk);
                return this.f15018d;
            }
            throw new ajh();
        } catch (IOException e) {
            throw new ait(e);
        }
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f15016b;
    }

    /* renamed from: f */
    public final void mo13299f() throws ait {
        this.f15016b = null;
        try {
            InputStream inputStream = this.f15017c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f15017c = null;
            if (this.f15019e) {
                this.f15019e = false;
                mo13799j();
            }
        } catch (IOException e) {
            throw new ait(e);
        } catch (Throwable th) {
            this.f15017c = null;
            if (this.f15019e) {
                this.f15019e = false;
                mo13799j();
            }
            throw th;
        }
    }
}
