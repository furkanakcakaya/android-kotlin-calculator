package com.example.summachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.summachine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var sumItem1:String = ""
    private var sumItem2:String = ""
    private var isPlus:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvResult.text = "0"

        binding.btnZero.setOnClickListener {
            if (isPlus) {
                sumItem2 += "0"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "0"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnOne.setOnClickListener {
            if (isPlus) {
                sumItem2 += "1"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "1"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnTwo.setOnClickListener {
            if (isPlus) {
                sumItem2 += "2"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "2"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnThree.setOnClickListener {
            if (isPlus) {
                sumItem2 += "3"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "3"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnFour.setOnClickListener {
            if (isPlus) {
                sumItem2 += "4"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "4"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnFive.setOnClickListener {
            if (isPlus) {
                sumItem2 += "5"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "5"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnSix.setOnClickListener {
            if (isPlus) {
                sumItem2 += "6"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "6"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnSeven.setOnClickListener {
            if (isPlus) {
                sumItem2 += "7"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "7"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnEight.setOnClickListener {
            if (isPlus) {
                sumItem2 += "8"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "8"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnNine.setOnClickListener {
            if (isPlus) {
                sumItem2 += "9"
                binding.tvResult.text = sumItem2
            } else {
                sumItem1 += "9"
                binding.tvResult.text = sumItem1
            }
        }

        binding.btnPlus.setOnClickListener {
//            Log.i("PLUS", "onCreate: isPlus = $isPlus")
//            Log.i("PLUS", "onCreate: sumitem1: $sumItem1")
//            Log.i("PLUS", "onCreate: sumitem2: $sumItem2")
            if (sumItem1.length > 0 && !isPlus){
                isPlus = true
                sumItem1 = binding.tvResult.text.toString()
            }else if (sumItem1.length > 0 && sumItem2.length > 0) {
                equals()
                isPlus = true
            }
        }

        binding.btnEq.setOnClickListener {
            equals()
        }

        binding.btnClear.setOnClickListener {
            sumItem1 = ""
            sumItem2 = ""
            binding.tvResult.text = "0"
            isPlus = false
        }
    }

    private fun equals() {
        if (isPlus && sumItem2.length > 0) {
            isPlus = false
            var result = sumItem1.toInt() + sumItem2.toInt()
            binding.tvResult.text = result.toString()
            sumItem1 = result.toString()
            sumItem2 = ""
        } else {
            sumItem1 = binding.tvResult.text.toString()
            binding.tvResult.text = "+?"
            isPlus = true
        }
    }
}