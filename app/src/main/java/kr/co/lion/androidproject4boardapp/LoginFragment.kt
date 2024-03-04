package kr.co.lion.androidproject4boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.lion.androidproject4boardapp.databinding.FragmentJoinBinding
import kr.co.lion.androidproject4boardapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)

        setToolbar()
        return binding.root
    }

    fun setToolbar(){
        binding.apply{
            toolbarLogin.apply{
                title = "로그인"
                setNavigationIcon(R.drawable.arrow_back_24px)
            }
        }
    }

}