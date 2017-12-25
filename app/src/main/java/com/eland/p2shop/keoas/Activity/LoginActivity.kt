package com.eland.p2shop.keoas.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.eland.p2shop.keoas.R
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by liuwenbin on 2017/11/7.
 * 虽然青春不在，但不能自我放逐.
 */
class LoginActivity :BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        Log.i("KEOAS", "one time")

        button2.setOnClickListener {
            login()
        }

    }

    private fun login() {
        val userName: String = textView.text.toString()
        val pwd = editText.text

        if(userName.isEmpty()) return
        if(pwd.isEmpty()) return


    }


}
