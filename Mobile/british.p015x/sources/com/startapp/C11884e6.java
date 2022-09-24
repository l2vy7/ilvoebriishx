package com.startapp;

import android.content.Context;
import android.hardware.SensorEvent;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.startapp.e6 */
/* compiled from: Sta */
public class C11884e6 extends Thread {

    /* renamed from: a */
    public final BlockingDeque<SensorEvent> f52901a;

    /* renamed from: b */
    public final C12452ya f52902b;

    /* renamed from: c */
    public final AtomicLong f52903c = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: d */
    public final AtomicLong f52904d = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: e */
    public final AtomicLong f52905e = new AtomicLong(0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11884e6(String str, Context context, MotionMetadata motionMetadata, int i, double d, long j) {
        super(str);
        C12452ya yaVar = new C12452ya(motionMetadata.mo46353f(), motionMetadata.mo46354g(), motionMetadata.mo46355h(), motionMetadata.mo46357i(), motionMetadata.mo46367s(), motionMetadata.mo46368t(), motionMetadata.mo46350d(), motionMetadata.mo46351e(), motionMetadata.mo46348b(), motionMetadata.mo46347a(), motionMetadata.mo46349c(), motionMetadata.mo46363o(), motionMetadata.mo46364p(), motionMetadata.mo46361m(), motionMetadata.mo46360l(), motionMetadata.mo46362n());
        this.f52902b = yaVar;
        yaVar.mo46837a(d, j);
        this.f52901a = new LinkedBlockingDeque(i);
    }

    public void run() {
        while (true) {
            try {
                SensorEvent take = this.f52901a.take();
                if (take != null) {
                    C12452ya yaVar = this.f52902b;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = take.timestamp;
                    float[] fArr = take.values;
                    yaVar.mo46838a(currentTimeMillis, j, (double) fArr[0], (double) fArr[1], (double) fArr[2]);
                    this.f52903c.set(Double.doubleToRawLongBits(this.f52902b.f55168k.f54790i));
                    this.f52904d.set(Double.doubleToRawLongBits(this.f52902b.f55168k.f54788g));
                    this.f52905e.set(this.f52902b.f55168k.f54789h);
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                return;
            }
        }
    }
}
