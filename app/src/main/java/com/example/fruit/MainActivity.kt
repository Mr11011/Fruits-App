package com.example.fruit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycler_view)
        val listOfFruits=getListOfFruits()
        val fruitsFruitAdapter=FruitAdapter(listOfFruits)
        recyclerView.adapter=fruitsFruitAdapter



    }


    private fun getListOfFruits():List<DataModel>{
        val fruity= mutableListOf<DataModel>()
     fruity.add(DataModel("Mango","You can drink and eat it",R.drawable.mango))
     fruity.add(DataModel("Banana","Monkeys love banana so much because it has a beautiful taste",R.drawable.banana))
     fruity.add(DataModel("Strawberry","This fruit is Red and juicy",R.drawable.strawberry))
     fruity.add(DataModel("Avocado","You can drink and eat it",R.drawable.avocado))
     fruity.add(DataModel("Cherry","cherry is a small fruit and has a beautiful taste",R.drawable.cherry))
     fruity.add(DataModel("Guava","This fruit color is green",R.drawable.guava))
     fruity.add(DataModel("Pineapple","This fruit has a special shape",R.drawable.pin))
     fruity.add(DataModel("Coconut","This fruit has a syrup inside it , you should break it first",R.drawable.coco))
     fruity.add(DataModel("KIWI","This fruit called Kiwi , you should break it first",R.drawable.kiwi))
     fruity.add(DataModel("Watermelon","A watermelon is a large round fruit with green skin, pink flesh, and black seeds.",R.drawable.watermelon2))
     fruity.add(DataModel("Orange","This fruit color is orange as its name ",R.drawable.orange))
     fruity.add(DataModel("Grape","This fruit called grape ",R.drawable.grape))



        return  fruity

    }

}