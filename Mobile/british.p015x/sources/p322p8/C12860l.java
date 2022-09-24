package p322p8;

import java.net.ConnectException;
import p308g8.C12728l;

/* renamed from: p8.l */
/* compiled from: HttpHostConnectException */
public class C12860l extends ConnectException {

    /* renamed from: b */
    private final C12728l f55523b;

    public C12860l(C12728l lVar, ConnectException connectException) {
        super("Connection to " + lVar + " refused");
        this.f55523b = lVar;
        initCause(connectException);
    }
}
