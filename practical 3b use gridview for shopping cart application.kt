package com.example.prac3b

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private var gridView: GridView? = null
    private var arrayList: ArrayList<LanguageItem>? = null
    private var languageAdapter: LanguageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.my_grid_view)
        arrayList = ArrayList()
        arrayList = setDataList()
        languageAdapter = LanguageAdapter(applicationContext, arrayList!!)
        gridView?.adapter = languageAdapter
        gridView?.onItemClickListener = this
    }

    private fun setDataList(): ArrayList<LanguageItem> {
        val arrayList: ArrayList<LanguageItem> = ArrayList()
        arrayList.add(LanguageItem(R.drawable.apple, "Apple:Rs:100"))
        arrayList.add(LanguageItem(R.drawable.butter, "Butter:Rs:250"))
        arrayList.add(LanguageItem(R.drawable.graphs, "Graphs:Rs:75"))
        arrayList.add(LanguageItem(R.drawable.horlicks, "Horlicks:Rs:505"))
        arrayList.add(LanguageItem(R.drawable.lays, "Lays:Rs:15"))
        arrayList.add(LanguageItem(R.drawable.maggi, "Maggi:Rs:08"))
        arrayList.add(LanguageItem(R.drawable.mango, "Mango:Rs:180"))
        arrayList.add(LanguageItem(R.drawable.orange, "Orange:Rs:60"))
        arrayList.add(LanguageItem(R.drawable.oreo, "Oreo:Rs:15"))
        arrayList.add(LanguageItem(R.drawable.potato, "Potato:Rs:55"))
        arrayList.add(LanguageItem(R.drawable.tomato, "Tomato:Rs:35"))
        arrayList.add(LanguageItem(R.drawable.sauce, "Sauces:Rs:45"))
        arrayList.add(LanguageItem(R.drawable.soap, "Soap:Rs:30"))
        arrayList.add(LanguageItem(R.drawable.oil, "Oil:Rs:50"))
        arrayList.add(LanguageItem(R.drawable.vegetable, "Vegetable:Rs:80"))
        arrayList.add(LanguageItem(R.drawable.watermelon, "Watermelon:Rs:200"))
        arrayList.add(LanguageItem(R.drawable.strawberry, "Strawberry:Rs:150"))
        return arrayList
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        val languageItem: LanguageItem = arrayList!!.get(p2)
        Toast.makeText(applicationContext, "Add successfully", Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext, languageItem.name, Toast.LENGTH_LONG).show()
    }
}
