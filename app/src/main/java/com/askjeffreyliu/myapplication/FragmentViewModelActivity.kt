package com.askjeffreyliu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.askjeffreyliu.myapplication.ui.fragmentviewmodel.FragmentViewModelFragment

class FragmentViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_view_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, FragmentViewModelFragment.newInstance())
                    .commitNow()
        }
    }

}
