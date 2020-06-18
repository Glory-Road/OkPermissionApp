package com.qing.okpermissionapp

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.qing.okpermission.OkPermission

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        OkPermission.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
            if (allGranted) {
                Toast.makeText(this, "通过了", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "未通过", Toast.LENGTH_LONG).show()
            }
        }
    }
}