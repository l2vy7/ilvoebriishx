package com.startapp;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.startapp.t9 */
/* compiled from: Sta */
public class C12347t9 {
    /* renamed from: a */
    public static String m53508a(List<String> list) {
        C11895f1 f1Var = new C11895f1();
        long currentTimeMillis = System.currentTimeMillis();
        BloomVersion bloomVersion = BloomVersion.FOUR;
        C11761a1 a1Var = f1Var.f52926b.f52590a.get(bloomVersion).f55219b;
        a1Var.getClass();
        OpenBitSet openBitSet = new OpenBitSet((long) (a1Var.f52519a * a1Var.f52520b));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ByteBuffer wrap = ByteBuffer.wrap(it.next().getBytes());
            long c = openBitSet.mo46518c();
            int i = a1Var.f52519a;
            long[] jArr = new long[i];
            long j = c / ((long) i);
            long j2 = currentTimeMillis;
            long a = C12343t6.m53498a(wrap, wrap.position(), wrap.remaining(), 0);
            long a2 = C12343t6.m53498a(wrap, wrap.position(), wrap.remaining(), a);
            Iterator<String> it2 = it;
            int i2 = 0;
            while (i2 < a1Var.f52519a) {
                BloomVersion bloomVersion2 = bloomVersion;
                long j3 = (long) i2;
                jArr[i2] = Math.abs(((j3 * a2) + a) % j) + (j3 * j);
                i2++;
                bloomVersion = bloomVersion2;
                a1Var = a1Var;
            }
            BloomVersion bloomVersion3 = bloomVersion;
            C11761a1 a1Var2 = a1Var;
            for (int i3 = 0; i3 < i; i3++) {
                openBitSet.mo46517b(jArr[i3]);
            }
            bloomVersion = bloomVersion3;
            currentTimeMillis = j2;
            it = it2;
            a1Var = a1Var2;
        }
        long j4 = currentTimeMillis;
        BloomVersion bloomVersion4 = bloomVersion;
        C12148qa qaVar = f1Var.f52925a;
        qaVar.getClass();
        try {
            String a3 = qaVar.f54072a.mo45525a(openBitSet);
            C12167ra raVar = qaVar.f54073b.f52590a.get(bloomVersion4).f55218a;
            return j4 + "-" + bloomVersion4.mo46529c() + "-" + raVar.mo45094a(a3);
        } catch (Throwable unused) {
            return null;
        }
    }
}
