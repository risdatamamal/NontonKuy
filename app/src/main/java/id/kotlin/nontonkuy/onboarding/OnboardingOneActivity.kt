package id.kotlin.nontonkuy.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.kotlin.nontonkuy.R
import id.kotlin.nontonkuy.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding_one.*
import java.util.prefs.Preferences

class OnboardingOneActivity : AppCompatActivity() {

    lateinit var preferences: id.kotlin.nontonkuy.utils.Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        preferences = id.kotlin.nontonkuy.utils.Preferences(this)

        if (preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent = Intent(this, OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_daftar.setOnClickListener {
            finishAffinity()

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
