package com.appnext.core;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.ResultReceiver;
import com.appnext.base.C3117a;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AdsService extends IntentService {
    public static final int ADD_PACK = 8348;
    public static final int START_APP = 8346;
    /* access modifiers changed from: private */

    /* renamed from: cW */
    public static HashMap<String, C3208l> f12235cW = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: cX */
    public Runnable f12236cX = new Runnable() {
        public final void run() {
            try {
                for (Map.Entry entry : new HashMap(AdsService.f12235cW).entrySet()) {
                    C3208l lVar = (C3208l) entry.getValue();
                    if (AdsService.this.m10643r(lVar.f12372dV)) {
                        new Bundle().putAll(lVar.f12373dW);
                        AdsService.this.mo10625a(lVar);
                        AdsService.f12235cW.remove(entry.getKey());
                        AdsService.this.startActivity(AdsService.this.getPackageManager().getLaunchIntentForPackage(lVar.f12372dV));
                    }
                }
                if (AdsService.this.mHandler == null) {
                    return;
                }
                if (AdsService.f12235cW.entrySet().size() > 0) {
                    AdsService.this.mHandler.postDelayed(AdsService.this.f12236cX, ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
                    return;
                }
                AdsService.this.mHandler.removeCallbacksAndMessages((Object) null);
                Handler unused = AdsService.this.mHandler = null;
            } catch (Throwable th) {
                C3117a.m10553a("AdsService$checkPackRunnable", th);
            }
        }
    };
    /* access modifiers changed from: private */
    public Handler mHandler;
    Messenger mMessenger = new Messenger(new C3153a());

    /* renamed from: com.appnext.core.AdsService$a */
    class C3153a extends Handler {
        C3153a() {
        }

        public final void handleMessage(Message message) {
            if (message.what != 8348) {
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            AdsService.this.addPack(data.getString("package"), data, (ResultReceiver) data.getParcelable("receiver"));
            data.getString("package");
        }
    }

    public AdsService() {
        super("AdsService");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m10643r(String str) {
        try {
            getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void addPack(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (f12235cW == null) {
            f12235cW = new HashMap<>();
        }
        if (f12235cW.containsKey(str)) {
            C3208l lVar = f12235cW.get(str);
            if (lVar == null) {
                addPack(str, bundle, resultReceiver);
                return;
            }
            lVar.f12373dW = bundle;
            f12235cW.put(str, lVar);
            return;
        }
        C3208l lVar2 = new C3208l();
        lVar2.f12372dV = str;
        lVar2.f12373dW = bundle;
        f12235cW.put(str, lVar2);
        if (this.mHandler == null) {
            Handler handler = new Handler();
            this.mHandler = handler;
            handler.postDelayed(this.f12236cX, ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    public void onDestroy() {
        super.onDestroy();
        f12235cW.clear();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.mHandler = null;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent.getIntExtra("added_info", 0) == 8348) {
            addPack(intent.getStringExtra("package"), intent.getExtras(), (ResultReceiver) intent.getParcelableExtra("receiver"));
            intent.getStringExtra("package");
        }
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo10625a(final C3208l lVar) {
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                HashMap hashMap = new HashMap();
                hashMap.put("guid", lVar.f12373dW.getString("guid"));
                String str = "";
                hashMap.put("zone", lVar.f12373dW.getString("zone") == null ? str : lVar.f12373dW.getString("zone"));
                hashMap.put("adsID", C3198g.m10787b((Context) AdsService.this, true));
                hashMap.put("isApk", SessionDescription.SUPPORTED_SDP_VERSION);
                hashMap.put("bannerid", lVar.f12373dW.getString("bannerid"));
                hashMap.put("placementid", lVar.f12373dW.getString("placementid"));
                hashMap.put("vid", lVar.f12373dW.getString("vid"));
                hashMap.put("tid", lVar.f12373dW.getString("tid", str));
                hashMap.put("osid", "100");
                hashMap.put("auid", lVar.f12373dW.getString("auid", str));
                String installerPackageName = AdsService.this.getPackageManager().getInstallerPackageName(lVar.f12372dV);
                if (installerPackageName != null) {
                    str = installerPackageName;
                }
                hashMap.put("installer", str);
                try {
                    C3198g.m10776a(AdsService.this.getBaseContext(), "https://admin.appnext.com/AdminService.asmx/SetOpenV1", hashMap);
                } catch (IOException unused) {
                }
            }
        });
    }
}
