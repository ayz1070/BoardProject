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
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)

        setData()
        setEvent()
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
    fun setData(){
        mainActivity = activity as MainActivity
    }

    fun setEvent(){
        binding.apply{
            buttonJoinLogin.setOnClickListener{
                mainActivity.replaceFragment(FragmentNameMain.JOIN_FRAGMENT,false,true,null)
            }
        }
    }

}