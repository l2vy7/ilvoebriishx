package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m84 extends va1 {

    /* renamed from: e */
    private final ContentResolver f35446e;

    /* renamed from: f */
    private Uri f35447f;

    /* renamed from: g */
    private AssetFileDescriptor f35448g;

    /* renamed from: h */
    private FileInputStream f35449h;

    /* renamed from: i */
    private long f35450i;

    /* renamed from: j */
    private boolean f35451j;

    public m84(Context context) {
        super(false);
        this.f35446e = context.getContentResolver();
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws l84 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f35450i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new l84(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f35449h;
        int i3 = d13.f20195a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f35450i;
        if (j2 != -1) {
            this.f35450i = j2 - ((long) read);
        }
        mo35395j(read);
        return read;
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws l84 {
        AssetFileDescriptor assetFileDescriptor;
        long j;
        int i = 2000;
        try {
            Uri uri = ci1.f30390a;
            this.f35447f = uri;
            mo35397l(ci1);
            if ("content".equals(ci1.f30390a.getScheme())) {
                Bundle bundle = new Bundle();
                if (d13.f20195a >= 31) {
                    k84.m33874a(bundle);
                }
                assetFileDescriptor = this.f35446e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f35446e.openAssetFileDescriptor(uri, "r");
            }
            this.f35448g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f35449h = fileInputStream;
                if (length != -1) {
                    if (ci1.f30395f > length) {
                        throw new l84((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(ci1.f30395f + startOffset) - startOffset;
                if (skip == ci1.f30395f) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f35450i = -1;
                            j = -1;
                        } else {
                            j = size - channel.position();
                            this.f35450i = j;
                            if (j < 0) {
                                throw new l84((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.f35450i = j2;
                        if (j2 >= 0) {
                            j = j2;
                        } else {
                            throw new l84((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j3 = ci1.f30396g;
                    if (j3 != -1) {
                        if (j != -1) {
                            j3 = Math.min(j, j3);
                        }
                        this.f35450i = j3;
                    }
                    this.f35451j = true;
                    mo35398m(ci1);
                    long j4 = ci1.f30396g;
                    return j4 != -1 ? j4 : this.f35450i;
                }
                throw new l84((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new l84(new IOException(sb.toString()), 2000);
        } catch (l84 e) {
            throw e;
        } catch (IOException e2) {
            if (true == (e2 instanceof FileNotFoundException)) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new l84(e2, i);
        }
    }

    public final Uri zzi() {
        return this.f35447f;
    }

    public final void zzj() throws l84 {
        this.f35447f = null;
        try {
            FileInputStream fileInputStream = this.f35449h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f35449h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f35448g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f35448g = null;
                if (this.f35451j) {
                    this.f35451j = false;
                    mo35396k();
                }
            } catch (IOException e) {
                throw new l84(e, 2000);
            } catch (Throwable th) {
                this.f35448g = null;
                if (this.f35451j) {
                    this.f35451j = false;
                    mo35396k();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new l84(e2, 2000);
        } catch (Throwable th2) {
            this.f35449h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f35448g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f35448g = null;
                if (this.f35451j) {
                    this.f35451j = false;
                    mo35396k();
                }
                throw th2;
            } catch (IOException e3) {
                throw new l84(e3, 2000);
            } catch (Throwable th3) {
                this.f35448g = null;
                if (this.f35451j) {
                    this.f35451j = false;
                    mo35396k();
                }
                throw th3;
            }
        }
    }
}
