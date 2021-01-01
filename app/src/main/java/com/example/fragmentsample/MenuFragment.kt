package com.example.fragmentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.ListFragment


class MenuFragment : ListFragment() {
     var adapter :ArrayAdapter<CharSequence>? = null

    var androidOS = arrayOf(
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "Honeycomb",
        "Ice Cream SandWich",
        "Jelly Bean",
        "KitKat"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      return  inflater.inflate(R.layout.menu_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       adapter = context?.let {
           ArrayAdapter.createFromResource(it,
                   R.array.androidOS , android.R.layout.simple_list_item_1)
       }
        setListAdapter(adapter)
        //  Retain the ListFragment instance across Activity re-creation
        retainInstance = true

    }

    override fun onListItemClick(listView: ListView, view: View, position: Int, id: Long) {
        super.onListItemClick(listView, view, position, id)
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show()
    }



}