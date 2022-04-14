package com.gh.module_main

import android.widget.Toast
import com.gh.lib_core.baseui.BaseBindingActivity
import com.gh.lib_core.baseui.BaseViewModel
import com.gh.module_main.databinding.MainActivityMainBinding

class MainActivity : BaseBindingActivity<MainActivityMainBinding, BaseViewModel>() {

    override fun getLayoutId() = R.layout.main_activity_main

    override fun onInit() {
        binding.btnInterceptor.setOnClickListener {
            Toast.makeText(this,"aaaa",Toast.LENGTH_SHORT).show()
        }
    }

}