package kr.co.lion.androidproject4boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout
import kr.co.lion.androidproject4boardapp.databinding.FragmentJoinBinding
import kr.co.lion.androidproject4boardapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    lateinit var mainActivity: MainActivity

    lateinit var userId:String
    lateinit var userPassword:String

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

            buttonLoginLogin.setOnClickListener {
                val chk = checkTextInput()
                if(chk==true){
                    // 입력 데이터가 정상적으로 입력되었을 때

                    mainActivity.hideSoftInput()

                    userId = editTextIdLogin.text.toString()
                    userPassword = editTextPasswordLogin.text.toString()

                    // 테스트로 스낵바
                    Snackbar.make(binding.root,"아이디 : ${userId}, 비밀번호 : ${userPassword}",Snackbar.LENGTH_SHORT).show()
                }
            }

        }
    }

    fun checkTextInput():Boolean{
        binding.apply{
            var errorView:View? = null

            if(editTextIdLogin.text.toString().trim().isEmpty()){
                textInputLayoutIdLogin.error = "아이디를 입력해주세요"
                if(errorView == null){
                    errorView = editTextIdLogin
                }
            }else{
                textInputLayoutIdLogin.error = null
            }

            if(editTextPasswordLogin.text.toString().trim().isEmpty()){
                textInputLayoutPasswordLogin.error = "비밀번호를 입력해주세요"
                if(errorView == null){
                    errorView = editTextPasswordLogin
                }
            }else{
                textInputLayoutPasswordLogin.error = null
            }

            // 비어있는 입력 요소가 있다면
            if(errorView != null){
                // 비어 있는 입력 요소에 포커스를 준다.
                mainActivity.showSoftInput(errorView)
                return false
            }
            return true
        }
    }

}