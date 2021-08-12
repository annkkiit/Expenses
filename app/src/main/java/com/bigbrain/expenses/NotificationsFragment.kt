package com.bigbrain.expenses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

/**
 * A simple [Fragment] subclass.
 */
class NotificationsFragment : Fragment() {

    private lateinit var btnNotificationDetails : MaterialButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnNotificationDetails = view.findViewById(R.id.btnNotificationDetails)
        setupViews()
    }

    fun setupViews()
    {
        btnNotificationDetails.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_notificationDetailsFragment)
        }
    }

}
