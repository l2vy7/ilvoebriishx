package p148s3;

import java.io.IOException;
import p189a7.C6503c;
import p189a7.C6504d;
import p189a7.C6505e;
import p192b7.C6516a;
import p192b7.C6517b;

/* renamed from: s3.b */
/* compiled from: AutoBatchedLogRequestEncoder */
public final class C6027b implements C6516a {

    /* renamed from: a */
    public static final C6516a f25091a = new C6027b();

    /* renamed from: s3.b$a */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C6028a implements C6504d<C6025a> {

        /* renamed from: a */
        static final C6028a f25092a = new C6028a();

        /* renamed from: b */
        private static final C6503c f25093b = C6503c.m28302b("sdkVersion");

        /* renamed from: c */
        private static final C6503c f25094c = C6503c.m28302b("model");

        /* renamed from: d */
        private static final C6503c f25095d = C6503c.m28302b("hardware");

        /* renamed from: e */
        private static final C6503c f25096e = C6503c.m28302b("device");

        /* renamed from: f */
        private static final C6503c f25097f = C6503c.m28302b("product");

        /* renamed from: g */
        private static final C6503c f25098g = C6503c.m28302b("osBuild");

        /* renamed from: h */
        private static final C6503c f25099h = C6503c.m28302b("manufacturer");

        /* renamed from: i */
        private static final C6503c f25100i = C6503c.m28302b("fingerprint");

        /* renamed from: j */
        private static final C6503c f25101j = C6503c.m28302b("locale");

        /* renamed from: k */
        private static final C6503c f25102k = C6503c.m28302b("country");

        /* renamed from: l */
        private static final C6503c f25103l = C6503c.m28302b("mccMnc");

        /* renamed from: m */
        private static final C6503c f25104m = C6503c.m28302b("applicationBuild");

        private C6028a() {
        }

        /* renamed from: b */
        public void mo23179a(C6025a aVar, C6505e eVar) throws IOException {
            eVar.mo24332a(f25093b, aVar.mo23164m());
            eVar.mo24332a(f25094c, aVar.mo23161j());
            eVar.mo24332a(f25095d, aVar.mo23157f());
            eVar.mo24332a(f25096e, aVar.mo23155d());
            eVar.mo24332a(f25097f, aVar.mo23163l());
            eVar.mo24332a(f25098g, aVar.mo23162k());
            eVar.mo24332a(f25099h, aVar.mo23159h());
            eVar.mo24332a(f25100i, aVar.mo23156e());
            eVar.mo24332a(f25101j, aVar.mo23158g());
            eVar.mo24332a(f25102k, aVar.mo23154c());
            eVar.mo24332a(f25103l, aVar.mo23160i());
            eVar.mo24332a(f25104m, aVar.mo23153b());
        }
    }

    /* renamed from: s3.b$b */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C6029b implements C6504d<C6051j> {

        /* renamed from: a */
        static final C6029b f25105a = new C6029b();

        /* renamed from: b */
        private static final C6503c f25106b = C6503c.m28302b("logRequest");

        private C6029b() {
        }

        /* renamed from: b */
        public void mo23179a(C6051j jVar, C6505e eVar) throws IOException {
            eVar.mo24332a(f25106b, jVar.mo23189c());
        }
    }

    /* renamed from: s3.b$c */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C6030c implements C6504d<C6052k> {

        /* renamed from: a */
        static final C6030c f25107a = new C6030c();

        /* renamed from: b */
        private static final C6503c f25108b = C6503c.m28302b("clientType");

        /* renamed from: c */
        private static final C6503c f25109c = C6503c.m28302b("androidClientInfo");

        private C6030c() {
        }

        /* renamed from: b */
        public void mo23179a(C6052k kVar, C6505e eVar) throws IOException {
            eVar.mo24332a(f25108b, kVar.mo23194c());
            eVar.mo24332a(f25109c, kVar.mo23193b());
        }
    }

    /* renamed from: s3.b$d */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C6031d implements C6504d<C6055l> {

        /* renamed from: a */
        static final C6031d f25110a = new C6031d();

        /* renamed from: b */
        private static final C6503c f25111b = C6503c.m28302b("eventTimeMs");

        /* renamed from: c */
        private static final C6503c f25112c = C6503c.m28302b("eventCode");

        /* renamed from: d */
        private static final C6503c f25113d = C6503c.m28302b("eventUptimeMs");

        /* renamed from: e */
        private static final C6503c f25114e = C6503c.m28302b("sourceExtension");

        /* renamed from: f */
        private static final C6503c f25115f = C6503c.m28302b("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C6503c f25116g = C6503c.m28302b("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C6503c f25117h = C6503c.m28302b("networkConnectionInfo");

        private C6031d() {
        }

        /* renamed from: b */
        public void mo23179a(C6055l lVar, C6505e eVar) throws IOException {
            eVar.mo24333d(f25111b, lVar.mo23202c());
            eVar.mo24332a(f25112c, lVar.mo23201b());
            eVar.mo24333d(f25113d, lVar.mo23203d());
            eVar.mo24332a(f25114e, lVar.mo23206f());
            eVar.mo24332a(f25115f, lVar.mo23207g());
            eVar.mo24333d(f25116g, lVar.mo23208h());
            eVar.mo24332a(f25117h, lVar.mo23204e());
        }
    }

    /* renamed from: s3.b$e */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C6032e implements C6504d<C6057m> {

        /* renamed from: a */
        static final C6032e f25118a = new C6032e();

        /* renamed from: b */
        private static final C6503c f25119b = C6503c.m28302b("requestTimeMs");

        /* renamed from: c */
        private static final C6503c f25120c = C6503c.m28302b("requestUptimeMs");

        /* renamed from: d */
        private static final C6503c f25121d = C6503c.m28302b("clientInfo");

        /* renamed from: e */
        private static final C6503c f25122e = C6503c.m28302b("logSource");

        /* renamed from: f */
        private static final C6503c f25123f = C6503c.m28302b("logSourceName");

        /* renamed from: g */
        private static final C6503c f25124g = C6503c.m28302b("logEvent");

        /* renamed from: h */
        private static final C6503c f25125h = C6503c.m28302b("qosTier");

        private C6032e() {
        }

        /* renamed from: b */
        public void mo23179a(C6057m mVar, C6505e eVar) throws IOException {
            eVar.mo24333d(f25119b, mVar.mo23225g());
            eVar.mo24333d(f25120c, mVar.mo23226h());
            eVar.mo24332a(f25121d, mVar.mo23219b());
            eVar.mo24332a(f25122e, mVar.mo23221d());
            eVar.mo24332a(f25123f, mVar.mo23222e());
            eVar.mo24332a(f25124g, mVar.mo23220c());
            eVar.mo24332a(f25125h, mVar.mo23224f());
        }
    }

    /* renamed from: s3.b$f */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C6033f implements C6504d<C6060o> {

        /* renamed from: a */
        static final C6033f f25126a = new C6033f();

        /* renamed from: b */
        private static final C6503c f25127b = C6503c.m28302b("networkType");

        /* renamed from: c */
        private static final C6503c f25128c = C6503c.m28302b("mobileSubtype");

        private C6033f() {
        }

        /* renamed from: b */
        public void mo23179a(C6060o oVar, C6505e eVar) throws IOException {
            eVar.mo24332a(f25127b, oVar.mo23242c());
            eVar.mo24332a(f25128c, oVar.mo23241b());
        }
    }

    private C6027b() {
    }

    /* renamed from: a */
    public void mo23178a(C6517b<?> bVar) {
        C6029b bVar2 = C6029b.f25105a;
        bVar.mo24349a(C6051j.class, bVar2);
        bVar.mo24349a(C6037d.class, bVar2);
        C6032e eVar = C6032e.f25118a;
        bVar.mo24349a(C6057m.class, eVar);
        bVar.mo24349a(C6044g.class, eVar);
        C6030c cVar = C6030c.f25107a;
        bVar.mo24349a(C6052k.class, cVar);
        bVar.mo24349a(C6038e.class, cVar);
        C6028a aVar = C6028a.f25092a;
        bVar.mo24349a(C6025a.class, aVar);
        bVar.mo24349a(C6034c.class, aVar);
        C6031d dVar = C6031d.f25110a;
        bVar.mo24349a(C6055l.class, dVar);
        bVar.mo24349a(C6041f.class, dVar);
        C6033f fVar = C6033f.f25126a;
        bVar.mo24349a(C6060o.class, fVar);
        bVar.mo24349a(C6048i.class, fVar);
    }
}
