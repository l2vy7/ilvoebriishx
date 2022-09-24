package p171x;

import java.util.ArrayList;
import java.util.Iterator;
import p166w.C6243d;
import p166w.C6246e;
import p166w.C6249f;

/* renamed from: x.c */
/* compiled from: ChainRun */
public class C6320c extends C6333m {

    /* renamed from: k */
    ArrayList<C6333m> f26091k = new ArrayList<>();

    /* renamed from: l */
    private int f26092l;

    public C6320c(C6246e eVar, int i) {
        super(eVar);
        this.f26142f = i;
        m27833q();
    }

    /* renamed from: q */
    private void m27833q() {
        C6246e eVar;
        C6246e eVar2 = this.f26138b;
        C6246e I = eVar2.mo23797I(this.f26142f);
        while (true) {
            C6246e eVar3 = I;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            I = eVar2.mo23797I(this.f26142f);
        }
        this.f26138b = eVar;
        this.f26091k.add(eVar.mo23801K(this.f26142f));
        C6246e G = eVar.mo23793G(this.f26142f);
        while (G != null) {
            this.f26091k.add(G.mo23801K(this.f26142f));
            G = G.mo23793G(this.f26142f);
        }
        Iterator<C6333m> it = this.f26091k.iterator();
        while (it.hasNext()) {
            C6333m next = it.next();
            int i = this.f26142f;
            if (i == 0) {
                next.f26138b.f25763c = this;
            } else if (i == 1) {
                next.f26138b.f25765d = this;
            }
        }
        if ((this.f26142f == 0 && ((C6249f) this.f26138b.mo23795H()).mo23873c1()) && this.f26091k.size() > 1) {
            ArrayList<C6333m> arrayList = this.f26091k;
            this.f26138b = arrayList.get(arrayList.size() - 1).f26138b;
        }
        this.f26092l = this.f26142f == 0 ? this.f26138b.mo23857y() : this.f26138b.mo23804M();
    }

    /* renamed from: r */
    private C6246e m27834r() {
        for (int i = 0; i < this.f26091k.size(); i++) {
            C6333m mVar = this.f26091k.get(i);
            if (mVar.f26138b.mo23807P() != 8) {
                return mVar.f26138b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C6246e m27835s() {
        for (int size = this.f26091k.size() - 1; size >= 0; size--) {
            C6333m mVar = this.f26091k.get(size);
            if (mVar.f26138b.mo23807P() != 8) {
                return mVar.f26138b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a6, code lost:
        if (r1 != r7) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cc, code lost:
        if (r1 != r7) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24081a(p171x.C6321d r26) {
        /*
            r25 = this;
            r0 = r25
            x.f r1 = r0.f26144h
            boolean r1 = r1.f26111j
            if (r1 == 0) goto L_0x0441
            x.f r1 = r0.f26145i
            boolean r1 = r1.f26111j
            if (r1 != 0) goto L_0x0010
            goto L_0x0441
        L_0x0010:
            w.e r1 = r0.f26138b
            w.e r1 = r1.mo23795H()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p166w.C6249f
            if (r3 == 0) goto L_0x0023
            w.f r1 = (p166w.C6249f) r1
            boolean r1 = r1.mo23873c1()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            x.f r3 = r0.f26145i
            int r3 = r3.f26108g
            x.f r4 = r0.f26144h
            int r4 = r4.f26108g
            int r3 = r3 - r4
            java.util.ArrayList<x.m> r4 = r0.f26091k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<x.m> r8 = r0.f26091k
            java.lang.Object r8 = r8.get(r5)
            x.m r8 = (p171x.C6333m) r8
            w.e r8 = r8.f26138b
            int r8 = r8.mo23807P()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<x.m> r10 = r0.f26091k
            java.lang.Object r10 = r10.get(r9)
            x.m r10 = (p171x.C6333m) r10
            w.e r10 = r10.f26138b
            int r10 = r10.mo23807P()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            if (r9 >= r11) goto L_0x010b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0071:
            if (r13 >= r4) goto L_0x00fd
            java.util.ArrayList<x.m> r2 = r0.f26091k
            java.lang.Object r2 = r2.get(r13)
            x.m r2 = (p171x.C6333m) r2
            w.e r11 = r2.f26138b
            int r11 = r11.mo23807P()
            if (r11 != r7) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0090
            if (r13 < r5) goto L_0x0090
            x.f r11 = r2.f26144h
            int r11 = r11.f26107f
            int r14 = r14 + r11
        L_0x0090:
            x.g r11 = r2.f26141e
            int r7 = r11.f26108g
            w.e$b r10 = r2.f26140d
            w.e$b r12 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            int r11 = r0.f26142f
            if (r11 != 0) goto L_0x00ae
            w.e r12 = r2.f26138b
            x.j r12 = r12.f25767e
            x.g r12 = r12.f26141e
            boolean r12 = r12.f26111j
            if (r12 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r12 = 1
            if (r11 != r12) goto L_0x00bc
            w.e r11 = r2.f26138b
            x.l r11 = r11.f25769f
            x.g r11 = r11.f26141e
            boolean r11 = r11.f26111j
            if (r11 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r19 = r7
            goto L_0x00d5
        L_0x00bf:
            r19 = r7
            r12 = 1
            int r7 = r2.f26137a
            if (r7 != r12) goto L_0x00cd
            if (r9 != 0) goto L_0x00cd
            int r7 = r11.f26123m
            int r15 = r15 + 1
            goto L_0x00d3
        L_0x00cd:
            boolean r7 = r11.f26111j
            if (r7 == 0) goto L_0x00d5
            r7 = r19
        L_0x00d3:
            r10 = 1
            goto L_0x00d7
        L_0x00d5:
            r7 = r19
        L_0x00d7:
            if (r10 != 0) goto L_0x00eb
            int r15 = r15 + 1
            w.e r7 = r2.f26138b
            float[] r7 = r7.f25729A0
            int r10 = r0.f26142f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ec
            float r17 = r17 + r7
            goto L_0x00ec
        L_0x00eb:
            int r14 = r14 + r7
        L_0x00ec:
            if (r13 >= r8) goto L_0x00f6
            if (r13 >= r6) goto L_0x00f6
            x.f r2 = r2.f26145i
            int r2 = r2.f26107f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0071
        L_0x00fd:
            if (r14 < r3) goto L_0x0108
            if (r15 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0108:
            r2 = r16
            goto L_0x0110
        L_0x010b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0110:
            x.f r7 = r0.f26144h
            int r7 = r7.f26108g
            if (r1 == 0) goto L_0x011a
            x.f r7 = r0.f26145i
            int r7 = r7.f26108g
        L_0x011a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0131
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x012a
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x0131
        L_0x012a:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x0131:
            if (r15 <= 0) goto L_0x023f
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013d:
            if (r12 >= r4) goto L_0x01f1
            java.util.ArrayList<x.m> r9 = r0.f26091k
            java.lang.Object r9 = r9.get(r12)
            x.m r9 = (p171x.C6333m) r9
            r19 = r11
            w.e r11 = r9.f26138b
            int r11 = r11.mo23807P()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0157
            goto L_0x01d7
        L_0x0157:
            w.e$b r11 = r9.f26140d
            w.e$b r14 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01d7
            x.g r11 = r9.f26141e
            boolean r14 = r11.f26111j
            if (r14 != 0) goto L_0x01d7
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x017b
            w.e r14 = r9.f26138b
            float[] r14 = r14.f25729A0
            r21 = r7
            int r7 = r0.f26142f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017f
        L_0x017b:
            r21 = r7
            r7 = r19
        L_0x017f:
            int r14 = r0.f26142f
            if (r14 != 0) goto L_0x01a9
            w.e r14 = r9.f26138b
            r22 = r10
            int r10 = r14.f25789p
            int r14 = r14.f25787o
            r23 = r1
            int r1 = r9.f26137a
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L_0x019b
            int r1 = r11.f26123m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x019c
        L_0x019b:
            r1 = r7
        L_0x019c:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01a6
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01a6:
            if (r1 == r7) goto L_0x01d1
            goto L_0x01ce
        L_0x01a9:
            r23 = r1
            r24 = r2
            r22 = r10
            w.e r1 = r9.f26138b
            int r2 = r1.f25795s
            int r1 = r1.f25793r
            int r10 = r9.f26137a
            r14 = 1
            if (r10 != r14) goto L_0x01c1
            int r10 = r11.f26123m
            int r10 = java.lang.Math.min(r7, r10)
            goto L_0x01c2
        L_0x01c1:
            r10 = r7
        L_0x01c2:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L_0x01cc
            int r1 = java.lang.Math.min(r2, r1)
        L_0x01cc:
            if (r1 == r7) goto L_0x01d1
        L_0x01ce:
            int r13 = r13 + 1
            r7 = r1
        L_0x01d1:
            x.g r1 = r9.f26141e
            r1.mo24099d(r7)
            goto L_0x01df
        L_0x01d7:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
        L_0x01df:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013d
        L_0x01f1:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0230
            int r15 = r15 - r13
            r1 = 0
            r2 = 0
        L_0x01fe:
            if (r1 >= r4) goto L_0x022e
            java.util.ArrayList<x.m> r7 = r0.f26091k
            java.lang.Object r7 = r7.get(r1)
            x.m r7 = (p171x.C6333m) r7
            w.e r9 = r7.f26138b
            int r9 = r9.mo23807P()
            r10 = 8
            if (r9 != r10) goto L_0x0213
            goto L_0x022b
        L_0x0213:
            if (r1 <= 0) goto L_0x021c
            if (r1 < r5) goto L_0x021c
            x.f r9 = r7.f26144h
            int r9 = r9.f26107f
            int r2 = r2 + r9
        L_0x021c:
            x.g r9 = r7.f26141e
            int r9 = r9.f26108g
            int r2 = r2 + r9
            if (r1 >= r8) goto L_0x022b
            if (r1 >= r6) goto L_0x022b
            x.f r7 = r7.f26145i
            int r7 = r7.f26107f
            int r7 = -r7
            int r2 = r2 + r7
        L_0x022b:
            int r1 = r1 + 1
            goto L_0x01fe
        L_0x022e:
            r14 = r2
            goto L_0x0232
        L_0x0230:
            r14 = r20
        L_0x0232:
            int r1 = r0.f26092l
            r2 = 2
            if (r1 != r2) goto L_0x023d
            if (r13 != 0) goto L_0x023d
            r1 = 0
            r0.f26092l = r1
            goto L_0x0249
        L_0x023d:
            r1 = 0
            goto L_0x0249
        L_0x023f:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L_0x0249:
            if (r14 <= r3) goto L_0x024d
            r0.f26092l = r2
        L_0x024d:
            if (r24 <= 0) goto L_0x0255
            if (r15 != 0) goto L_0x0255
            if (r5 != r6) goto L_0x0255
            r0.f26092l = r2
        L_0x0255:
            int r2 = r0.f26092l
            r7 = 1
            if (r2 != r7) goto L_0x02f9
            r9 = r24
            if (r9 <= r7) goto L_0x0263
            int r3 = r3 - r14
            int r2 = r9 + -1
            int r3 = r3 / r2
            goto L_0x026a
        L_0x0263:
            if (r9 != r7) goto L_0x0269
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x026a
        L_0x0269:
            r3 = 0
        L_0x026a:
            if (r15 <= 0) goto L_0x026d
            r3 = 0
        L_0x026d:
            r7 = r21
            r2 = 0
        L_0x0270:
            if (r2 >= r4) goto L_0x0441
            if (r23 == 0) goto L_0x0279
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x027a
        L_0x0279:
            r1 = r2
        L_0x027a:
            java.util.ArrayList<x.m> r9 = r0.f26091k
            java.lang.Object r1 = r9.get(r1)
            x.m r1 = (p171x.C6333m) r1
            w.e r9 = r1.f26138b
            int r9 = r9.mo23807P()
            r10 = 8
            if (r9 != r10) goto L_0x0297
            x.f r9 = r1.f26144h
            r9.mo24099d(r7)
            x.f r1 = r1.f26145i
            r1.mo24099d(r7)
            goto L_0x02f5
        L_0x0297:
            if (r2 <= 0) goto L_0x029e
            if (r23 == 0) goto L_0x029d
            int r7 = r7 - r3
            goto L_0x029e
        L_0x029d:
            int r7 = r7 + r3
        L_0x029e:
            if (r2 <= 0) goto L_0x02af
            if (r2 < r5) goto L_0x02af
            if (r23 == 0) goto L_0x02aa
            x.f r9 = r1.f26144h
            int r9 = r9.f26107f
            int r7 = r7 - r9
            goto L_0x02af
        L_0x02aa:
            x.f r9 = r1.f26144h
            int r9 = r9.f26107f
            int r7 = r7 + r9
        L_0x02af:
            if (r23 == 0) goto L_0x02b7
            x.f r9 = r1.f26145i
            r9.mo24099d(r7)
            goto L_0x02bc
        L_0x02b7:
            x.f r9 = r1.f26144h
            r9.mo24099d(r7)
        L_0x02bc:
            x.g r9 = r1.f26141e
            int r10 = r9.f26108g
            w.e$b r11 = r1.f26140d
            w.e$b r12 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02cd
            int r11 = r1.f26137a
            r12 = 1
            if (r11 != r12) goto L_0x02cd
            int r10 = r9.f26123m
        L_0x02cd:
            if (r23 == 0) goto L_0x02d1
            int r7 = r7 - r10
            goto L_0x02d2
        L_0x02d1:
            int r7 = r7 + r10
        L_0x02d2:
            if (r23 == 0) goto L_0x02da
            x.f r9 = r1.f26144h
            r9.mo24099d(r7)
            goto L_0x02df
        L_0x02da:
            x.f r9 = r1.f26145i
            r9.mo24099d(r7)
        L_0x02df:
            r9 = 1
            r1.f26143g = r9
            if (r2 >= r8) goto L_0x02f5
            if (r2 >= r6) goto L_0x02f5
            if (r23 == 0) goto L_0x02ef
            x.f r1 = r1.f26145i
            int r1 = r1.f26107f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02f5
        L_0x02ef:
            x.f r1 = r1.f26145i
            int r1 = r1.f26107f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02f5:
            int r2 = r2 + 1
            goto L_0x0270
        L_0x02f9:
            r9 = r24
            if (r2 != 0) goto L_0x0390
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L_0x0305
            r3 = 0
        L_0x0305:
            r7 = r21
            r2 = 0
        L_0x0308:
            if (r2 >= r4) goto L_0x0441
            if (r23 == 0) goto L_0x0311
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x0312
        L_0x0311:
            r1 = r2
        L_0x0312:
            java.util.ArrayList<x.m> r9 = r0.f26091k
            java.lang.Object r1 = r9.get(r1)
            x.m r1 = (p171x.C6333m) r1
            w.e r9 = r1.f26138b
            int r9 = r9.mo23807P()
            r10 = 8
            if (r9 != r10) goto L_0x032f
            x.f r9 = r1.f26144h
            r9.mo24099d(r7)
            x.f r1 = r1.f26145i
            r1.mo24099d(r7)
            goto L_0x038c
        L_0x032f:
            if (r23 == 0) goto L_0x0333
            int r7 = r7 - r3
            goto L_0x0334
        L_0x0333:
            int r7 = r7 + r3
        L_0x0334:
            if (r2 <= 0) goto L_0x0345
            if (r2 < r5) goto L_0x0345
            if (r23 == 0) goto L_0x0340
            x.f r9 = r1.f26144h
            int r9 = r9.f26107f
            int r7 = r7 - r9
            goto L_0x0345
        L_0x0340:
            x.f r9 = r1.f26144h
            int r9 = r9.f26107f
            int r7 = r7 + r9
        L_0x0345:
            if (r23 == 0) goto L_0x034d
            x.f r9 = r1.f26145i
            r9.mo24099d(r7)
            goto L_0x0352
        L_0x034d:
            x.f r9 = r1.f26144h
            r9.mo24099d(r7)
        L_0x0352:
            x.g r9 = r1.f26141e
            int r10 = r9.f26108g
            w.e$b r11 = r1.f26140d
            w.e$b r12 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0367
            int r11 = r1.f26137a
            r12 = 1
            if (r11 != r12) goto L_0x0367
            int r9 = r9.f26123m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0367:
            if (r23 == 0) goto L_0x036b
            int r7 = r7 - r10
            goto L_0x036c
        L_0x036b:
            int r7 = r7 + r10
        L_0x036c:
            if (r23 == 0) goto L_0x0374
            x.f r9 = r1.f26144h
            r9.mo24099d(r7)
            goto L_0x0379
        L_0x0374:
            x.f r9 = r1.f26145i
            r9.mo24099d(r7)
        L_0x0379:
            if (r2 >= r8) goto L_0x038c
            if (r2 >= r6) goto L_0x038c
            if (r23 == 0) goto L_0x0386
            x.f r1 = r1.f26145i
            int r1 = r1.f26107f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x038c
        L_0x0386:
            x.f r1 = r1.f26145i
            int r1 = r1.f26107f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x038c:
            int r2 = r2 + 1
            goto L_0x0308
        L_0x0390:
            r7 = 2
            if (r2 != r7) goto L_0x0441
            int r2 = r0.f26142f
            if (r2 != 0) goto L_0x039e
            w.e r2 = r0.f26138b
            float r2 = r2.mo23855x()
            goto L_0x03a4
        L_0x039e:
            w.e r2 = r0.f26138b
            float r2 = r2.mo23803L()
        L_0x03a4:
            if (r23 == 0) goto L_0x03aa
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L_0x03aa:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x03b6
            if (r15 <= 0) goto L_0x03b7
        L_0x03b6:
            r2 = 0
        L_0x03b7:
            if (r23 == 0) goto L_0x03bc
            int r7 = r21 - r2
            goto L_0x03be
        L_0x03bc:
            int r7 = r21 + r2
        L_0x03be:
            r2 = 0
        L_0x03bf:
            if (r2 >= r4) goto L_0x0441
            if (r23 == 0) goto L_0x03c8
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x03c9
        L_0x03c8:
            r1 = r2
        L_0x03c9:
            java.util.ArrayList<x.m> r3 = r0.f26091k
            java.lang.Object r1 = r3.get(r1)
            x.m r1 = (p171x.C6333m) r1
            w.e r3 = r1.f26138b
            int r3 = r3.mo23807P()
            r9 = 8
            if (r3 != r9) goto L_0x03e7
            x.f r3 = r1.f26144h
            r3.mo24099d(r7)
            x.f r1 = r1.f26145i
            r1.mo24099d(r7)
            r12 = 1
            goto L_0x043d
        L_0x03e7:
            if (r2 <= 0) goto L_0x03f8
            if (r2 < r5) goto L_0x03f8
            if (r23 == 0) goto L_0x03f3
            x.f r3 = r1.f26144h
            int r3 = r3.f26107f
            int r7 = r7 - r3
            goto L_0x03f8
        L_0x03f3:
            x.f r3 = r1.f26144h
            int r3 = r3.f26107f
            int r7 = r7 + r3
        L_0x03f8:
            if (r23 == 0) goto L_0x0400
            x.f r3 = r1.f26145i
            r3.mo24099d(r7)
            goto L_0x0405
        L_0x0400:
            x.f r3 = r1.f26144h
            r3.mo24099d(r7)
        L_0x0405:
            x.g r3 = r1.f26141e
            int r10 = r3.f26108g
            w.e$b r11 = r1.f26140d
            w.e$b r12 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0417
            int r11 = r1.f26137a
            r12 = 1
            if (r11 != r12) goto L_0x0418
            int r10 = r3.f26123m
            goto L_0x0418
        L_0x0417:
            r12 = 1
        L_0x0418:
            if (r23 == 0) goto L_0x041c
            int r7 = r7 - r10
            goto L_0x041d
        L_0x041c:
            int r7 = r7 + r10
        L_0x041d:
            if (r23 == 0) goto L_0x0425
            x.f r3 = r1.f26144h
            r3.mo24099d(r7)
            goto L_0x042a
        L_0x0425:
            x.f r3 = r1.f26145i
            r3.mo24099d(r7)
        L_0x042a:
            if (r2 >= r8) goto L_0x043d
            if (r2 >= r6) goto L_0x043d
            if (r23 == 0) goto L_0x0437
            x.f r1 = r1.f26145i
            int r1 = r1.f26107f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x043d
        L_0x0437:
            x.f r1 = r1.f26145i
            int r1 = r1.f26107f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x043d:
            int r2 = r2 + 1
            goto L_0x03bf
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p171x.C6320c.mo24081a(x.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24082d() {
        Iterator<C6333m> it = this.f26091k.iterator();
        while (it.hasNext()) {
            it.next().mo24082d();
        }
        int size = this.f26091k.size();
        if (size >= 1) {
            C6246e eVar = this.f26091k.get(0).f26138b;
            C6246e eVar2 = this.f26091k.get(size - 1).f26138b;
            if (this.f26142f == 0) {
                C6243d dVar = eVar.f25734D;
                C6243d dVar2 = eVar2.f25738F;
                C6323f i = mo24111i(dVar, 0);
                int c = dVar.mo23768c();
                C6246e r = m27834r();
                if (r != null) {
                    c = r.f25734D.mo23768c();
                }
                if (i != null) {
                    mo24107b(this.f26144h, i, c);
                }
                C6323f i2 = mo24111i(dVar2, 0);
                int c2 = dVar2.mo23768c();
                C6246e s = m27835s();
                if (s != null) {
                    c2 = s.f25738F.mo23768c();
                }
                if (i2 != null) {
                    mo24107b(this.f26145i, i2, -c2);
                }
            } else {
                C6243d dVar3 = eVar.f25736E;
                C6243d dVar4 = eVar2.f25739G;
                C6323f i3 = mo24111i(dVar3, 1);
                int c3 = dVar3.mo23768c();
                C6246e r2 = m27834r();
                if (r2 != null) {
                    c3 = r2.f25736E.mo23768c();
                }
                if (i3 != null) {
                    mo24107b(this.f26144h, i3, c3);
                }
                C6323f i4 = mo24111i(dVar4, 1);
                int c4 = dVar4.mo23768c();
                C6246e s2 = m27835s();
                if (s2 != null) {
                    c4 = s2.f25739G.mo23768c();
                }
                if (i4 != null) {
                    mo24107b(this.f26145i, i4, -c4);
                }
            }
            this.f26144h.f26102a = this;
            this.f26145i.f26102a = this;
        }
    }

    /* renamed from: e */
    public void mo24083e() {
        for (int i = 0; i < this.f26091k.size(); i++) {
            this.f26091k.get(i).mo24083e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24084f() {
        this.f26139c = null;
        Iterator<C6333m> it = this.f26091k.iterator();
        while (it.hasNext()) {
            it.next().mo24084f();
        }
    }

    /* renamed from: j */
    public long mo24085j() {
        int size = this.f26091k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C6333m mVar = this.f26091k.get(i);
            j = j + ((long) mVar.f26144h.f26107f) + mVar.mo24085j() + ((long) mVar.f26145i.f26107f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo24086m() {
        int size = this.f26091k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f26091k.get(i).mo24086m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f26142f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<C6333m> it = this.f26091k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
