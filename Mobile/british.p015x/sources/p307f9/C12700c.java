package p307f9;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.InputStream;
import p309g9.C12743a;
import p309g9.C12747e;
import p309g9.C12748f;
import p313i9.C12790d;
import p313i9.C12791e;
import p317k9.C12820a;
import p317k9.C12821b;

/* renamed from: f9.c */
/* compiled from: AbstractSessionInputBuffer */
public abstract class C12700c implements C12748f, C12743a {

    /* renamed from: a */
    private InputStream f55355a;

    /* renamed from: b */
    private byte[] f55356b;

    /* renamed from: c */
    private int f55357c;

    /* renamed from: d */
    private int f55358d;

    /* renamed from: e */
    private C12820a f55359e = null;

    /* renamed from: f */
    private String f55360f = C6540C.ASCII_NAME;

    /* renamed from: g */
    private boolean f55361g = true;

    /* renamed from: h */
    private int f55362h = -1;

    /* renamed from: i */
    private int f55363i = 512;

    /* renamed from: j */
    private C12707j f55364j;

    /* renamed from: h */
    private int m54022h(C12821b bVar) throws IOException {
        int l = this.f55359e.mo47961l();
        if (l > 0) {
            if (this.f55359e.mo47956f(l - 1) == 10) {
                l--;
                this.f55359e.mo47962m(l);
            }
            if (l > 0 && this.f55359e.mo47956f(l - 1) == 13) {
                this.f55359e.mo47962m(l - 1);
            }
        }
        int l2 = this.f55359e.mo47961l();
        if (this.f55361g) {
            bVar.mo47967d(this.f55359e, 0, l2);
        } else {
            String str = new String(this.f55359e.mo47955e(), 0, l2, this.f55360f);
            l2 = str.length();
            bVar.mo47966c(str);
        }
        this.f55359e.mo47958h();
        return l2;
    }

    /* renamed from: i */
    private int m54023i(C12821b bVar, int i) throws IOException {
        int i2 = this.f55357c;
        this.f55357c = i + 1;
        if (i > 0 && this.f55356b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f55361g) {
            bVar.mo47969f(this.f55356b, i2, i3);
            return i3;
        }
        String str = new String(this.f55356b, i2, i3, this.f55360f);
        bVar.mo47966c(str);
        return str.length();
    }

    /* renamed from: j */
    private int m54024j() {
        for (int i = this.f55357c; i < this.f55358d; i++) {
            if (this.f55356b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r2 == -1) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo43655a(p317k9.C12821b r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0070
            r0 = 1
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = -1
            if (r0 == 0) goto L_0x0060
            int r4 = r7.m54024j()
            if (r4 == r3) goto L_0x002c
            k9.a r0 = r7.f55359e
            boolean r0 = r0.mo47959j()
            if (r0 == 0) goto L_0x001b
            int r8 = r7.m54023i(r8, r4)
            return r8
        L_0x001b:
            int r4 = r4 + 1
            int r0 = r7.f55357c
            int r3 = r4 - r0
            k9.a r5 = r7.f55359e
            byte[] r6 = r7.f55356b
            r5.mo47953c(r6, r0, r3)
            r7.f55357c = r4
        L_0x002a:
            r0 = 0
            goto L_0x0049
        L_0x002c:
            boolean r2 = r7.mo47712f()
            if (r2 == 0) goto L_0x0042
            int r2 = r7.f55358d
            int r4 = r7.f55357c
            int r2 = r2 - r4
            k9.a r5 = r7.f55359e
            byte[] r6 = r7.f55356b
            r5.mo47953c(r6, r4, r2)
            int r2 = r7.f55358d
            r7.f55357c = r2
        L_0x0042:
            int r2 = r7.mo47711e()
            if (r2 != r3) goto L_0x0049
            goto L_0x002a
        L_0x0049:
            int r3 = r7.f55362h
            if (r3 <= 0) goto L_0x0005
            k9.a r3 = r7.f55359e
            int r3 = r3.mo47961l()
            int r4 = r7.f55362h
            if (r3 >= r4) goto L_0x0058
            goto L_0x0005
        L_0x0058:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L_0x0060:
            if (r2 != r3) goto L_0x006b
            k9.a r0 = r7.f55359e
            boolean r0 = r0.mo47959j()
            if (r0 == 0) goto L_0x006b
            return r3
        L_0x006b:
            int r8 = r7.m54022h(r8)
            return r8
        L_0x0070:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Char array buffer may not be null"
            r8.<init>(r0)
            goto L_0x0079
        L_0x0078:
            throw r8
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: p307f9.C12700c.mo43655a(k9.b):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12707j mo47710d() {
        return new C12707j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo47711e() throws IOException {
        int i = this.f55357c;
        if (i > 0) {
            int i2 = this.f55358d - i;
            if (i2 > 0) {
                byte[] bArr = this.f55356b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.f55357c = 0;
            this.f55358d = i2;
        }
        int i3 = this.f55358d;
        byte[] bArr2 = this.f55356b;
        int read = this.f55355a.read(bArr2, i3, bArr2.length - i3);
        if (read == -1) {
            return -1;
        }
        this.f55358d = i3 + read;
        this.f55364j.mo47744a((long) read);
        return read;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo47712f() {
        return this.f55357c < this.f55358d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo47713g(InputStream inputStream, int i, C12790d dVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (dVar != null) {
            this.f55355a = inputStream;
            this.f55356b = new byte[i];
            boolean z = false;
            this.f55357c = 0;
            this.f55358d = 0;
            this.f55359e = new C12820a(i);
            String a = C12791e.m54278a(dVar);
            this.f55360f = a;
            if (a.equalsIgnoreCase(C6540C.ASCII_NAME) || this.f55360f.equalsIgnoreCase("ASCII")) {
                z = true;
            }
            this.f55361g = z;
            this.f55362h = dVar.mo47928b("http.connection.max-line-length", -1);
            this.f55363i = dVar.mo47928b("http.connection.min-chunk-limit", 512);
            this.f55364j = mo47710d();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public C12747e getMetrics() {
        return this.f55364j;
    }

    public int length() {
        return this.f55358d - this.f55357c;
    }

    public int read() throws IOException {
        while (!mo47712f()) {
            if (mo47711e() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f55356b;
        int i = this.f55357c;
        this.f55357c = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (mo47712f()) {
            int min = Math.min(i2, this.f55358d - this.f55357c);
            System.arraycopy(this.f55356b, this.f55357c, bArr, i, min);
            this.f55357c += min;
            return min;
        } else if (i2 > this.f55363i) {
            return this.f55355a.read(bArr, i, i2);
        } else {
            while (!mo47712f()) {
                if (mo47711e() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f55358d - this.f55357c);
            System.arraycopy(this.f55356b, this.f55357c, bArr, i, min2);
            this.f55357c += min2;
            return min2;
        }
    }
}
