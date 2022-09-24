package p018c2;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: c2.d */
/* compiled from: GifHeaderParser */
public class C2649d {

    /* renamed from: a */
    private final byte[] f10429a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f10430b;

    /* renamed from: c */
    private C2648c f10431c;

    /* renamed from: d */
    private int f10432d = 0;

    /* renamed from: b */
    private boolean m9249b() {
        return this.f10431c.f10417b != 0;
    }

    /* renamed from: d */
    private int m9250d() {
        try {
            return this.f10430b.get() & 255;
        } catch (Exception unused) {
            this.f10431c.f10417b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m9251e() {
        this.f10431c.f10419d.f10405a = m9260n();
        this.f10431c.f10419d.f10406b = m9260n();
        this.f10431c.f10419d.f10407c = m9260n();
        this.f10431c.f10419d.f10408d = m9260n();
        int d = m9250d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C2647b bVar = this.f10431c.f10419d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f10409e = z;
        if (z2) {
            bVar.f10415k = m9253g(pow);
        } else {
            bVar.f10415k = null;
        }
        this.f10431c.f10419d.f10414j = this.f10430b.position();
        m9263r();
        if (!m9249b()) {
            C2648c cVar = this.f10431c;
            cVar.f10418c++;
            cVar.f10420e.add(cVar.f10419d);
        }
    }

    /* renamed from: f */
    private void m9252f() {
        int d = m9250d();
        this.f10432d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f10432d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f10430b.get(this.f10429a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f10432d, e);
                    }
                    this.f10431c.f10417b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m9253g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f10430b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f10431c.f10417b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m9254h() {
        m9255i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m9255i(int i) {
        boolean z = false;
        while (!z && !m9249b() && this.f10431c.f10418c <= i) {
            int d = m9250d();
            if (d == 33) {
                int d2 = m9250d();
                if (d2 == 1) {
                    m9262q();
                } else if (d2 == 249) {
                    this.f10431c.f10419d = new C2647b();
                    m9256j();
                } else if (d2 == 254) {
                    m9262q();
                } else if (d2 != 255) {
                    m9262q();
                } else {
                    m9252f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f10429a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m9259m();
                    } else {
                        m9262q();
                    }
                }
            } else if (d == 44) {
                C2648c cVar = this.f10431c;
                if (cVar.f10419d == null) {
                    cVar.f10419d = new C2647b();
                }
                m9251e();
            } else if (d != 59) {
                this.f10431c.f10417b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m9256j() {
        m9250d();
        int d = m9250d();
        C2647b bVar = this.f10431c.f10419d;
        int i = (d & 28) >> 2;
        bVar.f10411g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f10411g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f10410f = z;
        int n = m9260n();
        if (n < 2) {
            n = 10;
        }
        C2647b bVar2 = this.f10431c.f10419d;
        bVar2.f10413i = n * 10;
        bVar2.f10412h = m9250d();
        m9250d();
    }

    /* renamed from: k */
    private void m9257k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m9250d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f10431c.f10417b = 1;
            return;
        }
        m9258l();
        if (this.f10431c.f10423h && !m9249b()) {
            C2648c cVar = this.f10431c;
            cVar.f10416a = m9253g(cVar.f10424i);
            C2648c cVar2 = this.f10431c;
            cVar2.f10427l = cVar2.f10416a[cVar2.f10425j];
        }
    }

    /* renamed from: l */
    private void m9258l() {
        this.f10431c.f10421f = m9260n();
        this.f10431c.f10422g = m9260n();
        int d = m9250d();
        C2648c cVar = this.f10431c;
        cVar.f10423h = (d & 128) != 0;
        cVar.f10424i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f10431c.f10425j = m9250d();
        this.f10431c.f10426k = m9250d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9259m() {
        /*
            r3 = this;
        L_0x0000:
            r3.m9252f()
            byte[] r0 = r3.f10429a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            c2.c r2 = r3.f10431c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f10428m = r0
        L_0x001b:
            int r0 = r3.f10432d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m9249b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p018c2.C2649d.m9259m():void");
    }

    /* renamed from: n */
    private int m9260n() {
        return this.f10430b.getShort();
    }

    /* renamed from: o */
    private void m9261o() {
        this.f10430b = null;
        Arrays.fill(this.f10429a, (byte) 0);
        this.f10431c = new C2648c();
        this.f10432d = 0;
    }

    /* renamed from: q */
    private void m9262q() {
        int d;
        do {
            d = m9250d();
            this.f10430b.position(Math.min(this.f10430b.position() + d, this.f10430b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m9263r() {
        m9250d();
        m9262q();
    }

    /* renamed from: a */
    public void mo9325a() {
        this.f10430b = null;
        this.f10431c = null;
    }

    /* renamed from: c */
    public C2648c mo9326c() {
        if (this.f10430b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m9249b()) {
            return this.f10431c;
        } else {
            m9257k();
            if (!m9249b()) {
                m9254h();
                C2648c cVar = this.f10431c;
                if (cVar.f10418c < 0) {
                    cVar.f10417b = 1;
                }
            }
            return this.f10431c;
        }
    }

    /* renamed from: p */
    public C2649d mo9327p(ByteBuffer byteBuffer) {
        m9261o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f10430b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f10430b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
