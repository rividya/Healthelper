package com.example.healthelper

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthelper.api.model.HealthelperInterface
import com.example.healthelper.api.model.HealthelperService
import com.example.healthelper.api.request.loginRequest
import com.example.healthelper.api.response.loginResponse
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_login_signup.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        button_login.setOnClickListener {
//            val intent = Intent(this, Home::class.java)
//            startActivity(intent)
            val email = txtemail.text.toString().trim()
            val password = txtpass.text.toString().trim()

            if(email.isEmpty()){
                txtemail.error = "Email required"
                txtemail.requestFocus()
                return@setOnClickListener
            }

            if(password.isEmpty()){
                txtpass.error = "Password required"
                txtpass.requestFocus()
                return@setOnClickListener
            }

            val retIn = HealthelperService.getHealthelperService().create(HealthelperInterface::class.java)
            val loginReq =
                loginRequest(email, password)
            retIn.login(loginReq)
                .enqueue(object: Callback<loginResponse>{
                    override fun onFailure(call: Call<loginResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<loginResponse>, response: Response<loginResponse>) {
                        val loginResponse = response.body()
                        Log.d("Response","$loginResponse")
                        if(loginResponse?.code == 200){
                            Toast.makeText(this@Login, "Login success!", Toast.LENGTH_SHORT).show()

//                            getInstance(applicationContext).saveToken(response.body()!!.result)
                            val intent = Intent(applicationContext, Home::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(this@Login, "Login failed!", Toast.LENGTH_SHORT).show()
                        }

                    }
                })
        }
    }
}
