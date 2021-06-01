package com.example.motivation.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.R
import com.example.motivation.util.MotivationConstants
import com.example.motivation.util.SecurityPreference
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mSecurity: SecurityPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mSecurity = SecurityPreference(this)
        buttonSave.setOnClickListener(this)
        verifyUserName()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.buttonSave) handleSave()
    }

    private fun verifyUserName() {
        val username = mSecurity.getStoredString(MotivationConstants.KEY.PERSON_NAME)
        if (username != "") startActivity(Intent(this, MainActivity::class.java))
        editName.setText(username)
    }

    private fun handleSave() {
        val name: String = editName.text.toString()
        if (name.isEmpty()) {
            Toast.makeText(this, "Favor informar um nome!", Toast.LENGTH_LONG).show()
        } else {
            mSecurity.storeString(MotivationConstants.KEY.PERSON_NAME, name)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // finish() /* impede que seja possível voltar a esta activity */
        }
    }
}