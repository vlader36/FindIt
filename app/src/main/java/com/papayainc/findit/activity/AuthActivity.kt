package com.papayainc.findit.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.firebase.FirebaseApp
import com.papayainc.findit.R
import com.papayainc.findit.view.MaterialInputField

class AuthActivity: AppCompatActivity(), View.OnClickListener {
    private lateinit var mLoginInput: MaterialInputField
    private lateinit var mPasswordInput: MaterialInputField
    private lateinit var mLoginButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        FirebaseApp.initializeApp(this)

        mLoginInput = findViewById(R.id.login_login_input)
        mPasswordInput = findViewById(R.id.login_password_input)
        mLoginButton = findViewById(R.id.login_login_button)
        mLoginButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when (v.id){
                R.id.login_login_button -> {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                }
            }
        }
    }
}