package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.networkTest.startapp.NetworkTester;
import com.startapp.sdk.jobs.C12320b;

/* renamed from: com.startapp.g7 */
/* compiled from: Sta */
public final class C11922g7 extends C12320b {

    /* renamed from: com.startapp.g7$a */
    /* compiled from: Sta */
    public class C11923a implements NetworkTester.C12096b {
        public C11923a() {
        }

        /* renamed from: a */
        public void mo45381a(boolean z) {
            C11922g7.this.callback.mo46481a(C11922g7.this, z);
        }
    }

    public C11922g7(Context context, C12320b.C12321a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        NetworkTester.runTests(this.context, new C11923a());
    }
}
