package kr.co.lion.androidproject4boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.lion.androidproject4boardapp.databinding.FragmentAddUserInfoBinding

class AddUserInfoFragment : Fragment() {
    lateinit var binding:FragmentAddUserInfoBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAddUserInfoBinding.inflate(inflater)

        setData()
        setToolbar()

        return binding.root
    }

    fun setToolbar(){
        binding.apply{
            toolbarAddUser.apply{
                title = "회원가입"
                setNavigationIcon(R.drawable.arrow_back_24px)
            }
        }
    }

    fun setData(){
        mainActivity = activity as MainActivity
    }

}