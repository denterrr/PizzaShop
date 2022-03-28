package den.ter.pizzashop.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import den.ter.pizzashop.R
import den.ter.pizzashop.model.BannerModel
import den.ter.pizzashop.model.PizzaModel
import kotlinx.android.synthetic.main.item_banner.view.*
import java.util.*
import java.util.Collections.emptyList

class BannerAdapter: RecyclerView.Adapter<BannerAdapter.BannerViewHolder>(){

    private var list = emptyList<BannerModel>()

    class BannerViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {


        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_banner, parent, false)
        return BannerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {

        holder.itemView.iv_banner.setImageResource(list[position].banner)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(newList: List<BannerModel>){
        list = newList
        notifyDataSetChanged()
    }
}