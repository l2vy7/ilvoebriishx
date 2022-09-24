package p275c9;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p308g8.C12728l;
import p313i9.C12789c;
import p313i9.C12790d;
import p315j9.C12811e;
import p322p8.C12852d;
import p322p8.C12860l;
import p322p8.C12863o;
import p328s8.C12884b;
import p328s8.C12886d;
import p328s8.C12887e;

/* renamed from: c9.f */
/* compiled from: DefaultClientConnectionOperator */
public class C11209f implements C12852d {

    /* renamed from: a */
    private final Log f50324a = LogFactory.getLog(getClass());

    /* renamed from: b */
    protected final C12887e f50325b;

    public C11209f(C12887e eVar) {
        if (eVar != null) {
            this.f50325b = eVar;
            return;
        }
        throw new IllegalArgumentException("Scheme registry amy not be null");
    }

    /* renamed from: a */
    public void mo43648a(C12863o oVar, C12728l lVar, C12811e eVar, C12790d dVar) throws IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("Connection may not be null");
        } else if (lVar == null) {
            throw new IllegalArgumentException("Target host may not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        } else if (oVar.mo43616q()) {
            C12886d c = this.f50325b.mo48057c(lVar.mo47784c());
            if (c.mo48049c() instanceof C12884b) {
                C12884b bVar = (C12884b) c.mo48049c();
                try {
                    Socket c2 = bVar.mo48042c(oVar.mo43645l(), lVar.mo47782a(), lVar.mo47783b(), true);
                    mo43651d(c2, eVar, dVar);
                    oVar.mo43644f(c2, lVar, bVar.mo48045d(c2), dVar);
                } catch (ConnectException e) {
                    throw new C12860l(lVar, e);
                }
            } else {
                throw new IllegalArgumentException("Target scheme (" + c.mo48048b() + ") must have layered socket factory.");
            }
        } else {
            throw new IllegalStateException("Connection must be open");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0098 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43649b(p322p8.C12863o r17, p308g8.C12728l r18, java.net.InetAddress r19, p315j9.C12811e r20, p313i9.C12790d r21) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            if (r2 == 0) goto L_0x00ea
            if (r3 == 0) goto L_0x00e2
            if (r5 == 0) goto L_0x00da
            boolean r0 = r17.mo43616q()
            if (r0 != 0) goto L_0x00d2
            s8.e r0 = r1.f50325b
            java.lang.String r6 = r18.mo47784c()
            s8.d r0 = r0.mo48057c(r6)
            s8.f r6 = r0.mo48049c()
            java.lang.String r7 = r18.mo47782a()
            java.net.InetAddress[] r7 = r1.mo43652e(r7)
            int r8 = r18.mo47783b()
            int r8 = r0.mo48051e(r8)
            r9 = 0
            r10 = 0
        L_0x0036:
            int r0 = r7.length
            if (r10 >= r0) goto L_0x00d1
            r0 = r7[r10]
            int r11 = r7.length
            r12 = 1
            int r11 = r11 - r12
            if (r10 != r11) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r12 = 0
        L_0x0042:
            java.net.Socket r11 = r6.mo48043a(r5)
            r2.mo43647x(r11, r3)
            java.net.InetSocketAddress r13 = new java.net.InetSocketAddress
            r13.<init>(r0, r8)
            r0 = 0
            if (r4 == 0) goto L_0x0056
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r4, r9)
        L_0x0056:
            org.apache.commons.logging.Log r14 = r1.f50324a
            boolean r14 = r14.isDebugEnabled()
            if (r14 == 0) goto L_0x0074
            org.apache.commons.logging.Log r14 = r1.f50324a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "Connecting to "
            r15.append(r9)
            r15.append(r13)
            java.lang.String r9 = r15.toString()
            r14.debug(r9)
        L_0x0074:
            java.net.Socket r0 = r6.mo48044b(r11, r13, r0, r5)     // Catch:{ ConnectException -> 0x0099, f -> 0x0092 }
            if (r11 == r0) goto L_0x0081
            r2.mo43647x(r0, r3)     // Catch:{ ConnectException -> 0x0099, f -> 0x0092 }
            r9 = r20
            r11 = r0
            goto L_0x0083
        L_0x0081:
            r9 = r20
        L_0x0083:
            r1.mo43651d(r11, r9, r5)     // Catch:{ ConnectException -> 0x0090, f -> 0x008e }
            boolean r0 = r6.mo48045d(r11)     // Catch:{ ConnectException -> 0x0090, f -> 0x008e }
            r2.mo43646s(r0, r5)     // Catch:{ ConnectException -> 0x0090, f -> 0x008e }
            return
        L_0x008e:
            r0 = move-exception
            goto L_0x0095
        L_0x0090:
            r0 = move-exception
            goto L_0x009c
        L_0x0092:
            r0 = move-exception
            r9 = r20
        L_0x0095:
            if (r12 != 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            throw r0
        L_0x0099:
            r0 = move-exception
            r9 = r20
        L_0x009c:
            if (r12 != 0) goto L_0x00cb
        L_0x009e:
            org.apache.commons.logging.Log r0 = r1.f50324a
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x00c6
            org.apache.commons.logging.Log r0 = r1.f50324a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Connect to "
            r11.append(r12)
            r11.append(r13)
            java.lang.String r12 = " timed out. "
            r11.append(r12)
            java.lang.String r12 = "Connection will be retried using another IP address"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r0.debug(r11)
        L_0x00c6:
            int r10 = r10 + 1
            r9 = 0
            goto L_0x0036
        L_0x00cb:
            p8.l r2 = new p8.l
            r2.<init>(r3, r0)
            throw r2
        L_0x00d1:
            return
        L_0x00d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Connection must not be open"
            r0.<init>(r2)
            throw r0
        L_0x00da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Parameters may not be null"
            r0.<init>(r2)
            throw r0
        L_0x00e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Target host may not be null"
            r0.<init>(r2)
            throw r0
        L_0x00ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Connection may not be null"
            r0.<init>(r2)
            goto L_0x00f3
        L_0x00f2:
            throw r0
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: p275c9.C11209f.mo43649b(p8.o, g8.l, java.net.InetAddress, j9.e, i9.d):void");
    }

    /* renamed from: c */
    public C12863o mo43650c() {
        return new C11208e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo43651d(Socket socket, C12811e eVar, C12790d dVar) throws IOException {
        socket.setTcpNoDelay(C12789c.m54264f(dVar));
        socket.setSoTimeout(C12789c.m54262d(dVar));
        int b = C12789c.m54260b(dVar);
        if (b >= 0) {
            socket.setSoLinger(b > 0, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public InetAddress[] mo43652e(String str) throws UnknownHostException {
        return InetAddress.getAllByName(str);
    }
}
