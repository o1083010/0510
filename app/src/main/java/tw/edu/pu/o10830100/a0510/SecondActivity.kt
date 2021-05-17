package tw.edu.pu.o10830100.a0510

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val you:Int = intent.getIntExtra("You",0)
        val correct:Int = intent.getIntExtra("Correct",0)

var Result:String = ""
        Result = "您的答案為：" +you+ "\n正確答案為：" + correct +"\n\n"
        if(you == correct){
            Result += "您答對了！"
        }
        else{
            Result += "您答錯了！"
        }
        txvMsg.text=Result

        btnBack.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                finish()
            }
        })
    }
}

