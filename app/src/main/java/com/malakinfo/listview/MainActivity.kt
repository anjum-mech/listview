package com.malakinfo.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.trendyol.bubblescrollbarlib.BubbleTextProvider
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    internal var listData:MutableList<String> = ArrayList()

    lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        recycler_view.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.addItemDecoration(DividerItemDecoration(this,layoutManager.orientation))

        Collections.sort(listData)
        recycler_view.adapter = MyAdapter(listData)

        bubble_scrollbar.attachToRecyclerView(recycler_view)
        bubble_scrollbar.bubbleTextProvider = BubbleTextProvider {
            position-> StringBuilder(listData[position]).substring(0,1).toString()
        }
    }

    private fun initData() {
        listData.add("Aabidah")
        listData.add("Aaeedah")
        listData.add("Aaleyah")
        listData.add("Aasma")
        listData.add("Abeer")
        listData.add("Ablah")
        listData.add("Adara")
        listData.add("Adilah")
        listData.add("Adiva")
        listData.add("Afaaf")
        listData.add("Afra")
        listData.add("Ahd")
        listData.add("Ahlam")
        listData.add("Alima")
        listData.add("Almas")
        listData.add("Amal")
        listData.add("Aminah")
        listData.add("Amira")
        listData.add("Amtullah")
        listData.add("Anan")
        listData.add("Anisah")
        listData.add("Ayshah")
        listData.add("Aziza")
        listData.add("Badia")
        listData.add("Badriya")
        listData.add("Bahameen")
        listData.add("Barika")
    }

}
