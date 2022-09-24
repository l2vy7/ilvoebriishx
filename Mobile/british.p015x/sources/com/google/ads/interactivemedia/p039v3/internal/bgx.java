package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgx */
/* compiled from: IMASDK */
public final class bgx extends biy {

    /* renamed from: a */
    private static final Writer f16316a = new bgw();

    /* renamed from: b */
    private static final bfd f16317b = new bfd("closed");

    /* renamed from: c */
    private final List<bey> f16318c = new ArrayList();

    /* renamed from: d */
    private String f16319d;

    /* renamed from: e */
    private bey f16320e = bfa.f16231a;

    public bgx() {
        super(f16316a);
    }

    /* renamed from: s */
    private final bey m15889s() {
        List<bey> list = this.f16318c;
        return list.get(list.size() - 1);
    }

    /* renamed from: t */
    private final void m15890t(bey bey) {
        if (this.f16319d != null) {
            if (!(bey instanceof bfa) || mo15147r()) {
                ((bfb) m15889s()).mo14989a(this.f16319d, bey);
            }
            this.f16319d = null;
        } else if (this.f16318c.isEmpty()) {
            this.f16320e = bey;
        } else {
            bey s = m15889s();
            if (s instanceof bew) {
                ((bew) s).mo14979a(bey);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final bey mo15106a() {
        if (this.f16318c.isEmpty()) {
            return this.f16320e;
        }
        String valueOf = String.valueOf(this.f16318c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 34);
        sb.append("Expected one JSON element but was ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo15107b() throws IOException {
        bew bew = new bew();
        m15890t(bew);
        this.f16318c.add(bew);
    }

    /* renamed from: c */
    public final void mo15108c() throws IOException {
        bfb bfb = new bfb();
        m15890t(bfb);
        this.f16318c.add(bfb);
    }

    public final void close() throws IOException {
        if (this.f16318c.isEmpty()) {
            this.f16318c.add(f16317b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final void mo15110d() throws IOException {
        if (this.f16318c.isEmpty() || this.f16319d != null) {
            throw new IllegalStateException();
        } else if (m15889s() instanceof bew) {
            List<bey> list = this.f16318c;
            list.remove(list.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public final void mo15111e() throws IOException {
        if (this.f16318c.isEmpty() || this.f16319d != null) {
            throw new IllegalStateException();
        } else if (m15889s() instanceof bfb) {
            List<bey> list = this.f16318c;
            list.remove(list.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public final void mo15112f(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f16318c.isEmpty() || this.f16319d != null) {
            throw new IllegalStateException();
        } else if (m15889s() instanceof bfb) {
            this.f16319d = str;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void flush() throws IOException {
    }

    /* renamed from: g */
    public final void mo15114g() throws IOException {
        m15890t(bfa.f16231a);
    }

    /* renamed from: h */
    public final void mo15115h(long j) throws IOException {
        m15890t(new bfd((Number) Long.valueOf(j)));
    }

    /* renamed from: i */
    public final void mo15116i(Boolean bool) throws IOException {
        if (bool == null) {
            mo15114g();
        } else {
            m15890t(new bfd(bool));
        }
    }

    /* renamed from: j */
    public final void mo15117j(Number number) throws IOException {
        if (number == null) {
            mo15114g();
            return;
        }
        if (!mo15143n()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                String valueOf = String.valueOf(number);
                StringBuilder sb = new StringBuilder(valueOf.length() + 33);
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m15890t(new bfd(number));
    }

    /* renamed from: k */
    public final void mo15118k(String str) throws IOException {
        if (str == null) {
            mo15114g();
        } else {
            m15890t(new bfd(str));
        }
    }

    /* renamed from: l */
    public final void mo15119l(boolean z) throws IOException {
        m15890t(new bfd(Boolean.valueOf(z)));
    }
}
