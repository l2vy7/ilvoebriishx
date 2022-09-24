package p311h9;

import java.util.NoSuchElementException;
import p308g8.C12714b;
import p308g8.C12716c;
import p308g8.C12718d;
import p308g8.C12720e;
import p308g8.C12722f;
import p317k9.C12821b;

/* renamed from: h9.d */
/* compiled from: BasicHeaderElementIterator */
public class C12765d implements C12720e {

    /* renamed from: b */
    private final C12722f f55433b;

    /* renamed from: c */
    private final C12779r f55434c;

    /* renamed from: d */
    private C12718d f55435d;

    /* renamed from: e */
    private C12821b f55436e;

    /* renamed from: f */
    private C12782u f55437f;

    public C12765d(C12722f fVar, C12779r rVar) {
        this.f55435d = null;
        this.f55436e = null;
        this.f55437f = null;
        if (fVar == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        } else if (rVar != null) {
            this.f55433b = fVar;
            this.f55434c = rVar;
        } else {
            throw new IllegalArgumentException("Parser may not be null");
        }
    }

    /* renamed from: a */
    private void m54167a() {
        this.f55437f = null;
        this.f55436e = null;
        while (this.f55433b.hasNext()) {
            C12716c j = this.f55433b.mo47775j();
            if (j instanceof C12714b) {
                C12714b bVar = (C12714b) j;
                C12821b a = bVar.mo47755a();
                this.f55436e = a;
                C12782u uVar = new C12782u(0, a.mo47978p());
                this.f55437f = uVar;
                uVar.mo47923d(bVar.mo47756c());
                return;
            }
            String value = j.getValue();
            if (value != null) {
                C12821b bVar2 = new C12821b(value.length());
                this.f55436e = bVar2;
                bVar2.mo47966c(value);
                this.f55437f = new C12782u(0, this.f55436e.mo47978p());
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m54168b() {
        /*
            r3 = this;
        L_0x0000:
            g8.f r0 = r3.f55433b
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x000e
            h9.u r0 = r3.f55437f
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            h9.u r0 = r3.f55437f
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.mo47920a()
            if (r0 == 0) goto L_0x001b
        L_0x0018:
            r3.m54167a()
        L_0x001b:
            h9.u r0 = r3.f55437f
            if (r0 == 0) goto L_0x0000
        L_0x001f:
            h9.u r0 = r3.f55437f
            boolean r0 = r0.mo47920a()
            if (r0 != 0) goto L_0x0044
            h9.r r0 = r3.f55434c
            k9.b r1 = r3.f55436e
            h9.u r2 = r3.f55437f
            g8.d r0 = r0.mo47859b(r1, r2)
            java.lang.String r1 = r0.getName()
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = r0.getValue()
            if (r1 == 0) goto L_0x001f
        L_0x0041:
            r3.f55435d = r0
            return
        L_0x0044:
            h9.u r0 = r3.f55437f
            boolean r0 = r0.mo47920a()
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r3.f55437f = r0
            r3.f55436e = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: p311h9.C12765d.m54168b():void");
    }

    public boolean hasNext() {
        if (this.f55435d == null) {
            m54168b();
        }
        return this.f55435d != null;
    }

    /* renamed from: l */
    public C12718d mo47773l() throws NoSuchElementException {
        if (this.f55435d == null) {
            m54168b();
        }
        C12718d dVar = this.f55435d;
        if (dVar != null) {
            this.f55435d = null;
            return dVar;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    public final Object next() throws NoSuchElementException {
        return mo47773l();
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public C12765d(C12722f fVar) {
        this(fVar, C12767f.f55439a);
    }
}
