package com.bw.movie.constraint;

import com.bw.movie.model.bean.XLLoginBean;
import com.bw.movie.view.interfaces.IBaseView;

/**
 * <p>文件描述：契约类<p>
 * <p>作者：吴新仲<p>
 * <p>创建时间：2019/11/5/005<p>
 * <p>更改时间：2019/11/5/005<p>
 */
public interface Constraint {
    //登录
    interface ILoginView extends IBaseView {
        void loginSuccess(XLLoginBean xlLoginBean);

        void loginError(String s);
    }
}
