package com.example.kotlineandriodstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
            Box(
                modifier = Modifier .padding(top = 25.dp)
            ) {
//              HeaderPadding()
//            Text("Harshmeet Singh",fontSize =30.sp)
//            Display2()
//            Display("Harshmeet")
//            DisProb()
//            Col()
//            LoopList()
//            TextStyling()
//            LongText()
//            SelectableText()
//            PartiallySelectableText()
//            RowExample()
//            ScrollableRowExample()
//            ColExample()
//            ScrollableColElement()
//            LazyRowExample()
//            LazyColExample()
              BoxExample()
            }
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

@Composable
fun RowExample(){
Row( // They are not scrollable by default
    modifier = Modifier // Anything we use in modifier will be used by its child
        .fillMaxWidth()
        .fillMaxHeight() // It take up the rest of height
        .background(color = Color.LightGray),
    horizontalArrangement = Arrangement.Center // To make the alignment center Arrangement is used
    , verticalAlignment = Alignment.CenterVertically
) {
    Text("Harsh", fontSize = 30.sp)
    Text("Meet", fontSize = 30.sp)
    Text(" Singh", fontSize = 30.sp)
    }
}

@Composable
fun ScrollableRowExample(){
    Row( // They are not scrollable by default
        modifier = Modifier // Anything we use in modifier will be used by its child
            .fillMaxWidth()
            .fillMaxHeight() // It take up the rest of height
            .background(color = Color.LightGray)
            .horizontalScroll(rememberScrollState()), // This is used to create it scrollable
        horizontalArrangement = Arrangement.Center // To make the alignment center Arrangement is used
        , verticalAlignment = Alignment.CenterVertically
    ) {
       for (item in 0..10){
           Text("Item No. ${item} ,", fontSize = 30.sp)
       }

    }
}

@Composable
fun ColExample(){
    Column(
        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize(1f) // It will fill both height and width and we can pass on the fraction too from 0,1 like 0.5f
            .background(color = Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Harsh", fontSize = 30.sp)
        Text("Meet", fontSize = 30.sp)
        Text(" Singh", fontSize = 30.sp)
    }
}

@Composable
fun ScrollableColElement(){
    Column(
        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize(1f) // It will fill both height and width and we can pass on the fraction too from 0,1 like 0.5f
            .background(color = Color.LightGray)
            .verticalScroll(rememberScrollState())
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        for (item in 0..100){
            Text("Item No. $item", fontSize = 30.sp)
        }
    }
}

@Composable
fun LazyRowExample(){
    LazyRow(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxHeight()
            ,
        verticalAlignment = Alignment.CenterVertically,
    contentPadding = PaddingValues(horizontal = 50.dp) ,// We use contentPadding to give padding and padding values to define the padding
        horizontalArrangement = Arrangement.spacedBy(40.dp) //We use spacedBy() to give space b/w items
    ) {
        // In this we give something called as item or items
        // For single Item
        item {
            Text("Hey How are u", fontSize = 30.sp)
        }
        //For Multiple Items
        // Over here it take the lambda function
        items(50){ i->
            Text("Item No $i", fontSize = 30.sp)
        }
        item {
            Text(" Last Item", fontSize = 30.sp)
        }
    }
}

@Composable
fun LazyColExample(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
            ,
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(40.dp),
        verticalArrangement = Arrangement.spacedBy(40.dp)
    ) {
        // In this we give something called as item or items
        // For single Item
        item {
            Text("Hey How are u", fontSize = 30.sp)
        }
        //For Multiple Items
        // Over here it take the lambda function
        items(50){ i->
            Text("Item No $i", fontSize = 30.sp)
        }
        item {
            Text(" Last Item", fontSize = 30.sp)
        }
    }
}

@Composable
fun BoxExample(){
    // How does Box stack the stuff on each other
 Box(
     modifier = Modifier
         .background(color = Color.Yellow)
         .fillMaxHeight(0.5f)
         .fillMaxWidth(0.5f)
 ){
     Text("This is outer box.........")
     Box( modifier = Modifier
         .background(color = Color.Blue)
         .fillMaxHeight(0.5f)
         .fillMaxWidth(0.5f)
     ){
         Text("This is inner box.........")
     }
 }
}