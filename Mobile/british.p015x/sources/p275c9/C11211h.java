package p275c9;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p307f9.C12698a;
import p308g8.C12727k;
import p308g8.C12730n;
import p308g8.C12734r;
import p308g8.C12739w;
import p308g8.C12741y;
import p309g9.C12748f;
import p311h9.C12781t;
import p311h9.C12782u;
import p313i9.C12790d;
import p315j9.C12811e;
import p317k9.C12821b;

/* renamed from: c9.h */
/* compiled from: DefaultResponseParser */
public class C11211h extends C12698a {

    /* renamed from: h */
    private final Log f50327h = LogFactory.getLog(getClass());

    /* renamed from: i */
    private final C12734r f50328i;

    /* renamed from: j */
    private final C12821b f50329j;

    /* renamed from: k */
    private final int f50330k;

    public C11211h(C12748f fVar, C12781t tVar, C12734r rVar, C12790d dVar) {
        super(fVar, tVar, dVar);
        if (rVar != null) {
            this.f50328i = rVar;
            this.f50329j = new C12821b(128);
            this.f50330k = dVar.mo47928b("http.connection.max-status-line-garbage", Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Response factory may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12730n mo43654b(C12748f fVar) throws IOException, C12727k {
        int i = 0;
        while (true) {
            this.f50329j.mo47973j();
            int a = fVar.mo43655a(this.f50329j);
            if (a == -1 && i == 0) {
                throw new C12739w("The target server failed to respond");
            }
            C12782u uVar = new C12782u(0, this.f50329j.mo47978p());
            if (this.f55349e.mo47877b(this.f50329j, uVar)) {
                return this.f50328i.mo47807a(this.f55349e.mo47878c(this.f50329j, uVar), (C12811e) null);
            } else if (a != -1 && i < this.f50330k) {
                if (this.f50327h.isDebugEnabled()) {
                    Log log = this.f50327h;
                    log.debug("Garbage in response: " + this.f50329j.toString());
                }
                i++;
            }
        }
        throw new C12741y("The server failed to respond with a valid HTTP response");
    }
}
