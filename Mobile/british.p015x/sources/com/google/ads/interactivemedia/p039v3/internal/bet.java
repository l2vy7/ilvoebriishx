package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bet */
/* compiled from: IMASDK */
public final class bet {

    /* renamed from: a */
    final List<bfj> f16215a;

    /* renamed from: b */
    final boolean f16216b;

    /* renamed from: c */
    private final ThreadLocal<Map<biu<?>, bes<?>>> f16217c;

    /* renamed from: d */
    private final Map<biu<?>, bfi<?>> f16218d;

    /* renamed from: e */
    private final bfv f16219e;

    /* renamed from: f */
    private final bgt f16220f;

    static {
        biu.m15938d(Object.class);
    }

    public bet() {
        bfx bfx = bfx.f16262a;
        throw null;
    }

    /* renamed from: a */
    static void m15780a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder(168);
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: j */
    public static final biy m15781j(Writer writer) throws IOException {
        biy biy = new biy(writer);
        biy.mo15146q(false);
        return biy;
    }

    /* renamed from: b */
    public final <T> bfi<T> mo14965b(biu<T> biu) {
        boolean z;
        bfi<T> bfi = this.f16218d.get(biu);
        if (bfi != null) {
            return bfi;
        }
        Map map = this.f16217c.get();
        if (map == null) {
            map = new HashMap();
            this.f16217c.set(map);
            z = true;
        } else {
            z = false;
        }
        bes bes = (bes) map.get(biu);
        if (bes != null) {
            return bes;
        }
        try {
            bes bes2 = new bes();
            map.put(biu, bes2);
            for (bfj a : this.f16215a) {
                bfi<T> a2 = a.mo14244a(this, biu);
                if (a2 != null) {
                    bes2.mo14964a(a2);
                    this.f16218d.put(biu, a2);
                    return a2;
                }
            }
            String valueOf = String.valueOf(biu);
            StringBuilder sb = new StringBuilder(valueOf.length() + 40);
            sb.append("GSON (${project.version}) cannot handle ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } finally {
            map.remove(biu);
            if (z) {
                this.f16217c.remove();
            }
        }
    }

    /* renamed from: c */
    public final <T> bfi<T> mo14966c(bfj bfj, biu<T> biu) {
        if (!this.f16215a.contains(bfj)) {
            bfj = this.f16220f;
        }
        boolean z = false;
        for (bfj next : this.f16215a) {
            if (z) {
                bfi<T> a = next.mo14244a(this, biu);
                if (a != null) {
                    return a;
                }
            } else if (next == bfj) {
                z = true;
            }
        }
        String valueOf = String.valueOf(biu);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("GSON cannot serialize ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public final <T> bfi<T> mo14967d(Class<T> cls) {
        return mo14965b(biu.m15938d(cls));
    }

    /* renamed from: e */
    public final String mo14968e(Object obj) {
        if (obj == null) {
            bfa bfa = bfa.f16231a;
            StringWriter stringWriter = new StringWriter();
            try {
                mo14970g(bfa, m15781j(aru.m14640f(stringWriter)));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new bez((Throwable) e);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                mo14969f(obj, cls, m15781j(aru.m14640f(stringWriter2)));
                return stringWriter2.toString();
            } catch (IOException e2) {
                throw new bez((Throwable) e2);
            }
        }
    }

    /* renamed from: f */
    public final void mo14969f(Object obj, Type type, biy biy) throws bez {
        String str;
        bfi<?> b = mo14965b(biu.m15937c(type));
        boolean n = biy.mo15143n();
        biy.mo15142m(true);
        boolean p = biy.mo15145p();
        biy.mo15144o(this.f16216b);
        boolean r = biy.mo15147r();
        biy.mo15146q(false);
        try {
            b.write(biy, obj);
            biy.mo15142m(n);
            biy.mo15144o(p);
            biy.mo15146q(r);
        } catch (IOException e) {
            throw new bez((Throwable) e);
        } catch (AssertionError e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str = "AssertionError (GSON ${project.version}): ".concat(valueOf);
            } else {
                str = new String("AssertionError (GSON ${project.version}): ");
            }
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            biy.mo15142m(n);
            biy.mo15144o(p);
            biy.mo15146q(r);
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo14970g(bey bey, biy biy) throws bez {
        String str;
        boolean n = biy.mo15143n();
        biy.mo15142m(true);
        boolean p = biy.mo15145p();
        biy.mo15144o(this.f16216b);
        boolean r = biy.mo15147r();
        biy.mo15146q(false);
        try {
            aru.m14639e(bey, biy);
            biy.mo15142m(n);
            biy.mo15144o(p);
            biy.mo15146q(r);
        } catch (IOException e) {
            throw new bez((Throwable) e);
        } catch (AssertionError e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str = "AssertionError (GSON ${project.version}): ".concat(valueOf);
            } else {
                str = new String("AssertionError (GSON ${project.version}): ");
            }
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            biy.mo15142m(n);
            biy.mo15144o(p);
            biy.mo15146q(r);
            throw th;
        }
    }

    /* renamed from: h */
    public final <T> T mo14971h(Reader reader, Type type) throws bez, bff {
        biw biw = new biw(reader);
        biw.mo15138q(false);
        T i = mo14972i(biw, type);
        if (i != null) {
            try {
                if (biw.mo15101p() != 10) {
                    throw new bez("JSON document was not fully consumed.");
                }
            } catch (biz e) {
                throw new bff((Throwable) e);
            } catch (IOException e2) {
                throw new bez((Throwable) e2);
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = java.lang.String.valueOf(r7.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r3.length() != 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2 = "AssertionError (GSON ${project.version}): ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r2 = new java.lang.String("AssertionError (GSON ${project.version}): ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r1 = new java.lang.AssertionError(r2);
        r1.initCause(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.bff((java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.bff((java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r6.mo15138q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.bff((java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        r6.mo15138q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[ExcHandler: AssertionError (r7v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[Catch:{ EOFException -> 0x001b, IllegalStateException -> 0x004c, IOException -> 0x0045, AssertionError -> 0x0020, all -> 0x001e }, ExcHandler: IOException (r7v4 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A[Catch:{ EOFException -> 0x001b, IllegalStateException -> 0x004c, IOException -> 0x0045, AssertionError -> 0x0020, all -> 0x001e }, ExcHandler: IllegalStateException (r7v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A[SYNTHETIC, Splitter:B:28:0x005b] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo14972i(com.google.ads.interactivemedia.p039v3.internal.biw r6, java.lang.reflect.Type r7) throws com.google.ads.interactivemedia.p039v3.internal.bez, com.google.ads.interactivemedia.p039v3.internal.bff {
        /*
            r5 = this;
            boolean r0 = r6.mo15139r()
            r1 = 1
            r6.mo15138q(r1)
            r6.mo15101p()     // Catch:{ EOFException -> 0x0053, IllegalStateException -> 0x004c, IOException -> 0x0045, AssertionError -> 0x0020 }
            com.google.ads.interactivemedia.v3.internal.biu r7 = com.google.ads.interactivemedia.p039v3.internal.biu.m15937c(r7)     // Catch:{ EOFException -> 0x001b, IllegalStateException -> 0x004c, IOException -> 0x0045, AssertionError -> 0x0020 }
            com.google.ads.interactivemedia.v3.internal.bfi r7 = r5.mo14965b(r7)     // Catch:{ EOFException -> 0x001b, IllegalStateException -> 0x004c, IOException -> 0x0045, AssertionError -> 0x0020 }
            java.lang.Object r7 = r7.read(r6)     // Catch:{ EOFException -> 0x001b, IllegalStateException -> 0x004c, IOException -> 0x0045, AssertionError -> 0x0020 }
            r6.mo15138q(r0)
            return r7
        L_0x001b:
            r7 = move-exception
            r1 = 0
            goto L_0x0054
        L_0x001e:
            r7 = move-exception
            goto L_0x0061
        L_0x0020:
            r7 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x001e }
            java.lang.String r2 = "AssertionError (GSON ${project.version}): "
            java.lang.String r3 = r7.getMessage()     // Catch:{ all -> 0x001e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x001e }
            int r4 = r3.length()     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x0038
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x001e }
            goto L_0x003e
        L_0x0038:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x001e }
            r3.<init>(r2)     // Catch:{ all -> 0x001e }
            r2 = r3
        L_0x003e:
            r1.<init>(r2)     // Catch:{ all -> 0x001e }
            r1.initCause(r7)     // Catch:{ all -> 0x001e }
            throw r1     // Catch:{ all -> 0x001e }
        L_0x0045:
            r7 = move-exception
            com.google.ads.interactivemedia.v3.internal.bff r1 = new com.google.ads.interactivemedia.v3.internal.bff     // Catch:{ all -> 0x001e }
            r1.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x001e }
            throw r1     // Catch:{ all -> 0x001e }
        L_0x004c:
            r7 = move-exception
            com.google.ads.interactivemedia.v3.internal.bff r1 = new com.google.ads.interactivemedia.v3.internal.bff     // Catch:{ all -> 0x001e }
            r1.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x001e }
            throw r1     // Catch:{ all -> 0x001e }
        L_0x0053:
            r7 = move-exception
        L_0x0054:
            if (r1 == 0) goto L_0x005b
            r6.mo15138q(r0)
            r6 = 0
            return r6
        L_0x005b:
            com.google.ads.interactivemedia.v3.internal.bff r1 = new com.google.ads.interactivemedia.v3.internal.bff     // Catch:{ all -> 0x001e }
            r1.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x001e }
            throw r1     // Catch:{ all -> 0x001e }
        L_0x0061:
            r6.mo15138q(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bet.mo14972i(com.google.ads.interactivemedia.v3.internal.biw, java.lang.reflect.Type):java.lang.Object");
    }

    public final String toString() {
        return "{serializeNulls:" + false + ",factories:" + this.f16215a + ",instanceCreators:" + this.f16219e + "}";
    }

    bet(bfx bfx, bem bem, Map<Type, bev<?>> map, boolean z, int i, List<bfj> list) {
        bfi bfi;
        this.f16217c = new ThreadLocal<>();
        this.f16218d = new ConcurrentHashMap();
        bfv bfv = new bfv(map);
        this.f16219e = bfv;
        this.f16216b = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bip.f16398W);
        arrayList.add(bgz.f16324a);
        arrayList.add(bfx);
        arrayList.addAll(list);
        arrayList.add(bip.f16377B);
        arrayList.add(bip.f16412m);
        arrayList.add(bip.f16406g);
        arrayList.add(bip.f16408i);
        arrayList.add(bip.f16410k);
        if (i == bfg.f16234a) {
            bfi = bip.f16419t;
        } else {
            bfi = new bep();
        }
        arrayList.add(bip.m15927c(Long.TYPE, Long.class, bfi));
        arrayList.add(bip.m15927c(Double.TYPE, Double.class, new ben()));
        arrayList.add(bip.m15927c(Float.TYPE, Float.class, new beo()));
        arrayList.add(bip.f16421v);
        arrayList.add(bip.f16414o);
        arrayList.add(bip.f16416q);
        arrayList.add(bip.m15926b(AtomicLong.class, new beq(bfi).nullSafe()));
        arrayList.add(bip.m15926b(AtomicLongArray.class, new ber(bfi).nullSafe()));
        arrayList.add(bip.f16418s);
        arrayList.add(bip.f16423x);
        arrayList.add(bip.f16379D);
        arrayList.add(bip.f16381F);
        arrayList.add(bip.m15926b(BigDecimal.class, bip.f16425z));
        arrayList.add(bip.m15926b(BigInteger.class, bip.f16376A));
        arrayList.add(bip.f16383H);
        arrayList.add(bip.f16385J);
        arrayList.add(bip.f16389N);
        arrayList.add(bip.f16391P);
        arrayList.add(bip.f16396U);
        arrayList.add(bip.f16387L);
        arrayList.add(bip.f16403d);
        arrayList.add(bgs.f16306a);
        arrayList.add(bip.f16394S);
        arrayList.add(bhe.f16345a);
        arrayList.add(bhd.f16343a);
        arrayList.add(bip.f16392Q);
        arrayList.add(bgp.f16300a);
        arrayList.add(bip.f16401b);
        arrayList.add(new bgt(bfv, (byte[]) null));
        arrayList.add(new bgt(bfv, (char[]) null));
        bgt bgt = new bgt(bfv);
        this.f16220f = bgt;
        arrayList.add(bgt);
        arrayList.add(bip.f16399X);
        arrayList.add(new bhc(bfv, bem, bfx, bgt));
        this.f16215a = Collections.unmodifiableList(arrayList);
    }
}
