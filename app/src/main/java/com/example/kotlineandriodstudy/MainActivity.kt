package com.example.kotlineandriodstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.kotlineandriodstudy.ui.theme.WindSong


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            Text("Harshmeet Singh",fontSize =30.sp)
//            Display2()
//            Display("Harshmeet")
//            DisProb()
//            Col()
//            LoopList()
            TextStyling()
        }
    }
}

// How to create a composable functions
@Composable
fun Display2(){
    Text("Harshmeet Singh",fontSize =30.sp)
}
@Composable
fun Display(name:String){
    Text(name,fontSize =30.sp)
}

// BY DEFAULT IN JETPACK COMPOSE EVERYTHING IS IN STACK

@Composable
fun DisProb(){
    // The problem is it stack everything upon each other
    Text("harsh",fontSize =30.sp)
    Text("Abdul",fontSize =30.sp)
    Text("yasmin",fontSize =30.sp)
    Text("Hira",fontSize =30.sp)
    Text("Rozanna",fontSize =30.sp)
}


@Composable
fun Col(){
    Column {
        Text("harsh",fontSize =30.sp)
        Text("Abdul",fontSize =30.sp)
        Text("yasmin",fontSize =30.sp)
        Text("Hira",fontSize =30.sp)
        Text("Rozanna",fontSize =30.sp)
    }
}

@Composable
fun LoopList(){
    val name = listOf("Harsh","Sonam","Abdul","Ali")
//    for (n in name){ // Thus will going to stack them on each other
//        Text(n)
//    }
    Column {
        for (n in name){
        Text(n)
        }
    }

}

@Composable
fun TextStyling(){
Text(
    text= "Hey Harshmeet singh",
    fontSize = 15.sp,
    color = Color.Blue,
    fontStyle = FontStyle.Italic,
    fontWeight = FontWeight.W600,
    fontFamily = WindSong,
    textAlign = TextAlign.Center,// like webd it take that much with as it is the content
)
}