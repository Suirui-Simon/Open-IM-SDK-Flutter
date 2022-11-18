package io.openim.flutter_openim_sdk.listener;

import io.openim.flutter_openim_sdk.util.CommonUtil;

/**
 * author : Simon Fu
 * date : 2022/11/18 13:47
 * description :
 */
public class OnLogListener implements open_im_sdk_callback.OnLogListener {
    @Override
    public void onLogout(String s, long i) {
        CommonUtil.emitEvent("logListener", "onPrint", i, s, null);
    }
}
