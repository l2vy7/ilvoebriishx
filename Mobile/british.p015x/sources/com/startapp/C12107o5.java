package com.startapp;

import com.startapp.sdk.ads.list3d.List3DView;

/* renamed from: com.startapp.o5 */
/* compiled from: Sta */
public class C12107o5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List3DView f53955a;

    public C12107o5(List3DView list3DView) {
        this.f53955a = list3DView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r8 < r9) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f53955a
            com.startapp.r2 r1 = r0.f54254l
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x006e
            com.startapp.sdk.ads.list3d.List3DView r2 = r11.f53955a
            int r0 = r2.mo45893d(r0)
            com.startapp.sdk.ads.list3d.List3DView r3 = r11.f53955a
            int r4 = r3.f54249g
            int r0 = r0 - r4
            r2.f54247e = r0
            com.startapp.r2 r0 = r3.f54254l
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r0.f54094e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x005f
            long r4 = r2 - r4
            int r5 = (int) r4
            r4 = 50
            if (r5 <= r4) goto L_0x0032
            r5 = 50
        L_0x0032:
            r4 = r0
            com.startapp.s9 r4 = (com.startapp.C12182s9) r4
            float r6 = r4.f54091b
            r7 = 0
            float r8 = r4.f54090a
            float r9 = r4.f54092c
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            float r9 = r4.f54093d
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x0049
        L_0x0047:
            float r7 = r9 - r8
        L_0x0049:
            float r9 = r4.f54147g
            float r7 = r7 * r9
            float r7 = r7 + r6
            r4.f54091b = r7
            float r5 = (float) r5
            float r5 = r5 * r7
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            float r5 = r5 + r8
            r4.f54090a = r5
            float r5 = r4.f54146f
            float r7 = r7 * r5
            r4.f54091b = r7
        L_0x005f:
            r0.f54094e = r2
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f53955a
            com.startapp.r2 r2 = r0.f54254l
            float r2 = r2.f54090a
            int r2 = (int) r2
            int r3 = r0.f54247e
            int r2 = r2 - r3
            r0.mo45885a((int) r2)
        L_0x006e:
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f53955a
            com.startapp.r2 r0 = r0.f54254l
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r0.f54091b
            float r3 = java.lang.Math.abs(r3)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0084
            r3 = 1
            goto L_0x0085
        L_0x0084:
            r3 = 0
        L_0x0085:
            float r4 = r0.f54090a
            float r6 = r4 - r2
            float r7 = r0.f54092c
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0098
            float r4 = r4 + r2
            float r0 = r0.f54093d
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            r0 = 1
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            if (r3 == 0) goto L_0x009e
            if (r0 == 0) goto L_0x009e
            r1 = 1
        L_0x009e:
            if (r1 != 0) goto L_0x00a7
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f53955a
            r1 = 16
            r0.postDelayed(r11, r1)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12107o5.run():void");
    }
}
