package com.bw.movie.constant;

import com.bw.movie.model.bean.XLLoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * <p>文件描述：接口<p>
 * <p>作者：吴新仲<p>
 * <p>创建时间：2019/11/5/005<p>
 * <p>更改时间：2019/11/5/005<p>
 */
public interface Constant {

    //登录接口
    @FormUrlEncoded
    @POST("movieApi/user/v2/login")
    Observable<XLLoginBean> XL_LOGIN_BEAN(@Field("email")String email,
                                          @Field("pwd")String pwd);

}
