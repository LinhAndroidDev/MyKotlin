package com.example.mykotlin

import android.graphics.drawable.LayerDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.Visibility
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*
import kotlin.collections.ArrayList

class SecondActivity : AppCompatActivity() {
    var b1: Int = 0
    var b2: Int = 0
    var b3: Int = 0
    var kq1: Int = 1
    var kq2: Int = 2
    var kq3: Int = 3
    var arrlabai: ArrayList<Int> = ArrayList()
    var ramb1:Random = Random()
    var ramb2:Random = Random()
    var ramb3:Random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Click restart
        ClickRestart()

        //Tạo mảng lá bài
        TaoMangLaBai()

        var tiengLatBai:MediaPlayer = MediaPlayer.create(this@SecondActivity,R.raw.tienggamebai)

        //Tạo random
        var ram1: Random = Random()
        var ram2: Random = Random()
        var ram3: Random = Random()

        //lá bài 1
        laBai1.setOnClickListener {
            tiengLatBai.start()

            //set enable cho lá bài 1
            laBai1.isEnabled = false

            //Tạo giá trị cho lá bài 1
            do {
                kq1 = ram1.nextInt(51)
            }while (kq1 == kq2 || kq2 == kq3 || kq3 == kq1)

                laBai1.animate().apply {
                    duration = 200
                    rotationYBy(90f)
                }.withEndAction {
                    laBai1.animate().apply {
                        duration = 200
                        rotationYBy(90f)
                        laBai1.setBackgroundResource(arrlabai.get(kq1))
                        InKetQua();
                    }
                }
            }

        //lá bài 2
        laBai2.setOnClickListener {
            tiengLatBai.start()

            //set enable cho lá bài 2
            laBai2.isEnabled = false

            //Tạo giá trị cho lá bài 2
            do {
                kq2 = ram1.nextInt(51)
            }while (kq1 == kq2 || kq2 == kq3 || kq3 == kq1)

                laBai2.animate().apply {
                    duration = 200
                    rotationYBy(90f)
                }.withEndAction {
                    laBai2.animate().apply {
                        duration = 200
                        rotationYBy(90f)
                        laBai2.setBackgroundResource(arrlabai.get(kq2))
                        InKetQua();
                    }
                }
        }

        //lá bài 3
        laBai3.setOnClickListener {
            tiengLatBai.start()

            //set enable cho lá bài 3
            laBai3.isEnabled = false

            //Tạo giá trị cho giá trị 3
            do {
                kq1 = ram1.nextInt(51)
            }while (kq1 == kq2 || kq2 == kq3 || kq3 == kq1)

                laBai3.animate().apply {
                    duration = 200
                    rotationYBy(90f)
                }.withEndAction {
                    laBai3.animate().apply {
                        duration = 200
                        rotationYBy(90f)
                        laBai3.setBackgroundResource(arrlabai.get(kq3))
                        InKetQua();
                    }
                }
        }
    }

    private fun LaBaiBoss() {
        b1 = b1 % 13+1
        b2 = b2 % 13+1
        b3 = b3 % 13+1
    }

    private fun ClickRestart() {
        restart.setOnClickListener {
            laBai1.isChecked = false
            laBai2.isChecked = false
            laBai3.isChecked = false

            laBai1.isEnabled = true
            laBai2.isEnabled = true
            laBai3.isEnabled = true

            laBai1.animate().apply {
                duration = 300
                rotationYBy(-90f)
            }.withEndAction {
                laBai1.setBackgroundResource(R.drawable.matup)
                laBai1.animate().apply {
                    duration = 300
                    rotationYBy(-90f)
                }
            }

            laBai2.animate().apply {
                duration = 300
                rotationYBy(-90f)
            }.withEndAction {
                laBai2.setBackgroundResource(R.drawable.matup)
                laBai2.animate().apply {
                    duration = 300
                    rotationYBy(-90f)
                }
            }

            laBai3.animate().apply {
                duration = 300
                rotationYBy(-90f)
            }.withEndAction {
                laBai3.setBackgroundResource(R.drawable.matup)
                laBai3.animate().apply {
                    duration = 300
                    rotationYBy(-90f)
                }
            }

            laBaiboss1.animate().apply {
                duration = 300
                rotationYBy(-90f)
            }.withEndAction {
                laBaiboss1.setBackgroundResource(R.drawable.matup)
                laBaiboss1.animate().apply {
                    duration = 300
                    rotationYBy(-90f)
                }
            }

            laBaiboss2.animate().apply {
                duration = 300
                rotationYBy(-90f)
            }.withEndAction {
                laBaiboss2.setBackgroundResource(R.drawable.matup)
                laBaiboss2.animate().apply {
                    duration = 300
                    rotationYBy(-90f)
                }
            }

            laBaiboss3.animate().apply {
                duration = 300
                rotationYBy(-90f)
            }.withEndAction {
                laBaiboss3.setBackgroundResource(R.drawable.matup)
                laBaiboss3.animate().apply {
                    duration = 300
                    rotationYBy(-90f)
                }
            }
        }
    }

    private fun TaoMangLaBai() {
        arrlabai.add(R.drawable.coat)
        arrlabai.add(R.drawable.co2)
        arrlabai.add(R.drawable.co3)
        arrlabai.add(R.drawable.co4)
        arrlabai.add(R.drawable.co5)
        arrlabai.add(R.drawable.co6)
        arrlabai.add(R.drawable.co7)
        arrlabai.add(R.drawable.co8)
        arrlabai.add(R.drawable.co9)
        arrlabai.add(R.drawable.co10)
        arrlabai.add(R.drawable.coj)
        arrlabai.add(R.drawable.coq)
        arrlabai.add(R.drawable.cok)
        arrlabai.add(R.drawable.roat)
        arrlabai.add(R.drawable.ro2)
        arrlabai.add(R.drawable.ro3)
        arrlabai.add(R.drawable.ro4)
        arrlabai.add(R.drawable.ro5)
        arrlabai.add(R.drawable.ro6)
        arrlabai.add(R.drawable.ro7)
        arrlabai.add(R.drawable.ro8)
        arrlabai.add(R.drawable.ro9)
        arrlabai.add(R.drawable.ro10)
        arrlabai.add(R.drawable.roj)
        arrlabai.add(R.drawable.roq)
        arrlabai.add(R.drawable.rok)
        arrlabai.add(R.drawable.tepat)
        arrlabai.add(R.drawable.tep2)
        arrlabai.add(R.drawable.tep3)
        arrlabai.add(R.drawable.tep4)
        arrlabai.add(R.drawable.tep5)
        arrlabai.add(R.drawable.tep6)
        arrlabai.add(R.drawable.tep7)
        arrlabai.add(R.drawable.tep8)
        arrlabai.add(R.drawable.tep9)
        arrlabai.add(R.drawable.tep10)
        arrlabai.add(R.drawable.tepj)
        arrlabai.add(R.drawable.tepq)
        arrlabai.add(R.drawable.tepk)
        arrlabai.add(R.drawable.bichat)
        arrlabai.add(R.drawable.bich2)
        arrlabai.add(R.drawable.bich3)
        arrlabai.add(R.drawable.bich4)
        arrlabai.add(R.drawable.bich5)
        arrlabai.add(R.drawable.bich6)
        arrlabai.add(R.drawable.bich7)
        arrlabai.add(R.drawable.bich8)
        arrlabai.add(R.drawable.bich9)
        arrlabai.add(R.drawable.bich10)
        arrlabai.add(R.drawable.bichj)
        arrlabai.add(R.drawable.bichq)
        arrlabai.add(R.drawable.bichk)
    }

    private fun InKetQua() {
        //In ra kết quả
        if (laBai1.isChecked  && laBai2.isChecked && laBai3.isChecked) {
            //tạo kết quả lá bài boss
            TaoLaBaiBoss()

            //Tạo lá bài boss
            LaBaiBoss()

            kq1 = kq1 % 13+1
            kq2 = kq2 % 13+1
            kq3 = kq3 % 13+1

            var player = kq1 + kq2 + kq3
            if(player % 10 == 0){
                player = player % 10 + 10
            }else{
                player = player % 10
            }

            var boss = b1 + b2 + b3 + 3

            if(boss % 10 == 0){
                boss = boss % 10 + 10
            }else {
                boss = boss % 10
            }

            var kq = player - boss

            if(kq > 0){
                ketqua.setText("Chúc mừng bạn đã thắng")
            }
            else if(kq < 0){
                ketqua.setText("Chủ phòng thắng")
            }else if(kq == 0){
                ketqua.setText("Hoà rồi")
            }

            ketqua.animate().apply {
                duration = 400
                scaleXBy(1f)
                scaleYBy(1f)
            }.withEndAction {
                ketqua.animate().apply {
                    duration = 400
                    scaleXBy(-1f)
                    scaleYBy(-1f)
                }
            }
            }
        }

    private fun TaoLaBaiBoss() {
        do {
            b1 = ramb1.nextInt(51)
            b2 = ramb2.nextInt(51)
            b3 = ramb3.nextInt(51)
        }while (b1 == b2 || b2 == b3 || b3 == b1)

        laBaiboss1.animate().apply {
            duration = 300
            rotationYBy(90f)
        }.withEndAction {
            laBaiboss1.animate().apply {
                duration = 300
                rotationYBy(90f)
                laBaiboss1.setBackgroundResource(arrlabai.get(b1))
            }
        }

        laBaiboss2.animate().apply {
            duration = 300
            rotationYBy(90f)
        }.withEndAction {
            laBaiboss2.animate().apply {
                duration = 300
                rotationYBy(90f)
                laBaiboss2.setBackgroundResource(arrlabai.get(b2))
            }
        }

        laBaiboss3.animate().apply {
            duration = 300
            rotationYBy(90f)
        }.withEndAction {
            laBaiboss3.animate().apply {
                duration = 300
                rotationYBy(90f)
                laBaiboss3.setBackgroundResource(arrlabai.get(b3))
            }
        }
    }
}