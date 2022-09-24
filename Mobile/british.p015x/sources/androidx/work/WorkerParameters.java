package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p178y1.C6400a;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f6268a;

    /* renamed from: b */
    private C1427e f6269b;

    /* renamed from: c */
    private Set<String> f6270c;

    /* renamed from: d */
    private C1417a f6271d;

    /* renamed from: e */
    private int f6272e;

    /* renamed from: f */
    private Executor f6273f;

    /* renamed from: g */
    private C6400a f6274g;

    /* renamed from: h */
    private C1506z f6275h;

    /* renamed from: i */
    private C1497s f6276i;

    /* renamed from: j */
    private C1432i f6277j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1417a {

        /* renamed from: a */
        public List<String> f6278a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f6279b = Collections.emptyList();

        /* renamed from: c */
        public Network f6280c;
    }

    public WorkerParameters(UUID uuid, C1427e eVar, Collection<String> collection, C1417a aVar, int i, Executor executor, C6400a aVar2, C1506z zVar, C1497s sVar, C1432i iVar) {
        this.f6268a = uuid;
        this.f6269b = eVar;
        this.f6270c = new HashSet(collection);
        this.f6271d = aVar;
        this.f6272e = i;
        this.f6273f = executor;
        this.f6274g = aVar2;
        this.f6275h = zVar;
        this.f6276i = sVar;
        this.f6277j = iVar;
    }

    /* renamed from: a */
    public Executor mo6843a() {
        return this.f6273f;
    }

    /* renamed from: b */
    public C1432i mo6844b() {
        return this.f6277j;
    }

    /* renamed from: c */
    public UUID mo6845c() {
        return this.f6268a;
    }

    /* renamed from: d */
    public C1427e mo6846d() {
        return this.f6269b;
    }

    /* renamed from: e */
    public Network mo6847e() {
        return this.f6271d.f6280c;
    }

    /* renamed from: f */
    public C1497s mo6848f() {
        return this.f6276i;
    }

    /* renamed from: g */
    public int mo6849g() {
        return this.f6272e;
    }

    /* renamed from: h */
    public Set<String> mo6850h() {
        return this.f6270c;
    }

    /* renamed from: i */
    public C6400a mo6851i() {
        return this.f6274g;
    }

    /* renamed from: j */
    public List<String> mo6852j() {
        return this.f6271d.f6278a;
    }

    /* renamed from: k */
    public List<Uri> mo6853k() {
        return this.f6271d.f6279b;
    }

    /* renamed from: l */
    public C1506z mo6854l() {
        return this.f6275h;
    }
}
