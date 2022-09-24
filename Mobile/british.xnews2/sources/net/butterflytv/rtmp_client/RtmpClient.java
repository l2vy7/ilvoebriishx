package net.butterflytv.rtmp_client;

import java.io.IOException;

public class RtmpClient {

    /* renamed from: a */
    private long f55511a = 0;

    /* renamed from: b */
    private int f55512b = 10000;

    /* renamed from: c */
    private int f55513c = 10000;

    /* renamed from: net.butterflytv.rtmp_client.RtmpClient$a */
    public static class C12843a extends IOException {

        /* renamed from: b */
        public final int f55514b;

        public C12843a(int i) {
            super("RTMP error: " + i);
            this.f55514b = i;
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativeRead(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    /* renamed from: a */
    public void mo47989a() {
        nativeClose(this.f55511a);
        this.f55511a = 0;
    }

    /* renamed from: b */
    public void mo47990b(String str, boolean z) throws C12843a {
        long nativeAlloc = nativeAlloc();
        this.f55511a = nativeAlloc;
        if (nativeAlloc != 0) {
            int nativeOpen = nativeOpen(str, z, nativeAlloc, this.f55512b, this.f55513c);
            if (nativeOpen != 0) {
                this.f55511a = 0;
                throw new C12843a(nativeOpen);
            }
            return;
        }
        throw new C12843a(-2);
    }

    /* renamed from: c */
    public int mo47991c(byte[] bArr, int i, int i2) throws C12843a, IllegalStateException {
        int nativeRead = nativeRead(bArr, i, i2, this.f55511a);
        if (nativeRead >= 0 || nativeRead == -1) {
            return nativeRead;
        }
        throw new C12843a(nativeRead);
    }
}
