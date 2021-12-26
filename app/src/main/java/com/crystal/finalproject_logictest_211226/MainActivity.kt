package com.crystal.finalproject_logictest_211226

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.crystal.finalproject_logictest_211226.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.btnLottoSimulator.setOnClickListener {

            val myIntent = Intent(mContext, LottoSimulatorActivity::class.java)
            startActivity(myIntent)

        }

        binding.btnNumberBaseBallGame.setOnClickListener {
            val myIntent = Intent(mContext, NumberBaseballGameActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun setValues() {
    }
}