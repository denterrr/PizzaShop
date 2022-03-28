package den.ter.pizzashop.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory
import den.ter.pizzashop.R
import den.ter.pizzashop.databinding.ItemLayoutBinding
import den.ter.pizzashop.model.PizzaModel
import den.ter.pizzashop.screens.start.StartFragment
import kotlinx.android.synthetic.main.item_layout.view.*
import java.util.Collections.emptyList

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var list = emptyList<PizzaModel>()
    lateinit var ctx: Context

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("SetTextI18n", "CheckResult")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val crs: DrawableTransitionOptions = DrawableTransitionOptions.with(
            DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()
        )
        holder.itemView.pizza_title.text = list[position].title
        holder.itemView.pizza_desc.text = list[position].desc
        Glide.with(ctx)
            .load(list[position].image)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .transition(crs)
            .placeholder(R.drawable.ic_load)
            .fallback(R.drawable.ic_load)
            .into(holder.itemView.ic_pizza)
        holder.itemView.button_buy.text = "от ${list[position].price} р"
    }


    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(newList: List<PizzaModel>){
        list = newList
        notifyDataSetChanged()
    }



}