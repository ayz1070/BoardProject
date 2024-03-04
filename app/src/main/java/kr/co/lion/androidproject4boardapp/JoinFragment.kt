package kr.co.lion.androidproject4boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.lion.androidproject4boardapp.databinding.FragmentJoinBinding

class JoinFragment : Fragment() {

    lateinit var binding:FragmentJoinBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentJoinBinding.inflate(inflater)
        setData()
        setToolbar()
        setEvent()
        return binding.root
    }

    fun setToolbar(){
        binding.apply{
            toolbarJoin.apply{
                title = "회원가입"
                setNavigationIcon(R.drawable.arrow_back_24px)
            }
        }
    }

    fun setData(){
        mainActivity = activity as MainActivity
    }

    fun initView(){

    }

    fun setEvent(){
        binding.apply {
            buttonNextJoin.setOnClickListener {
                mainActivity.replaceFragment(FragmentNameMain.ADD_USER_INFO_FRAGMENT, false, true, null)
            }
        }
    }
}