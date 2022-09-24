package com.google.ads.interactivemedia.p039v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajc */
/* compiled from: IMASDK */
public final class ajc extends aja {

    /* renamed from: a */
    private final ContentResolver f15033a;

    /* renamed from: b */
    private Uri f15034b;

    /* renamed from: c */
    private AssetFileDescriptor f15035c;

    /* renamed from: d */
    private FileInputStream f15036d;

    /* renamed from: e */
    private long f15037e;

    /* renamed from: f */
    private boolean f15038f;

    public ajc(Context context) {
        super(false);
        this.f15033a = context.getContentResolver();
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws ajb {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f15037e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ajb(e);
            }
        }
        FileInputStream fileInputStream = this.f15036d;
        int i3 = amm.f15298a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f15037e;
        if (j2 != -1) {
            this.f15037e = j2 - ((long) read);
        }
        mo13798i(read);
        return read;
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws ajb {
        long j;
        try {
            Uri uri = ajk.f15056a;
            this.f15034b = uri;
            mo13796g(ajk);
            AssetFileDescriptor openAssetFileDescriptor = this.f15033a.openAssetFileDescriptor(uri, "r");
            this.f15035c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f15036d = fileInputStream;
                if (length != -1) {
                    if (ajk.f15060e > length) {
                        throw new ajh();
                    }
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(ajk.f15060e + startOffset) - startOffset;
                if (skip == ajk.f15060e) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f15037e = -1;
                            j = -1;
                        } else {
                            j = size - channel.position();
                            this.f15037e = j;
                            if (j < 0) {
                                throw new ajh();
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.f15037e = j2;
                        if (j2 >= 0) {
                            j = j2;
                        } else {
                            throw new ajh();
                        }
                    }
                    long j3 = ajk.f15061f;
                    if (j3 != -1) {
                        if (j != -1) {
                            j3 = Math.min(j, j3);
                        }
                        this.f15037e = j3;
                    }
                    this.f15038f = true;
                    mo13797h(ajk);
                    long j4 = ajk.f15061f;
                    return j4 != -1 ? j4 : this.f15037e;
                }
                throw new ajh();
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new ajb(e);
        }
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f15034b;
    }

    /* renamed from: f */
    public final void mo13299f() throws ajb {
        this.f15034b = null;
        try {
            FileInputStream fileInputStream = this.f15036d;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f15036d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f15035c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f15035c = null;
                if (this.f15038f) {
                    this.f15038f = false;
                    mo13799j();
                }
            } catch (IOException e) {
                throw new ajb(e);
            } catch (Throwable th) {
                this.f15035c = null;
                if (this.f15038f) {
                    this.f15038f = false;
                    mo13799j();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ajb(e2);
        } catch (Throwable th2) {
            this.f15036d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f15035c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f15035c = null;
                if (this.f15038f) {
                    this.f15038f = false;
                    mo13799j();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ajb(e3);
            } catch (Throwable th3) {
                this.f15035c = null;
                if (this.f15038f) {
                    this.f15038f = false;
                    mo13799j();
                }
                throw th3;
            }
        }
    }
}
