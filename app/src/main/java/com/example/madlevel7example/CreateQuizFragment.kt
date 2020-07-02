package com.example.madlevel7example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_create_quiz.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CreateQuizFragment : Fragment() {

    private lateinit var viewModel: QuizViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize the Shared Activity ViewModel
        viewModel = ViewModelProvider(activity as AppCompatActivity).get(QuizViewModel::class.java)

        btnCreate.setOnClickListener {
            viewModel.createQuestion(
                etQuestion.text.toString(),
                etAnswer.text.toString()
            )
            findNavController().navigateUp()
        }
    }
}
