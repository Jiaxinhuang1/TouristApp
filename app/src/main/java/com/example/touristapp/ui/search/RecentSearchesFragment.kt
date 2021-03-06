package com.example.touristapp.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.touristapp.R

class RecentSearchesFragment {}

//class RecentSearchesFragment : Fragment() {
//
//    private lateinit var searchViewModel: SearchViewModel
//    private lateinit var recentSearchesContainer: FrameLayout
//    private lateinit var recentSearchesList: ListView
//    private lateinit var recentSearchesDeleteButton: ImageView
//    private lateinit var wiredList: MutableList<String>
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val root = inflater.inflate(R.layout.fragment_search_recent, container, false)
//        //localContext = root!!.context
//
//        recentSearchesContainer = root.findViewById(R.id.recent_searches_frame_layout)
//        recentSearchesList = root.findViewById(R.id.recent_searches_list)
//        recentSearchesDeleteButton = root.findViewById(R.id.recent_searches_delete_button)
//
//        val previousSet = PrefsUtil.getStringSet(
//            PrefsUtil.PREVIOUS_SEARCHES_KEY,
//            emptySet())
//        if (previousSet != null && previousSet.isNotEmpty()) {
//            wiredList = previousSet.toMutableList()
//        } else {
//            wiredList = arrayListOf()
//            wiredList.clear()
//        }
//
//        val newAdapter = ArrayAdapter(
//            requireContext(), R.layout.fragment_search_item_textview, wiredList)
//
//        recentSearchesList.adapter = newAdapter
//        searchViewModel.previousSearchStringList.observe(viewLifecycleOwner, {
//            val searchList = it
//            wiredList = searchList!!.toMutableList()
//        })
//
//        recentSearchesDeleteButton.setOnClickListener { _ ->
//            wiredList.clear()
//            newAdapter.clear()
////            PrefsUtil.setStringSet(PrefsUtil.PREVIOUS_SEARCHES_KEY, emptySet())
//            newAdapter.notifyDataSetChanged()
//        }
//
//        recentSearchesList.setOnItemClickListener { parent, v, position, id ->
//            val intent = Intent(context, FruitActivity::class.java)
//            val fruitName = (v as TextView).text
//            intent.putExtra(FruitActivity.EXTRA_NAME, fruitName)
//            requireContext().startActivity(intent)
//        }
//        return root
//    }
//
//
//    fun setViewModel(viewModel: SearchViewModel) {
//        searchViewModel = viewModel
//    }
//
//    fun show() {
//        recentSearchesContainer.visibility = View.VISIBLE
//    }
//
//    fun hide() {
//        recentSearchesContainer.visibility = View.INVISIBLE
//    }
//
//
//}