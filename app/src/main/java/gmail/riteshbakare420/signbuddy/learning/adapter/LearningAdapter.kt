package gmail.riteshbakare420.signbuddy.learning.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import gmail.riteshbakare420.signbuddy.R
import gmail.riteshbakare420.signbuddy.learning.models.Learning

class LearningAdapter(private val learningList: ArrayList<Learning>) :
    RecyclerView.Adapter<LearningAdapter.MyViewHolder>() {

    private lateinit var mListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        mListener = listener
    }

    class MyViewHolder(itemView: View, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.IVLearn)
        val char: TextView = itemView.findViewById(R.id.TVLearn)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.learning_tile, parent, false)
        return MyViewHolder(view, mListener)
    }

    override fun getItemCount(): Int {
        return learningList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val learning : Learning = learningList[position]
        holder.char.text = learning.character
        holder.image.setImageResource(learning.image)
    }

}