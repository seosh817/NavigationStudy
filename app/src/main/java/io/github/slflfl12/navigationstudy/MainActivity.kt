package io.github.slflfl12.navigationstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupWithNavController(bnv_main, findNavController(R.id.nav_host))

        /*
        popupTo는 destination이 나올 때까지 stack에서 제거한다.
        popupToInclusive가 ture라면 destination도 스택에서 날려버린다.
        특히 popupTo가 처음 시작점으로 설정되었다면 모든 popup이 날라가버리므로 앱이 종료된다.
        popupToInclusive가 false면 destination이 스택에서 안날라간다.
        */
    }
}