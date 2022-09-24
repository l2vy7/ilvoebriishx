package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import com.startapp.networkTest.results.BaseResult;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.results.NetworkInformationResult;
import com.startapp.networkTest.startapp.ConnectivityTestListener;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import java.util.Map;

/* renamed from: com.startapp.e7 */
/* compiled from: Sta */
public class C11885e7 implements ConnectivityTestListener, CoverageMapperManager.OnNetworkInfoResultListener {
    public C11885e7(Context context) {
    }

    /* renamed from: a */
    public final void mo45322a(C11882e4 e4Var, BaseResult baseResult) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map<Activity, Integer> map = C5015nb.f22145a;
            String encodeToString = Base64.encodeToString(C5015nb.m22924a(String.valueOf(C11883e5.m52270b(baseResult))), 11);
            if (encodeToString != null) {
                C5004d4 d4Var = new C5004d4(e4Var);
                d4Var.f22130h = Long.valueOf(currentTimeMillis);
                d4Var.f22127e = encodeToString;
                d4Var.mo20661a();
                return;
            }
            C5004d4 d4Var2 = new C5004d4(C11882e4.f52886e);
            d4Var2.f22126d = "NTS, can not encode result";
            d4Var2.f22127e = baseResult.getClass().getName();
            d4Var2.mo20661a();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    public void onConnectivityTestFinished(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onConnectivityTestResult(ConnectivityTestResult connectivityTestResult) {
        if (connectivityTestResult != null) {
            mo45322a(C11882e4.f52896o, connectivityTestResult);
        }
    }

    public void onLatencyTestResult(LatencyResult latencyResult) {
        if (latencyResult != null) {
            mo45322a(C11882e4.f52897p, latencyResult);
        }
    }

    public void onNetworkInfoResult(NetworkInformationResult networkInformationResult) {
        if (networkInformationResult != null) {
            mo45322a(C11882e4.f52898q, networkInformationResult);
        }
    }
}
