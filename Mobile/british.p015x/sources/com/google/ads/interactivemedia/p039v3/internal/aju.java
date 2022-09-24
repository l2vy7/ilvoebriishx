package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aju */
/* compiled from: IMASDK */
public final class aju extends aja {

    /* renamed from: a */
    private RandomAccessFile f15119a;

    /* renamed from: b */
    private Uri f15120b;

    /* renamed from: c */
    private long f15121c;

    /* renamed from: d */
    private boolean f15122d;

    public aju() {
        super(false);
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws ajt {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f15121c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f15119a;
            int i3 = amm.f15298a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f15121c -= (long) read;
                mo13798i(read);
            }
            return read;
        } catch (IOException e) {
            throw new ajt(e);
        }
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws ajt {
        Uri uri;
        try {
            uri = ajk.f15056a;
            this.f15120b = uri;
            mo13796g(ajk);
            String path = uri.getPath();
            aup.m14890u(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f15119a = randomAccessFile;
            randomAccessFile.seek(ajk.f15060e);
            long j = ajk.f15061f;
            if (j == -1) {
                j = this.f15119a.length() - ajk.f15060e;
            }
            this.f15121c = j;
            if (j >= 0) {
                this.f15122d = true;
                mo13797h(ajk);
                return this.f15121c;
            }
            throw new ajh();
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getFragment())) {
                    throw new ajt(e);
                }
            }
            throw new ajt(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e);
        } catch (IOException e2) {
            throw new ajt(e2);
        }
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f15120b;
    }

    /* renamed from: f */
    public final void mo13299f() throws ajt {
        this.f15120b = null;
        try {
            RandomAccessFile randomAccessFile = this.f15119a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f15119a = null;
            if (this.f15122d) {
                this.f15122d = false;
                mo13799j();
            }
        } catch (IOException e) {
            throw new ajt(e);
        } catch (Throwable th) {
            this.f15119a = null;
            if (this.f15122d) {
                this.f15122d = false;
                mo13799j();
            }
            throw th;
        }
    }
}
