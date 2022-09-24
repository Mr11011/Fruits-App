//package com.example.fruit
//
//import android.content.Intent
//import android.view.View
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    private val images: ImageView
//    private val names: TextView
//
//    init {
//        images = itemView.findViewById(R.id.Image_layout)
//        names = itemView.findViewById(R.id.item_label)
//        navigate()
//
//
//    }
//
//    fun bind(dataModel: DataModel) {
//        names.text = dataModel.FruitName
//        )
////        images.setImageResource(dataModel.Image)
//    }
//
//
//    private fun navigate() {
//        itemView.setOnClickListener {
//
//            val intent: Intent = Intent(itemView.context, MainActivity2::class.java)
//            val currentF = FruitList[layoutPosition]
//            intent.putExtra("Fruits", currentF)
////            intent.putExtra("Fruits", currentF.Description)
////            intent.putExtra("Fruits", currentF.Image)
//            itemView.context.startActivity(intent)
//
//
//        }
//    }
//
//}