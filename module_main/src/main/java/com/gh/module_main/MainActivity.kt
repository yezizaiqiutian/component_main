package com.gh.module_main

import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.gh.lib_core.baseui.BaseBindingActivity
import com.gh.lib_core.baseui.BaseViewModel
import com.gh.lib_router.login.LoginRoute
import com.gh.lib_router.login.LoginService
import com.gh.lib_router.main.MainRoute
import com.gh.module_main.databinding.MainActivityMainBinding

@Route(path = MainRoute.ACTIVITY_MAIN)
class MainActivity : BaseBindingActivity<MainActivityMainBinding, BaseViewModel>() {

    override fun getLayoutId() = R.layout.main_activity_main

    override fun onInit() {
        binding.btnInterceptor.setOnClickListener {

            ARouter.getInstance().build(LoginRoute.ACTIVITY_LOGIN).navigation()

        }
        binding.btnIslogin.setOnClickListener {

            val navigation = ARouter.getInstance().navigation(LoginService::class.java)
            if (navigation != null) {
                val login = navigation.isLogin()
                Toast.makeText(this@MainActivity,"是否登录:$login",Toast.LENGTH_SHORT).show()
            }
        }
    }

}