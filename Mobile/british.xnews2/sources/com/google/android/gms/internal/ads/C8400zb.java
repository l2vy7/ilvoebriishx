package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p251t4.C11013c;
import p251t4.C11014d;

/* renamed from: com.google.android.gms.internal.ads.zb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8400zb {

    /* renamed from: r */
    private static final String f42393r = "zb";

    /* renamed from: a */
    protected final Context f42394a;

    /* renamed from: b */
    private ExecutorService f42395b;

    /* renamed from: c */
    private DexClassLoader f42396c;

    /* renamed from: d */
    private C7677fb f42397d;

    /* renamed from: e */
    private byte[] f42398e;

    /* renamed from: f */
    private volatile AdvertisingIdClient f42399f = null;

    /* renamed from: g */
    private volatile boolean f42400g;

    /* renamed from: h */
    private Future f42401h;

    /* renamed from: i */
    private final boolean f42402i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile C8218u8 f42403j;

    /* renamed from: k */
    private Future f42404k;

    /* renamed from: l */
    private C8257va f42405l;

    /* renamed from: m */
    protected boolean f42406m;

    /* renamed from: n */
    protected boolean f42407n;

    /* renamed from: o */
    private final Map<Pair<String, String>, C7753hd> f42408o;

    /* renamed from: p */
    private boolean f42409p;

    /* renamed from: q */
    private zzaml f42410q;

    private C8400zb(Context context) {
        boolean z = false;
        this.f42400g = false;
        this.f42401h = null;
        this.f42403j = null;
        this.f42404k = null;
        this.f42406m = false;
        this.f42407n = false;
        this.f42409p = false;
        Context applicationContext = context.getApplicationContext();
        this.f42402i = applicationContext != null ? true : z;
        context = applicationContext != null ? applicationContext : context;
        this.f42394a = context;
        this.f42408o = new HashMap();
        if (this.f42410q == null) {
            this.f42410q = new zzaml(context);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|(3:27|28|(17:30|(2:32|33)|34|35|36|37|(2:39|(1:41)(2:42|43))|44|(1:46)|47|48|49|50|51|52|53|82)(3:71|72|73))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ rb -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086 A[Catch:{ IllegalArgumentException -> 0x0157, eb -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0151 A[SYNTHETIC, Splitter:B:71:0x0151] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C8400zb m40254g(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r11 = "1633031840514"
            com.google.android.gms.internal.ads.zb r0 = new com.google.android.gms.internal.ads.zb
            r0.<init>(r9)
            com.google.android.gms.internal.ads.vb r9 = new com.google.android.gms.internal.ads.vb     // Catch:{ rb -> 0x0165 }
            r9.<init>()     // Catch:{ rb -> 0x0165 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ rb -> 0x0165 }
            r0.f42395b = r9     // Catch:{ rb -> 0x0165 }
            r0.f42400g = r12     // Catch:{ rb -> 0x0165 }
            if (r12 == 0) goto L_0x0025
            java.util.concurrent.ExecutorService r9 = r0.f42395b     // Catch:{ rb -> 0x0165 }
            com.google.android.gms.internal.ads.wb r12 = new com.google.android.gms.internal.ads.wb     // Catch:{ rb -> 0x0165 }
            r12.<init>(r0)     // Catch:{ rb -> 0x0165 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ rb -> 0x0165 }
            r0.f42401h = r9     // Catch:{ rb -> 0x0165 }
        L_0x0025:
            java.util.concurrent.ExecutorService r9 = r0.f42395b     // Catch:{ rb -> 0x0165 }
            com.google.android.gms.internal.ads.yb r12 = new com.google.android.gms.internal.ads.yb     // Catch:{ rb -> 0x0165 }
            r12.<init>(r0)     // Catch:{ rb -> 0x0165 }
            r9.execute(r12)     // Catch:{ rb -> 0x0165 }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.b r1 = com.google.android.gms.common.C7353b.m29920h()     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.f42394a     // Catch:{ all -> 0x004f }
            int r2 = r1.mo29973b(r2)     // Catch:{ all -> 0x004f }
            if (r2 <= 0) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r0.f42406m = r2     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.f42394a     // Catch:{ all -> 0x004f }
            int r1 = r1.mo29708i(r2)     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0.f42407n = r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0.mo36039o(r12, r9)     // Catch:{ rb -> 0x0165 }
            boolean r1 = com.google.android.gms.internal.ads.C7569cc.m30948f()     // Catch:{ rb -> 0x0165 }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.p00.f37025Y1     // Catch:{ rb -> 0x0165 }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ rb -> 0x0165 }
            java.lang.Object r1 = r2.mo18570b(r1)     // Catch:{ rb -> 0x0165 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ rb -> 0x0165 }
            boolean r1 = r1.booleanValue()     // Catch:{ rb -> 0x0165 }
            if (r1 != 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ rb -> 0x0165 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ rb -> 0x0165 }
            throw r9     // Catch:{ rb -> 0x0165 }
        L_0x0073:
            com.google.android.gms.internal.ads.fb r1 = new com.google.android.gms.internal.ads.fb     // Catch:{ rb -> 0x0165 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ rb -> 0x0165 }
            r0.f42397d = r1     // Catch:{ rb -> 0x0165 }
            java.lang.String r3 = "BcJJ7m9GnDZ5QH3kvN4kRXKQduFKSe4hbLIA7qGtn8k="
            byte[] r3 = com.google.android.gms.internal.ads.C7859k9.m33876b(r3, r12)     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0157 }
            r5 = 32
            if (r4 != r5) goto L_0x0151
            r4 = 4
            r5 = 16
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0157 }
            byte[] r4 = new byte[r5]     // Catch:{ IllegalArgumentException -> 0x0157 }
            r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x0157 }
            r3 = 0
        L_0x0093:
            if (r3 >= r5) goto L_0x009f
            byte r6 = r4[r3]     // Catch:{ IllegalArgumentException -> 0x0157 }
            r6 = r6 ^ 68
            byte r6 = (byte) r6     // Catch:{ IllegalArgumentException -> 0x0157 }
            r4[r3] = r6     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r3 = r3 + 1
            goto L_0x0093
        L_0x009f:
            r0.f42398e = r4     // Catch:{ eb -> 0x015e }
            android.content.Context r1 = r0.f42394a     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r0.f42394a     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r3 = "dex"
            java.io.File r1 = r1.getDir(r3, r12)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            if (r1 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            com.google.android.gms.internal.ads.rb r9 = new com.google.android.gms.internal.ads.rb     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            throw r9     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
        L_0x00ba:
            java.lang.String r3 = "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"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r6[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r6[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r7 = "%s/%s.jar"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            boolean r6 = r4.exists()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            if (r6 != 0) goto L_0x00eb
            com.google.android.gms.internal.ads.fb r6 = r0.f42397d     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            byte[] r7 = r0.f42398e     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            byte[] r3 = r6.mo31788b(r7, r3)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r6.<init>(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            int r7 = r3.length     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r6.write(r3, r12, r7)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
        L_0x00eb:
            r0.m40259x(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            dalvik.system.DexClassLoader r3 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = r4.getAbsolutePath()     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x0120 }
            android.content.Context r8 = r0.f42394a     // Catch:{ all -> 0x0120 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x0120 }
            r3.<init>(r6, r7, r2, r8)     // Catch:{ all -> 0x0120 }
            r0.f42396c = r3     // Catch:{ all -> 0x0120 }
            m40260y(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r0.m40258w(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r2[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r2[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r10 = java.lang.String.format(r10, r2)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            m40261z(r10)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            com.google.android.gms.internal.ads.va r10 = new com.google.android.gms.internal.ads.va     // Catch:{ rb -> 0x0165 }
            r10.<init>(r0)     // Catch:{ rb -> 0x0165 }
            r0.f42405l = r10     // Catch:{ rb -> 0x0165 }
            r0.f42409p = r9     // Catch:{ rb -> 0x0165 }
            goto L_0x0165
        L_0x0120:
            r2 = move-exception
            m40260y(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r0.m40258w(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r3[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            r3[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r9 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            m40261z(r9)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
            throw r2     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, eb -> 0x013c, NullPointerException -> 0x0135 }
        L_0x0135:
            r9 = move-exception
            com.google.android.gms.internal.ads.rb r10 = new com.google.android.gms.internal.ads.rb     // Catch:{ rb -> 0x0165 }
            r10.<init>(r9)     // Catch:{ rb -> 0x0165 }
            throw r10     // Catch:{ rb -> 0x0165 }
        L_0x013c:
            r9 = move-exception
            com.google.android.gms.internal.ads.rb r10 = new com.google.android.gms.internal.ads.rb     // Catch:{ rb -> 0x0165 }
            r10.<init>(r9)     // Catch:{ rb -> 0x0165 }
            throw r10     // Catch:{ rb -> 0x0165 }
        L_0x0143:
            r9 = move-exception
            com.google.android.gms.internal.ads.rb r10 = new com.google.android.gms.internal.ads.rb     // Catch:{ rb -> 0x0165 }
            r10.<init>(r9)     // Catch:{ rb -> 0x0165 }
            throw r10     // Catch:{ rb -> 0x0165 }
        L_0x014a:
            r9 = move-exception
            com.google.android.gms.internal.ads.rb r10 = new com.google.android.gms.internal.ads.rb     // Catch:{ rb -> 0x0165 }
            r10.<init>(r9)     // Catch:{ rb -> 0x0165 }
            throw r10     // Catch:{ rb -> 0x0165 }
        L_0x0151:
            com.google.android.gms.internal.ads.eb r9 = new com.google.android.gms.internal.ads.eb     // Catch:{ IllegalArgumentException -> 0x0157 }
            r9.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0157 }
            throw r9     // Catch:{ IllegalArgumentException -> 0x0157 }
        L_0x0157:
            r9 = move-exception
            com.google.android.gms.internal.ads.eb r10 = new com.google.android.gms.internal.ads.eb     // Catch:{ eb -> 0x015e }
            r10.<init>(r1, r9)     // Catch:{ eb -> 0x015e }
            throw r10     // Catch:{ eb -> 0x015e }
        L_0x015e:
            r9 = move-exception
            com.google.android.gms.internal.ads.rb r10 = new com.google.android.gms.internal.ads.rb     // Catch:{ rb -> 0x0165 }
            r10.<init>(r9)     // Catch:{ rb -> 0x0165 }
            throw r10     // Catch:{ rb -> 0x0165 }
        L_0x0165:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8400zb.m40254g(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zb");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m40257v() {
        try {
            if (this.f42399f == null && this.f42402i) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f42394a);
                advertisingIdClient.start();
                this.f42399f = advertisingIdClient;
            }
        } catch (IOException | C11013c | C11014d unused) {
            this.f42399f = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3 A[SYNTHETIC, Splitter:B:42:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da A[SYNTHETIC, Splitter:B:46:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4 A[SYNTHETIC, Splitter:B:54:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC, Splitter:B:58:0x00eb] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m40258w(java.io.File r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r12 = "test"
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r11
            r4 = 1
            java.lang.String r5 = "1633031840514"
            r2[r4] = r5
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001f
            return
        L_0x001f:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r4] = r5
            java.lang.String r11 = "%s/%s.dex"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r2.<init>(r11)
            boolean r11 = r2.exists()
            if (r11 != 0) goto L_0x0037
            return
        L_0x0037:
            long r6 = r2.length()
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0042
            return
        L_0x0042:
            int r11 = (int) r6
            byte[] r11 = new byte[r11]
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e1, all -> 0x00ce }
            r4.<init>(r2)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e1, all -> 0x00ce }
            int r6 = r4.read(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            if (r6 > 0) goto L_0x0058
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            m40260y(r2)
            return
        L_0x0058:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.x8 r12 = com.google.android.gms.internal.ads.C8361y8.m39793E()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.eo3 r6 = com.google.android.gms.internal.ads.eo3.m31873L(r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.mo35733C(r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r5 = r5.getBytes()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.eo3 r5 = com.google.android.gms.internal.ads.eo3.m31873L(r5)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.mo35734H(r5)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.fb r5 = r10.f42397d     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r10.f42398e     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r11 = r5.mo31787a(r6, r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r11 = r11.getBytes()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.eo3 r5 = com.google.android.gms.internal.ads.eo3.m31873L(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.mo35735y(r5)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r11 = com.google.android.gms.internal.ads.C8007o9.m35601e(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.eo3 r11 = com.google.android.gms.internal.ads.eo3.m31873L(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.mo35732B(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.createNewFile()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r11.<init>(r0)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.kp3 r12 = r12.mo32424p()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            com.google.android.gms.internal.ads.y8 r12 = (com.google.android.gms.internal.ads.C8361y8) r12     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            byte[] r12 = r12.mo33365g()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            int r0 = r12.length     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r11.write(r12, r3, r0)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r11.close()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r4.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r11.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            m40260y(r2)
            return
        L_0x00c4:
            r12 = move-exception
            goto L_0x00c9
        L_0x00c6:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00c9:
            r1 = r4
            goto L_0x00d1
        L_0x00cb:
            r11 = r1
        L_0x00cc:
            r1 = r4
            goto L_0x00e2
        L_0x00ce:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00d1:
            if (r1 == 0) goto L_0x00d8
            r1.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            if (r11 == 0) goto L_0x00dd
            r11.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            m40260y(r2)
            throw r12
        L_0x00e1:
            r11 = r1
        L_0x00e2:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r11 == 0) goto L_0x00ee
            r11.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00ee:
            m40260y(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8400zb.m40258w(java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:31|32|33|34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: eb | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea A[SYNTHETIC, Splitter:B:61:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f1 A[SYNTHETIC, Splitter:B:65:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f8 A[SYNTHETIC, Splitter:B:72:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ff A[SYNTHETIC, Splitter:B:76:0x00ff] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m40259x(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r11 = new java.io.File
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            r3 = 1
            java.lang.String r4 = "1633031840514"
            r1[r3] = r4
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            r11.<init>(r1)
            boolean r1 = r11.exists()
            if (r1 != 0) goto L_0x001d
            return r2
        L_0x001d:
            java.io.File r1 = new java.io.File
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            r0[r3] = r4
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 != 0) goto L_0x0102
            r10 = 0
            long r5 = r11.length()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
            m40260y(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            return r2
        L_0x0043:
            int r0 = (int) r5     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            byte[] r0 = new byte[r0]     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            r5.<init>(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            int r6 = r5.read(r0)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r6 > 0) goto L_0x005f
            java.lang.String r0 = f42393r     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r0, r1)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            m40260y(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r5.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return r2
        L_0x005f:
            com.google.android.gms.internal.ads.wo3 r6 = com.google.android.gms.internal.ads.wo3.m39219a()     // Catch:{ NullPointerException -> 0x00db, eb | IOException | NoSuchAlgorithmException -> 0x00e3, eb | IOException | NoSuchAlgorithmException -> 0x00e3 }
            com.google.android.gms.internal.ads.y8 r0 = com.google.android.gms.internal.ads.C8361y8.m39795H(r0, r6)     // Catch:{ NullPointerException -> 0x00db, eb | IOException | NoSuchAlgorithmException -> 0x00e3, eb | IOException | NoSuchAlgorithmException -> 0x00e3 }
            java.lang.String r6 = new java.lang.String     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.eo3 r7 = r0.mo35890L()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r7 = r7.mo31616f()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r7)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = r4.equals(r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.eo3 r4 = r0.mo35888J()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.mo31616f()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.eo3 r6 = r0.mo35887I()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.mo31616f()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = com.google.android.gms.internal.ads.C8007o9.m35601e(r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.eo3 r4 = r0.mo35889K()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.mo31616f()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.getBytes()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 != 0) goto L_0x00a9
            goto L_0x00d4
        L_0x00a9:
            com.google.android.gms.internal.ads.fb r11 = r9.f42397d     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r9.f42398e     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = new java.lang.String     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.eo3 r0 = r0.mo35887I()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r0 = r0.mo31616f()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r0)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r11 = r11.mo31788b(r4, r6)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r1.createNewFile()     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r0.<init>(r1)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            int r10 = r11.length     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r0.write(r11, r2, r10)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r5.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r0.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            return r3
        L_0x00d1:
            r10 = move-exception
            r11 = r10
            goto L_0x00e1
        L_0x00d4:
            m40260y(r11)     // Catch:{ eb | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r5.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r2
        L_0x00db:
            r5.close()     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            return r2
        L_0x00df:
            r11 = move-exception
            r0 = r10
        L_0x00e1:
            r10 = r5
            goto L_0x00e8
        L_0x00e3:
            r0 = r10
        L_0x00e4:
            r10 = r5
            goto L_0x00f6
        L_0x00e6:
            r11 = move-exception
            r0 = r10
        L_0x00e8:
            if (r10 == 0) goto L_0x00ef
            r10.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r0 == 0) goto L_0x00f4
            r0.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            throw r11
        L_0x00f5:
            r0 = r10
        L_0x00f6:
            if (r10 == 0) goto L_0x00fd
            r10.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            if (r0 == 0) goto L_0x0102
            r0.close()     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8400zb.m40259x(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: y */
    private static final void m40260y(File file) {
        if (!file.exists()) {
            Log.d(f42393r, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* renamed from: z */
    private static final void m40261z(String str) {
        m40260y(new File(str));
    }

    /* renamed from: a */
    public final int mo36028a() {
        if (this.f42405l != null) {
            return C8257va.m38766d();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public final Context mo36029b() {
        return this.f42394a;
    }

    /* renamed from: c */
    public final C8218u8 mo36030c() {
        return this.f42403j;
    }

    /* renamed from: d */
    public final C8257va mo36031d() {
        return this.f42405l;
    }

    /* renamed from: e */
    public final C7677fb mo36032e() {
        return this.f42397d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final zzaml mo36033f() {
        return this.f42410q;
    }

    /* renamed from: h */
    public final AdvertisingIdClient mo36034h() {
        if (!this.f42400g) {
            return null;
        }
        if (this.f42399f != null) {
            return this.f42399f;
        }
        Future future = this.f42401h;
        if (future != null) {
            try {
                future.get(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                this.f42401h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f42401h.cancel(true);
            }
        }
        return this.f42399f;
    }

    /* renamed from: i */
    public final DexClassLoader mo36035i() {
        return this.f42396c;
    }

    /* renamed from: j */
    public final Method mo36036j(String str, String str2) {
        C7753hd hdVar = this.f42408o.get(new Pair(str, str2));
        if (hdVar == null) {
            return null;
        }
        return hdVar.mo32386a();
    }

    /* renamed from: k */
    public final ExecutorService mo36037k() {
        return this.f42395b;
    }

    /* renamed from: l */
    public final Future mo36038l() {
        return this.f42404k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo36039o(int i, boolean z) {
        if (this.f42407n) {
            Future<?> submit = this.f42395b.submit(new C8328xb(this, i, true));
            if (i == 0) {
                this.f42404k = submit;
            }
        }
    }

    /* renamed from: p */
    public final boolean mo36040p() {
        return this.f42407n;
    }

    /* renamed from: q */
    public final boolean mo36041q() {
        return this.f42406m;
    }

    /* renamed from: r */
    public final boolean mo36042r() {
        return this.f42409p;
    }

    /* renamed from: s */
    public final boolean mo36043s() {
        return this.f42410q.mo36182a();
    }

    /* renamed from: t */
    public final boolean mo36044t(String str, String str2, Class<?>... clsArr) {
        if (this.f42408o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f42408o.put(new Pair(str, str2), new C7753hd(this, str, str2, clsArr));
        return true;
    }

    /* renamed from: u */
    public final byte[] mo36045u() {
        return this.f42398e;
    }
}
