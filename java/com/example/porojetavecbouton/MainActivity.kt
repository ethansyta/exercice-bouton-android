package com.example.porojetavecbouton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import com.example.porojetavecbouton.ui.theme.PorojetavecboutonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PorojetavecboutonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


    Column ( verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())
    {
        var color  by remember { mutableStateOf(Color.Black)}
        var score  by remember {
            mutableStateOf( 0) }



        Text(
            text = "Hello les coders", color = color,
        )


        Button (
            enabled = true,
            onClick = {
            if (color == Color.Black) {
                color = Color.Green

            } else if (color != Color.Black) {
                color = Color.Black
            }
                else {
                   color = Color.Black
                }
        }

        )



        {
            Text("button")

        }


        TextButton(onClick = { score++ }) {
            Text(text = "augmenter mon score! score :  $score")
            }

        TextButton(onClick = { score-- }) {
            Text(text = "si tu click ici... surprise!" )
        }




        }

}

        



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PorojetavecboutonTheme {
        Greeting("")
    }
}