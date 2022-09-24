package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Bundle;
import com.startapp.C11917g3;
import com.startapp.C11963i7;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C12320b;

/* renamed from: com.startapp.sdk.adsbase.remoteconfig.d */
/* compiled from: Sta */
public class C12295d extends C12320b {
    public static final String LOG_TAG = C12295d.class.getSimpleName();

    public C12295d(Context context, C12320b.C12321a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        C12296a aVar = new C12296a(context, adPreferences, MetaDataRequest.RequestReason.PERIODIC, context, adPreferences);
        ComponentLocator a = ComponentLocator.m23305a(context);
        a.mo21229p().execute(new C11917g3(aVar, a));
    }

    public void run() {
        try {
            ComponentLocator.m23305a(this.context).mo21234u().mo45546b();
            MetaData.m23246c(this.context);
            if (MetaData.f22407k.mo21178T()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.mo46481a(this, false);
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.remoteconfig.d$a */
    /* compiled from: Sta */
    public class C12296a extends C12293a {

        /* renamed from: l */
        public MetaData f54680l;

        /* renamed from: m */
        public final /* synthetic */ Context f54681m;

        /* renamed from: n */
        public final /* synthetic */ AdPreferences f54682n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12296a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason, Context context2, AdPreferences adPreferences2) {
            super(context, adPreferences, requestReason);
            this.f54681m = context2;
            this.f54682n = adPreferences2;
        }

        /* renamed from: a */
        public Boolean mo46435a() {
            try {
                SimpleTokenUtils.m23086e(this.f54681m);
                MetaDataRequest metaDataRequest = new MetaDataRequest(this.f54681m, ComponentLocator.m23305a(this.f54681m).mo21217d(), MetaDataRequest.RequestReason.PERIODIC);
                metaDataRequest.mo46692a(this.f54681m, this.f54682n);
                C11963i7.C11964a a = C12293a.m53411a(this.f54681m, metaDataRequest);
                if (a != null) {
                    this.f54680l = (MetaData) C5015nb.m22902a(a.f53099a, MetaData.class);
                }
                return Boolean.TRUE;
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                return Boolean.FALSE;
            }
        }

        /* renamed from: a */
        public void mo46436a(Boolean bool) {
            MetaData metaData;
            Context context;
            try {
                if (!(!bool.booleanValue() || (metaData = this.f54680l) == null || (context = this.f54681m) == null)) {
                    MetaData.m23242a(context, metaData, MetaDataRequest.RequestReason.PERIODIC, this.f54676k);
                }
                C12295d.this.callback.mo46481a(C12295d.this, false);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }
}
