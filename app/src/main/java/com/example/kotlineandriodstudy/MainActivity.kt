package com.example.kotlineandriodstudy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.kotlineandriodstudy.ui.theme.WindSong


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent () {

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
//            BoxExample()
//            MaterialDesignExample()
//            AccessingImage()
//            AccessingImageFromNetowrk()
//            usingIcon()
//            CardExample()
//            StateFull()
//            StateHoistingParent()
//            ButtonsExample()
            TextFieldExample()
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
    modifier = Modifier
        .background(color = Color.Yellow)
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
    //Method 1
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
     Text("This is outer box.........") // This comes as the yellow part
     Box( modifier = Modifier
         .background(color = Color.Blue)
         .fillMaxHeight(0.5f)
         .fillMaxWidth(0.5f)
     ){
         Text("This is inner box",color=Color.White, modifier = Modifier.align(Alignment.Center)) // this comes on top of it
     }
     Text("Testing",color = Color.Green, modifier = Modifier.align(Alignment.Center)) // but this comes on top of blue and yellow both

 }
}

@OptIn(ExperimentalMaterial3Api::class) // I have to write this
@Composable
fun MaterialDesignExample(){
Scaffold(
    topBar = {
        TopAppBar(
            title = { Text("Material APP") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF04411A),
                titleContentColor = Color.White,
            ),
            actions = { // The placement of it is at the right side
                IconButton(onClick = {Log.d("top bar","Action icon")}) {
                    Icon(Icons.Default.Menu,contentDescription = null, tint = Color.White)

                }
            },
            navigationIcon = { // placement of it is at the left side
                IconButton(onClick = {Log.d("top bar","Navigation Icon")}) {
                    Icon(Icons.Default.Menu,contentDescription = null, tint = Color.White)
                }
            }
        )
    }
){ padding -> // It is imp as it give padding to us from all sides so that it won't send text to the background of the top bar
    Box(modifier = Modifier.padding(padding)) {
        LazyColExample()
 }}
}

@Composable
fun AccessingImage(){
    Image(painter = painterResource(R.drawable.a), contentDescription = null, modifier = Modifier
        .size(500.dp)
        .border(2.dp, color = Color.Red,CircleShape)
        .clip(shape = CircleShape)
        .background(color = Color.Blue),
        contentScale = ContentScale.Crop // Add the scaling to content
    )
}

@Composable
fun AccessingImageFromNetowrk(){
    Image(painter = rememberAsyncImagePainter(
        "https://getwallpapers.com/wallpaper/full/a/0/7/701514-gorgerous-iu-wallpaper-3840x2160-xiaomi.jpg"
    ), contentDescription = null, modifier = Modifier
        .size(500.dp)
        .border(2.dp, color = Color.Red,CircleShape)
        .clip(shape = CircleShape)
        .background(color = Color.Blue),
        contentScale = ContentScale.Crop // Add the scaling to content
    )
}

@Composable
fun usingIcon(){
Icon(
    Icons.Outlined.Edit, contentDescription = "Edit icon",
    modifier = Modifier.size(20.dp),
    tint = Color.Red
)
}

@Composable
fun CardExample(){
    Box(modifier = Modifier.fillMaxSize().background(color = Color.LightGray)){
Card(
    modifier = Modifier.padding(top = 30.dp),
    shape = RoundedCornerShape(6.dp),
    colors = CardDefaults.cardColors(Color.White),
    elevation = CardDefaults.cardElevation(defaultElevation = 15.dp),
) {
    Column {
        Text("Harshmeet Singh", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))
        Text("Trying to be good coder ", fontSize = 30.sp)
    }
}}
}

@Composable
fun StateFull(){
    var name:String by remember { mutableStateOf("") }
    TextField(
        value = name,
        onValueChange = {name = it},
        label = { Text("Enter your name") },
        modifier = Modifier.padding(10.dp)

    )
}

// State hoisting
@Composable
fun StateHoistingParent(){
    var name:String by remember { mutableStateOf("") }

    StateHoistingFull(name, onNameChange = {name= it})

    Text(name, fontSize = 20.sp)
}
@Composable
fun StateHoistingFull(name:String,onNameChange:(String)-> Unit){
    TextField(
        value = name,
        onValueChange = onNameChange,
        label = { Text("Enter your name") },
        modifier = Modifier.padding(10.dp)

    )
}

@Composable
fun ButtonsExample(){
    Column {

            // Normal button
            Button(
                onClick = { Log.d("Button Clicked","Clicking the Button")},
                modifier = Modifier
                    .padding(23.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,  // Button background
                    contentColor = Color.Black ),     // Button text color ),
                shape = RoundedCornerShape(1.dp),
                border = BorderStroke(2.dp,Color.Blue),
                        contentPadding = PaddingValues(top = 20.dp, start = 30.dp, end = 30.dp, bottom = 20.dp)
            ) {
                Text("Button")
                }
            // Text button
            TextButton(
                onClick = { Log.d("Button Clicked","Clicking the Button")},
                modifier = Modifier
                    .padding(23.dp),
                colors = ButtonDefaults.textButtonColors( contentColor = Color.Black)
            ) {

                Text("Button")
                }
            // Outlined button
        OutlinedButton(  onClick = { Log.d("Button Clicked","Clicking the Button")},
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Cyan),
            border = BorderStroke(1.dp, color = Color.Green),
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 0.dp, bottomEnd = 16.dp, bottomStart = 0.dp)
        ) {
            Text("Button")
            }
IconButton(
    onClick = { Log.d("Button Clicked","Clicking the Button")},
    modifier = Modifier.padding(1.dp).border(1.dp, color = Color.Red, CircleShape)
) {
    Icon(Icons.Outlined.Add, contentDescription = null)
}
        FloatingActionButton(
            onClick = { Log.d("Button Clicked","Clicking the Button")},
            modifier = Modifier.padding(10.dp),
            containerColor = Color.Yellow,
            contentColor = Color.Red,
            shape = CircleShape //default square
            , elevation = FloatingActionButtonDefaults.elevation(
                defaultElevation = 8.dp, // Normal state
                pressedElevation = 12.dp, // When clicked
                hoveredElevation = 10.dp,
                focusedElevation = 8.dp
            )
        ) {

            Icon(Icons.Outlined.Add, contentDescription = null)
        }

    }
}

@Composable
fun TextFieldExample(){
// First text filed
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        item{
            var name:String by remember { mutableStateOf("") }
            // Basic Text filed
            TextField(
                value = name,
                onValueChange = {name =  it},
                label = { Text("Enter your name") },
                placeholder = { Text("Write your name") },
                textStyle = TextStyle(Color.Blue),
                leadingIcon = {
                    Icon(Icons.Filled.Person, contentDescription = null)
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Red,
                    unfocusedIndicatorColor = Color.Transparent
                ),
//                readOnly = true,
//                singleLine = true, // it will prevent from going it to another line
            )
        }
    // Outlines one
        item{
            var name:String by remember { mutableStateOf("") }
            // Basic Text filed
            OutlinedTextField(
                value = name,
                onValueChange = {name =  it},
                label = { Text("Enter your name") },
                placeholder = { Text("Write your name") },
                textStyle = TextStyle(Color.Blue),
                leadingIcon = {
                    Icon(Icons.Filled.Person, contentDescription = null)
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Red,
                    unfocusedIndicatorColor = Color.Transparent
                ),
//                readOnly = true,
//                singleLine = true, // it will prevent from going it to another line
            )
        }

        // How to show password
        item{
            var name:String by remember { mutableStateOf("") }
            // Basic Text filed
            OutlinedTextField(
                value = name,
                onValueChange = {name =  it},
                label = { Text("Enter your name") },
                placeholder = { Text("Write your name") },
                textStyle = TextStyle(Color.Blue),
                leadingIcon = {
                    Icon(Icons.Filled.Person, contentDescription = null)
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Red,
                    unfocusedIndicatorColor = Color.Transparent
                ),
//                readOnly = true,
//                singleLine = true, // it will prevent from going it to another line
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }

    }
}