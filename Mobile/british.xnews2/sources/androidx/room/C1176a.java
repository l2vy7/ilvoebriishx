package androidx.room;

import android.content.Context;
import androidx.room.C1199i;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p090i1.C5437c;

/* renamed from: androidx.room.a */
/* compiled from: DatabaseConfiguration */
public class C1176a {

    /* renamed from: a */
    public final C5437c.C5441c f5418a;

    /* renamed from: b */
    public final Context f5419b;

    /* renamed from: c */
    public final String f5420c;

    /* renamed from: d */
    public final C1199i.C1203d f5421d;

    /* renamed from: e */
    public final List<C1199i.C1201b> f5422e;

    /* renamed from: f */
    public final boolean f5423f;

    /* renamed from: g */
    public final C1199i.C1202c f5424g;

    /* renamed from: h */
    public final Executor f5425h;

    /* renamed from: i */
    public final Executor f5426i;

    /* renamed from: j */
    public final boolean f5427j;

    /* renamed from: k */
    public final boolean f5428k;

    /* renamed from: l */
    public final boolean f5429l;

    /* renamed from: m */
    private final Set<Integer> f5430m;

    /* renamed from: n */
    public final String f5431n;

    /* renamed from: o */
    public final File f5432o;

    public C1176a(Context context, String str, C5437c.C5441c cVar, C1199i.C1203d dVar, List<C1199i.C1201b> list, boolean z, C1199i.C1202c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f5418a = cVar;
        this.f5419b = context;
        this.f5420c = str;
        this.f5421d = dVar;
        this.f5422e = list;
        this.f5423f = z;
        this.f5424g = cVar2;
        this.f5425h = executor;
        this.f5426i = executor2;
        this.f5427j = z2;
        this.f5428k = z3;
        this.f5429l = z4;
        this.f5430m = set;
        this.f5431n = str2;
        this.f5432o = file;
    }

    /* renamed from: a */
    public boolean mo5847a(int i, int i2) {
        Set<Integer> set;
        if ((!(i > i2) || !this.f5429l) && this.f5428k && ((set = this.f5430m) == null || !set.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }
}
