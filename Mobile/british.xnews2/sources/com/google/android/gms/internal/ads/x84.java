package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x84 extends va1 {

    /* renamed from: e */
    private RandomAccessFile f41086e;

    /* renamed from: f */
    private Uri f41087f;

    /* renamed from: g */
    private long f41088g;

    /* renamed from: h */
    private boolean f41089h;

    public x84() {
        super(false);
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws w84 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f41088g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f41086e;
            int i3 = d13.f20195a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f41088g -= (long) read;
                mo35395j(read);
            }
            return read;
        } catch (IOException e) {
            throw new w84(e, 2000);
        }
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws w84 {
        Uri uri = ci1.f30390a;
        this.f41087f = uri;
        mo35397l(ci1);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f41086e = randomAccessFile;
            try {
                randomAccessFile.seek(ci1.f30395f);
                long j = ci1.f30396g;
                if (j == -1) {
                    j = this.f41086e.length() - ci1.f30395f;
                }
                this.f41088g = j;
                if (j >= 0) {
                    this.f41089h = true;
                    mo35398m(ci1);
                    return this.f41088g;
                }
                throw new w84((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e) {
                throw new w84(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new w84(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (d13.f20195a < 21 || !v84.m38749b(e2.getCause())) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new w84(e2, i);
        } catch (SecurityException e3) {
            throw new w84(e3, 2006);
        } catch (RuntimeException e4) {
            throw new w84(e4, 2000);
        }
    }

    public final Uri zzi() {
        return this.f41087f;
    }

    public final void zzj() throws w84 {
        this.f41087f = null;
        try {
            RandomAccessFile randomAccessFile = this.f41086e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f41086e = null;
            if (this.f41089h) {
                this.f41089h = false;
                mo35396k();
            }
        } catch (IOException e) {
            throw new w84(e, 2000);
        } catch (Throwable th) {
            this.f41086e = null;
            if (this.f41089h) {
                this.f41089h = false;
                mo35396k();
            }
            throw th;
        }
    }
}
