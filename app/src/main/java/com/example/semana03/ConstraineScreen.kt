package com.example.semana03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun EjemploContraint(){
    ConstraintLayout (modifier = Modifier.fillMaxSize()) {
        val  boxBlue = createRef()
        val guiaLineaArriba = createGuidelineFromTop(0.1f)
        Box(modifier = Modifier.size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue){
                top.linkTo(guiaLineaArriba)
                start.linkTo(parent.start)
                //end.linkTo(parent.end)
                //bottom.linkTo(parent.bottom)
            })
    }
}