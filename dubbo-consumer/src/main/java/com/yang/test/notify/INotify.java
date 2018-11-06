package com.yang.test.notify;

/**
 * @author yangmingkai
 * @ClassName INotify
 * @Description TODO
 * @date 2018/10/23 4:51 PM
 **/
public interface INotify {
    void onreturn(String resStr,String inSter);
    void onthrow(Throwable ex,String resStr,String inSter);
    void oninvoke(String resStr,String inSter);
}
