package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.q */
/* compiled from: GraphRequestBatch */
public class C3652q extends AbstractList<GraphRequest> {

    /* renamed from: h */
    private static AtomicInteger f13562h = new AtomicInteger();

    /* renamed from: b */
    private Handler f13563b;

    /* renamed from: c */
    private List<GraphRequest> f13564c;

    /* renamed from: d */
    private int f13565d;

    /* renamed from: e */
    private final String f13566e;

    /* renamed from: f */
    private List<C3653a> f13567f;

    /* renamed from: g */
    private String f13568g;

    /* renamed from: com.facebook.q$a */
    /* compiled from: GraphRequestBatch */
    public interface C3653a {
        /* renamed from: a */
        void mo11869a(C3652q qVar);
    }

    /* renamed from: com.facebook.q$b */
    /* compiled from: GraphRequestBatch */
    public interface C3654b extends C3653a {
        /* renamed from: b */
        void mo12379b(C3652q qVar, long j, long j2);
    }

    public C3652q() {
        this.f13564c = new ArrayList();
        this.f13565d = 0;
        this.f13566e = Integer.valueOf(f13562h.incrementAndGet()).toString();
        this.f13567f = new ArrayList();
        this.f13564c = new ArrayList();
    }

    /* renamed from: A */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return this.f13564c.set(i, graphRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo12356D(Handler handler) {
        this.f13563b = handler;
    }

    /* renamed from: a */
    public final void add(int i, GraphRequest graphRequest) {
        this.f13564c.add(i, graphRequest);
    }

    /* renamed from: b */
    public final boolean add(GraphRequest graphRequest) {
        return this.f13564c.add(graphRequest);
    }

    /* renamed from: c */
    public void mo12361c(C3653a aVar) {
        if (!this.f13567f.contains(aVar)) {
            this.f13567f.add(aVar);
        }
    }

    public final void clear() {
        this.f13564c.clear();
    }

    /* renamed from: e */
    public final List<C3655r> mo12363e() {
        return mo12364f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List<C3655r> mo12364f() {
        return GraphRequest.m11276j(this);
    }

    /* renamed from: g */
    public final C3651p mo12365g() {
        return mo12367j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3651p mo12367j() {
        return GraphRequest.m11279m(this);
    }

    /* renamed from: q */
    public final GraphRequest get(int i) {
        return this.f13564c.get(i);
    }

    /* renamed from: r */
    public final String mo12369r() {
        return this.f13568g;
    }

    public final int size() {
        return this.f13564c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Handler mo12373t() {
        return this.f13563b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final List<C3653a> mo12374u() {
        return this.f13567f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final String mo12375v() {
        return this.f13566e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final List<GraphRequest> mo12376x() {
        return this.f13564c;
    }

    /* renamed from: y */
    public int mo12377y() {
        return this.f13565d;
    }

    /* renamed from: z */
    public final GraphRequest remove(int i) {
        return this.f13564c.remove(i);
    }

    public C3652q(Collection<GraphRequest> collection) {
        this.f13564c = new ArrayList();
        this.f13565d = 0;
        this.f13566e = Integer.valueOf(f13562h.incrementAndGet()).toString();
        this.f13567f = new ArrayList();
        this.f13564c = new ArrayList(collection);
    }

    public C3652q(GraphRequest... graphRequestArr) {
        this.f13564c = new ArrayList();
        this.f13565d = 0;
        this.f13566e = Integer.valueOf(f13562h.incrementAndGet()).toString();
        this.f13567f = new ArrayList();
        this.f13564c = Arrays.asList(graphRequestArr);
    }
}
