package com.example.medi_sheba.presentation.screens

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import com.example.medi_sheba.model.Class
import com.example.medi_sheba.presentation.screenItem.ScreenItem
import com.google.firebase.auth.FirebaseAuth


@Composable
fun ELearningScreen(navController: NavHostController, auth: FirebaseAuth, eLearning: String) {

    val classList = listOf (
        Class(1, "Native Language", ""),
        Class(2, "Class 1", ""),
        Class(3, "Class 2", ""),
        Class(4, "Class 3", ""),
        Class(5, "Class 4", ""),
        Class(6, "Class 5", ""),
        Class(7, "Class 6", ""),
        Class(8, "Class 7", ""),
        Class(9, "Class 8", ""),
        Class(10, "Class 9", ""),
        Class(11, "Class 10", ""),
        Class(12, "Class 11", ""),
        Class(13, "Class 12", ""),
    )

    val context = LocalContext.current

    Scaffold(
        modifier = Modifier
            .background(Color(0xFFB0D5E9)),
        topBar = {
            AppBar(navController = navController, title = eLearning.uppercase() + " E-Learning")
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            items(classList) { singleClass ->
                ClassBox(name = singleClass.className, route = singleClass.route, modifier = Modifier.clickable {
//                    val intent = Intent(context, YoutubePlayerActivity::class.java)
//                    startActivity(context, intent, null)
                    navController.navigate(ScreenItem.PlayerScreenItem.route)
                })
            }
        }
    }
}

@Composable
fun ClassBox(name: String, route: String, modifier: Modifier) {
    Box (
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
            .background(Color.LightGray)
            .clip(RoundedCornerShape(10.dp))
            .padding(horizontal = 20.dp, vertical = 5.dp)
    ) {
        Text(text = name)
    }
}