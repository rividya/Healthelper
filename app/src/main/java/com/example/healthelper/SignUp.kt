package com.example.healthelper

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.healthelper.api.model.HealthelperInterface
import com.example.healthelper.api.model.HealthelperService
import com.example.healthelper.api.request.RegisterRequest
import com.example.healthelper.api.response.RegisterResponse

import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        button_signup_login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        button_signup.setOnClickListener {
            val name = txt_name.text.toString()
            val email = txt_email.text.toString()
            val phone_number = txt_phone_number.text.toString()
            val address = txt_address.text.toString()
            val password = txt_password.text.toString()

            if (email.isEmpty()) {
                txt_email.error = "Email required"
                txt_email.requestFocus()
                return@setOnClickListener
            }

            if (phone_number.isEmpty()) {
                txt_phone_number.error = "Phone number required"
                txt_phone_number.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                txt_password.error = "Password required"
                txt_password.requestFocus()
                return@setOnClickListener
            }

            val retIn = HealthelperService.getHealthelperService().create(HealthelperInterface::class.java)
            val registerReq =
                RegisterRequest(name, email, phone_number, address, password)
                retIn.register(registerReq)
                .enqueue(object: Callback<RegisterResponse> {
                    override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<RegisterResponse>, response: Response<RegisterResponse>) {
                        val registerResponse = response.body()
                        Log.d("Response","$registerResponse")
                        if(registerResponse?.code == 201){
                            Toast.makeText(this@SignUp, "Register success!", Toast.LENGTH_SHORT).show()
                            val intent = Intent(applicationContext, Login::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(this@SignUp, "Register failed!", Toast.LENGTH_SHORT).show()
                        }
                    }

                })
        }
    }
}
