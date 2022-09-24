package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akn */
/* compiled from: IMASDK */
public final class akn extends aja {

    /* renamed from: a */
    private final Resources f15157a;

    /* renamed from: b */
    private final String f15158b;

    /* renamed from: c */
    private Uri f15159c;

    /* renamed from: d */
    private AssetFileDescriptor f15160d;

    /* renamed from: e */
    private InputStream f15161e;

    /* renamed from: f */
    private long f15162f;

    /* renamed from: g */
    private boolean f15163g;

    public akn(Context context) {
        super(false);
        this.f15157a = context.getResources();
        this.f15158b = context.getPackageName();
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws akm {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f15162f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new akm((Throwable) e);
            }
        }
        InputStream inputStream = this.f15161e;
        int i3 = amm.f15298a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f15162f;
            if (j2 != -1) {
                this.f15162f = j2 - ((long) read);
            }
            mo13798i(read);
            return read;
        } else if (this.f15162f == -1) {
            return -1;
        } else {
            throw new akm((Throwable) new EOFException());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0151  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo13296c(com.google.ads.interactivemedia.p038v3.internal.ajk r12) throws com.google.ads.interactivemedia.p038v3.internal.akm {
        /*
            r11 = this;
            android.net.Uri r0 = r12.f15056a
            r11.f15159c = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 1
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0037
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = r0.getLastPathSegment()
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r1)
            java.lang.String r4 = "\\d+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0037
            goto L_0x00a0
        L_0x0037:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r0.getPath()
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r1)
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0054
            java.lang.String r1 = r1.substring(r2)
        L_0x0054:
            java.lang.String r3 = r0.getHost()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = ""
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.concat(r4)
        L_0x006b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x007e
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0083
        L_0x007e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0083:
            android.content.res.Resources r3 = r11.f15157a
            java.lang.String r4 = r11.f15158b
            java.lang.String r5 = "raw"
            int r1 = r3.getIdentifier(r1, r5, r4)
            if (r1 == 0) goto L_0x0090
            goto L_0x00ab
        L_0x0090:
            com.google.ads.interactivemedia.v3.internal.akm r12 = new com.google.ads.interactivemedia.v3.internal.akm
            java.lang.String r0 = "Resource not found."
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x0098:
            com.google.ads.interactivemedia.v3.internal.akm r12 = new com.google.ads.interactivemedia.v3.internal.akm
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x00a0:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0179 }
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r1)     // Catch:{ NumberFormatException -> 0x0179 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0179 }
        L_0x00ab:
            r11.mo13796g(r12)
            android.content.res.Resources r3 = r11.f15157a     // Catch:{ NotFoundException -> 0x0172 }
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)     // Catch:{ NotFoundException -> 0x0172 }
            r11.f15160d = r1
            if (r1 == 0) goto L_0x0151
            long r3 = r1.getLength()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r1.getFileDescriptor()
            r0.<init>(r5)
            r11.f15161e = r0
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00da
            long r7 = r12.f15060e     // Catch:{ IOException -> 0x014a }
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            com.google.ads.interactivemedia.v3.internal.ajh r12 = new com.google.ads.interactivemedia.v3.internal.ajh     // Catch:{ IOException -> 0x014a }
            r12.<init>()     // Catch:{ IOException -> 0x014a }
            throw r12     // Catch:{ IOException -> 0x014a }
        L_0x00da:
            long r7 = r1.getStartOffset()     // Catch:{ IOException -> 0x014a }
            long r9 = r12.f15060e     // Catch:{ IOException -> 0x014a }
            long r9 = r9 + r7
            long r9 = r0.skip(r9)     // Catch:{ IOException -> 0x014a }
            long r9 = r9 - r7
            long r7 = r12.f15060e     // Catch:{ IOException -> 0x014a }
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0144
            r7 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0118
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x014a }
            long r3 = r0.size()     // Catch:{ IOException -> 0x014a }
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0102
            r11.f15162f = r5     // Catch:{ IOException -> 0x014a }
            r3 = r5
            goto L_0x011f
        L_0x0102:
            long r3 = r0.size()     // Catch:{ IOException -> 0x014a }
            long r0 = r0.position()     // Catch:{ IOException -> 0x014a }
            long r3 = r3 - r0
            r11.f15162f = r3     // Catch:{ IOException -> 0x014a }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0112
            goto L_0x011f
        L_0x0112:
            com.google.ads.interactivemedia.v3.internal.ajh r12 = new com.google.ads.interactivemedia.v3.internal.ajh     // Catch:{ IOException -> 0x014a }
            r12.<init>()     // Catch:{ IOException -> 0x014a }
            throw r12     // Catch:{ IOException -> 0x014a }
        L_0x0118:
            long r3 = r3 - r9
            r11.f15162f = r3     // Catch:{ IOException -> 0x014a }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x013e
        L_0x011f:
            long r0 = r12.f15061f
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x012f
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x012d
            long r0 = java.lang.Math.min(r3, r0)
        L_0x012d:
            r11.f15162f = r0
        L_0x012f:
            r11.f15163g = r2
            r11.mo13797h(r12)
            long r0 = r12.f15061f
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x013b
            return r0
        L_0x013b:
            long r0 = r11.f15162f
            return r0
        L_0x013e:
            com.google.ads.interactivemedia.v3.internal.ajh r12 = new com.google.ads.interactivemedia.v3.internal.ajh     // Catch:{ IOException -> 0x014a }
            r12.<init>()     // Catch:{ IOException -> 0x014a }
            throw r12     // Catch:{ IOException -> 0x014a }
        L_0x0144:
            com.google.ads.interactivemedia.v3.internal.ajh r12 = new com.google.ads.interactivemedia.v3.internal.ajh     // Catch:{ IOException -> 0x014a }
            r12.<init>()     // Catch:{ IOException -> 0x014a }
            throw r12     // Catch:{ IOException -> 0x014a }
        L_0x014a:
            r12 = move-exception
            com.google.ads.interactivemedia.v3.internal.akm r0 = new com.google.ads.interactivemedia.v3.internal.akm
            r0.<init>((java.lang.Throwable) r12)
            throw r0
        L_0x0151:
            com.google.ads.interactivemedia.v3.internal.akm r12 = new com.google.ads.interactivemedia.v3.internal.akm
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 24
            r2.<init>(r1)
            java.lang.String r1 = "Resource is compressed: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x0172:
            r12 = move-exception
            com.google.ads.interactivemedia.v3.internal.akm r0 = new com.google.ads.interactivemedia.v3.internal.akm
            r0.<init>((java.lang.Throwable) r12)
            throw r0
        L_0x0179:
            com.google.ads.interactivemedia.v3.internal.akm r12 = new com.google.ads.interactivemedia.v3.internal.akm
            java.lang.String r0 = "Resource identifier must be an integer."
            r12.<init>((java.lang.String) r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.akn.mo13296c(com.google.ads.interactivemedia.v3.internal.ajk):long");
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f15159c;
    }

    /* renamed from: f */
    public final void mo13299f() throws akm {
        this.f15159c = null;
        try {
            InputStream inputStream = this.f15161e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f15161e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f15160d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f15160d = null;
                if (this.f15163g) {
                    this.f15163g = false;
                    mo13799j();
                }
            } catch (IOException e) {
                throw new akm((Throwable) e);
            } catch (Throwable th) {
                this.f15160d = null;
                if (this.f15163g) {
                    this.f15163g = false;
                    mo13799j();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new akm((Throwable) e2);
        } catch (Throwable th2) {
            this.f15161e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f15160d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f15160d = null;
                if (this.f15163g) {
                    this.f15163g = false;
                    mo13799j();
                }
                throw th2;
            } catch (IOException e3) {
                throw new akm((Throwable) e3);
            } catch (Throwable th3) {
                this.f15160d = null;
                if (this.f15163g) {
                    this.f15163g = false;
                    mo13799j();
                }
                throw th3;
            }
        }
    }
}
