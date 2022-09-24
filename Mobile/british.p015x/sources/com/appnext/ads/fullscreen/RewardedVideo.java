package com.appnext.ads.fullscreen;

import android.content.Context;
import com.appnext.base.C3117a;
import com.appnext.core.SettingsManager;

public class RewardedVideo extends Video {
    public static final String VIDEO_MODE_DEFAULT = "default";
    public static final String VIDEO_MODE_MULTI = "multi";
    public static final String VIDEO_MODE_NORMAL = "normal";
    private String mode = VIDEO_MODE_DEFAULT;
    private int multiTimerLength = 5;
    private RewardedServerSidePostback rewardedServerSidePostback;

    protected RewardedVideo(Context context, RewardedVideo rewardedVideo) {
        super(context, rewardedVideo);
        if (rewardedVideo != null) {
            try {
                setRewardedServerSidePostback(rewardedVideo.getRewardedServerSidePostback());
                setMode(rewardedVideo.getMode());
                setMultiTimerLength(rewardedVideo.getMultiTimerLength());
                setBackButtonCanClose(rewardedVideo.isBackButtonCanClose());
            } catch (Throwable th) {
                C3117a.m10553a("RewardedVideo$RewardedVideo", th);
            }
        }
    }

    public String getAUID() {
        return "800";
    }

    /* access modifiers changed from: protected */
    public SettingsManager getConfig() {
        return C3012f.m10411o();
    }

    public String getMode() {
        return this.mode;
    }

    public int getMultiTimerLength() {
        return this.multiTimerLength;
    }

    /* access modifiers changed from: protected */
    public RewardedServerSidePostback getRewardedServerSidePostback() {
        if (!getRewardsTransactionId().equals("") || !getRewardsUserId().equals("") || !getRewardsRewardTypeCurrency().equals("") || !getRewardsAmountRewarded().equals("") || !getRewardsCustomParameter().equals("")) {
            return this.rewardedServerSidePostback;
        }
        return null;
    }

    public String getRewardsAmountRewarded() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback2 = this.rewardedServerSidePostback;
            if (rewardedServerSidePostback2 == null) {
                return "";
            }
            return rewardedServerSidePostback2.getRewardsAmountRewarded();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getRewardsCustomParameter() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback2 = this.rewardedServerSidePostback;
            if (rewardedServerSidePostback2 == null) {
                return "";
            }
            return rewardedServerSidePostback2.getRewardsCustomParameter();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getRewardsRewardTypeCurrency() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback2 = this.rewardedServerSidePostback;
            if (rewardedServerSidePostback2 == null) {
                return "";
            }
            return rewardedServerSidePostback2.getRewardsRewardTypeCurrency();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getRewardsTransactionId() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback2 = this.rewardedServerSidePostback;
            if (rewardedServerSidePostback2 == null) {
                return "";
            }
            return rewardedServerSidePostback2.getRewardsTransactionId();
        } catch (Throwable th) {
            C3117a.m10553a("RewardedVideo$getRewardsTransactionId", th);
            return "";
        }
    }

    public String getRewardsUserId() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback2 = this.rewardedServerSidePostback;
            if (rewardedServerSidePostback2 == null) {
                return "";
            }
            return rewardedServerSidePostback2.getRewardsUserId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMultiTimerLength(int i) {
        if (i > 0 && i <= 20) {
            this.multiTimerLength = i;
        }
    }

    /* access modifiers changed from: protected */
    public void setRewardedServerSidePostback(RewardedServerSidePostback rewardedServerSidePostback2) {
        this.rewardedServerSidePostback = rewardedServerSidePostback2;
    }

    public void setRewardsAmountRewarded(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsAmountRewarded(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardsCustomParameter(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsCustomParameter(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardsRewardTypeCurrency(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsRewardTypeCurrency(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardsTransactionId(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsTransactionId(str);
        } catch (Throwable th) {
            C3117a.m10553a("RewardedVideo$setRewardsTransactionId", th);
        }
    }

    public void setRewardsUserId(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsUserId(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        try {
            setRewardsTransactionId(str);
            setRewardsUserId(str2);
            setRewardsRewardTypeCurrency(str3);
            setRewardsAmountRewarded(str4);
            setRewardsCustomParameter(str5);
        } catch (Throwable th) {
            C3117a.m10553a("RewardedVideo$setRewardedServerSidePostback", th);
        }
    }

    public RewardedVideo(Context context, String str) {
        super(context, 2, str);
    }

    public RewardedVideo(Context context, String str, RewardedConfig rewardedConfig) {
        super(context, 2, str, rewardedConfig);
        if (rewardedConfig != null) {
            try {
                setBackButtonCanClose(rewardedConfig.isBackButtonCanClose());
                setMode(rewardedConfig.getMode());
                setMultiTimerLength(rewardedConfig.getMultiTimerLength());
                setShowCta(rewardedConfig.isShowCta());
            } catch (Throwable th) {
                C3117a.m10553a("RewardedVideo$RewardedVideo", th);
            }
        }
    }
}
