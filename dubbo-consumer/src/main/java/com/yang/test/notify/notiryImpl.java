package com.yang.test.notify;

/**
 * @author yangmingkai
 * @ClassName notiryImpl
 * @Description TODO
 * @date 2018/10/23 4:54 PM
 **/
public class notiryImpl implements INotify{
    @Override
    public void onreturn(String resStr, String inSter) {
        System.out.println("after");
    }

    @Override
    public void onthrow(Throwable ex, String resStr, String inSter) {
        System.out.println("yichang");
    }

    @Override
    public void oninvoke(String resStr, String inSter) {
        System.out.println("before");
    }
}
