package com.fomus.mobile_erp.ui.actions

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.fomus.mobile_erp.R

class ActionsScreenFragment : Fragment() {

    companion object {
        fun newInstance() = ActionsScreenFragment()
    }

    private lateinit var viewModel: ActionsScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.actions_screen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ActionsScreenViewModel::class.java)
        setHasOptionsMenu(true)

    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_actions_screen, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add -> {
                addSomething()
                true
            }
            R.id.create_action -> {
                createAction()
                true
            }
            R.id.read_action -> {
                readAction()
                true
            }
            R.id.update_action -> {
                updateAction()
                true
            }
            R.id.delete_action -> {
                deleteAction()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun deleteAction() {
        Toast.makeText(requireContext(),"menu clickeed",Toast.LENGTH_LONG).show()
    }

    private fun updateAction() {

        Toast.makeText(requireContext(),"menu clickeed",Toast.LENGTH_LONG).show()
    }

    private fun readAction() {
        Toast.makeText(requireContext(),"menu clickeed",Toast.LENGTH_LONG).show()
    }

    private fun createAction() {
        Toast.makeText(requireContext(),"menu clickeed",Toast.LENGTH_LONG).show()
    }

    private fun addSomething() {
        Toast.makeText(requireContext(),"menu clickeed",Toast.LENGTH_LONG).show()
    }

}