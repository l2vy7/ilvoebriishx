package com.adcolony.sdk;

import org.json.JSONObject;

public class AdColonyReward {

    /* renamed from: a */
    private int f10560a;

    /* renamed from: b */
    private String f10561b;

    /* renamed from: c */
    private String f10562c;

    /* renamed from: d */
    private boolean f10563d;

    AdColonyReward(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f10560a = C2976x.m10332e(b, "reward_amount");
        this.f10561b = C2976x.m10337i(b, "reward_name");
        this.f10563d = C2976x.m10329c(b, "success");
        this.f10562c = C2976x.m10337i(b, "zone_id");
    }

    public int getRewardAmount() {
        return this.f10560a;
    }

    public String getRewardName() {
        return this.f10561b;
    }

    public String getZoneID() {
        return this.f10562c;
    }

    public boolean success() {
        return this.f10563d;
    }
}
