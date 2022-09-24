package p065d2;

import java.io.IOException;

/* renamed from: d2.e */
/* compiled from: HttpException */
public final class C5158e extends IOException {

    /* renamed from: b */
    private final int f22593b;

    public C5158e(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public C5158e(String str) {
        this(str, -1);
    }

    public C5158e(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public C5158e(String str, int i, Throwable th) {
        super(str, th);
        this.f22593b = i;
    }
}
