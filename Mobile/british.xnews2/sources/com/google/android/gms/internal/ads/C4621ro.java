package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.ro */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4621ro {
    /* renamed from: a */
    static long m20902a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? m20902a((j * j) % 1073807359, i >> 1) : j * (m20902a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    /* renamed from: b */
    static String m20903b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            co0.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public static void m20904c(String[] strArr, int i, int i2, PriorityQueue<C8093qo> priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            m20905d(i, m20906e(strArr2, 0, length), m20903b(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long e = m20906e(strArr2, 0, 6);
        m20905d(i, e, m20903b(strArr2, 0, 6), 6, priorityQueue);
        long a = m20902a(16785407, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i3 < length2 - 5) {
                e = ((((((e + 1073807359) - ((((((long) C4615no.m20740a(strArr2[i3 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) C4615no.m20740a(strArr2[i3 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                m20905d(i, e, m20903b(strArr2, i3, 6), length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    static void m20905d(int i, long j, String str, int i2, PriorityQueue<C8093qo> priorityQueue) {
        C8093qo qoVar = new C8093qo(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f38207c <= qoVar.f38207c && priorityQueue.peek().f38205a <= qoVar.f38205a)) && !priorityQueue.contains(qoVar)) {
            priorityQueue.add(qoVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: e */
    private static long m20906e(String[] strArr, int i, int i2) {
        long a = (((long) C4615no.m20740a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) C4615no.m20740a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
