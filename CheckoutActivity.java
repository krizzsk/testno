package com.razorpay;

/* loaded from: classes5.dex */
public final class CheckoutActivity extends android.app.Activity {
    private android.view.ViewGroup D$_X_;
    private android.view.View E$_6$;
    private java.lang.String E$_j$;
    private com.razorpay.T__j$ G__G_;
    private com.razorpay.y$_O_ J$$A_;
    private com.razorpay.RzpAssist K$$z$;
    private long L__R$;
    private java.lang.String Q_$2$;
    java.lang.String R$$r_;
    private java.lang.String Y$_o$;
    private org.json.JSONObject a_$P$;
    private android.widget.RelativeLayout b__J_;
    private long f$_G$;
    private boolean l_$w$;
    private long l__d$;
    private android.webkit.WebView r$_Y_;
    private java.lang.Boolean B$$W$ = java.lang.Boolean.TRUE;
    private java.lang.String O_$B_ = "{}";
    private int c__C_ = 0;
    private boolean g__v_ = false;
    java.lang.String d__1_ = null;
    private com.razorpay.Magic J$_0_ = null;

    /* renamed from: com.razorpay.CheckoutActivity$1 */
    /* loaded from: classes5.dex */
    public class C59781 implements com.razorpay.Y_$B$.G__G_ {
        private /* synthetic */ java.util.HashMap R$$r_;

        public C59781(java.util.HashMap hashMap) {
            this.R$$r_ = hashMap;
        }

        @Override // com.razorpay.Y_$B$.G__G_
        public final void R$$r_() {
            com.razorpay.l__d$.d__1_(com.razorpay.f$_G$.ALERT_PAYMENT_CONTINUE, this.R$$r_);
        }

        @Override // com.razorpay.Y_$B$.G__G_
        public final void d__1_() {
            com.razorpay.l__d$.d__1_(com.razorpay.f$_G$.ALERT_PAYMENT_CANCELLED, this.R$$r_);
            com.razorpay.CheckoutActivity.this.d__1_();
            if (com.razorpay.Q$$U_.Q_$2$.booleanValue()) {
                com.razorpay.CheckoutActivity.this.showWebView();
                com.razorpay.CheckoutActivity.this.r$_Y_.setVisibility(0);
            }
            com.razorpay.CheckoutActivity.Q_$2$(com.razorpay.CheckoutActivity.this, "");
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$10  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass10 implements java.lang.Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.razorpay.CheckoutActivity.this.E$_6$.setVisibility(8);
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$11  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass11 implements java.lang.Runnable {
        public AnonymousClass11() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.razorpay.CheckoutActivity.this.G__G_();
            com.razorpay.CheckoutActivity.this.Q_$2$("");
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$13  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass13 implements java.lang.Runnable {
        private /* synthetic */ com.razorpay.CheckoutActivity Q_$2$;

        public AnonymousClass13(com.razorpay.CheckoutActivity checkoutActivity) {
            this.Q_$2$ = checkoutActivity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.razorpay.CheckoutActivity checkoutActivity = com.razorpay.CheckoutActivity.this;
            int i = com.razorpay.C5996R.id.rzp_innerbox;
            if (((android.view.ViewGroup) checkoutActivity.findViewById(i)) != null) {
                com.razorpay.CheckoutActivity.this.E$_6$.setVisibility(0);
            } else {
                android.view.LayoutInflater from = android.view.LayoutInflater.from(this.Q_$2$);
                com.razorpay.CheckoutActivity.this.E$_6$ = from.inflate(com.razorpay.C5996R.C5998layout.rzp_magic_base, (android.view.ViewGroup) null);
                com.razorpay.CheckoutActivity.this.b__J_.addView(com.razorpay.CheckoutActivity.this.E$_6$);
                com.razorpay.CheckoutActivity.this.E$_6$.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            }
            try {
                com.razorpay.CheckoutActivity.this.J$_0_.paymentFlowStart((android.view.ViewGroup) com.razorpay.CheckoutActivity.this.findViewById(i));
            } catch (java.lang.Exception e) {
                com.razorpay.l__d$.d__1_("warning", e.getMessage());
            }
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$14  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass14 implements java.lang.Runnable {
        public AnonymousClass14() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.razorpay.CheckoutActivity.this.Y$_o$ == null || com.razorpay.CheckoutActivity.this.Y$_o$.isEmpty()) {
                com.razorpay.CheckoutActivity.this.r$_Y_.loadUrl("javascript: CheckoutBridge.setCheckoutBody(document.documentElement.outerHTML)");
            }
            com.razorpay.CheckoutActivity.this.r$_Y_.loadUrl(com.razorpay.CheckoutActivity.this.a_$P$());
            com.razorpay.CheckoutActivity.this.r$_Y_.loadUrl(java.lang.String.format("javascript: CheckoutBridge.sendAnalyticsData({data: %s})", com.razorpay.l__d$.G__G_(com.razorpay.CheckoutActivity.this).toString()));
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$2 */
    /* loaded from: classes5.dex */
    public class RunnableC59792 implements java.lang.Runnable {
        private /* synthetic */ int a_$P$;
        private /* synthetic */ int d__1_;

        public RunnableC59792(int i, int i2) {
            this.a_$P$ = i;
            this.d__1_ = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.view.WindowManager.LayoutParams attributes = com.razorpay.CheckoutActivity.this.getWindow().getAttributes();
            com.razorpay.CheckoutActivity checkoutActivity = com.razorpay.CheckoutActivity.this;
            attributes.height = (int) android.util.TypedValue.applyDimension(1, this.a_$P$, checkoutActivity.getResources().getDisplayMetrics());
            com.razorpay.CheckoutActivity checkoutActivity2 = com.razorpay.CheckoutActivity.this;
            attributes.width = (int) android.util.TypedValue.applyDimension(1, this.d__1_, checkoutActivity2.getResources().getDisplayMetrics());
            com.razorpay.CheckoutActivity.this.getWindow().setAttributes(attributes);
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$3 */
    /* loaded from: classes5.dex */
    public class RunnableC59803 implements java.lang.Runnable {
        private /* synthetic */ java.lang.String d__1_;

        public RunnableC59803(java.lang.String str) {
            this.d__1_ = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.razorpay.CheckoutActivity.Q_$2$(com.razorpay.CheckoutActivity.this, this.d__1_);
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$4 */
    /* loaded from: classes5.dex */
    public class RunnableC59814 implements java.lang.Runnable {
        public RunnableC59814() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.razorpay.CheckoutActivity.this.b__J_.removeView(com.razorpay.CheckoutActivity.this.E$_6$);
            com.razorpay.CheckoutActivity.this.r$_Y_.setVisibility(0);
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$5 */
    /* loaded from: classes5.dex */
    public class RunnableC59825 implements java.lang.Runnable {
        private /* synthetic */ java.lang.String d__1_;

        public RunnableC59825(java.lang.String str) {
            this.d__1_ = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.razorpay.CheckoutActivity.this.G__G_(new org.json.JSONObject(this.d__1_));
            } catch (java.lang.Exception e) {
                com.razorpay.l__d$.d__1_("critical", e.getMessage());
                com.razorpay.CheckoutActivity.this.G__G_(0, e.getMessage());
            }
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$6 */
    /* loaded from: classes5.dex */
    public class C59836 implements com.razorpay.RestoreViewCallback {
        public C59836() {
        }

        @Override // com.razorpay.RestoreViewCallback
        public final void onViewRestore() {
            com.razorpay.CheckoutActivity.this.showWebView();
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$7 */
    /* loaded from: classes5.dex */
    public class C59847 extends android.webkit.WebChromeClient {
        public C59847() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            if (consoleMessage.messageLevel() == android.webkit.ConsoleMessage.MessageLevel.ERROR) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("message", consoleMessage.message());
                hashMap.put("source_id", consoleMessage.sourceId());
                hashMap.put("line_number", java.lang.String.valueOf(consoleMessage.lineNumber()));
                com.razorpay.l__d$.d__1_(com.razorpay.f$_G$.WEB_VIEW_JS_ERROR, hashMap);
                consoleMessage.message();
                return false;
            }
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(android.webkit.WebView webView, int i) {
            if (com.razorpay.Q$$U_.Q_$2$.booleanValue() && com.razorpay.CheckoutActivity.this.J$_0_ != null) {
                com.razorpay.CheckoutActivity.this.J$_0_.onProgressChanged(i);
            } else if (com.razorpay.CheckoutActivity.this.K$$z$ != null) {
                com.razorpay.CheckoutActivity.this.K$$z$.onProgressChanged(i);
            }
            if (com.razorpay.CheckoutActivity.this.J$$A_ != null) {
                com.razorpay.CheckoutActivity.this.J$$A_.d__1_(i);
            }
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$8 */
    /* loaded from: classes5.dex */
    public class C59858 implements com.razorpay.O__Y_ {
        public C59858() {
        }

        @Override // com.razorpay.O__Y_
        public final void d__1_(com.razorpay.t_$J_ t__j_) {
        }
    }

    /* renamed from: com.razorpay.CheckoutActivity$9 */
    /* loaded from: classes5.dex */
    public class C59869 extends android.webkit.WebViewClient {
        public C59869() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            long nanoTime = java.lang.System.nanoTime();
            com.razorpay.Y_$B$.Q_$2$();
            if (com.razorpay.CheckoutActivity.this.J$$A_ != null) {
                com.razorpay.CheckoutActivity.this.J$$A_.a_$P$();
            }
            if (str.indexOf(com.razorpay.CheckoutActivity.this.E$_j$) == 0) {
                if (com.razorpay.CheckoutActivity.this.c__C_ == 1) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    long j = nanoTime - com.razorpay.CheckoutActivity.this.L__R$;
                    hashMap.put("checkout_load_duration", java.lang.Long.valueOf(j));
                    com.razorpay.h__y_.G__G_(j);
                    if (com.razorpay.CheckoutActivity.this.f$_G$ > 0) {
                        hashMap.put("preload_finish_duration", java.lang.Long.valueOf(com.razorpay.CheckoutActivity.this.f$_G$));
                        com.razorpay.h__y_.G__G_(com.razorpay.CheckoutActivity.this.f$_G$);
                    } else if (com.razorpay.CheckoutActivity.this.l__d$ > 0) {
                        hashMap.put("preload_abort_duration", java.lang.Long.valueOf(com.razorpay.CheckoutActivity.this.l__d$));
                        com.razorpay.h__y_.G__G_(com.razorpay.CheckoutActivity.this.l__d$);
                    }
                    long j2 = com.razorpay.CheckoutActivity.this.f$_G$ - j;
                    if (j2 > 0) {
                        hashMap.put("time_shaved_off", java.lang.Long.valueOf(j2));
                        com.razorpay.h__y_.G__G_(j2);
                    }
                    com.razorpay.l__d$.d__1_(com.razorpay.f$_G$.CHECKOUT_LOADED, hashMap);
                }
                if (com.razorpay.CheckoutActivity.this.l_$w$) {
                    com.razorpay.CheckoutActivity.this.r$_Y_.clearHistory();
                    com.razorpay.CheckoutActivity.this.l_$w$ = false;
                }
            }
            if (com.razorpay.Q$$U_.Q_$2$.booleanValue() && com.razorpay.CheckoutActivity.this.J$_0_ != null) {
                com.razorpay.CheckoutActivity.this.J$_0_.onPageFinished(webView, str);
            } else if (com.razorpay.CheckoutActivity.this.K$$z$ != null) {
                com.razorpay.CheckoutActivity.this.K$$z$.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            com.razorpay.CheckoutActivity checkoutActivity = com.razorpay.CheckoutActivity.this;
            com.razorpay.Y_$B$.G__G_(checkoutActivity, checkoutActivity.B$$W$.booleanValue());
            if (com.razorpay.CheckoutActivity.this.K$$z$ != null) {
                com.razorpay.CheckoutActivity.this.K$$z$.onPageStarted(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            com.razorpay.CheckoutActivity.this.G__G_(2, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
            if (!com.razorpay.h__y_.Q_$2$(sslErrorHandler, sslError)) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            return false;
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.razorpay.RzpAssist rzpAssist = this.K$$z$;
        if (rzpAssist != null) {
            hashMap.put("current_loading_url", rzpAssist.a_$P$());
            hashMap.put("last_loaded_url", this.K$$z$.R$$r_());
        }
        com.razorpay.l__d$.d__1_(com.razorpay.f$_G$.CHECKOUT_HARD_BACK_PRESSED, hashMap);
        if (this.B$$W$.booleanValue()) {
            this.r$_Y_.loadUrl("javascript: window.backPressed ? window.backPressed('onCheckoutBackPress') : CheckoutBridge.onCheckoutBackPress();");
            hashMap.put("in_checkout", "true");
        } else if (!com.razorpay.I$_e_.l_$w$().h__y_()) {
            G__G_(0, "BackPressed");
        } else {
            com.razorpay.CheckoutActivity.C59781 c59781 = new com.razorpay.CheckoutActivity.C59781(hashMap);
            new android.app.AlertDialog.Builder(this).setMessage(com.razorpay.I$_e_.l_$w$().K$$z$()).setPositiveButton(com.razorpay.I$_e_.l_$w$().O__Y_(), new com.razorpay.Y_$B$.DialogInterface$OnClickListenerC60085(c59781)).setNegativeButton(com.razorpay.I$_e_.l_$w$().B_$q$(), new com.razorpay.Y_$B$.DialogInterface$OnClickListenerC60072(c59781)).show();
        }
    }

    @android.webkit.JavascriptInterface
    public final void onCheckoutBackPress() {
        com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.CHECKOUT_SOFT_BACK_PRESSED);
        G__G_(0, "Checkout BackPressed");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        boolean z2;
        com.razorpay.RzpAssist rzpAssist;
        com.razorpay.I$_e_.l_$w$().R$$r_(this);
        this.L__R$ = java.lang.System.nanoTime();
        com.razorpay.l__d$.R$$r_();
        com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.CHECKOUT_INIT);
        super.onCreate(bundle);
        requestWindowFeature(1);
        java.lang.String str = null;
        if (bundle == null) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras == null) {
                G__G_(0, "Invalid parameters passed");
                z = false;
                if (z) {
                    return;
                }
                com.razorpay.l__d$.d__1_(this, this.R$$r_);
                this.E$_j$ = com.razorpay.Y_$B$.d__1_(this.G__G_);
                this.D$_X_ = (android.view.ViewGroup) findViewById(16908290);
                try {
                    this.a_$P$ = new org.json.JSONObject(this.Q_$2$);
                } catch (java.lang.Exception unused) {
                }
                android.webkit.WebView webView = new android.webkit.WebView(this);
                this.r$_Y_ = webView;
                com.razorpay.h__y_.d__1_(this, webView);
                this.r$_Y_.clearFormData();
                this.r$_Y_.addJavascriptInterface(this, "CheckoutBridge");
                this.r$_Y_.setWebChromeClient(new com.razorpay.CheckoutActivity.C59847());
                this.r$_Y_.setWebViewClient(new com.razorpay.CheckoutActivity.C59869());
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
                this.b__J_ = relativeLayout;
                relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
                this.b__J_.setBackgroundColor(-1);
                this.D$_X_.addView(this.b__J_);
                this.r$_Y_.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                this.b__J_.addView(this.r$_Y_);
                try {
                } catch (java.lang.Exception e) {
                    try {
                        jSONObject = this.a_$P$;
                    } catch (java.lang.Exception e2) {
                        this.J$$A_ = new com.razorpay.y$_O_(this, this.b__J_);
                        com.razorpay.l__d$.d__1_("error", e2.getMessage());
                    }
                    if (jSONObject != null) {
                        java.lang.String string = jSONObject.getJSONObject("theme").getString("color");
                        android.graphics.Color.parseColor(string);
                        this.J$$A_ = new com.razorpay.y$_O_(this, this.b__J_, string);
                        com.razorpay.l__d$.d__1_("error", e.getMessage());
                    } else {
                        throw new java.lang.Exception("No dash options defined");
                    }
                }
                if (this.G__G_.Q_$2$() != null) {
                    java.lang.String string2 = this.G__G_.Q_$2$().getJSONObject("theme").getString("color");
                    android.graphics.Color.parseColor(string2);
                    this.J$$A_ = new com.razorpay.y$_O_(this, this.b__J_, string2);
                    if (com.razorpay.Q$$U_.Q_$2$.booleanValue()) {
                        try {
                            com.razorpay.Magic magic = new com.razorpay.Magic(this, this.r$_Y_);
                            this.J$_0_ = magic;
                            this.K$$z$ = magic.rzpAssist;
                            magic.setRestoreViewCallback(new com.razorpay.CheckoutActivity.C59836());
                        } catch (java.lang.Exception e3) {
                            com.razorpay.l__d$.d__1_("error", e3.getMessage());
                        }
                    } else {
                        try {
                            this.K$$z$ = new com.razorpay.RzpAssist(this.R$$r_, this, this.r$_Y_);
                        } catch (java.lang.Exception e4) {
                            com.razorpay.l__d$.d__1_("error", e4.getMessage());
                        }
                    }
                    if (this.G__G_.d__1_() != null && (rzpAssist = this.K$$z$) != null) {
                        rzpAssist.setOtpElfPreferences(this.G__G_.d__1_());
                    }
                    if (this.E$_j$ == null) {
                        G__G_(3, "Invalid URL. Please make sure you've set public key");
                    }
                    Q_$2$("");
                    com.razorpay.T__j$ t__j$ = this.G__G_;
                    if (t__j$.a_$P$() == null) {
                        optString = null;
                    } else {
                        optString = t__j$.a_$P$().optString("contact");
                    }
                    if (!android.text.TextUtils.isEmpty(optString)) {
                        com.razorpay.l__d$.Q_$2$("email", new com.razorpay.g__v_(optString, com.razorpay.g__v_.d__1_.G__G_));
                    }
                    com.razorpay.T__j$ t__j$2 = this.G__G_;
                    if (t__j$2.a_$P$() != null) {
                        str = t__j$2.a_$P$().optString("contact");
                    }
                    if (!android.text.TextUtils.isEmpty(str)) {
                        com.razorpay.l__d$.Q_$2$("contact", new com.razorpay.g__v_(str, com.razorpay.g__v_.d__1_.G__G_));
                    }
                    if ((getWindow().getAttributes().flags & 1024) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        com.razorpay.L__R$.G__G_(this);
                    }
                    if (getResources().getBoolean(com.razorpay.C5996R.bool.isTablet)) {
                        setFinishOnTouchOutside(false);
                        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
                        attributes.height = (int) android.util.TypedValue.applyDimension(1, 600.0f, getResources().getDisplayMetrics());
                        attributes.width = (int) android.util.TypedValue.applyDimension(1, 375.0f, getResources().getDisplayMetrics());
                        getWindow().setAttributes(attributes);
                    } else {
                        setRequestedOrientation(1);
                    }
                    com.razorpay.K$$z$.d__1_(this, this.R$$r_);
                    com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.CARD_SAVING_START);
                    com.razorpay.B_$q$.R$$r_(getApplicationContext());
                    return;
                }
                throw new java.lang.Exception("No options defined");
            }
            com.razorpay.T__j$ t__j$3 = new com.razorpay.T__j$(extras.getString("OPTIONS"));
            this.G__G_ = t__j$3;
            t__j$3.D$_X_();
            java.lang.String G__G_ = this.G__G_.G__G_();
            this.R$$r_ = G__G_;
            this.Q_$2$ = com.razorpay.n__T$.G__G_((android.app.Activity) this).getString("pref_merchant_options_" + G__G_, null);
            this.G__G_.d__1_(this, extras.getInt("IMAGE"));
            this.Y$_o$ = extras.getString("BODY");
            java.lang.String string3 = extras.getString("FRAMEWORK");
            if (string3 != null) {
                com.razorpay.l__d$.Q_$2$("framework", new com.razorpay.g__v_(string3, com.razorpay.g__v_.d__1_.G__G_));
            }
            if (extras.getBoolean("DISABLE_FULL_SCREEN", false)) {
                getWindow().addFlags(2048);
                getWindow().clearFlags(1024);
            }
            if (extras.containsKey("PRELOAD_COMPLETE_DURATION")) {
                this.f$_G$ = extras.getLong("PRELOAD_COMPLETE_DURATION");
            }
            if (extras.containsKey("PRELOAD_ABORT_DURATION")) {
                this.l__d$ = extras.getLong("PRELOAD_ABORT_DURATION");
            }
        } else {
            com.razorpay.T__j$ t__j$4 = new com.razorpay.T__j$(bundle.getString("OPTIONS"));
            this.G__G_ = t__j$4;
            this.R$$r_ = t__j$4.G__G_();
            this.Q_$2$ = bundle.getString("DASH_OPTIONS");
            this.Y$_o$ = bundle.getString("BODY");
            if (bundle.getBoolean("DISABLE_FULL_SCREEN", false)) {
                getWindow().addFlags(2048);
                getWindow().clearFlags(1024);
            }
        }
        z = true;
        if (z) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.ACTIVITY_ONDESTROY_CALLED);
        d__1_();
        com.razorpay.RzpAssist rzpAssist = this.K$$z$;
        if (rzpAssist != null) {
            rzpAssist.paymentFlowEnd();
        }
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof com.razorpay.U$_z$) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(((com.razorpay.U$_z$) defaultUncaughtExceptionHandler).Q_$2$);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        com.razorpay.RzpAssist rzpAssist = this.K$$z$;
        if (rzpAssist != null) {
            rzpAssist.R$$r_(i, iArr);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("OPTIONS", this.G__G_.R$$r_());
        bundle.putString("DASH_OPTIONS", this.Q_$2$);
        bundle.putBoolean("DISABLE_FULL_SCREEN", getIntent().getBooleanExtra("DISABLE_FULL_SCREEN", false));
    }

    @android.webkit.JavascriptInterface
    public final void oncomplete(java.lang.String str) {
        runOnUiThread(new com.razorpay.CheckoutActivity.RunnableC59825(str));
    }

    @android.webkit.JavascriptInterface
    public final void ondismiss() {
        G__G_(0, "Payment Cancelled");
    }

    @android.webkit.JavascriptInterface
    public final void onerror(java.lang.String str) {
        try {
            R$$r_(new org.json.JSONObject(str));
        } catch (java.lang.Exception e) {
            com.razorpay.l__d$.d__1_("critical", e.getMessage());
            runOnUiThread(new com.razorpay.CheckoutActivity.AnonymousClass11());
        }
    }

    @android.webkit.JavascriptInterface
    public final void onfault(java.lang.String str) {
        G__G_(3, str);
    }

    @android.webkit.JavascriptInterface
    public final void onload() {
        runOnUiThread(new com.razorpay.CheckoutActivity.AnonymousClass14());
    }

    @android.webkit.JavascriptInterface
    public final void onsubmit(java.lang.String str) {
        this.B$$W$ = java.lang.Boolean.FALSE;
        if (this.c__C_ > 1) {
            com.razorpay.l__d$.B$$W$();
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.O_$B_ = str;
            com.razorpay.RzpAssist rzpAssist = this.K$$z$;
            if (rzpAssist != null) {
                rzpAssist.R$$r_(jSONObject);
                jSONObject.put("razorpay_otp", this.K$$z$.d__1_());
            }
            com.razorpay.l__d$.a_$P$(jSONObject);
            try {
                if (jSONObject.has("contact")) {
                    java.lang.String string = jSONObject.getString("contact");
                    android.content.SharedPreferences.Editor G__G_ = com.razorpay.n__T$.G__G_((android.content.Context) this);
                    G__G_.putString("rzp_user_contact", string);
                    G__G_.commit();
                    this.G__G_.Q_$2$("contact", jSONObject.getString("contact"));
                }
                if (jSONObject.has("email")) {
                    java.lang.String string2 = jSONObject.getString("email");
                    android.content.SharedPreferences.Editor G__G_2 = com.razorpay.n__T$.G__G_((android.content.Context) this);
                    G__G_2.putString("rzp_user_email", string2);
                    G__G_2.commit();
                    this.G__G_.Q_$2$("email", jSONObject.getString("email"));
                }
            } catch (org.json.JSONException unused) {
            }
            java.lang.String string3 = jSONObject.getString("method");
            if (!string3.equals("card")) {
                if (string3.equals("wallet")) {
                    java.lang.String string4 = jSONObject.getString("wallet");
                    if (this.G__G_.G__G_(string4)) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("external_wallet", string4);
                        com.razorpay.l__d$.Q_$2$("external_wallet", new com.razorpay.g__v_(string4, com.razorpay.g__v_.d__1_.G__G_));
                        com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.EXTERNAL_WALLET_SELECTED);
                        G__G_(jSONObject2);
                    }
                }
            } else {
                java.lang.Boolean bool = com.razorpay.Q$$U_.Q_$2$;
                if (bool.booleanValue() && bool.booleanValue()) {
                    runOnUiThread(new com.razorpay.CheckoutActivity.AnonymousClass13(this));
                }
            }
            com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.CHECKOUT_SUBMIT);
            com.razorpay.l__d$.d__1_();
        } catch (java.lang.Exception e) {
            com.razorpay.l__d$.d__1_("critical", e.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    public final void setAppToken(java.lang.String str) {
        com.razorpay.n__T$.G__G_((android.content.Context) this).putString("rzp_app_token", str).apply();
    }

    @android.webkit.JavascriptInterface
    public final void setCheckoutBody(java.lang.String str) {
        this.Y$_o$ = str;
    }

    @android.webkit.JavascriptInterface
    public final void setDeviceToken(java.lang.String str) {
        android.content.SharedPreferences.Editor edit;
        edit = com.razorpay.n__T$.a_$P$(this).edit();
        edit.putString("rzp_device_token", str).apply();
    }

    @android.webkit.JavascriptInterface
    public final void setDimensions(int i, int i2) {
        if (getResources().getBoolean(com.razorpay.C5996R.bool.isTablet)) {
            runOnUiThread(new com.razorpay.CheckoutActivity.RunnableC59792(i2, i));
        }
    }

    @android.webkit.JavascriptInterface
    public final void setMerchantOptions(java.lang.String str) {
        this.Q_$2$ = str;
        try {
            this.a_$P$ = new org.json.JSONObject(str);
        } catch (java.lang.Exception e) {
            this.a_$P$ = null;
            com.razorpay.l__d$.d__1_("critical", e.getMessage());
        }
        if (this.a_$P$ == null) {
            com.razorpay.Y_$B$.G__G_(this, this.R$$r_, null);
        } else {
            com.razorpay.Y_$B$.G__G_(this, this.R$$r_, str);
        }
    }

    @android.webkit.JavascriptInterface
    public final void setPaymentID(java.lang.String str) {
        this.d__1_ = str;
        com.razorpay.RzpAssist rzpAssist = this.K$$z$;
        if (rzpAssist != null) {
            rzpAssist.G__G_(str);
        }
        com.razorpay.l__d$.Q_$2$("payment_id", new com.razorpay.g__v_(str, com.razorpay.g__v_.d__1_.Q_$2$));
        com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.PAYMENT_ID_ATTACHED);
    }

    public final void showWebView() {
        if (!com.razorpay.Q$$U_.Q_$2$.booleanValue()) {
            return;
        }
        runOnUiThread(new com.razorpay.CheckoutActivity.AnonymousClass10());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q_$2$(java.lang.String str) {
        if (this.c__C_ != 0) {
            com.razorpay.l__d$.d__1_();
        }
        int i = this.c__C_ + 1;
        this.c__C_ = i;
        com.razorpay.l__d$.Q_$2$("payment_attempt", new com.razorpay.g__v_(i, com.razorpay.g__v_.d__1_.G__G_));
        this.B$$W$ = java.lang.Boolean.TRUE;
        this.l_$w$ = true;
        java.lang.String m7443m = p000.ka.m7443m(new java.lang.StringBuilder(), this.E$_j$, str);
        java.lang.String str2 = this.Y$_o$;
        if (str2 != null && !str2.isEmpty()) {
            this.r$_Y_.loadDataWithBaseURL(m7443m, this.Y$_o$, "text/html", "UTF-8", null);
        } else {
            this.r$_Y_.loadUrl(m7443m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a_$P$() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("options", this.G__G_.Q_$2$());
            jSONObject.put("data", this.O_$B_);
            jSONObject.put("id", com.razorpay.l__d$.a_$P$());
            jSONObject.put("key_id", this.R$$r_);
            java.lang.String string = com.razorpay.n__T$.a_$P$(getApplicationContext()).getString("rzp_device_token", null);
            if (!android.text.TextUtils.isEmpty(string)) {
                jSONObject.put("device_token", string);
            }
        } catch (org.json.JSONException unused) {
        }
        return java.lang.String.format("javascript: handleMessage(%s)", jSONObject.toString());
    }

    private void R$$r_(org.json.JSONObject jSONObject) {
        com.razorpay.CheckoutActivity.RunnableC59803 runnableC59803;
        R$$r_();
        java.lang.String str = "";
        try {
            try {
                if (jSONObject.has("error")) {
                    java.lang.String str2 = this.E$_j$.contains("?") ? "&" : "?";
                    try {
                        if (jSONObject.get("error") instanceof org.json.JSONObject) {
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONObject.get("error");
                            if (jSONObject2.has("description")) {
                                str = str2 + "error.description=" + jSONObject2.get("description");
                                if (jSONObject2.has("field")) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(str);
                                    str2 = "&error.field=";
                                    sb.append("&error.field=");
                                    sb.append(jSONObject2.get("field"));
                                    str = sb.toString();
                                }
                            } else {
                                str = str2 + "error=" + jSONObject2.toString();
                            }
                        } else {
                            str = str2;
                        }
                    } catch (java.lang.Exception e) {
                        e = e;
                        str = str2;
                        com.razorpay.l__d$.d__1_("critical", e.getMessage());
                        runnableC59803 = new com.razorpay.CheckoutActivity.RunnableC59803(str);
                        runOnUiThread(runnableC59803);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        str = str2;
                        runOnUiThread(new com.razorpay.CheckoutActivity.RunnableC59803(str));
                        throw th;
                    }
                }
                runnableC59803 = new com.razorpay.CheckoutActivity.RunnableC59803(str);
            } catch (java.lang.Exception e2) {
                e = e2;
            }
            runOnUiThread(runnableC59803);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d__1_() {
        if (this.d__1_ != null && !this.g__v_) {
            try {
                java.lang.String G__G_ = com.razorpay.h__y_.G__G_(this.R$$r_);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("Authorization", "Basic " + G__G_);
                com.razorpay.Q__v$.G__G_("https://api.razorpay.com/v1/payments/" + this.d__1_ + "/cancel?platform=android_sdk", hashMap, new com.razorpay.CheckoutActivity.C59858());
                this.d__1_ = null;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G__G_(org.json.JSONObject jSONObject) {
        try {
            if (jSONObject.has("error")) {
                int i = com.razorpay.g__v_.d__1_.Q_$2$;
                com.razorpay.l__d$.Q_$2$("payment_status", new com.razorpay.g__v_("fail", i));
                com.razorpay.l__d$.Q_$2$("payload", new com.razorpay.g__v_(jSONObject.toString(), i));
                com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.CHECKOUT_PAYMENT_COMPLETE);
                R$$r_(jSONObject);
            } else if (jSONObject.has("razorpay_payment_id")) {
                java.lang.String string = jSONObject.getString("razorpay_payment_id");
                this.d__1_ = string;
                int i2 = com.razorpay.g__v_.d__1_.Q_$2$;
                com.razorpay.l__d$.Q_$2$("payment_id", new com.razorpay.g__v_(string, i2));
                com.razorpay.l__d$.Q_$2$("payment_status", new com.razorpay.g__v_("success", i2));
                com.razorpay.l__d$.Q_$2$("payload", new com.razorpay.g__v_(jSONObject.toString(), i2));
                com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.CHECKOUT_PAYMENT_COMPLETE);
                this.g__v_ = true;
                G__G_(1, jSONObject.toString());
            } else if (jSONObject.has("external_wallet")) {
                G__G_(4, jSONObject.toString());
            } else {
                G__G_(0, "Post payment parsing error");
            }
        } catch (java.lang.Exception e) {
            com.razorpay.l__d$.d__1_("critical", e.getMessage());
            G__G_(0, e.getMessage());
        }
    }

    public static /* synthetic */ void Q_$2$(com.razorpay.CheckoutActivity checkoutActivity, java.lang.String str) {
        int i = checkoutActivity.c__C_;
        int L__R$ = com.razorpay.I$_e_.l_$w$().L__R$();
        boolean z = true;
        if (!com.razorpay.I$_e_.l_$w$().f$_G$() || (L__R$ != -1 && L__R$ <= i)) {
            z = false;
        }
        if (z) {
            checkoutActivity.G__G_();
            checkoutActivity.Q_$2$(str);
            return;
        }
        checkoutActivity.G__G_(0, "BackPressed");
    }

    private void R$$r_() {
        android.view.View view;
        if (com.razorpay.Q$$U_.Q_$2$.booleanValue() && (view = this.E$_6$) != null && view.getVisibility() == 0) {
            runOnUiThread(new com.razorpay.CheckoutActivity.RunnableC59814());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G__G_(int i, java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(i);
        int i2 = com.razorpay.g__v_.d__1_.G__G_;
        com.razorpay.l__d$.Q_$2$("destroy_resultCode", new com.razorpay.g__v_(valueOf, i2));
        com.razorpay.l__d$.Q_$2$("destroy_result", new com.razorpay.g__v_(str, i2));
        com.razorpay.l__d$.R$$r_(com.razorpay.f$_G$.INTERNAL_DESTROY_METHOD_CALLED);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("RESULT", str);
        setResult(i, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G__G_() {
        com.razorpay.Magic magic;
        if (com.razorpay.Q$$U_.Q_$2$.booleanValue() && (magic = this.J$_0_) != null) {
            magic.reset();
            return;
        }
        com.razorpay.RzpAssist rzpAssist = this.K$$z$;
        if (rzpAssist != null) {
            rzpAssist.reset();
        }
    }
}
