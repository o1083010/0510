package tw.edu.pu.o10830100.a0510

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var x :Int=0
    var y :Int=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GenerateQuestion()

        btn2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                GenerateQuestion()
            }
        })

        btn1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity, SecondActivity::class.java).apply {
                    putExtra("You", edt.text.toString().toInt())
                    putExtra("Correct", (x+y).toInt())

                }
                startActivity(intent)
            }
        })
    }


        fun GenerateQuestion(){
            x=(0..100).random()
            y=(0..100).random()


            txvQuestion.text= x.toString() +"+"+ y.toString() +"="

            edt.text = null
        }

}