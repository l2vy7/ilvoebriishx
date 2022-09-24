package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c84 extends va1 {

    /* renamed from: e */
    private final AssetManager f30282e;

    /* renamed from: f */
    private Uri f30283f;

    /* renamed from: g */
    private InputStream f30284g;

    /* renamed from: h */
    private long f30285h;

    /* renamed from: i */
    private boolean f30286i;

    public c84(Context context) {
        super(false);
        this.f30282e = context.getAssets();
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws b84 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f30285h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new b84(e, 2000);
            }
        }
        InputStream inputStream = this.f30284g;
        int i3 = d13.f20195a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f30285h;
        if (j2 != -1) {
            this.f30285h = j2 - ((long) read);
        }
        mo35395j(read);
        return read;
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws b84 {
        try {
            Uri uri = ci1.f30390a;
            this.f30283f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo35397l(ci1);
            InputStream open = this.f30282e.open(path, 1);
            this.f30284g = open;
            if (open.skip(ci1.f30395f) >= ci1.f30395f) {
                long j = ci1.f30396g;
                if (j != -1) {
                    this.f30285h = j;
                } else {
                    long available = (long) this.f30284g.available();
                    this.f30285h = available;
                    if (available == 2147483647L) {
                        this.f30285h = -1;
                    }
                }
                this.f30286i = true;
                mo35398m(ci1);
                return this.f30285h;
            }
            throw new b84((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (b84 e) {
            throw e;
        } catch (IOException e2) {
            throw new b84(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    public final Uri zzi() {
        return this.f30283f;
    }

    public final void zzj() throws b84 {
        this.f30283f = null;
        try {
            InputStream inputStream = this.f30284g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f30284g = null;
            if (this.f30286i) {
                this.f30286i = false;
                mo35396k();
            }
        } catch (IOException e) {
            throw new b84(e, 2000);
        } catch (Throwable th) {
            this.f30284g = null;
            if (this.f30286i) {
                this.f30286i = false;
                mo35396k();
            }
            throw th;
        }
    }
}
