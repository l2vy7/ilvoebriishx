package p195c7;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p189a7.C6501a;
import p189a7.C6502b;
import p189a7.C6504d;
import p189a7.C6505e;
import p189a7.C6506f;
import p189a7.C6507g;
import p192b7.C6516a;
import p192b7.C6517b;

/* renamed from: c7.d */
/* compiled from: JsonDataEncoderBuilder */
public final class C6536d implements C6517b<C6536d> {

    /* renamed from: e */
    private static final C6504d<Object> f27177e = C6533a.m28323b();

    /* renamed from: f */
    private static final C6506f<String> f27178f = C6534b.m28325b();

    /* renamed from: g */
    private static final C6506f<Boolean> f27179g = C6535c.m28327b();

    /* renamed from: h */
    private static final C6538b f27180h = new C6538b((C6537a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C6504d<?>> f27181a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C6506f<?>> f27182b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6504d<Object> f27183c = f27177e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f27184d = false;

    /* renamed from: c7.d$a */
    /* compiled from: JsonDataEncoderBuilder */
    class C6537a implements C6501a {
        C6537a() {
        }

        /* renamed from: a */
        public void mo24327a(Object obj, Writer writer) throws IOException {
            C6539e eVar = new C6539e(writer, C6536d.this.f27181a, C6536d.this.f27182b, C6536d.this.f27183c, C6536d.this.f27184d);
            eVar.mo24366f(obj, false);
            eVar.mo24372m();
        }
    }

    /* renamed from: c7.d$b */
    /* compiled from: JsonDataEncoderBuilder */
    private static final class C6538b implements C6506f<Date> {

        /* renamed from: a */
        private static final DateFormat f27186a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f27186a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C6538b() {
        }

        /* renamed from: b */
        public void mo24334a(Date date, C6507g gVar) throws IOException {
            gVar.mo24335b(f27186a.format(date));
        }

        /* synthetic */ C6538b(C6537a aVar) {
            this();
        }
    }

    public C6536d() {
        mo24363m(String.class, f27178f);
        mo24363m(Boolean.class, f27179g);
        mo24363m(Date.class, f27180h);
    }

    /* renamed from: i */
    static /* synthetic */ void m28333i(Object obj, C6505e eVar) throws IOException {
        throw new C6502b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: f */
    public C6501a mo24359f() {
        return new C6537a();
    }

    /* renamed from: g */
    public C6536d mo24360g(C6516a aVar) {
        aVar.mo23178a(this);
        return this;
    }

    /* renamed from: h */
    public C6536d mo24361h(boolean z) {
        this.f27184d = z;
        return this;
    }

    /* renamed from: l */
    public <T> C6536d mo24349a(Class<T> cls, C6504d<? super T> dVar) {
        this.f27181a.put(cls, dVar);
        this.f27182b.remove(cls);
        return this;
    }

    /* renamed from: m */
    public <T> C6536d mo24363m(Class<T> cls, C6506f<? super T> fVar) {
        this.f27182b.put(cls, fVar);
        this.f27181a.remove(cls);
        return this;
    }
}
