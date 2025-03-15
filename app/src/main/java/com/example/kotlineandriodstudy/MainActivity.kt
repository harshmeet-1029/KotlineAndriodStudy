package com.example.kotlineandriodstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlineandriodstudy.ui.theme.WindSong


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                HeaderPadding()
//            Text("Harshmeet Singh",fontSize =30.sp)
//            Display2()
//            Display("Harshmeet")
//            DisProb()
//            Col()
//            LoopList()
//            TextStyling()
//            LongText()
//            SelectableText()
                PartiallySelectableText()
            }
        }
    }
}

@Composable
fun HeaderPadding(){
    Box(
        modifier = Modifier
            .padding(top = 10.dp)
            .background(color = Color(0xff66bb6a)) // Over here THE FIRST 0X IS USED BEFORE THE HEX CODE
            .fillMaxWidth()
            .height(56.dp)
    )// THE FIRST FF REPRESENT TEH OPACITY
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
    fontSize = 30.sp,
    color = Color.Blue,
    fontStyle = FontStyle.Italic,
    fontWeight = FontWeight.W600,
    fontFamily = WindSong,
    textAlign = TextAlign.Center,// like webD. it take that much with as it is the content
    modifier = Modifier.background(color = Color.Yellow)
        .width(2000.dp)
)
}

/// How to repeat a text
@Composable
fun LongText(){
    Text("Harsh ".repeat(20), fontSize = 30.sp, maxLines = 2)
}

@Composable
fun SelectableText(){
    SelectionContainer {
        Text("Harshmeet Singh", fontSize = 20.sp, modifier = Modifier.padding(top = 10.dp, end = 10.dp))
    }
}

@Composable
fun PartiallySelectableText(){
    //Mehtod 1
    Column {
        SelectionContainer {
            Column {
                Text(
                    "Selectable Text",
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 10.dp, end = 10.dp)
                )
                DisableSelection {
                    Text("Non Selectable text Disable Selection", fontSize = 30.sp)
                }
            }
        }

        Text("Non Selectable text", fontSize = 30.sp)
    // Method 2

    }
}

