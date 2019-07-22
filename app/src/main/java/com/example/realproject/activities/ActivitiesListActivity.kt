package com.example.realproject.activities

import android.app.Presentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerActivitiesAdapter
import com.example.realproject.model.Addressed
import kotlinx.android.synthetic.main.activity_activities_list.*

class ActivitiesListActivity : AppCompatActivity() {
    lateinit var presentationArray: List<Addressed>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_list)
        val addressd_chairman = Addressed("Sayar U Thein Oo","Don't wait fo opportunity, Creat it",
                                R.drawable.chairman,R.drawable.favorite,"1.8M",R.drawable.comment,"50K",
                                R.drawable.seen,"1.8M seen","June လ (၄) ရက္ေန႕နဲ႕ (၅) ရက္ေန႕မွာ Interview ေျဖဆိုရမယ့္သူမ်ားအေနနဲ႕ ေအာက္ပါအခ်က္အလက္မ်ားကို ေမးျမန္းသြားမွာျဖစ္ပါတယ္…\n" +
                    "\n" +
                    "(၁) မိမိအေၾကာင္းမိတ္ဆက္ျခင္းနွင့္ ကိုယ္ေရးအက်ဥ္း၊ အနာဂတ္ရည္မွန္းခ်က္\n" +
                    "(၂) Technical Test (Online Test) မွေျဖဆိုထားမွဳမ်ားမွ ေကာက္နွဳတ္ ေမးျမန္းခ်က္မ်ား\n" +
                    "(၃) Talent Program ကို တက္ေရာက္နိုင္ရန္အတြက္ စည္းမ်ဥ္းစည္းကမ္း သေဘာတူညီခ်က္ကို လုိက္နာနိုင္ျခင္း ရိွမရိွ ေမးျမန္းခ်က္မ်ား\n" +
                    "(၄) က်င့္ဝတ္ပိုင္းဆိုင္ရာနွင့္ ကိုယ္က်င့္တရားဆိုင္ရာ ေမးျမန္းခ်က္မ်ား\n" +
                    "\n" +
                    "မွတ္ပံုတင္၊ သန္းေခါင္စာရင္းမိတၲဴ၊ ဘဲြ႕လက္မွတ္၊ သင္တန္းဆင္းလက္မွတ္ အစရိွတဲ့ လိုအပ္တဲ့စာရြက္စာတမ္းေတြလည္း တပါတည္း ယူလာခဲ့ေပးပါေနာ္…")
        val addressed_ceo = Addressed("Talent Program Myanmar","Talent materials are ready now and waiting",
                                R.drawable.group,R.drawable.favorite,"50.8K",R.drawable.comment,"50K",
                                R.drawable.seen,"1M seen","မဂၤလာပါ\n" +
                    "TALENT Program Entrance Final Test ျဖစ္\u200Bတဲ့ လူေတြ႕စစ္ေဆးျခင္း Interview \u200BResultမ်ားကို သက္\u200Bဆိုင္\u200Bရာ Fieldမ်ားအလိုက္\u200B \u200Bေၾကျငာ\u200Bေပးျခင္\u200Bးျဖစ္\u200Bပါတယ္\u200B။Talent Program ၀င္\u200Bခြင္\u200B့\u200Bေအာင္\u200Bျမင္\u200Bသူမ်ားအားလံုးသည္\u200B 14/06/2019(Friday)\u200Bေန႔ Room 10, Building 5, MICT Park, Hlaing တြင္\u200B မနက္\u200B 9:00 Amနာရီ အမွီစတင္\u200Bတတ္\u200B\u200Bေရာက္\u200Bၾကရမည္\u200Bျဖစ္\u200Bပါသည္\u200B။။ ဖုန္\u200Bး (သို႔) Emailျဖင္\u200B့လည္\u200Bးဆက္\u200Bသြယ္\u200Bအ\u200Bေၾကာင္\u200Bးၾကား\u200Bေပးမည္\u200Bျဖစ္\u200Bၿပီး အ\u200Bေသးစိတ္\u200Bသိရိွလိုပါက 09777005811သို႔ဆက္\u200Bသြယ္\u200B\u200Bေမးျမန္\u200Bးနိုင္\u200Bပါသည္\u200B။")
        val new_addressd_chairman = Addressed("Sayar U Thein Oo","Don't wait fo opportunity, Creat it",
            R.drawable.chairman,R.drawable.favorite,"1.8M",R.drawable.comment,"50K",
            R.drawable.seen,"1.8M seen","မဂၤလာပါ\n" +
                    "TALENT Program Entrance Final Test ျဖစ္\u200Bတဲ့ လူေတြ့စစ္ေဆးျခင္း Interview \u200BResultမ်ားကို 07/06/2019(Friday)\u200Bေန႔ ည\u200Bေနပိုင္\u200Bးတြင္\u200B သက္ဆိုင္ရာ Field မ်ားအလိုက္ ထုတ္\u200Bျပန္\u200B\u200Bေျကျငာေပးသြားမည္\u200Bျဖစ္\u200Bၿပီး Talent Program အား 14/06/2019(Friday)\u200Bေန႔တြင္\u200Bစတင္\u200Bဖြင္\u200B့လွစ္\u200Bသင္\u200Bၾကား\u200Bေပးသြားမည္\u200Bျဖစ္\u200Bပါ\u200Bသည္\u200B။")
        presentationArray = mutableListOf<Addressed>(addressd_chairman,addressed_ceo,new_addressd_chairman)
        var rvActivityAdapter = RecyclerActivitiesAdapter(presentationArray, this::onItemClick)
        rvActivity.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        rvActivity.adapter = rvActivityAdapter
    }
    private fun  onItemClick(addressed:Addressed){
        startActivity(ActivitiesDetailActivity.newIntent(
            this,addressed.name,addressed.mainImg,addressed.msgBdoy))
    }

}
