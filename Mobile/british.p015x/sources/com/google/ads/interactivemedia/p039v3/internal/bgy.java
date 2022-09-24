package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgy */
/* compiled from: IMASDK */
final class bgy<K, V> extends bfi<Map<K, V>> {

    /* renamed from: a */
    private final bfi<K> f16321a;

    /* renamed from: b */
    private final bfi<V> f16322b;

    /* renamed from: c */
    private final bgj<? extends Map<K, V>> f16323c;

    public bgy(bet bet, Type type, bfi bfi, Type type2, bfi bfi2, bgj bgj) {
        this.f16321a = new bhi(bet, bfi, type);
        this.f16322b = new bhi(bet, bfi2, type2);
        this.f16323c = bgj;
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        int p = biw.mo15101p();
        if (p == 9) {
            biw.mo15094i();
            return null;
        }
        Map map = (Map) this.f16323c.mo15028a();
        if (p == 1) {
            biw.mo15085a();
            while (biw.mo15090e()) {
                biw.mo15085a();
                K read = this.f16321a.read(biw);
                if (map.put(read, this.f16322b.read(biw)) == null) {
                    biw.mo15086b();
                } else {
                    String valueOf = String.valueOf(read);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 15);
                    sb.append("duplicate key: ");
                    sb.append(valueOf);
                    throw new bff(sb.toString());
                }
            }
            biw.mo15086b();
        } else {
            biw.mo15087c();
            while (biw.mo15090e()) {
                bfz.f16269a.mo15036a(biw);
                K read2 = this.f16321a.read(biw);
                if (map.put(read2, this.f16322b.read(biw)) != null) {
                    String valueOf2 = String.valueOf(read2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 15);
                    sb2.append("duplicate key: ");
                    sb2.append(valueOf2);
                    throw new bff(sb2.toString());
                }
            }
            biw.mo15089d();
        }
        return map;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            biy.mo15114g();
            return;
        }
        biy.mo15108c();
        for (Map.Entry entry : map.entrySet()) {
            biy.mo15112f(String.valueOf(entry.getKey()));
            this.f16322b.write(biy, entry.getValue());
        }
        biy.mo15111e();
    }
}
