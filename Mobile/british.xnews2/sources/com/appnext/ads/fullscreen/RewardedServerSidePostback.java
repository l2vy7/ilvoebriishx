package com.appnext.ads.fullscreen;

import com.appnext.base.C3117a;
import java.io.Serializable;
import java.util.HashMap;

public class RewardedServerSidePostback implements Serializable {

    /* renamed from: J */
    private String f11983J = "";

    /* renamed from: K */
    private String f11984K = "";

    /* renamed from: L */
    private String f11985L = "";

    /* renamed from: M */
    private String f11986M = "";

    /* renamed from: N */
    private String f11987N = "";

    public RewardedServerSidePostback() {
    }

    public String getRewardsAmountRewarded() {
        return this.f11986M;
    }

    public String getRewardsCustomParameter() {
        return this.f11987N;
    }

    public String getRewardsRewardTypeCurrency() {
        return this.f11985L;
    }

    public String getRewardsTransactionId() {
        return this.f11983J;
    }

    public String getRewardsUserId() {
        return this.f11984K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final HashMap<String, String> mo10170n() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("rewardsTransactionId", this.f11983J);
            hashMap.put("rewardsUserId", this.f11984K);
            hashMap.put("rewardsRewardTypeCurrency", this.f11985L);
            hashMap.put("rewardsAmountRewarded", this.f11986M);
            hashMap.put("rewardsCustomParameter", this.f11987N);
        } catch (Throwable th) {
            C3117a.m10553a("RewardedServerSidePostback$getParams", th);
        }
        return hashMap;
    }

    public void setRewardsAmountRewarded(String str) {
        this.f11986M = str;
    }

    public void setRewardsCustomParameter(String str) {
        this.f11987N = str;
    }

    public void setRewardsRewardTypeCurrency(String str) {
        this.f11985L = str;
    }

    public void setRewardsTransactionId(String str) {
        this.f11983J = str;
    }

    public void setRewardsUserId(String str) {
        this.f11984K = str;
    }

    public RewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        this.f11983J = str;
        this.f11984K = str2;
        this.f11985L = str3;
        this.f11986M = str4;
        this.f11987N = str5;
    }
}
