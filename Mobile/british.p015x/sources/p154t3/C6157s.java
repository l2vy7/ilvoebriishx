package p154t3;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p005a4.C0078c;

/* renamed from: t3.s */
/* compiled from: TransportRuntimeComponent */
abstract class C6157s implements Closeable {

    /* renamed from: t3.s$a */
    /* compiled from: TransportRuntimeComponent */
    interface C6158a {
        /* renamed from: a */
        C6158a mo23514a(Context context);

        C6157s build();
    }

    C6157s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C0078c mo23512c();

    public void close() throws IOException {
        mo23512c().close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C6156r mo23513d();
}
