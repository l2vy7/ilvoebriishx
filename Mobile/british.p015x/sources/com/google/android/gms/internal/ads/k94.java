package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k94 extends va1 {

    /* renamed from: e */
    private final Resources f34204e;

    /* renamed from: f */
    private final String f34205f;

    /* renamed from: g */
    private Uri f34206g;

    /* renamed from: h */
    private AssetFileDescriptor f34207h;

    /* renamed from: i */
    private InputStream f34208i;

    /* renamed from: j */
    private long f34209j;

    /* renamed from: k */
    private boolean f34210k;

    public k94(Context context) {
        super(false);
        this.f34204e = context.getResources();
        this.f34205f = context.getPackageName();
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws j94 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f34209j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new j94((String) null, e, 2000);
            }
        }
        InputStream inputStream = this.f34208i;
        int i3 = d13.f20195a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f34209j;
            if (j2 != -1) {
                this.f34209j = j2 - ((long) read);
            }
            mo35395j(read);
            return read;
        } else if (this.f34209j == -1) {
            return -1;
        } else {
            throw new j94("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r1.matches("\\d+") != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30478i(com.google.android.gms.internal.ads.ci1 r15) throws com.google.android.gms.internal.ads.j94 {
        /*
            r14 = this;
            android.net.Uri r0 = r15.f30390a
            r14.f34206g = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 2005(0x7d5, float:2.81E-42)
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = r0.getScheme()
            java.lang.String r6 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r6, r1)
            if (r1 == 0) goto L_0x003c
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r4) goto L_0x003c
            java.lang.String r1 = r0.getLastPathSegment()
            java.util.Objects.requireNonNull(r1)
            java.lang.String r7 = "\\d+"
            boolean r1 = r1.matches(r7)
            if (r1 == 0) goto L_0x003c
            goto L_0x00a5
        L_0x003c:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r6, r1)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r0.getPath()
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = r1.substring(r4)
        L_0x0059:
            java.lang.String r3 = r0.getHost()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0066
            java.lang.String r3 = ""
            goto L_0x0070
        L_0x0066:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = ":"
            java.lang.String r3 = r3.concat(r6)
        L_0x0070:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            if (r6 == 0) goto L_0x0083
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0088
        L_0x0083:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0088:
            android.content.res.Resources r3 = r14.f34204e
            java.lang.String r6 = r14.f34205f
            java.lang.String r7 = "raw"
            int r1 = r3.getIdentifier(r1, r7, r6)
            if (r1 == 0) goto L_0x0095
            goto L_0x00b0
        L_0x0095:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94
            java.lang.String r0 = "Resource not found."
            r15.<init>(r0, r5, r2)
            throw r15
        L_0x009d:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r15.<init>(r0, r5, r3)
            throw r15
        L_0x00a5:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0173 }
            java.util.Objects.requireNonNull(r1)
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0173 }
        L_0x00b0:
            r14.mo35397l(r15)
            android.content.res.Resources r3 = r14.f34204e     // Catch:{ NotFoundException -> 0x016c }
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)     // Catch:{ NotFoundException -> 0x016c }
            r14.f34207h = r1
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r1 == 0) goto L_0x015c
            long r6 = r1.getLength()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r3 = r1.getFileDescriptor()
            r0.<init>(r3)
            r14.f34208i = r0
            r3 = 2008(0x7d8, float:2.814E-42)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00e3
            long r10 = r15.f30395f     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 > 0) goto L_0x00dd
            goto L_0x00e3
        L_0x00dd:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            r15.<init>(r5, r5, r3)     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            throw r15     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
        L_0x00e3:
            long r10 = r1.getStartOffset()     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            long r12 = r15.f30395f     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            long r12 = r12 + r10
            long r12 = r0.skip(r12)     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            long r12 = r12 - r10
            long r10 = r15.f30395f     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x014d
            r10 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0121
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            long r6 = r0.size()     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x010b
            r14.f34209j = r8     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            r6 = r8
            goto L_0x0128
        L_0x010b:
            long r6 = r0.size()     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            long r0 = r0.position()     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            long r6 = r6 - r0
            r14.f34209j = r6     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x011b
            goto L_0x0128
        L_0x011b:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            r15.<init>(r5, r5, r3)     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            throw r15     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
        L_0x0121:
            long r6 = r6 - r12
            r14.f34209j = r6     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0147
        L_0x0128:
            long r0 = r15.f30396g
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0138
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            long r0 = java.lang.Math.min(r6, r0)
        L_0x0136:
            r14.f34209j = r0
        L_0x0138:
            r14.f34210k = r4
            r14.mo35398m(r15)
            long r0 = r15.f30396g
            int r15 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x0144
            return r0
        L_0x0144:
            long r0 = r14.f34209j
            return r0
        L_0x0147:
            com.google.android.gms.internal.ads.ze1 r15 = new com.google.android.gms.internal.ads.ze1     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            r15.<init>(r3)     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            throw r15     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
        L_0x014d:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            r15.<init>(r5, r5, r3)     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
            throw r15     // Catch:{ j94 -> 0x015a, IOException -> 0x0153 }
        L_0x0153:
            r15 = move-exception
            com.google.android.gms.internal.ads.j94 r0 = new com.google.android.gms.internal.ads.j94
            r0.<init>(r5, r15, r2)
            throw r0
        L_0x015a:
            r15 = move-exception
            throw r15
        L_0x015c:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Resource is compressed: "
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0, r5, r2)
            throw r15
        L_0x016c:
            r15 = move-exception
            com.google.android.gms.internal.ads.j94 r0 = new com.google.android.gms.internal.ads.j94
            r0.<init>(r5, r15, r2)
            throw r0
        L_0x0173:
            com.google.android.gms.internal.ads.j94 r15 = new com.google.android.gms.internal.ads.j94
            java.lang.String r0 = "Resource identifier must be an integer."
            r15.<init>(r0, r5, r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k94.mo30478i(com.google.android.gms.internal.ads.ci1):long");
    }

    public final Uri zzi() {
        return this.f34206g;
    }

    public final void zzj() throws j94 {
        this.f34206g = null;
        try {
            InputStream inputStream = this.f34208i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f34208i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f34207h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f34207h = null;
                if (this.f34210k) {
                    this.f34210k = false;
                    mo35396k();
                }
            } catch (IOException e) {
                throw new j94((String) null, e, 2000);
            } catch (Throwable th) {
                this.f34207h = null;
                if (this.f34210k) {
                    this.f34210k = false;
                    mo35396k();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new j94((String) null, e2, 2000);
        } catch (Throwable th2) {
            this.f34208i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f34207h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f34207h = null;
                if (this.f34210k) {
                    this.f34210k = false;
                    mo35396k();
                }
                throw th2;
            } catch (IOException e3) {
                throw new j94((String) null, e3, 2000);
            } catch (Throwable th3) {
                this.f34207h = null;
                if (this.f34210k) {
                    this.f34210k = false;
                    mo35396k();
                }
                throw th3;
            }
        }
    }
}
